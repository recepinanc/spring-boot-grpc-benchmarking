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
    comments = "Source: Sample.proto")
public final class SampleGrpc {

  private SampleGrpc() {}

  public static final String SERVICE_NAME = "Sample";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.recepinanc.samplegrpcserver.sample.SampleRequest,
      com.recepinanc.samplegrpcserver.sample.SampleResponse> getRandomNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RandomNumber",
      requestType = com.recepinanc.samplegrpcserver.sample.SampleRequest.class,
      responseType = com.recepinanc.samplegrpcserver.sample.SampleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.recepinanc.samplegrpcserver.sample.SampleRequest,
      com.recepinanc.samplegrpcserver.sample.SampleResponse> getRandomNumberMethod() {
    io.grpc.MethodDescriptor<com.recepinanc.samplegrpcserver.sample.SampleRequest, com.recepinanc.samplegrpcserver.sample.SampleResponse> getRandomNumberMethod;
    if ((getRandomNumberMethod = SampleGrpc.getRandomNumberMethod) == null) {
      synchronized (SampleGrpc.class) {
        if ((getRandomNumberMethod = SampleGrpc.getRandomNumberMethod) == null) {
          SampleGrpc.getRandomNumberMethod = getRandomNumberMethod =
              io.grpc.MethodDescriptor.<com.recepinanc.samplegrpcserver.sample.SampleRequest, com.recepinanc.samplegrpcserver.sample.SampleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RandomNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.recepinanc.samplegrpcserver.sample.SampleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.recepinanc.samplegrpcserver.sample.SampleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SampleMethodDescriptorSupplier("RandomNumber"))
              .build();
        }
      }
    }
    return getRandomNumberMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SampleStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SampleStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SampleStub>() {
        @java.lang.Override
        public SampleStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SampleStub(channel, callOptions);
        }
      };
    return SampleStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SampleBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SampleBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SampleBlockingStub>() {
        @java.lang.Override
        public SampleBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SampleBlockingStub(channel, callOptions);
        }
      };
    return SampleBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SampleFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SampleFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SampleFutureStub>() {
        @java.lang.Override
        public SampleFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SampleFutureStub(channel, callOptions);
        }
      };
    return SampleFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SampleImplBase implements io.grpc.BindableService {

    /**
     */
    public void randomNumber(com.recepinanc.samplegrpcserver.sample.SampleRequest request,
        io.grpc.stub.StreamObserver<com.recepinanc.samplegrpcserver.sample.SampleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRandomNumberMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRandomNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.recepinanc.samplegrpcserver.sample.SampleRequest,
                com.recepinanc.samplegrpcserver.sample.SampleResponse>(
                  this, METHODID_RANDOM_NUMBER)))
          .build();
    }
  }

  /**
   */
  public static final class SampleStub extends io.grpc.stub.AbstractAsyncStub<SampleStub> {
    private SampleStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SampleStub(channel, callOptions);
    }

    /**
     */
    public void randomNumber(com.recepinanc.samplegrpcserver.sample.SampleRequest request,
        io.grpc.stub.StreamObserver<com.recepinanc.samplegrpcserver.sample.SampleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRandomNumberMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SampleBlockingStub extends io.grpc.stub.AbstractBlockingStub<SampleBlockingStub> {
    private SampleBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SampleBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.recepinanc.samplegrpcserver.sample.SampleResponse randomNumber(com.recepinanc.samplegrpcserver.sample.SampleRequest request) {
      return blockingUnaryCall(
          getChannel(), getRandomNumberMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SampleFutureStub extends io.grpc.stub.AbstractFutureStub<SampleFutureStub> {
    private SampleFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SampleFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.recepinanc.samplegrpcserver.sample.SampleResponse> randomNumber(
        com.recepinanc.samplegrpcserver.sample.SampleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRandomNumberMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RANDOM_NUMBER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SampleImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SampleImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RANDOM_NUMBER:
          serviceImpl.randomNumber((com.recepinanc.samplegrpcserver.sample.SampleRequest) request,
              (io.grpc.stub.StreamObserver<com.recepinanc.samplegrpcserver.sample.SampleResponse>) responseObserver);
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

  private static abstract class SampleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SampleBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.recepinanc.samplegrpcserver.sample.SampleProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Sample");
    }
  }

  private static final class SampleFileDescriptorSupplier
      extends SampleBaseDescriptorSupplier {
    SampleFileDescriptorSupplier() {}
  }

  private static final class SampleMethodDescriptorSupplier
      extends SampleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SampleMethodDescriptorSupplier(String methodName) {
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
      synchronized (SampleGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SampleFileDescriptorSupplier())
              .addMethod(getRandomNumberMethod())
              .build();
        }
      }
    }
    return result;
  }
}
