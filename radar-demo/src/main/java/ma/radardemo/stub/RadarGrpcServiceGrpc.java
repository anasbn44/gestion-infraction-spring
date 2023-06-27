package ma.radardemo.stub;

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
    comments = "Source: RadarService.proto")
public final class RadarGrpcServiceGrpc {

  private RadarGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "RadarGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.radardemo.stub.RadarService.EmptyRadar,
      ma.radardemo.stub.RadarService.RadarsList> getGetAllRadarsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllRadars",
      requestType = ma.radardemo.stub.RadarService.EmptyRadar.class,
      responseType = ma.radardemo.stub.RadarService.RadarsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.radardemo.stub.RadarService.EmptyRadar,
      ma.radardemo.stub.RadarService.RadarsList> getGetAllRadarsMethod() {
    io.grpc.MethodDescriptor<ma.radardemo.stub.RadarService.EmptyRadar, ma.radardemo.stub.RadarService.RadarsList> getGetAllRadarsMethod;
    if ((getGetAllRadarsMethod = RadarGrpcServiceGrpc.getGetAllRadarsMethod) == null) {
      synchronized (RadarGrpcServiceGrpc.class) {
        if ((getGetAllRadarsMethod = RadarGrpcServiceGrpc.getGetAllRadarsMethod) == null) {
          RadarGrpcServiceGrpc.getGetAllRadarsMethod = getGetAllRadarsMethod = 
              io.grpc.MethodDescriptor.<ma.radardemo.stub.RadarService.EmptyRadar, ma.radardemo.stub.RadarService.RadarsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RadarGrpcService", "getAllRadars"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.radardemo.stub.RadarService.EmptyRadar.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.radardemo.stub.RadarService.RadarsList.getDefaultInstance()))
                  .setSchemaDescriptor(new RadarGrpcServiceMethodDescriptorSupplier("getAllRadars"))
                  .build();
          }
        }
     }
     return getGetAllRadarsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.radardemo.stub.RadarService.RadarIdRequest,
      ma.radardemo.stub.RadarService.RadarResponse> getGetRadarByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRadarById",
      requestType = ma.radardemo.stub.RadarService.RadarIdRequest.class,
      responseType = ma.radardemo.stub.RadarService.RadarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.radardemo.stub.RadarService.RadarIdRequest,
      ma.radardemo.stub.RadarService.RadarResponse> getGetRadarByIdMethod() {
    io.grpc.MethodDescriptor<ma.radardemo.stub.RadarService.RadarIdRequest, ma.radardemo.stub.RadarService.RadarResponse> getGetRadarByIdMethod;
    if ((getGetRadarByIdMethod = RadarGrpcServiceGrpc.getGetRadarByIdMethod) == null) {
      synchronized (RadarGrpcServiceGrpc.class) {
        if ((getGetRadarByIdMethod = RadarGrpcServiceGrpc.getGetRadarByIdMethod) == null) {
          RadarGrpcServiceGrpc.getGetRadarByIdMethod = getGetRadarByIdMethod = 
              io.grpc.MethodDescriptor.<ma.radardemo.stub.RadarService.RadarIdRequest, ma.radardemo.stub.RadarService.RadarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RadarGrpcService", "getRadarById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.radardemo.stub.RadarService.RadarIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.radardemo.stub.RadarService.RadarResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadarGrpcServiceMethodDescriptorSupplier("getRadarById"))
                  .build();
          }
        }
     }
     return getGetRadarByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.radardemo.stub.RadarService.RadarRequest,
      ma.radardemo.stub.RadarService.RadarResponse> getSaveRadarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveRadar",
      requestType = ma.radardemo.stub.RadarService.RadarRequest.class,
      responseType = ma.radardemo.stub.RadarService.RadarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.radardemo.stub.RadarService.RadarRequest,
      ma.radardemo.stub.RadarService.RadarResponse> getSaveRadarMethod() {
    io.grpc.MethodDescriptor<ma.radardemo.stub.RadarService.RadarRequest, ma.radardemo.stub.RadarService.RadarResponse> getSaveRadarMethod;
    if ((getSaveRadarMethod = RadarGrpcServiceGrpc.getSaveRadarMethod) == null) {
      synchronized (RadarGrpcServiceGrpc.class) {
        if ((getSaveRadarMethod = RadarGrpcServiceGrpc.getSaveRadarMethod) == null) {
          RadarGrpcServiceGrpc.getSaveRadarMethod = getSaveRadarMethod = 
              io.grpc.MethodDescriptor.<ma.radardemo.stub.RadarService.RadarRequest, ma.radardemo.stub.RadarService.RadarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RadarGrpcService", "saveRadar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.radardemo.stub.RadarService.RadarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.radardemo.stub.RadarService.RadarResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadarGrpcServiceMethodDescriptorSupplier("saveRadar"))
                  .build();
          }
        }
     }
     return getSaveRadarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.radardemo.stub.RadarService.UpdateRadarRequest,
      ma.radardemo.stub.RadarService.RadarResponse> getUpdateRadarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateRadar",
      requestType = ma.radardemo.stub.RadarService.UpdateRadarRequest.class,
      responseType = ma.radardemo.stub.RadarService.RadarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.radardemo.stub.RadarService.UpdateRadarRequest,
      ma.radardemo.stub.RadarService.RadarResponse> getUpdateRadarMethod() {
    io.grpc.MethodDescriptor<ma.radardemo.stub.RadarService.UpdateRadarRequest, ma.radardemo.stub.RadarService.RadarResponse> getUpdateRadarMethod;
    if ((getUpdateRadarMethod = RadarGrpcServiceGrpc.getUpdateRadarMethod) == null) {
      synchronized (RadarGrpcServiceGrpc.class) {
        if ((getUpdateRadarMethod = RadarGrpcServiceGrpc.getUpdateRadarMethod) == null) {
          RadarGrpcServiceGrpc.getUpdateRadarMethod = getUpdateRadarMethod = 
              io.grpc.MethodDescriptor.<ma.radardemo.stub.RadarService.UpdateRadarRequest, ma.radardemo.stub.RadarService.RadarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RadarGrpcService", "updateRadar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.radardemo.stub.RadarService.UpdateRadarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.radardemo.stub.RadarService.RadarResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadarGrpcServiceMethodDescriptorSupplier("updateRadar"))
                  .build();
          }
        }
     }
     return getUpdateRadarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.radardemo.stub.RadarService.RadarIdRequest,
      ma.radardemo.stub.RadarService.EmptyRadar> getDeleteRadarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteRadar",
      requestType = ma.radardemo.stub.RadarService.RadarIdRequest.class,
      responseType = ma.radardemo.stub.RadarService.EmptyRadar.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.radardemo.stub.RadarService.RadarIdRequest,
      ma.radardemo.stub.RadarService.EmptyRadar> getDeleteRadarMethod() {
    io.grpc.MethodDescriptor<ma.radardemo.stub.RadarService.RadarIdRequest, ma.radardemo.stub.RadarService.EmptyRadar> getDeleteRadarMethod;
    if ((getDeleteRadarMethod = RadarGrpcServiceGrpc.getDeleteRadarMethod) == null) {
      synchronized (RadarGrpcServiceGrpc.class) {
        if ((getDeleteRadarMethod = RadarGrpcServiceGrpc.getDeleteRadarMethod) == null) {
          RadarGrpcServiceGrpc.getDeleteRadarMethod = getDeleteRadarMethod = 
              io.grpc.MethodDescriptor.<ma.radardemo.stub.RadarService.RadarIdRequest, ma.radardemo.stub.RadarService.EmptyRadar>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RadarGrpcService", "deleteRadar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.radardemo.stub.RadarService.RadarIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.radardemo.stub.RadarService.EmptyRadar.getDefaultInstance()))
                  .setSchemaDescriptor(new RadarGrpcServiceMethodDescriptorSupplier("deleteRadar"))
                  .build();
          }
        }
     }
     return getDeleteRadarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.radardemo.stub.RadarService.GenerateInfractionRequest,
      ma.radardemo.stub.RadarService.InfractionResponse> getGenerateInfractionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "generateInfraction",
      requestType = ma.radardemo.stub.RadarService.GenerateInfractionRequest.class,
      responseType = ma.radardemo.stub.RadarService.InfractionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.radardemo.stub.RadarService.GenerateInfractionRequest,
      ma.radardemo.stub.RadarService.InfractionResponse> getGenerateInfractionMethod() {
    io.grpc.MethodDescriptor<ma.radardemo.stub.RadarService.GenerateInfractionRequest, ma.radardemo.stub.RadarService.InfractionResponse> getGenerateInfractionMethod;
    if ((getGenerateInfractionMethod = RadarGrpcServiceGrpc.getGenerateInfractionMethod) == null) {
      synchronized (RadarGrpcServiceGrpc.class) {
        if ((getGenerateInfractionMethod = RadarGrpcServiceGrpc.getGenerateInfractionMethod) == null) {
          RadarGrpcServiceGrpc.getGenerateInfractionMethod = getGenerateInfractionMethod = 
              io.grpc.MethodDescriptor.<ma.radardemo.stub.RadarService.GenerateInfractionRequest, ma.radardemo.stub.RadarService.InfractionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RadarGrpcService", "generateInfraction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.radardemo.stub.RadarService.GenerateInfractionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.radardemo.stub.RadarService.InfractionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadarGrpcServiceMethodDescriptorSupplier("generateInfraction"))
                  .build();
          }
        }
     }
     return getGenerateInfractionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RadarGrpcServiceStub newStub(io.grpc.Channel channel) {
    return new RadarGrpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RadarGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RadarGrpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RadarGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RadarGrpcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RadarGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllRadars(ma.radardemo.stub.RadarService.EmptyRadar request,
        io.grpc.stub.StreamObserver<ma.radardemo.stub.RadarService.RadarsList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllRadarsMethod(), responseObserver);
    }

