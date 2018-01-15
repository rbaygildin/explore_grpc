package org.egdev.fileUpload;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.9.0)",
    comments = "Source: FileUploadService.proto")
public final class FileUploadServiceGrpc {

  private FileUploadServiceGrpc() {}

  public static final String SERVICE_NAME = "org.egdev.FileUploadService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getUploadFileMethod()} instead.
  public static final io.grpc.MethodDescriptor<FileUploadReq,
      FileUploadResp> METHOD_UPLOAD_FILE = getUploadFileMethod();

  private static volatile io.grpc.MethodDescriptor<FileUploadReq,
      FileUploadResp> getUploadFileMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<FileUploadReq,
      FileUploadResp> getUploadFileMethod() {
    io.grpc.MethodDescriptor<FileUploadReq, FileUploadResp> getUploadFileMethod;
    if ((getUploadFileMethod = FileUploadServiceGrpc.getUploadFileMethod) == null) {
      synchronized (FileUploadServiceGrpc.class) {
        if ((getUploadFileMethod = FileUploadServiceGrpc.getUploadFileMethod) == null) {
          FileUploadServiceGrpc.getUploadFileMethod = getUploadFileMethod =
              io.grpc.MethodDescriptor.<FileUploadReq, FileUploadResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "org.egdev.FileUploadService", "uploadFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  FileUploadReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  FileUploadResp.getDefaultInstance()))
                  .setSchemaDescriptor(new FileUploadServiceMethodDescriptorSupplier("uploadFile"))
                  .build();
          }
        }
     }
     return getUploadFileMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FileUploadServiceStub newStub(io.grpc.Channel channel) {
    return new FileUploadServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FileUploadServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FileUploadServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FileUploadServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FileUploadServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class FileUploadServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<FileUploadReq> uploadFile(
        io.grpc.stub.StreamObserver<FileUploadResp> responseObserver) {
      return asyncUnimplementedStreamingCall(getUploadFileMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUploadFileMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                FileUploadReq,
                FileUploadResp>(
                  this, METHODID_UPLOAD_FILE)))
          .build();
    }
  }

  /**
   */
  public static final class FileUploadServiceStub extends io.grpc.stub.AbstractStub<FileUploadServiceStub> {
    private FileUploadServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FileUploadServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected FileUploadServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FileUploadServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<FileUploadReq> uploadFile(
        io.grpc.stub.StreamObserver<FileUploadResp> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getUploadFileMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class FileUploadServiceBlockingStub extends io.grpc.stub.AbstractStub<FileUploadServiceBlockingStub> {
    private FileUploadServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FileUploadServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected FileUploadServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FileUploadServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class FileUploadServiceFutureStub extends io.grpc.stub.AbstractStub<FileUploadServiceFutureStub> {
    private FileUploadServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FileUploadServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected FileUploadServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FileUploadServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_UPLOAD_FILE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FileUploadServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FileUploadServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD_FILE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uploadFile(
              (io.grpc.stub.StreamObserver<FileUploadResp>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FileUploadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FileUploadServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return FileUploadServiceOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FileUploadService");
    }
  }

  private static final class FileUploadServiceFileDescriptorSupplier
      extends FileUploadServiceBaseDescriptorSupplier {
    FileUploadServiceFileDescriptorSupplier() {}
  }

  private static final class FileUploadServiceMethodDescriptorSupplier
      extends FileUploadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FileUploadServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FileUploadServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FileUploadServiceFileDescriptorSupplier())
              .addMethod(getUploadFileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
