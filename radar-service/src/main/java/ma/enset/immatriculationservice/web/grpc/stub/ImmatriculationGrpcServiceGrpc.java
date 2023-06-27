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
  private static volatile io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject,
      ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculesList> getGetAllVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllVehicule",
      requestType = ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject.class,
      responseType = ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject,
      ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculesList> getGetAllVehiculeMethod() {
    io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject, ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculesList> getGetAllVehiculeMethod;
    if ((getGetAllVehiculeMethod = ImmatriculationGrpcServiceGrpc.getGetAllVehiculeMethod) == null) {
      synchronized (ImmatriculationGrpcServiceGrpc.class) {
        if ((getGetAllVehiculeMethod = ImmatriculationGrpcServiceGrpc.getGetAllVehiculeMethod) == null) {
          ImmatriculationGrpcServiceGrpc.getGetAllVehiculeMethod = getGetAllVehiculeMethod = 
              io.grpc.MethodDescriptor.<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject, ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationGrpcService", "getAllVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculesList.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationGrpcServiceMethodDescriptorSupplier("getAllVehicule"))
                  .build();
          }
        }
     }
     return getGetAllVehiculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest,
      ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse> getGetVehiculeByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVehiculeById",
      requestType = ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest.class,
      responseType = ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest,
      ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse> getGetVehiculeByIdMethod() {
    io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest, ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse> getGetVehiculeByIdMethod;
    if ((getGetVehiculeByIdMethod = ImmatriculationGrpcServiceGrpc.getGetVehiculeByIdMethod) == null) {
      synchronized (ImmatriculationGrpcServiceGrpc.class) {
        if ((getGetVehiculeByIdMethod = ImmatriculationGrpcServiceGrpc.getGetVehiculeByIdMethod) == null) {
          ImmatriculationGrpcServiceGrpc.getGetVehiculeByIdMethod = getGetVehiculeByIdMethod = 
              io.grpc.MethodDescriptor.<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest, ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationGrpcService", "getVehiculeById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationGrpcServiceMethodDescriptorSupplier("getVehiculeById"))
                  .build();
          }
        }
     }
     return getGetVehiculeByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeRequest,
      ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse> getSaveVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveVehicule",
      requestType = ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeRequest.class,
      responseType = ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeRequest,
      ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse> getSaveVehiculeMethod() {
    io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeRequest, ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse> getSaveVehiculeMethod;
    if ((getSaveVehiculeMethod = ImmatriculationGrpcServiceGrpc.getSaveVehiculeMethod) == null) {
      synchronized (ImmatriculationGrpcServiceGrpc.class) {
        if ((getSaveVehiculeMethod = ImmatriculationGrpcServiceGrpc.getSaveVehiculeMethod) == null) {
          ImmatriculationGrpcServiceGrpc.getSaveVehiculeMethod = getSaveVehiculeMethod = 
              io.grpc.MethodDescriptor.<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeRequest, ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationGrpcService", "saveVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationGrpcServiceMethodDescriptorSupplier("saveVehicule"))
                  .build();
          }
        }
     }
     return getSaveVehiculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest,
      ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject> getDeletVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deletVehicule",
      requestType = ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest.class,
      responseType = ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest,
      ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject> getDeletVehiculeMethod() {
    io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest, ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject> getDeletVehiculeMethod;
    if ((getDeletVehiculeMethod = ImmatriculationGrpcServiceGrpc.getDeletVehiculeMethod) == null) {
      synchronized (ImmatriculationGrpcServiceGrpc.class) {
        if ((getDeletVehiculeMethod = ImmatriculationGrpcServiceGrpc.getDeletVehiculeMethod) == null) {
          ImmatriculationGrpcServiceGrpc.getDeletVehiculeMethod = getDeletVehiculeMethod = 
              io.grpc.MethodDescriptor.<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest, ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationGrpcService", "deletVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationGrpcServiceMethodDescriptorSupplier("deletVehicule"))
                  .build();
          }
        }
     }
     return getDeletVehiculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Matricule,
      ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse> getGetVehiculeByMatriculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVehiculeByMatricule",
      requestType = ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Matricule.class,
      responseType = ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Matricule,
      ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse> getGetVehiculeByMatriculeMethod() {
    io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Matricule, ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse> getGetVehiculeByMatriculeMethod;
    if ((getGetVehiculeByMatriculeMethod = ImmatriculationGrpcServiceGrpc.getGetVehiculeByMatriculeMethod) == null) {
      synchronized (ImmatriculationGrpcServiceGrpc.class) {
        if ((getGetVehiculeByMatriculeMethod = ImmatriculationGrpcServiceGrpc.getGetVehiculeByMatriculeMethod) == null) {
          ImmatriculationGrpcServiceGrpc.getGetVehiculeByMatriculeMethod = getGetVehiculeByMatriculeMethod = 
              io.grpc.MethodDescriptor.<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Matricule, ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationGrpcService", "getVehiculeByMatricule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Matricule.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationGrpcServiceMethodDescriptorSupplier("getVehiculeByMatricule"))
                  .build();
          }
        }
     }
     return getGetVehiculeByMatriculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest,
      ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse> getGetProprietaireOfVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProprietaireOfVehicule",
      requestType = ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest.class,
      responseType = ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest,
      ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse> getGetProprietaireOfVehiculeMethod() {
    io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest, ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse> getGetProprietaireOfVehiculeMethod;
    if ((getGetProprietaireOfVehiculeMethod = ImmatriculationGrpcServiceGrpc.getGetProprietaireOfVehiculeMethod) == null) {
      synchronized (ImmatriculationGrpcServiceGrpc.class) {
        if ((getGetProprietaireOfVehiculeMethod = ImmatriculationGrpcServiceGrpc.getGetProprietaireOfVehiculeMethod) == null) {
          ImmatriculationGrpcServiceGrpc.getGetProprietaireOfVehiculeMethod = getGetProprietaireOfVehiculeMethod = 
              io.grpc.MethodDescriptor.<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest, ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationGrpcService", "getProprietaireOfVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationGrpcServiceMethodDescriptorSupplier("getProprietaireOfVehicule"))
                  .build();
          }
        }
     }
     return getGetProprietaireOfVehiculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject,
      ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietairesList> getGetAllProprietaireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllProprietaire",
      requestType = ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject.class,
      responseType = ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietairesList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject,
      ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietairesList> getGetAllProprietaireMethod() {
    io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject, ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietairesList> getGetAllProprietaireMethod;
    if ((getGetAllProprietaireMethod = ImmatriculationGrpcServiceGrpc.getGetAllProprietaireMethod) == null) {
      synchronized (ImmatriculationGrpcServiceGrpc.class) {
        if ((getGetAllProprietaireMethod = ImmatriculationGrpcServiceGrpc.getGetAllProprietaireMethod) == null) {
          ImmatriculationGrpcServiceGrpc.getGetAllProprietaireMethod = getGetAllProprietaireMethod = 
              io.grpc.MethodDescriptor.<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject, ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietairesList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationGrpcService", "getAllProprietaire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietairesList.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationGrpcServiceMethodDescriptorSupplier("getAllProprietaire"))
                  .build();
          }
        }
     }
     return getGetAllProprietaireMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireIdRequest,
      ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse> getGetProprietaireByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProprietaireById",
      requestType = ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireIdRequest.class,
      responseType = ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireIdRequest,
      ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse> getGetProprietaireByIdMethod() {
    io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireIdRequest, ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse> getGetProprietaireByIdMethod;
    if ((getGetProprietaireByIdMethod = ImmatriculationGrpcServiceGrpc.getGetProprietaireByIdMethod) == null) {
      synchronized (ImmatriculationGrpcServiceGrpc.class) {
        if ((getGetProprietaireByIdMethod = ImmatriculationGrpcServiceGrpc.getGetProprietaireByIdMethod) == null) {
          ImmatriculationGrpcServiceGrpc.getGetProprietaireByIdMethod = getGetProprietaireByIdMethod = 
              io.grpc.MethodDescriptor.<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireIdRequest, ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationGrpcService", "getProprietaireById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationGrpcServiceMethodDescriptorSupplier("getProprietaireById"))
                  .build();
          }
        }
     }
     return getGetProprietaireByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireRequest,
      ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse> getSaveProprietaireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveProprietaire",
      requestType = ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireRequest.class,
      responseType = ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireRequest,
      ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse> getSaveProprietaireMethod() {
    io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireRequest, ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse> getSaveProprietaireMethod;
    if ((getSaveProprietaireMethod = ImmatriculationGrpcServiceGrpc.getSaveProprietaireMethod) == null) {
      synchronized (ImmatriculationGrpcServiceGrpc.class) {
        if ((getSaveProprietaireMethod = ImmatriculationGrpcServiceGrpc.getSaveProprietaireMethod) == null) {
          ImmatriculationGrpcServiceGrpc.getSaveProprietaireMethod = getSaveProprietaireMethod = 
              io.grpc.MethodDescriptor.<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireRequest, ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationGrpcService", "saveProprietaire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationGrpcServiceMethodDescriptorSupplier("saveProprietaire"))
                  .build();
          }
        }
     }
     return getSaveProprietaireMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireIdRequest,
      ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject> getDeletProprietaireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deletProprietaire",
      requestType = ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireIdRequest.class,
      responseType = ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireIdRequest,
      ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject> getDeletProprietaireMethod() {
    io.grpc.MethodDescriptor<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireIdRequest, ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject> getDeletProprietaireMethod;
    if ((getDeletProprietaireMethod = ImmatriculationGrpcServiceGrpc.getDeletProprietaireMethod) == null) {
      synchronized (ImmatriculationGrpcServiceGrpc.class) {
        if ((getDeletProprietaireMethod = ImmatriculationGrpcServiceGrpc.getDeletProprietaireMethod) == null) {
          ImmatriculationGrpcServiceGrpc.getDeletProprietaireMethod = getDeletProprietaireMethod = 
              io.grpc.MethodDescriptor.<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireIdRequest, ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationGrpcService", "deletProprietaire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationGrpcServiceMethodDescriptorSupplier("deletProprietaire"))
                  .build();
          }
        }
     }
     return getDeletProprietaireMethod;
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
    public void getAllVehicule(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculesList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllVehiculeMethod(), responseObserver);
    }

    /**
     */
    public void getVehiculeById(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVehiculeByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveVehicule(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveVehiculeMethod(), responseObserver);
    }

    /**
     */
    public void deletVehicule(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletVehiculeMethod(), responseObserver);
    }

    /**
     */
    public void getVehiculeByMatricule(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Matricule request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVehiculeByMatriculeMethod(), responseObserver);
    }

    /**
     */
    public void getProprietaireOfVehicule(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProprietaireOfVehiculeMethod(), responseObserver);
    }

    /**
     */
    public void getAllProprietaire(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietairesList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllProprietaireMethod(), responseObserver);
    }

    /**
     */
    public void getProprietaireById(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireIdRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProprietaireByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveProprietaire(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveProprietaireMethod(), responseObserver);
    }

    /**
     */
    public void deletProprietaire(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireIdRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletProprietaireMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject,
                ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculesList>(
                  this, METHODID_GET_ALL_VEHICULE)))
          .addMethod(
            getGetVehiculeByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest,
                ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse>(
                  this, METHODID_GET_VEHICULE_BY_ID)))
          .addMethod(
            getSaveVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeRequest,
                ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse>(
                  this, METHODID_SAVE_VEHICULE)))
          .addMethod(
            getDeletVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest,
                ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject>(
                  this, METHODID_DELET_VEHICULE)))
          .addMethod(
            getGetVehiculeByMatriculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Matricule,
                ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse>(
                  this, METHODID_GET_VEHICULE_BY_MATRICULE)))
          .addMethod(
            getGetProprietaireOfVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest,
                ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse>(
                  this, METHODID_GET_PROPRIETAIRE_OF_VEHICULE)))
          .addMethod(
            getGetAllProprietaireMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject,
                ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietairesList>(
                  this, METHODID_GET_ALL_PROPRIETAIRE)))
          .addMethod(
            getGetProprietaireByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireIdRequest,
                ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse>(
                  this, METHODID_GET_PROPRIETAIRE_BY_ID)))
          .addMethod(
            getSaveProprietaireMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireRequest,
                ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse>(
                  this, METHODID_SAVE_PROPRIETAIRE)))
          .addMethod(
            getDeletProprietaireMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireIdRequest,
                ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject>(
                  this, METHODID_DELET_PROPRIETAIRE)))
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
    public void getAllVehicule(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculesList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllVehiculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVehiculeById(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVehiculeByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveVehicule(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveVehiculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletVehicule(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletVehiculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVehiculeByMatricule(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Matricule request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVehiculeByMatriculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProprietaireOfVehicule(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProprietaireOfVehiculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllProprietaire(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietairesList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllProprietaireMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProprietaireById(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireIdRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProprietaireByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveProprietaire(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveProprietaireMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletProprietaire(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireIdRequest request,
        io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletProprietaireMethod(), getCallOptions()), request, responseObserver);
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
    public ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculesList getAllVehicule(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject request) {
      return blockingUnaryCall(
          getChannel(), getGetAllVehiculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse getVehiculeById(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVehiculeByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse saveVehicule(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveVehiculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject deletVehicule(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeletVehiculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse getVehiculeByMatricule(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Matricule request) {
      return blockingUnaryCall(
          getChannel(), getGetVehiculeByMatriculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse getProprietaireOfVehicule(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProprietaireOfVehiculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietairesList getAllProprietaire(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject request) {
      return blockingUnaryCall(
          getChannel(), getGetAllProprietaireMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse getProprietaireById(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProprietaireByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse saveProprietaire(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveProprietaireMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject deletProprietaire(ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeletProprietaireMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculesList> getAllVehicule(
        ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllVehiculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse> getVehiculeById(
        ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVehiculeByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse> saveVehicule(
        ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveVehiculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject> deletVehicule(
        ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletVehiculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse> getVehiculeByMatricule(
        ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Matricule request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVehiculeByMatriculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse> getProprietaireOfVehicule(
        ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProprietaireOfVehiculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietairesList> getAllProprietaire(
        ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllProprietaireMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse> getProprietaireById(
        ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProprietaireByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse> saveProprietaire(
        ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveProprietaireMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject> deletProprietaire(
        ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletProprietaireMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_VEHICULE = 0;
  private static final int METHODID_GET_VEHICULE_BY_ID = 1;
  private static final int METHODID_SAVE_VEHICULE = 2;
  private static final int METHODID_DELET_VEHICULE = 3;
  private static final int METHODID_GET_VEHICULE_BY_MATRICULE = 4;
  private static final int METHODID_GET_PROPRIETAIRE_OF_VEHICULE = 5;
  private static final int METHODID_GET_ALL_PROPRIETAIRE = 6;
  private static final int METHODID_GET_PROPRIETAIRE_BY_ID = 7;
  private static final int METHODID_SAVE_PROPRIETAIRE = 8;
  private static final int METHODID_DELET_PROPRIETAIRE = 9;

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
        case METHODID_GET_ALL_VEHICULE:
          serviceImpl.getAllVehicule((ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject) request,
              (io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculesList>) responseObserver);
          break;
        case METHODID_GET_VEHICULE_BY_ID:
          serviceImpl.getVehiculeById((ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse>) responseObserver);
          break;
        case METHODID_SAVE_VEHICULE:
          serviceImpl.saveVehicule((ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse>) responseObserver);
          break;
        case METHODID_DELET_VEHICULE:
          serviceImpl.deletVehicule((ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject>) responseObserver);
          break;
        case METHODID_GET_VEHICULE_BY_MATRICULE:
          serviceImpl.getVehiculeByMatricule((ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Matricule) request,
              (io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse>) responseObserver);
          break;
        case METHODID_GET_PROPRIETAIRE_OF_VEHICULE:
          serviceImpl.getProprietaireOfVehicule((ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_PROPRIETAIRE:
          serviceImpl.getAllProprietaire((ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject) request,
              (io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietairesList>) responseObserver);
          break;
        case METHODID_GET_PROPRIETAIRE_BY_ID:
          serviceImpl.getProprietaireById((ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireIdRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse>) responseObserver);
          break;
        case METHODID_SAVE_PROPRIETAIRE:
          serviceImpl.saveProprietaire((ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse>) responseObserver);
          break;
        case METHODID_DELET_PROPRIETAIRE:
          serviceImpl.deletProprietaire((ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireIdRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject>) responseObserver);
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
              .addMethod(getGetAllVehiculeMethod())
              .addMethod(getGetVehiculeByIdMethod())
              .addMethod(getSaveVehiculeMethod())
              .addMethod(getDeletVehiculeMethod())
              .addMethod(getGetVehiculeByMatriculeMethod())
              .addMethod(getGetProprietaireOfVehiculeMethod())
              .addMethod(getGetAllProprietaireMethod())
              .addMethod(getGetProprietaireByIdMethod())
              .addMethod(getSaveProprietaireMethod())
              .addMethod(getDeletProprietaireMethod())
              .build();
        }
      }
    }
    return result;
  }
}