    /**
     */
    public void getRadarById(ma.radardemo.stub.RadarService.RadarIdRequest request,
        io.grpc.stub.StreamObserver<ma.radardemo.stub.RadarService.RadarResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRadarByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveRadar(ma.radardemo.stub.RadarService.RadarRequest request,
        io.grpc.stub.StreamObserver<ma.radardemo.stub.RadarService.RadarResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveRadarMethod(), responseObserver);
    }

    /**
     */
    public void updateRadar(ma.radardemo.stub.RadarService.UpdateRadarRequest request,
        io.grpc.stub.StreamObserver<ma.radardemo.stub.RadarService.RadarResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateRadarMethod(), responseObserver);
    }

    /**
     */
    public void deleteRadar(ma.radardemo.stub.RadarService.RadarIdRequest request,
        io.grpc.stub.StreamObserver<ma.radardemo.stub.RadarService.EmptyRadar> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteRadarMethod(), responseObserver);
    }

    /**
     */
    public void generateInfraction(ma.radardemo.stub.RadarService.GenerateInfractionRequest request,
        io.grpc.stub.StreamObserver<ma.radardemo.stub.RadarService.InfractionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateInfractionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllRadarsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.radardemo.stub.RadarService.EmptyRadar,
                ma.radardemo.stub.RadarService.RadarsList>(
                  this, METHODID_GET_ALL_RADARS)))
          .addMethod(
            getGetRadarByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.radardemo.stub.RadarService.RadarIdRequest,
                ma.radardemo.stub.RadarService.RadarResponse>(
                  this, METHODID_GET_RADAR_BY_ID)))
          .addMethod(
            getSaveRadarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.radardemo.stub.RadarService.RadarRequest,
                ma.radardemo.stub.RadarService.RadarResponse>(
                  this, METHODID_SAVE_RADAR)))
          .addMethod(
            getUpdateRadarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.radardemo.stub.RadarService.UpdateRadarRequest,
                ma.radardemo.stub.RadarService.RadarResponse>(
                  this, METHODID_UPDATE_RADAR)))
          .addMethod(
            getDeleteRadarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.radardemo.stub.RadarService.RadarIdRequest,
                ma.radardemo.stub.RadarService.EmptyRadar>(
                  this, METHODID_DELETE_RADAR)))
          .addMethod(
            getGenerateInfractionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.radardemo.stub.RadarService.GenerateInfractionRequest,
                ma.radardemo.stub.RadarService.InfractionResponse>(
                  this, METHODID_GENERATE_INFRACTION)))
          .build();
    }
  }

  /**
   */
  public static final class RadarGrpcServiceStub extends io.grpc.stub.AbstractStub<RadarGrpcServiceStub> {
    private RadarGrpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadarGrpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadarGrpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadarGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllRadars(ma.radardemo.stub.RadarService.EmptyRadar request,
        io.grpc.stub.StreamObserver<ma.radardemo.stub.RadarService.RadarsList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllRadarsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRadarById(ma.radardemo.stub.RadarService.RadarIdRequest request,
        io.grpc.stub.StreamObserver<ma.radardemo.stub.RadarService.RadarResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRadarByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveRadar(ma.radardemo.stub.RadarService.RadarRequest request,
        io.grpc.stub.StreamObserver<ma.radardemo.stub.RadarService.RadarResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveRadarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRadar(ma.radardemo.stub.RadarService.UpdateRadarRequest request,
        io.grpc.stub.StreamObserver<ma.radardemo.stub.RadarService.RadarResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateRadarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRadar(ma.radardemo.stub.RadarService.RadarIdRequest request,
        io.grpc.stub.StreamObserver<ma.radardemo.stub.RadarService.EmptyRadar> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteRadarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generateInfraction(ma.radardemo.stub.RadarService.GenerateInfractionRequest request,
        io.grpc.stub.StreamObserver<ma.radardemo.stub.RadarService.InfractionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateInfractionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RadarGrpcServiceBlockingStub extends io.grpc.stub.AbstractStub<RadarGrpcServiceBlockingStub> {
    private RadarGrpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadarGrpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadarGrpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadarGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ma.radardemo.stub.RadarService.RadarsList getAllRadars(ma.radardemo.stub.RadarService.EmptyRadar request) {
      return blockingUnaryCall(
          getChannel(), getGetAllRadarsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.radardemo.stub.RadarService.RadarResponse getRadarById(ma.radardemo.stub.RadarService.RadarIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRadarByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.radardemo.stub.RadarService.RadarResponse saveRadar(ma.radardemo.stub.RadarService.RadarRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveRadarMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.radardemo.stub.RadarService.RadarResponse updateRadar(ma.radardemo.stub.RadarService.UpdateRadarRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateRadarMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.radardemo.stub.RadarService.EmptyRadar deleteRadar(ma.radardemo.stub.RadarService.RadarIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteRadarMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.radardemo.stub.RadarService.InfractionResponse generateInfraction(ma.radardemo.stub.RadarService.GenerateInfractionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGenerateInfractionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RadarGrpcServiceFutureStub extends io.grpc.stub.AbstractStub<RadarGrpcServiceFutureStub> {
    private RadarGrpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadarGrpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadarGrpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadarGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.radardemo.stub.RadarService.RadarsList> getAllRadars(
        ma.radardemo.stub.RadarService.EmptyRadar request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllRadarsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.radardemo.stub.RadarService.RadarResponse> getRadarById(
        ma.radardemo.stub.RadarService.RadarIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRadarByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.radardemo.stub.RadarService.RadarResponse> saveRadar(
        ma.radardemo.stub.RadarService.RadarRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveRadarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.radardemo.stub.RadarService.RadarResponse> updateRadar(
        ma.radardemo.stub.RadarService.UpdateRadarRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateRadarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.radardemo.stub.RadarService.EmptyRadar> deleteRadar(
        ma.radardemo.stub.RadarService.RadarIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteRadarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.radardemo.stub.RadarService.InfractionResponse> generateInfraction(
        ma.radardemo.stub.RadarService.GenerateInfractionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateInfractionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_RADARS = 0;
  private static final int METHODID_GET_RADAR_BY_ID = 1;
  private static final int METHODID_SAVE_RADAR = 2;
  private static final int METHODID_UPDATE_RADAR = 3;
  private static final int METHODID_DELETE_RADAR = 4;
  private static final int METHODID_GENERATE_INFRACTION = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RadarGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RadarGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_RADARS:
          serviceImpl.getAllRadars((ma.radardemo.stub.RadarService.EmptyRadar) request,
              (io.grpc.stub.StreamObserver<ma.radardemo.stub.RadarService.RadarsList>) responseObserver);
          break;
        case METHODID_GET_RADAR_BY_ID:
          serviceImpl.getRadarById((ma.radardemo.stub.RadarService.RadarIdRequest) request,
              (io.grpc.stub.StreamObserver<ma.radardemo.stub.RadarService.RadarResponse>) responseObserver);
          break;
        case METHODID_SAVE_RADAR:
          serviceImpl.saveRadar((ma.radardemo.stub.RadarService.RadarRequest) request,
              (io.grpc.stub.StreamObserver<ma.radardemo.stub.RadarService.RadarResponse>) responseObserver);
          break;
        case METHODID_UPDATE_RADAR:
          serviceImpl.updateRadar((ma.radardemo.stub.RadarService.UpdateRadarRequest) request,
              (io.grpc.stub.StreamObserver<ma.radardemo.stub.RadarService.RadarResponse>) responseObserver);
          break;
        case METHODID_DELETE_RADAR:
          serviceImpl.deleteRadar((ma.radardemo.stub.RadarService.RadarIdRequest) request,
              (io.grpc.stub.StreamObserver<ma.radardemo.stub.RadarService.EmptyRadar>) responseObserver);
          break;
        case METHODID_GENERATE_INFRACTION:
          serviceImpl.generateInfraction((ma.radardemo.stub.RadarService.GenerateInfractionRequest) request,
              (io.grpc.stub.StreamObserver<ma.radardemo.stub.RadarService.InfractionResponse>) responseObserver);
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

  private static abstract class RadarGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RadarGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.radardemo.stub.RadarService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RadarGrpcService");
    }
  }

  private static final class RadarGrpcServiceFileDescriptorSupplier
      extends RadarGrpcServiceBaseDescriptorSupplier {
    RadarGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class RadarGrpcServiceMethodDescriptorSupplier
      extends RadarGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RadarGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RadarGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RadarGrpcServiceFileDescriptorSupplier())
              .addMethod(getGetAllRadarsMethod())
              .addMethod(getGetRadarByIdMethod())
              .addMethod(getSaveRadarMethod())
              .addMethod(getUpdateRadarMethod())
              .addMethod(getDeleteRadarMethod())
              .addMethod(getGenerateInfractionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
