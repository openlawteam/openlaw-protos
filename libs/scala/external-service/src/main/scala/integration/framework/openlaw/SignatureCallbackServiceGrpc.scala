package integration.framework.openlaw

object SignatureCallbackServiceGrpc {
  val METHOD_CALLBACK: _root_.io.grpc.MethodDescriptor[_root_.integration.framework.openlaw.ExecuteResponse, _root_.integration.framework.openlaw.SignatureCallbackResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("integration.framework.openlaw.SignatureCallbackService", "Callback"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.integration.framework.openlaw.ExecuteResponse])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.integration.framework.openlaw.SignatureCallbackResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(integration.framework.openlaw.SignatureCallbackServiceProto.javaDescriptor.getServices.get(0).getMethods.get(0)))
      .build()
  
  val SERVICE: _root_.io.grpc.ServiceDescriptor =
    _root_.io.grpc.ServiceDescriptor.newBuilder("integration.framework.openlaw.SignatureCallbackService")
      .setSchemaDescriptor(new _root_.scalapb.grpc.ConcreteProtoFileDescriptorSupplier(integration.framework.openlaw.SignatureCallbackServiceProto.javaDescriptor))
      .addMethod(METHOD_CALLBACK)
      .build()
  
  trait SignatureCallbackService extends _root_.scalapb.grpc.AbstractService {
    override def serviceCompanion = SignatureCallbackService
    def callback(request: _root_.integration.framework.openlaw.ExecuteResponse): scala.concurrent.Future[_root_.integration.framework.openlaw.SignatureCallbackResponse]
  }
  
  object SignatureCallbackService extends _root_.scalapb.grpc.ServiceCompanion[SignatureCallbackService] {
    implicit def serviceCompanion: _root_.scalapb.grpc.ServiceCompanion[SignatureCallbackService] = this
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = integration.framework.openlaw.SignatureCallbackServiceProto.javaDescriptor.getServices().get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.ServiceDescriptor = SignatureCallbackServiceProto.scalaDescriptor.services(0)
  }
  
  trait SignatureCallbackServiceBlockingClient {
    def serviceCompanion = SignatureCallbackService
    def callback(request: _root_.integration.framework.openlaw.ExecuteResponse): _root_.integration.framework.openlaw.SignatureCallbackResponse
  }
  
  class SignatureCallbackServiceBlockingStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[SignatureCallbackServiceBlockingStub](channel, options) with SignatureCallbackServiceBlockingClient {
    override def callback(request: _root_.integration.framework.openlaw.ExecuteResponse): _root_.integration.framework.openlaw.SignatureCallbackResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_CALLBACK, options, request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): SignatureCallbackServiceBlockingStub = new SignatureCallbackServiceBlockingStub(channel, options)
  }
  
  class SignatureCallbackServiceStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[SignatureCallbackServiceStub](channel, options) with SignatureCallbackService {
    override def callback(request: _root_.integration.framework.openlaw.ExecuteResponse): scala.concurrent.Future[_root_.integration.framework.openlaw.SignatureCallbackResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_CALLBACK, options, request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): SignatureCallbackServiceStub = new SignatureCallbackServiceStub(channel, options)
  }
  
  def bindService(serviceImpl: SignatureCallbackService, executionContext: scala.concurrent.ExecutionContext): _root_.io.grpc.ServerServiceDefinition =
    _root_.io.grpc.ServerServiceDefinition.builder(SERVICE)
    .addMethod(
      METHOD_CALLBACK,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[_root_.integration.framework.openlaw.ExecuteResponse, _root_.integration.framework.openlaw.SignatureCallbackResponse] {
        override def invoke(request: _root_.integration.framework.openlaw.ExecuteResponse, observer: _root_.io.grpc.stub.StreamObserver[_root_.integration.framework.openlaw.SignatureCallbackResponse]): Unit =
          serviceImpl.callback(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .build()
  
  def blockingStub(channel: _root_.io.grpc.Channel): SignatureCallbackServiceBlockingStub = new SignatureCallbackServiceBlockingStub(channel)
  
  def stub(channel: _root_.io.grpc.Channel): SignatureCallbackServiceStub = new SignatureCallbackServiceStub(channel)
  
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = integration.framework.openlaw.SignatureCallbackServiceProto.javaDescriptor.getServices().get(0)
  
}