package com.recepinanc.samplegrpcserver.sample;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.0)",
    comments = "Source: LargeObject.proto")
public final class LargeObjectServiceGrpc {

  private LargeObjectServiceGrpc() {}

  public static final String SERVICE_NAME = "LargeObjectService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.recepinanc.samplegrpcserver.sample.LargeObjectRequest,
      com.recepinanc.samplegrpcserver.sample.LargeObjectResponse> getGetLargeObjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLargeObjects",
      requestType = com.recepinanc.samplegrpcserver.sample.LargeObjectRequest.class,
      responseType = com.recepinanc.samplegrpcserver.sample.LargeObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.recepinanc.samplegrpcserver.sample.LargeObjectRequest,
      com.recepinanc.samplegrpcserver.sample.LargeObjectResponse> getGetLargeObjectsMethod() {
    io.grpc.MethodDescriptor<com.recepinanc.samplegrpcserver.sample.LargeObjectRequest, com.recepinanc.samplegrpcserver.sample.LargeObjectResponse> getGetLargeObjectsMethod;
    if ((getGetLargeObjectsMethod = LargeObjectServiceGrpc.getGetLargeObjectsMethod) == null) {
      synchronized (LargeObjectServiceGrpc.class) {
        if ((getGetLargeObjectsMethod = LargeObjectServiceGrpc.getGetLargeObjectsMethod) == null) {
          LargeObjectServiceGrpc.getGetLargeObjectsMethod = getGetLargeObjectsMethod =
              io.grpc.MethodDescriptor.<com.recepinanc.samplegrpcserver.sample.LargeObjectRequest, com.recepinanc.samplegrpcserver.sample.LargeObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLargeObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.recepinanc.samplegrpcserver.sample.LargeObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.recepinanc.samplegrpcserver.sample.LargeObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LargeObjectServiceMethodDescriptorSupplier("GetLargeObjects"))
              .build();
        }
      }
    }
    return getGetLargeObjectsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LargeObjectServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LargeObjectServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LargeObjectServiceStub>() {
        @java.lang.Override
        public LargeObjectServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LargeObjectServiceStub(channel, callOptions);
        }
      };
    return LargeObjectServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LargeObjectServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LargeObjectServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LargeObjectServiceBlockingStub>() {
        @java.lang.Override
        public LargeObjectServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LargeObjectServiceBlockingStub(channel, callOptions);
        }
      };
    return LargeObjectServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LargeObjectServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LargeObjectServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LargeObjectServiceFutureStub>() {
        @java.lang.Override
        public LargeObjectServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LargeObjectServiceFutureStub(channel, callOptions);
        }
      };
    return LargeObjectServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class LargeObjectServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getLargeObjects(com.recepinanc.samplegrpcserver.sample.LargeObjectRequest request,
        io.grpc.stub.StreamObserver<com.recepinanc.samplegrpcserver.sample.LargeObjectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLargeObjectsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetLargeObjectsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.recepinanc.samplegrpcserver.sample.LargeObjectRequest,
                com.recepinanc.samplegrpcserver.sample.LargeObjectResponse>(
                  this, METHODID_GET_LARGE_OBJECTS)))
          .build();
    }
  }

  /**
   */
  public static final class LargeObjectServiceStub extends io.grpc.stub.AbstractAsyncStub<LargeObjectServiceStub> {
    private LargeObjectServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LargeObjectServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LargeObjectServiceStub(channel, callOptions);
    }

    /**
     */
    public void getLargeObjects(com.recepinanc.samplegrpcserver.sample.LargeObjectRequest request,
        io.grpc.stub.StreamObserver<com.recepinanc.samplegrpcserver.sample.LargeObjectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLargeObjectsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LargeObjectServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LargeObjectServiceBlockingStub> {
    private LargeObjectServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LargeObjectServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LargeObjectServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.recepinanc.samplegrpcserver.sample.LargeObjectResponse getLargeObjects(com.recepinanc.samplegrpcserver.sample.LargeObjectRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLargeObjectsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LargeObjectServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LargeObjectServiceFutureStub> {
    private LargeObjectServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LargeObjectServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LargeObjectServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.recepinanc.samplegrpcserver.sample.LargeObjectResponse> getLargeObjects(
        com.recepinanc.samplegrpcserver.sample.LargeObjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLargeObjectsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LARGE_OBJECTS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LargeObjectServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LargeObjectServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_LARGE_OBJECTS:
          serviceImpl.getLargeObjects((com.recepinanc.samplegrpcserver.sample.LargeObjectRequest) request,
              (io.grpc.stub.StreamObserver<com.recepinanc.samplegrpcserver.sample.LargeObjectResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LargeObjectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LargeObjectServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.recepinanc.samplegrpcserver.sample.LargeObjectProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LargeObjectService");
    }
  }

  private static final class LargeObjectServiceFileDescriptorSupplier
      extends LargeObjectServiceBaseDescriptorSupplier {
    LargeObjectServiceFileDescriptorSupplier() {}
  }

  private static final class LargeObjectServiceMethodDescriptorSupplier
      extends LargeObjectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LargeObjectServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (LargeObjectServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LargeObjectServiceFileDescriptorSupplier())
              .addMethod(getGetLargeObjectsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
