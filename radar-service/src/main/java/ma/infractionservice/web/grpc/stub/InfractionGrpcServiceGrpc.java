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
  private static volatile io.grpc.MethodDescriptor<ma.infractionservice.web.grpc.stub.InfractionSefvice.voidInfractioRequest,
      ma.infractionservice.web.grpc.stub.InfractionSefvice.InfrationsListResponse> getGetAllInfractionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllInfractions",
      requestType = ma.infractionservice.web.grpc.stub.InfractionSefvice.voidInfractioRequest.class,
      responseType = ma.infractionservice.web.grpc.stub.InfractionSefvice.InfrationsListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.infractionservice.web.grpc.stub.InfractionSefvice.voidInfractioRequest,
      ma.infractionservice.web.grpc.stub.InfractionSefvice.InfrationsListResponse> getGetAllInfractionsMethod() {
    io.grpc.MethodDescriptor<ma.infractionservice.web.grpc.stub.InfractionSefvice.voidInfractioRequest, ma.infractionservice.web.grpc.stub.InfractionSefvice.InfrationsListResponse> getGetAllInfractionsMethod;
    if ((getGetAllInfractionsMethod = InfractionGrpcServiceGrpc.getGetAllInfractionsMethod) == null) {
      synchronized (InfractionGrpcServiceGrpc.class) {
        if ((getGetAllInfractionsMethod = InfractionGrpcServiceGrpc.getGetAllInfractionsMethod) == null) {
          InfractionGrpcServiceGrpc.getGetAllInfractionsMethod = getGetAllInfractionsMethod = 
              io.grpc.MethodDescriptor.<ma.infractionservice.web.grpc.stub.InfractionSefvice.voidInfractioRequest, ma.infractionservice.web.grpc.stub.InfractionSefvice.InfrationsListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InfractionGrpcService", "getAllInfractions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.infractionservice.web.grpc.stub.InfractionSefvice.voidInfractioRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.infractionservice.web.grpc.stub.InfractionSefvice.InfrationsListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InfractionGrpcServiceMethodDescriptorSupplier("getAllInfractions"))
                  .build();
          }
        }
     }
     return getGetAllInfractionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionIdRequest,
      ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse> getGetInfractionByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getInfractionById",
      requestType = ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionIdRequest.class,
      responseType = ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionIdRequest,
      ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse> getGetInfractionByIdMethod() {
    io.grpc.MethodDescriptor<ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionIdRequest, ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse> getGetInfractionByIdMethod;
    if ((getGetInfractionByIdMethod = InfractionGrpcServiceGrpc.getGetInfractionByIdMethod) == null) {
      synchronized (InfractionGrpcServiceGrpc.class) {
        if ((getGetInfractionByIdMethod = InfractionGrpcServiceGrpc.getGetInfractionByIdMethod) == null) {
          InfractionGrpcServiceGrpc.getGetInfractionByIdMethod = getGetInfractionByIdMethod = 
              io.grpc.MethodDescriptor.<ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionIdRequest, ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InfractionGrpcService", "getInfractionById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InfractionGrpcServiceMethodDescriptorSupplier("getInfractionById"))
                  .build();
          }
        }
     }
     return getGetInfractionByIdMethod;
  }

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

  private static volatile io.grpc.MethodDescriptor<ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionIdRequest,
      ma.infractionservice.web.grpc.stub.InfractionSefvice.voidInfractioRequest> getDeleteInfractionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteInfraction",
      requestType = ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionIdRequest.class,
      responseType = ma.infractionservice.web.grpc.stub.InfractionSefvice.voidInfractioRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionIdRequest,
      ma.infractionservice.web.grpc.stub.InfractionSefvice.voidInfractioRequest> getDeleteInfractionMethod() {
    io.grpc.MethodDescriptor<ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionIdRequest, ma.infractionservice.web.grpc.stub.InfractionSefvice.voidInfractioRequest> getDeleteInfractionMethod;
    if ((getDeleteInfractionMethod = InfractionGrpcServiceGrpc.getDeleteInfractionMethod) == null) {
      synchronized (InfractionGrpcServiceGrpc.class) {
        if ((getDeleteInfractionMethod = InfractionGrpcServiceGrpc.getDeleteInfractionMethod) == null) {
          InfractionGrpcServiceGrpc.getDeleteInfractionMethod = getDeleteInfractionMethod = 
              io.grpc.MethodDescriptor.<ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionIdRequest, ma.infractionservice.web.grpc.stub.InfractionSefvice.voidInfractioRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InfractionGrpcService", "deleteInfraction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.infractionservice.web.grpc.stub.InfractionSefvice.voidInfractioRequest.getDefaultInstance()))
                  .setSchemaDescriptor(new InfractionGrpcServiceMethodDescriptorSupplier("deleteInfraction"))
                  .build();
          }
        }
     }
     return getDeleteInfractionMethod;
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
    public void getAllInfractions(ma.infractionservice.web.grpc.stub.InfractionSefvice.voidInfractioRequest request,
        io.grpc.stub.StreamObserver<ma.infractionservice.web.grpc.stub.InfractionSefvice.InfrationsListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllInfractionsMethod(), responseObserver);
    }

    /**
     */
    public void getInfractionById(ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionIdRequest request,
        io.grpc.stub.StreamObserver<ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInfractionByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveInfraction(ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionRequest request,
        io.grpc.stub.StreamObserver<ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveInfractionMethod(), responseObserver);
    }

    /**
     */
    public void deleteInfraction(ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionIdRequest request,
        io.grpc.stub.StreamObserver<ma.infractionservice.web.grpc.stub.InfractionSefvice.voidInfractioRequest> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteInfractionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllInfractionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.infractionservice.web.grpc.stub.InfractionSefvice.voidInfractioRequest,
                ma.infractionservice.web.grpc.stub.InfractionSefvice.InfrationsListResponse>(
                  this, METHODID_GET_ALL_INFRACTIONS)))
          .addMethod(
            getGetInfractionByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionIdRequest,
                ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse>(
                  this, METHODID_GET_INFRACTION_BY_ID)))
          .addMethod(
            getSaveInfractionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionRequest,
                ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse>(
                  this, METHODID_SAVE_INFRACTION)))
          .addMethod(
            getDeleteInfractionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionIdRequest,
                ma.infractionservice.web.grpc.stub.InfractionSefvice.voidInfractioRequest>(
                  this, METHODID_DELETE_INFRACTION)))
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
    public void getAllInfractions(ma.infractionservice.web.grpc.stub.InfractionSefvice.voidInfractioRequest request,
        io.grpc.stub.StreamObserver<ma.infractionservice.web.grpc.stub.InfractionSefvice.InfrationsListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllInfractionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getInfractionById(ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionIdRequest request,
        io.grpc.stub.StreamObserver<ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInfractionByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveInfraction(ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionRequest request,
        io.grpc.stub.StreamObserver<ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveInfractionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteInfraction(ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionIdRequest request,
        io.grpc.stub.StreamObserver<ma.infractionservice.web.grpc.stub.InfractionSefvice.voidInfractioRequest> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteInfractionMethod(), getCallOptions()), request, responseObserver);
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
    public ma.infractionservice.web.grpc.stub.InfractionSefvice.InfrationsListResponse getAllInfractions(ma.infractionservice.web.grpc.stub.InfractionSefvice.voidInfractioRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllInfractionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse getInfractionById(ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetInfractionByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse saveInfraction(ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveInfractionMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.infractionservice.web.grpc.stub.InfractionSefvice.voidInfractioRequest deleteInfraction(ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteInfractionMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<ma.infractionservice.web.grpc.stub.InfractionSefvice.InfrationsListResponse> getAllInfractions(
        ma.infractionservice.web.grpc.stub.InfractionSefvice.voidInfractioRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllInfractionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse> getInfractionById(
        ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInfractionByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse> saveInfraction(
        ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveInfractionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.infractionservice.web.grpc.stub.InfractionSefvice.voidInfractioRequest> deleteInfraction(
        ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteInfractionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_INFRACTIONS = 0;
  private static final int METHODID_GET_INFRACTION_BY_ID = 1;
  private static final int METHODID_SAVE_INFRACTION = 2;
  private static final int METHODID_DELETE_INFRACTION = 3;

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
        case METHODID_GET_ALL_INFRACTIONS:
          serviceImpl.getAllInfractions((ma.infractionservice.web.grpc.stub.InfractionSefvice.voidInfractioRequest) request,
              (io.grpc.stub.StreamObserver<ma.infractionservice.web.grpc.stub.InfractionSefvice.InfrationsListResponse>) responseObserver);
          break;
        case METHODID_GET_INFRACTION_BY_ID:
          serviceImpl.getInfractionById((ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionIdRequest) request,
              (io.grpc.stub.StreamObserver<ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse>) responseObserver);
          break;
        case METHODID_SAVE_INFRACTION:
          serviceImpl.saveInfraction((ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionRequest) request,
              (io.grpc.stub.StreamObserver<ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionResponse>) responseObserver);
          break;
        case METHODID_DELETE_INFRACTION:
          serviceImpl.deleteInfraction((ma.infractionservice.web.grpc.stub.InfractionSefvice.InfractionIdRequest) request,
              (io.grpc.stub.StreamObserver<ma.infractionservice.web.grpc.stub.InfractionSefvice.voidInfractioRequest>) responseObserver);
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
              .addMethod(getGetAllInfractionsMethod())
              .addMethod(getGetInfractionByIdMethod())
              .addMethod(getSaveInfractionMethod())
              .addMethod(getDeleteInfractionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
