package com.zzsong.netty.grpc.hello;

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
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.0)",
    comments = "Source: helloworld.proto")
public final class GreeterGrpc {

  private GreeterGrpc() {}

  public static final String SERVICE_NAME = "com.zzsong.netty.grpc.hello.Greeter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.zzsong.netty.grpc.hello.HelloRequest,
      com.zzsong.netty.grpc.hello.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = com.zzsong.netty.grpc.hello.HelloRequest.class,
      responseType = com.zzsong.netty.grpc.hello.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zzsong.netty.grpc.hello.HelloRequest,
      com.zzsong.netty.grpc.hello.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.zzsong.netty.grpc.hello.HelloRequest, com.zzsong.netty.grpc.hello.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
          GreeterGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<com.zzsong.netty.grpc.hello.HelloRequest, com.zzsong.netty.grpc.hello.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zzsong.netty.grpc.hello.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zzsong.netty.grpc.hello.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zzsong.netty.grpc.hello.StudentRequest,
      com.zzsong.netty.grpc.hello.StudentReply> getGetStudentFromNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudentFromName",
      requestType = com.zzsong.netty.grpc.hello.StudentRequest.class,
      responseType = com.zzsong.netty.grpc.hello.StudentReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.zzsong.netty.grpc.hello.StudentRequest,
      com.zzsong.netty.grpc.hello.StudentReply> getGetStudentFromNameMethod() {
    io.grpc.MethodDescriptor<com.zzsong.netty.grpc.hello.StudentRequest, com.zzsong.netty.grpc.hello.StudentReply> getGetStudentFromNameMethod;
    if ((getGetStudentFromNameMethod = GreeterGrpc.getGetStudentFromNameMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getGetStudentFromNameMethod = GreeterGrpc.getGetStudentFromNameMethod) == null) {
          GreeterGrpc.getGetStudentFromNameMethod = getGetStudentFromNameMethod =
              io.grpc.MethodDescriptor.<com.zzsong.netty.grpc.hello.StudentRequest, com.zzsong.netty.grpc.hello.StudentReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStudentFromName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zzsong.netty.grpc.hello.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zzsong.netty.grpc.hello.StudentReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("GetStudentFromName"))
              .build();
        }
      }
    }
    return getGetStudentFromNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zzsong.netty.grpc.hello.CatRequest,
      com.zzsong.netty.grpc.hello.CatReply> getGetCatFromCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCatFromCategory",
      requestType = com.zzsong.netty.grpc.hello.CatRequest.class,
      responseType = com.zzsong.netty.grpc.hello.CatReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.zzsong.netty.grpc.hello.CatRequest,
      com.zzsong.netty.grpc.hello.CatReply> getGetCatFromCategoryMethod() {
    io.grpc.MethodDescriptor<com.zzsong.netty.grpc.hello.CatRequest, com.zzsong.netty.grpc.hello.CatReply> getGetCatFromCategoryMethod;
    if ((getGetCatFromCategoryMethod = GreeterGrpc.getGetCatFromCategoryMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getGetCatFromCategoryMethod = GreeterGrpc.getGetCatFromCategoryMethod) == null) {
          GreeterGrpc.getGetCatFromCategoryMethod = getGetCatFromCategoryMethod =
              io.grpc.MethodDescriptor.<com.zzsong.netty.grpc.hello.CatRequest, com.zzsong.netty.grpc.hello.CatReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCatFromCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zzsong.netty.grpc.hello.CatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zzsong.netty.grpc.hello.CatReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("GetCatFromCategory"))
              .build();
        }
      }
    }
    return getGetCatFromCategoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zzsong.netty.grpc.hello.PersonRequest,
      com.zzsong.netty.grpc.hello.PersonReply> getGetPersonFromSexBiTalkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPersonFromSexBiTalk",
      requestType = com.zzsong.netty.grpc.hello.PersonRequest.class,
      responseType = com.zzsong.netty.grpc.hello.PersonReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.zzsong.netty.grpc.hello.PersonRequest,
      com.zzsong.netty.grpc.hello.PersonReply> getGetPersonFromSexBiTalkMethod() {
    io.grpc.MethodDescriptor<com.zzsong.netty.grpc.hello.PersonRequest, com.zzsong.netty.grpc.hello.PersonReply> getGetPersonFromSexBiTalkMethod;
    if ((getGetPersonFromSexBiTalkMethod = GreeterGrpc.getGetPersonFromSexBiTalkMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getGetPersonFromSexBiTalkMethod = GreeterGrpc.getGetPersonFromSexBiTalkMethod) == null) {
          GreeterGrpc.getGetPersonFromSexBiTalkMethod = getGetPersonFromSexBiTalkMethod =
              io.grpc.MethodDescriptor.<com.zzsong.netty.grpc.hello.PersonRequest, com.zzsong.netty.grpc.hello.PersonReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPersonFromSexBiTalk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zzsong.netty.grpc.hello.PersonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zzsong.netty.grpc.hello.PersonReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("GetPersonFromSexBiTalk"))
              .build();
        }
      }
    }
    return getGetPersonFromSexBiTalkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterStub>() {
        @java.lang.Override
        public GreeterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterStub(channel, callOptions);
        }
      };
    return GreeterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterBlockingStub>() {
        @java.lang.Override
        public GreeterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterBlockingStub(channel, callOptions);
        }
      };
    return GreeterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterFutureStub>() {
        @java.lang.Override
        public GreeterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterFutureStub(channel, callOptions);
        }
      };
    return GreeterFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class GreeterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(com.zzsong.netty.grpc.hello.HelloRequest request,
        io.grpc.stub.StreamObserver<com.zzsong.netty.grpc.hello.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     */
    public void getStudentFromName(com.zzsong.netty.grpc.hello.StudentRequest request,
        io.grpc.stub.StreamObserver<com.zzsong.netty.grpc.hello.StudentReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStudentFromNameMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.zzsong.netty.grpc.hello.CatRequest> getCatFromCategory(
        io.grpc.stub.StreamObserver<com.zzsong.netty.grpc.hello.CatReply> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetCatFromCategoryMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.zzsong.netty.grpc.hello.PersonRequest> getPersonFromSexBiTalk(
        io.grpc.stub.StreamObserver<com.zzsong.netty.grpc.hello.PersonReply> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetPersonFromSexBiTalkMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.zzsong.netty.grpc.hello.HelloRequest,
                com.zzsong.netty.grpc.hello.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getGetStudentFromNameMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.zzsong.netty.grpc.hello.StudentRequest,
                com.zzsong.netty.grpc.hello.StudentReply>(
                  this, METHODID_GET_STUDENT_FROM_NAME)))
          .addMethod(
            getGetCatFromCategoryMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.zzsong.netty.grpc.hello.CatRequest,
                com.zzsong.netty.grpc.hello.CatReply>(
                  this, METHODID_GET_CAT_FROM_CATEGORY)))
          .addMethod(
            getGetPersonFromSexBiTalkMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.zzsong.netty.grpc.hello.PersonRequest,
                com.zzsong.netty.grpc.hello.PersonReply>(
                  this, METHODID_GET_PERSON_FROM_SEX_BI_TALK)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterStub extends io.grpc.stub.AbstractAsyncStub<GreeterStub> {
    private GreeterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(com.zzsong.netty.grpc.hello.HelloRequest request,
        io.grpc.stub.StreamObserver<com.zzsong.netty.grpc.hello.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStudentFromName(com.zzsong.netty.grpc.hello.StudentRequest request,
        io.grpc.stub.StreamObserver<com.zzsong.netty.grpc.hello.StudentReply> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetStudentFromNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.zzsong.netty.grpc.hello.CatRequest> getCatFromCategory(
        io.grpc.stub.StreamObserver<com.zzsong.netty.grpc.hello.CatReply> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGetCatFromCategoryMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.zzsong.netty.grpc.hello.PersonRequest> getPersonFromSexBiTalk(
        io.grpc.stub.StreamObserver<com.zzsong.netty.grpc.hello.PersonReply> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGetPersonFromSexBiTalkMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterBlockingStub extends io.grpc.stub.AbstractBlockingStub<GreeterBlockingStub> {
    private GreeterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.zzsong.netty.grpc.hello.HelloReply sayHello(com.zzsong.netty.grpc.hello.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.zzsong.netty.grpc.hello.StudentReply> getStudentFromName(
        com.zzsong.netty.grpc.hello.StudentRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetStudentFromNameMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterFutureStub extends io.grpc.stub.AbstractFutureStub<GreeterFutureStub> {
    private GreeterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zzsong.netty.grpc.hello.HelloReply> sayHello(
        com.zzsong.netty.grpc.hello.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_GET_STUDENT_FROM_NAME = 1;
  private static final int METHODID_GET_CAT_FROM_CATEGORY = 2;
  private static final int METHODID_GET_PERSON_FROM_SEX_BI_TALK = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreeterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreeterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.zzsong.netty.grpc.hello.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.zzsong.netty.grpc.hello.HelloReply>) responseObserver);
          break;
        case METHODID_GET_STUDENT_FROM_NAME:
          serviceImpl.getStudentFromName((com.zzsong.netty.grpc.hello.StudentRequest) request,
              (io.grpc.stub.StreamObserver<com.zzsong.netty.grpc.hello.StudentReply>) responseObserver);
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
        case METHODID_GET_CAT_FROM_CATEGORY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getCatFromCategory(
              (io.grpc.stub.StreamObserver<com.zzsong.netty.grpc.hello.CatReply>) responseObserver);
        case METHODID_GET_PERSON_FROM_SEX_BI_TALK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getPersonFromSexBiTalk(
              (io.grpc.stub.StreamObserver<com.zzsong.netty.grpc.hello.PersonReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreeterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.zzsong.netty.grpc.hello.HelloWorldServer.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Greeter");
    }
  }

  private static final class GreeterFileDescriptorSupplier
      extends GreeterBaseDescriptorSupplier {
    GreeterFileDescriptorSupplier() {}
  }

  private static final class GreeterMethodDescriptorSupplier
      extends GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreeterMethodDescriptorSupplier(String methodName) {
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
      synchronized (GreeterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreeterFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getGetStudentFromNameMethod())
              .addMethod(getGetCatFromCategoryMethod())
              .addMethod(getGetPersonFromSexBiTalkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
