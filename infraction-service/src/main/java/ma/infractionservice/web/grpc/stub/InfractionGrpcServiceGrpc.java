package ma.infractionservice.web.grpc.stub;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: InfractionSefvice.proto")
public final class InfractionGrpcServiceGrpc {

  private InfractionGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "InfractionGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionRequest,
      ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse> getSaveInfractionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveInfraction",
      requestType = ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionRequest.class,
      responseType = ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionRequest,
      ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse> getSaveInfractionMethod() {
    io.grpc.MethodDescriptor<ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionRequest, ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse> getSaveInfractionMethod;
    if ((getSaveInfractionMethod = InfractionGrpcServiceGrpc.getSaveInfractionMethod) == null) {
      synchronized (InfractionGrpcServiceGrpc.class) {
        if ((getSaveInfractionMethod = InfractionGrpcServiceGrpc.getSaveInfractionMethod) == null) {
          InfractionGrpcServiceGrpc.getSaveInfractionMethod = getSaveInfractionMethod = 
              io.grpc.MethodDescriptor.<ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionRequest, ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InfractionGrpcService", "saveInfraction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InfractionGrpcServiceMethodDescriptorSupplier("saveInfraction"))
                  .build();
          }
        }
     }
     return getSaveInfractionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InfractionGrpcServiceStub newStub(io.grpc.Channel channel) {
    return new InfractionGrpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InfractionGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InfractionGrpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InfractionGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InfractionGrpcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class InfractionGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void saveInfraction(ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionRequest request,
        io.grpc.stub.StreamObserver<ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveInfractionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveInfractionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionRequest,
                ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse>(
                  this, METHODID_SAVE_INFRACTION)))
          .build();
    }
  }

  /**
   */
  public static final class InfractionGrpcServiceStub extends io.grpc.stub.AbstractStub<InfractionGrpcServiceStub> {
    private InfractionGrpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InfractionGrpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InfractionGrpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InfractionGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void saveInfraction(ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionRequest request,
        io.grpc.stub.StreamObserver<ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveInfractionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InfractionGrpcServiceBlockingStub extends io.grpc.stub.AbstractStub<InfractionGrpcServiceBlockingStub> {
    private InfractionGrpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InfractionGrpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InfractionGrpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InfractionGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse saveInfraction(ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveInfractionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InfractionGrpcServiceFutureStub extends io.grpc.stub.AbstractStub<InfractionGrpcServiceFutureStub> {
    private InfractionGrpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InfractionGrpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InfractionGrpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InfractionGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse> saveInfraction(
        ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveInfractionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_INFRACTION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InfractionGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InfractionGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_INFRACTION:
          serviceImpl.saveInfraction((ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionRequest) request,
              (io.grpc.stub.StreamObserver<ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse>) responseObserver);
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

  private static abstract class InfractionGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InfractionGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.infractionservice.web.grpc.stub.InfractionSefvice.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InfractionGrpcService");
    }
  }

  private static final class InfractionGrpcServiceFileDescriptorSupplier
      extends InfractionGrpcServiceBaseDescriptorSupplier {
    InfractionGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class InfractionGrpcServiceMethodDescriptorSupplier
      extends InfractionGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InfractionGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (InfractionGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InfractionGrpcServiceFileDescriptorSupplier())
              .addMethod(getSaveInfractionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
