package org.egdev.reducer;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.9.0)",
    comments = "Source: NumsReducerService.proto")
public final class NumsReducerServiceGrpc {

  private NumsReducerServiceGrpc() {}

  public static final String SERVICE_NAME = "org.egdev.NumsReducerService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getAvgMethod()} instead.
  public static final io.grpc.MethodDescriptor<org.egdev.NumbersReq,
      org.egdev.NumbersResp> METHOD_AVG = getAvgMethod();

  private static volatile io.grpc.MethodDescriptor<org.egdev.NumbersReq,
      org.egdev.NumbersResp> getAvgMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.egdev.NumbersReq,
      org.egdev.NumbersResp> getAvgMethod() {
    io.grpc.MethodDescriptor<org.egdev.NumbersReq, org.egdev.NumbersResp> getAvgMethod;
    if ((getAvgMethod = NumsReducerServiceGrpc.getAvgMethod) == null) {
      synchronized (NumsReducerServiceGrpc.class) {
        if ((getAvgMethod = NumsReducerServiceGrpc.getAvgMethod) == null) {
          NumsReducerServiceGrpc.getAvgMethod = getAvgMethod =
              io.grpc.MethodDescriptor.<org.egdev.NumbersReq, org.egdev.NumbersResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.egdev.NumsReducerService", "avg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.egdev.NumbersReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.egdev.NumbersResp.getDefaultInstance()))
                  .setSchemaDescriptor(new NumsReducerServiceMethodDescriptorSupplier("avg"))
                  .build();
          }
        }
     }
     return getAvgMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NumsReducerServiceStub newStub(io.grpc.Channel channel) {
    return new NumsReducerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NumsReducerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NumsReducerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NumsReducerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NumsReducerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class NumsReducerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void avg(org.egdev.NumbersReq request,
        io.grpc.stub.StreamObserver<org.egdev.NumbersResp> responseObserver) {
      asyncUnimplementedUnaryCall(getAvgMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAvgMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.egdev.NumbersReq,
                org.egdev.NumbersResp>(
                  this, METHODID_AVG)))
          .build();
    }
  }

  /**
   */
  public static final class NumsReducerServiceStub extends io.grpc.stub.AbstractStub<NumsReducerServiceStub> {
    private NumsReducerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NumsReducerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected NumsReducerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NumsReducerServiceStub(channel, callOptions);
    }

    /**
     */
    public void avg(org.egdev.NumbersReq request,
        io.grpc.stub.StreamObserver<org.egdev.NumbersResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAvgMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NumsReducerServiceBlockingStub extends io.grpc.stub.AbstractStub<NumsReducerServiceBlockingStub> {
    private NumsReducerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NumsReducerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected NumsReducerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NumsReducerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.egdev.NumbersResp avg(org.egdev.NumbersReq request) {
      return blockingUnaryCall(
          getChannel(), getAvgMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NumsReducerServiceFutureStub extends io.grpc.stub.AbstractStub<NumsReducerServiceFutureStub> {
    private NumsReducerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NumsReducerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected NumsReducerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NumsReducerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.egdev.NumbersResp> avg(
        org.egdev.NumbersReq request) {
      return futureUnaryCall(
          getChannel().newCall(getAvgMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AVG = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NumsReducerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NumsReducerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AVG:
          serviceImpl.avg((org.egdev.NumbersReq) request,
              (io.grpc.stub.StreamObserver<org.egdev.NumbersResp>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class NumsReducerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NumsReducerServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.egdev.NumsReducerServiceOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NumsReducerService");
    }
  }

  private static final class NumsReducerServiceFileDescriptorSupplier
      extends NumsReducerServiceBaseDescriptorSupplier {
    NumsReducerServiceFileDescriptorSupplier() {}
  }

  private static final class NumsReducerServiceMethodDescriptorSupplier
      extends NumsReducerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NumsReducerServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (NumsReducerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NumsReducerServiceFileDescriptorSupplier())
              .addMethod(getAvgMethod())
              .build();
        }
      }
    }
    return result;
  }
}
