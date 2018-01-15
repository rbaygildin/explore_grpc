package org.egdev.fileUpload;

import io.grpc.stub.StreamObserver;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

public class FileUploadServiceImpl extends FileUploadServiceGrpc.FileUploadServiceImplBase {

    private static final Logger LOG = Logger.getLogger(FileUploadServiceImpl.class.getName());

    private String fileName = "";
    private BufferedOutputStream output = null;

    @Override
    public StreamObserver<FileUploadReq> uploadFile(final StreamObserver<FileUploadResp> responseObserver) {
        LOG.info("Upload file called!");
        return new StreamObserver<FileUploadReq>() {

            @Override
            public void onNext(FileUploadReq fileUploadReq) {
                LOG.info("Request [" + fileUploadReq + "] received");
                byte[] data = fileUploadReq.getContent().toByteArray();
                long offset = fileUploadReq.getOffset();
                String name = fileUploadReq.getName();
                try {
                    if (output == null)
                        output = new BufferedOutputStream(new FileOutputStream("received_" + name));
                    output.write(trimArray(data));
                    output.flush();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onCompleted() {
                if(output != null) {
                    responseObserver.onNext(FileUploadResp.newBuilder()
                            .setOkStatus(true)
                            .setMessage("File " + fileName + " received!")
                            .build());
                    responseObserver.onCompleted();
                    try {
                        output.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    finally {
                        output = null;
                    }
                }
            }
        };
    }
    private static byte[] trimArray(byte[] input){
        int i = input.length - 1;
        while (i-- >= 0 && input[i] == 0){}
        return Arrays.copyOf(input, i + 1);
    }
}
