package integration.framework.openlaw

object ExternalServiceGrpc {
  val METHOD_GET_ETHEREUM_ADDRESS: _root_.io.grpc.MethodDescriptor[_root_.integration.framework.openlaw.Empty, _root_.integration.framework.openlaw.EthereumAddressResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("integration.framework.openlaw.ExternalService", "GetEthereumAddress"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.integration.framework.openlaw.Empty])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.integration.framework.openlaw.EthereumAddressResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(integration.framework.openlaw.ExternalServiceProto.javaDescriptor.getServices.get(0).getMethods.get(0)))
      .build()
  
  val METHOD_GET_MARKUP_INTERFACE: _root_.io.grpc.MethodDescriptor[_root_.integration.framework.openlaw.Empty, _root_.integration.framework.openlaw.MarkupInterfaceResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("integration.framework.openlaw.ExternalService", "GetMarkupInterface"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.integration.framework.openlaw.Empty])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.integration.framework.openlaw.MarkupInterfaceResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(integration.framework.openlaw.ExternalServiceProto.javaDescriptor.getServices.get(0).getMethods.get(1)))
      .build()
  
  val METHOD_EXECUTE: _root_.io.grpc.MethodDescriptor[_root_.integration.framework.openlaw.ExecuteRequest, _root_.integration.framework.openlaw.ExecuteResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("integration.framework.openlaw.ExternalService", "Execute"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.integration.framework.openlaw.ExecuteRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.integration.framework.openlaw.ExecuteResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(integration.framework.openlaw.ExternalServiceProto.javaDescriptor.getServices.get(0).getMethods.get(2)))
      .build()
  
  val SERVICE: _root_.io.grpc.ServiceDescriptor =
    _root_.io.grpc.ServiceDescriptor.newBuilder("integration.framework.openlaw.ExternalService")
      .setSchemaDescriptor(new _root_.scalapb.grpc.ConcreteProtoFileDescriptorSupplier(integration.framework.openlaw.ExternalServiceProto.javaDescriptor))
      .addMethod(METHOD_GET_ETHEREUM_ADDRESS)
      .addMethod(METHOD_GET_MARKUP_INTERFACE)
      .addMethod(METHOD_EXECUTE)
      .build()
  
  /** ExternalService definition parsed by the Protoc Compiler. It must be extended by the server implementation,
    * so it can respond to gRPC requests from OpenLaw Integration Framework.
    */
  trait ExternalService extends _root_.scalapb.grpc.AbstractService {
    override def serviceCompanion = ExternalService
    /** Gets the Ethereum Public Address from the service which is 
      * used to verify events sent from the service to OpenLaw VM.
      */
    def getEthereumAddress(request: _root_.integration.framework.openlaw.Empty): scala.concurrent.Future[_root_.integration.framework.openlaw.EthereumAddressResponse]
    /** Gets the server Markup Interface definition which is used in a OpenLaw Agreement with ExternalCall or ExternalSignature variable types.
      * The expected Markup Interface definition must follow the standard:
      *  - [[Input:Structure(inputField1: &lt;Type&gt;; inputField2: &lt;Type&gt;; inputFieldN: &lt;Type&gt;)]] [[Output:Structure(outputField1: &lt;Type&gt;; outputField2: &lt;Type&gt;; outputFieldN: &lt;Type&gt;)]]
      *  - &lt;Type&gt; - can be replaced by: Text, Number and Date.
      * Basic Markup Interface for the Coin Market Cap service can be defined as a String of value:
      *  - "[[Input:Structure(fromCurrency: Text; toCurrency: Text; amount: Number)]] [[Output:Structure(currency: Text; price: Number; lastUpdate: Text)]]"
      * The standard Markup Interface for any e-Signature service is defined by the following String value:
      *  - "[[Input:Structure(signerEmail: Text; contractContentBase64: Text; contractTitle: Text)]] [[Output:Structure(signerEmail: Text; signature: Text; recordLink: Text)]]"
      * Any e-Signature service must use the exact same Markup Interface as described above, otherwise the e-Signature will not be validated by the OpenLaw VM.
      */
    def getMarkupInterface(request: _root_.integration.framework.openlaw.Empty): scala.concurrent.Future[_root_.integration.framework.openlaw.MarkupInterfaceResponse]
    /** Executes the request from OpenLaw Integrator Framework and waits for the External Service response.
      */
    def execute(request: _root_.integration.framework.openlaw.ExecuteRequest): scala.concurrent.Future[_root_.integration.framework.openlaw.ExecuteResponse]
  }
  
  object ExternalService extends _root_.scalapb.grpc.ServiceCompanion[ExternalService] {
    implicit def serviceCompanion: _root_.scalapb.grpc.ServiceCompanion[ExternalService] = this
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = integration.framework.openlaw.ExternalServiceProto.javaDescriptor.getServices().get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.ServiceDescriptor = ExternalServiceProto.scalaDescriptor.services(0)
  }
  
  /** ExternalService definition parsed by the Protoc Compiler. It must be extended by the server implementation,
    * so it can respond to gRPC requests from OpenLaw Integration Framework.
    */
  trait ExternalServiceBlockingClient {
    def serviceCompanion = ExternalService
    /** Gets the Ethereum Public Address from the service which is 
      * used to verify events sent from the service to OpenLaw VM.
      */
    def getEthereumAddress(request: _root_.integration.framework.openlaw.Empty): _root_.integration.framework.openlaw.EthereumAddressResponse
    /** Gets the server Markup Interface definition which is used in a OpenLaw Agreement with ExternalCall or ExternalSignature variable types.
      * The expected Markup Interface definition must follow the standard:
      *  - [[Input:Structure(inputField1: &lt;Type&gt;; inputField2: &lt;Type&gt;; inputFieldN: &lt;Type&gt;)]] [[Output:Structure(outputField1: &lt;Type&gt;; outputField2: &lt;Type&gt;; outputFieldN: &lt;Type&gt;)]]
      *  - &lt;Type&gt; - can be replaced by: Text, Number and Date.
      * Basic Markup Interface for the Coin Market Cap service can be defined as a String of value:
      *  - "[[Input:Structure(fromCurrency: Text; toCurrency: Text; amount: Number)]] [[Output:Structure(currency: Text; price: Number; lastUpdate: Text)]]"
      * The standard Markup Interface for any e-Signature service is defined by the following String value:
      *  - "[[Input:Structure(signerEmail: Text; contractContentBase64: Text; contractTitle: Text)]] [[Output:Structure(signerEmail: Text; signature: Text; recordLink: Text)]]"
      * Any e-Signature service must use the exact same Markup Interface as described above, otherwise the e-Signature will not be validated by the OpenLaw VM.
      */
    def getMarkupInterface(request: _root_.integration.framework.openlaw.Empty): _root_.integration.framework.openlaw.MarkupInterfaceResponse
    /** Executes the request from OpenLaw Integrator Framework and waits for the External Service response.
      */
    def execute(request: _root_.integration.framework.openlaw.ExecuteRequest): _root_.integration.framework.openlaw.ExecuteResponse
  }
  
  class ExternalServiceBlockingStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[ExternalServiceBlockingStub](channel, options) with ExternalServiceBlockingClient {
    /** Gets the Ethereum Public Address from the service which is 
      * used to verify events sent from the service to OpenLaw VM.
      */
    override def getEthereumAddress(request: _root_.integration.framework.openlaw.Empty): _root_.integration.framework.openlaw.EthereumAddressResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_GET_ETHEREUM_ADDRESS, options, request)
    }
    
    /** Gets the server Markup Interface definition which is used in a OpenLaw Agreement with ExternalCall or ExternalSignature variable types.
      * The expected Markup Interface definition must follow the standard:
      *  - [[Input:Structure(inputField1: &lt;Type&gt;; inputField2: &lt;Type&gt;; inputFieldN: &lt;Type&gt;)]] [[Output:Structure(outputField1: &lt;Type&gt;; outputField2: &lt;Type&gt;; outputFieldN: &lt;Type&gt;)]]
      *  - &lt;Type&gt; - can be replaced by: Text, Number and Date.
      * Basic Markup Interface for the Coin Market Cap service can be defined as a String of value:
      *  - "[[Input:Structure(fromCurrency: Text; toCurrency: Text; amount: Number)]] [[Output:Structure(currency: Text; price: Number; lastUpdate: Text)]]"
      * The standard Markup Interface for any e-Signature service is defined by the following String value:
      *  - "[[Input:Structure(signerEmail: Text; contractContentBase64: Text; contractTitle: Text)]] [[Output:Structure(signerEmail: Text; signature: Text; recordLink: Text)]]"
      * Any e-Signature service must use the exact same Markup Interface as described above, otherwise the e-Signature will not be validated by the OpenLaw VM.
      */
    override def getMarkupInterface(request: _root_.integration.framework.openlaw.Empty): _root_.integration.framework.openlaw.MarkupInterfaceResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_GET_MARKUP_INTERFACE, options, request)
    }
    
    /** Executes the request from OpenLaw Integrator Framework and waits for the External Service response.
      */
    override def execute(request: _root_.integration.framework.openlaw.ExecuteRequest): _root_.integration.framework.openlaw.ExecuteResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_EXECUTE, options, request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): ExternalServiceBlockingStub = new ExternalServiceBlockingStub(channel, options)
  }
  
  class ExternalServiceStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[ExternalServiceStub](channel, options) with ExternalService {
    /** Gets the Ethereum Public Address from the service which is 
      * used to verify events sent from the service to OpenLaw VM.
      */
    override def getEthereumAddress(request: _root_.integration.framework.openlaw.Empty): scala.concurrent.Future[_root_.integration.framework.openlaw.EthereumAddressResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_GET_ETHEREUM_ADDRESS, options, request)
    }
    
    /** Gets the server Markup Interface definition which is used in a OpenLaw Agreement with ExternalCall or ExternalSignature variable types.
      * The expected Markup Interface definition must follow the standard:
      *  - [[Input:Structure(inputField1: &lt;Type&gt;; inputField2: &lt;Type&gt;; inputFieldN: &lt;Type&gt;)]] [[Output:Structure(outputField1: &lt;Type&gt;; outputField2: &lt;Type&gt;; outputFieldN: &lt;Type&gt;)]]
      *  - &lt;Type&gt; - can be replaced by: Text, Number and Date.
      * Basic Markup Interface for the Coin Market Cap service can be defined as a String of value:
      *  - "[[Input:Structure(fromCurrency: Text; toCurrency: Text; amount: Number)]] [[Output:Structure(currency: Text; price: Number; lastUpdate: Text)]]"
      * The standard Markup Interface for any e-Signature service is defined by the following String value:
      *  - "[[Input:Structure(signerEmail: Text; contractContentBase64: Text; contractTitle: Text)]] [[Output:Structure(signerEmail: Text; signature: Text; recordLink: Text)]]"
      * Any e-Signature service must use the exact same Markup Interface as described above, otherwise the e-Signature will not be validated by the OpenLaw VM.
      */
    override def getMarkupInterface(request: _root_.integration.framework.openlaw.Empty): scala.concurrent.Future[_root_.integration.framework.openlaw.MarkupInterfaceResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_GET_MARKUP_INTERFACE, options, request)
    }
    
    /** Executes the request from OpenLaw Integrator Framework and waits for the External Service response.
      */
    override def execute(request: _root_.integration.framework.openlaw.ExecuteRequest): scala.concurrent.Future[_root_.integration.framework.openlaw.ExecuteResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_EXECUTE, options, request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): ExternalServiceStub = new ExternalServiceStub(channel, options)
  }
  
  def bindService(serviceImpl: ExternalService, executionContext: scala.concurrent.ExecutionContext): _root_.io.grpc.ServerServiceDefinition =
    _root_.io.grpc.ServerServiceDefinition.builder(SERVICE)
    .addMethod(
      METHOD_GET_ETHEREUM_ADDRESS,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[_root_.integration.framework.openlaw.Empty, _root_.integration.framework.openlaw.EthereumAddressResponse] {
        override def invoke(request: _root_.integration.framework.openlaw.Empty, observer: _root_.io.grpc.stub.StreamObserver[_root_.integration.framework.openlaw.EthereumAddressResponse]): Unit =
          serviceImpl.getEthereumAddress(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_GET_MARKUP_INTERFACE,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[_root_.integration.framework.openlaw.Empty, _root_.integration.framework.openlaw.MarkupInterfaceResponse] {
        override def invoke(request: _root_.integration.framework.openlaw.Empty, observer: _root_.io.grpc.stub.StreamObserver[_root_.integration.framework.openlaw.MarkupInterfaceResponse]): Unit =
          serviceImpl.getMarkupInterface(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_EXECUTE,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[_root_.integration.framework.openlaw.ExecuteRequest, _root_.integration.framework.openlaw.ExecuteResponse] {
        override def invoke(request: _root_.integration.framework.openlaw.ExecuteRequest, observer: _root_.io.grpc.stub.StreamObserver[_root_.integration.framework.openlaw.ExecuteResponse]): Unit =
          serviceImpl.execute(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .build()
  
  def blockingStub(channel: _root_.io.grpc.Channel): ExternalServiceBlockingStub = new ExternalServiceBlockingStub(channel)
  
  def stub(channel: _root_.io.grpc.Channel): ExternalServiceStub = new ExternalServiceStub(channel)
  
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = integration.framework.openlaw.ExternalServiceProto.javaDescriptor.getServices().get(0)
  
}