package org.egdev.reducer;

import io.grpc.Server;
import io.grpc.netty.NettyServerBuilder;

import java.io.IOException;

public class NumsReducerServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = NettyServerBuilder.forPort(8080).maxMessageSize(20480)
                .addService(new NumsReducerServiceImpl())
                .build();
        server.start();
        server.awaitTermination();
    }
}
