package org.egdev.fileUpload;

import io.grpc.Server;
import io.grpc.netty.NettyServerBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class FileUploadServer {
    private static Logger LOG = Logger.getLogger(FileUploadServer.class.getName());

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = NettyServerBuilder.forPort(8080)
                .addService(new FileUploadServiceImpl())
                .build();
        LOG.info("Server starting");
        server.start();
        server.awaitTermination();
    }
}
