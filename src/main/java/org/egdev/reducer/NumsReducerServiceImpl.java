package org.egdev.reducer;

import io.grpc.stub.StreamObserver;
import org.egdev.NumbersReq;
import org.egdev.NumbersResp;

import java.util.OptionalDouble;

public class NumsReducerServiceImpl extends NumsReducerServiceGrpc.NumsReducerServiceImplBase {

    public NumsReducerServiceImpl(){
        System.out.println("Service constructed");
    }

    @Override
    public void avg(NumbersReq request, StreamObserver<NumbersResp> responseObserver) {
        OptionalDouble average = request.getNumbersList().stream().mapToDouble(d -> d).average();
        System.out.println("Len is " + request.getNumbersCount());
        responseObserver.onNext(NumbersResp.newBuilder()
                .setOperation("Average")
                .setResult(average.orElse(0.0))
                .build());
        responseObserver.onCompleted();
    }
}
