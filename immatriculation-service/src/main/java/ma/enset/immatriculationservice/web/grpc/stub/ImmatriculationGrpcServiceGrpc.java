package ma.enset.immatriculationservice.web.grpc.stub;

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
    comments = "Source: ImmatriculationService.proto")
public final class ImmatriculationGrpcServiceGrpc {

  private ImmatriculationGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "ImmatriculationGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Matricule,
      ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicule> getGetVehiculeByMatriculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVehiculeByMatricule",
      requestType = ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Matricule.class,
      responseType = ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Matricule,
      ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicule> getGetVehiculeByMatriculeMethod() {
    io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Matricule, ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicule> getGetVehiculeByMatriculeMethod;
    if ((getGetVehiculeByMatriculeMethod = ImmatriculationGrpcServiceGrpc.getGetVehiculeByMatriculeMethod) == null) {
      synchronized (ImmatriculationGrpcServiceGrpc.class) {
        if ((getGetVehiculeByMatriculeMethod = ImmatriculationGrpcServiceGrpc.getGetVehiculeByMatriculeMethod) == null) {
          ImmatriculationGrpcServiceGrpc.getGetVehiculeByMatriculeMethod = getGetVehiculeByMatriculeMethod = 
              io.grpc.MethodDescriptor.<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Matricule, ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationGrpcService", "getVehiculeByMatricule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Matricule.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicule.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationGrpcServiceMethodDescriptorSupplier("getVehiculeByMatricule"))
                  .build();
          }
        }
     }
     return getGetVehiculeByMatriculeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImmatriculationGrpcServiceStub newStub(io.grpc.Channel channel) {
    return new ImmatriculationGrpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImmatriculationGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ImmatriculationGrpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImmatriculationGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ImmatriculationGrpcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ImmatriculationGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getVehiculeByMatricule(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Matricule request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicule> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVehiculeByMatriculeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetVehiculeByMatriculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Matricule,
                ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicule>(
                  this, METHODID_GET_VEHICULE_BY_MATRICULE)))
          .build();
    }
  }

  /**
   */
  public static final class ImmatriculationGrpcServiceStub extends io.grpc.stub.AbstractStub<ImmatriculationGrpcServiceStub> {
    private ImmatriculationGrpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationGrpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationGrpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void getVehiculeByMatricule(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Matricule request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicule> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVehiculeByMatriculeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ImmatriculationGrpcServiceBlockingStub extends io.grpc.stub.AbstractStub<ImmatriculationGrpcServiceBlockingStub> {
    private ImmatriculationGrpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationGrpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationGrpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicule getVehiculeByMatricule(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Matricule request) {
      return blockingUnaryCall(
          getChannel(), getGetVehiculeByMatriculeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ImmatriculationGrpcServiceFutureStub extends io.grpc.stub.AbstractStub<ImmatriculationGrpcServiceFutureStub> {
    private ImmatriculationGrpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationGrpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationGrpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicule> getVehiculeByMatricule(
        ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Matricule request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVehiculeByMatriculeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VEHICULE_BY_MATRICULE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImmatriculationGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImmatriculationGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_VEHICULE_BY_MATRICULE:
          serviceImpl.getVehiculeByMatricule((ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Matricule) request,
              (io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicule>) responseObserver);
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

  private static abstract class ImmatriculationGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImmatriculationGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImmatriculationGrpcService");
    }
  }

  private static final class ImmatriculationGrpcServiceFileDescriptorSupplier
      extends ImmatriculationGrpcServiceBaseDescriptorSupplier {
    ImmatriculationGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class ImmatriculationGrpcServiceMethodDescriptorSupplier
      extends ImmatriculationGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImmatriculationGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ImmatriculationGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImmatriculationGrpcServiceFileDescriptorSupplier())
              .addMethod(getGetVehiculeByMatriculeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
