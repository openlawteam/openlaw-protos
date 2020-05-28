package grpc.health.v1

object HealthGrpc {
  val METHOD_CHECK: _root_.io.grpc.MethodDescriptor[_root_.grpc.health.v1.HealthCheckRequest, _root_.grpc.health.v1.HealthCheckResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("grpc.health.v1.Health", "Check"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.grpc.health.v1.HealthCheckRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.grpc.health.v1.HealthCheckResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(grpc.health.v1.HealthCheckProto.javaDescriptor.getServices.get(0).getMethods.get(0)))
      .build()
  
  val SERVICE: _root_.io.grpc.ServiceDescriptor =
    _root_.io.grpc.ServiceDescriptor.newBuilder("grpc.health.v1.Health")
      .setSchemaDescriptor(new _root_.scalapb.grpc.ConcreteProtoFileDescriptorSupplier(grpc.health.v1.HealthCheckProto.javaDescriptor))
      .addMethod(METHOD_CHECK)
      .build()
  
  trait Health extends _root_.scalapb.grpc.AbstractService {
    override def serviceCompanion = Health
    def check(request: _root_.grpc.health.v1.HealthCheckRequest): scala.concurrent.Future[_root_.grpc.health.v1.HealthCheckResponse]
  }
  
  object Health extends _root_.scalapb.grpc.ServiceCompanion[Health] {
    implicit def serviceCompanion: _root_.scalapb.grpc.ServiceCompanion[Health] = this
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = grpc.health.v1.HealthCheckProto.javaDescriptor.getServices().get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.ServiceDescriptor = HealthCheckProto.scalaDescriptor.services(0)
  }
  
  trait HealthBlockingClient {
    def serviceCompanion = Health
    def check(request: _root_.grpc.health.v1.HealthCheckRequest): _root_.grpc.health.v1.HealthCheckResponse
  }
  
  class HealthBlockingStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[HealthBlockingStub](channel, options) with HealthBlockingClient {
    override def check(request: _root_.grpc.health.v1.HealthCheckRequest): _root_.grpc.health.v1.HealthCheckResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_CHECK, options, request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): HealthBlockingStub = new HealthBlockingStub(channel, options)
  }
  
  class HealthStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[HealthStub](channel, options) with Health {
    override def check(request: _root_.grpc.health.v1.HealthCheckRequest): scala.concurrent.Future[_root_.grpc.health.v1.HealthCheckResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_CHECK, options, request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): HealthStub = new HealthStub(channel, options)
  }
  
  def bindService(serviceImpl: Health, executionContext: scala.concurrent.ExecutionContext): _root_.io.grpc.ServerServiceDefinition =
    _root_.io.grpc.ServerServiceDefinition.builder(SERVICE)
    .addMethod(
      METHOD_CHECK,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[_root_.grpc.health.v1.HealthCheckRequest, _root_.grpc.health.v1.HealthCheckResponse] {
        override def invoke(request: _root_.grpc.health.v1.HealthCheckRequest, observer: _root_.io.grpc.stub.StreamObserver[_root_.grpc.health.v1.HealthCheckResponse]): Unit =
          serviceImpl.check(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .build()
  
  def blockingStub(channel: _root_.io.grpc.Channel): HealthBlockingStub = new HealthBlockingStub(channel)
  
  def stub(channel: _root_.io.grpc.Channel): HealthStub = new HealthStub(channel)
  
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = grpc.health.v1.HealthCheckProto.javaDescriptor.getServices().get(0)
  
}