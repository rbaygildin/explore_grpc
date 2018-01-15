package org.egdev.fileUpload;

import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.io.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class FileUploadClient {
    private static final Logger LOG = Logger.getLogger(FileUploadClient.class.getName());

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext(true)
                .build();
        FileUploadServiceGrpc.FileUploadServiceStub stub = FileUploadServiceGrpc.newStub(channel);
        String fileName = "hello.txt";
//        File file = new File(fileName);
        StreamObserver<FileUploadResp> respObserver = new StreamObserver<FileUploadResp>() {
            @Override
            public void onNext(FileUploadResp fileUploadResp) {
                LOG.info("Next response request");
            }

            @Override
            public void onError(Throwable throwable) {
                LOG.info("Response error");
            }

            @Override
            public void onCompleted() {
                LOG.info("Response completed");
            }
        };
        try {
            BufferedInputStream input = new BufferedInputStream(FileUploadClient.class.getClassLoader().getResourceAsStream(fileName));
            StreamObserver<FileUploadReq> reqObserver = stub.uploadFile(respObserver);
            int bufferSize = 512 * 1024; // 512k
            byte[] buffer = new byte[bufferSize];
            int tmp = 0;
            int size = 0;
            while ((tmp = input.read(buffer)) > 0) {
                size += tmp;
                ByteString byteString = ByteString.copyFrom(buffer);
                FileUploadReq req = FileUploadReq.newBuilder().setName(fileName).setContent(byteString).setOffset(tmp).build();
                reqObserver.onNext(req);
            }
            reqObserver.onCompleted();
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            respObserver.onError(e);
            e.printStackTrace();
        }
        LOG.info("File " + fileName + " was uploaded on server");
        try {
            channel.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
