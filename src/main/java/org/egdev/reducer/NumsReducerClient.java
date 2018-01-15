package org.egdev.reducer;

import com.google.common.collect.Lists;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.egdev.NumbersReq;
import org.egdev.NumbersResp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class NumsReducerClient {
    public static void main(String[] args) throws InterruptedException {
        Random rnd = new Random();
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext(true).build();
        NumsReducerServiceGrpc.NumsReducerServiceBlockingStub stub = NumsReducerServiceGrpc.newBlockingStub(channel);
        List<Double> l = new ArrayList<>();
        NumbersResp resp = stub.avg(NumbersReq.
                newBuilder()
                .addAllNumbers(rnd.doubles(1_131_720, -1.0, 1.0)
                        .boxed()
                        .collect(Collectors.toList()))
                .build());
        System.out.println("Average is" + resp.getResult());
        channel.awaitTermination(5, TimeUnit.SECONDS);
    }
}
