// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package integration.framework.openlaw

/** The Response message obtained from the executed call.
  *
  * @param callerId
  *   The contractId or flowId string value generated by OpenLaw.
  *   e.g: 1a86c0ab-7895-497c-babb-a3c089df1203
  * @param actionId
  *   The actionId string value which is an arbitrary content that 
  *   represents the action that happened in OpenLaw VM. 
  * @param requestId
  *   The requestId string value that represents the request in 
  *   Integrator Framework.
  * @param outputJson
  *   The outputJson as string value that matches the Output type 
  *   defined in the Markup Interface. All values of the json must 
  *   be String and the json must have no spaces.
  *   e.g: 
  *   - {"currency":"BRL","price":"29.03","update":"2019-09-10T16:31:00.000Z"}
  *   - {"param1":"value1","param2":"value2","paramN":"valueN"}
  * @param outputSignature
  *   The output signature string which represents the signature of 
  *   the outputJson field. The stringified version of the outputJson
  *   must be used for signature.
  * @param status
  *   The status of the execution. If not provided, the default is FAILURE. 
  * @param message
  *   The message returned by the External Service to indicate if the 
  *   execution was completed with success or not. It can be an error 
  *   message as well.
  * @param servicePublicAddress
  *   The ethereum public address from the External Service as provided
  *   in the EthereumAddressResponse.
  */
@SerialVersionUID(0L)
final case class ExecuteResponse(
    callerId: _root_.scala.Predef.String = "",
    actionId: _root_.scala.Predef.String = "",
    requestId: _root_.scala.Predef.String = "",
    outputJson: _root_.scala.Predef.String = "",
    outputSignature: _root_.scala.Predef.String = "",
    status: integration.framework.openlaw.ExecuteResponse.Status = integration.framework.openlaw.ExecuteResponse.Status.FAILURE,
    message: _root_.scala.Predef.String = "",
    servicePublicAddress: _root_.scala.Predef.String = ""
    ) extends scalapb.GeneratedMessage with scalapb.Message[ExecuteResponse] with scalapb.lenses.Updatable[ExecuteResponse] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = callerId
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = actionId
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      
      {
        val __value = requestId
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
        }
      };
      
      {
        val __value = outputJson
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, __value)
        }
      };
      
      {
        val __value = outputSignature
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(5, __value)
        }
      };
      
      {
        val __value = status
        if (__value != integration.framework.openlaw.ExecuteResponse.Status.FAILURE) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(6, __value.value)
        }
      };
      
      {
        val __value = message
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(7, __value)
        }
      };
      
      {
        val __value = servicePublicAddress
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(8, __value)
        }
      };
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = callerId
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = actionId
        if (__v != "") {
          _output__.writeString(2, __v)
        }
      };
      {
        val __v = requestId
        if (__v != "") {
          _output__.writeString(3, __v)
        }
      };
      {
        val __v = outputJson
        if (__v != "") {
          _output__.writeString(4, __v)
        }
      };
      {
        val __v = outputSignature
        if (__v != "") {
          _output__.writeString(5, __v)
        }
      };
      {
        val __v = status
        if (__v != integration.framework.openlaw.ExecuteResponse.Status.FAILURE) {
          _output__.writeEnum(6, __v.value)
        }
      };
      {
        val __v = message
        if (__v != "") {
          _output__.writeString(7, __v)
        }
      };
      {
        val __v = servicePublicAddress
        if (__v != "") {
          _output__.writeString(8, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): integration.framework.openlaw.ExecuteResponse = {
      var __callerId = this.callerId
      var __actionId = this.actionId
      var __requestId = this.requestId
      var __outputJson = this.outputJson
      var __outputSignature = this.outputSignature
      var __status = this.status
      var __message = this.message
      var __servicePublicAddress = this.servicePublicAddress
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __callerId = _input__.readString()
          case 18 =>
            __actionId = _input__.readString()
          case 26 =>
            __requestId = _input__.readString()
          case 34 =>
            __outputJson = _input__.readString()
          case 42 =>
            __outputSignature = _input__.readString()
          case 48 =>
            __status = integration.framework.openlaw.ExecuteResponse.Status.fromValue(_input__.readEnum())
          case 58 =>
            __message = _input__.readString()
          case 66 =>
            __servicePublicAddress = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      integration.framework.openlaw.ExecuteResponse(
          callerId = __callerId,
          actionId = __actionId,
          requestId = __requestId,
          outputJson = __outputJson,
          outputSignature = __outputSignature,
          status = __status,
          message = __message,
          servicePublicAddress = __servicePublicAddress
      )
    }
    def withCallerId(__v: _root_.scala.Predef.String): ExecuteResponse = copy(callerId = __v)
    def withActionId(__v: _root_.scala.Predef.String): ExecuteResponse = copy(actionId = __v)
    def withRequestId(__v: _root_.scala.Predef.String): ExecuteResponse = copy(requestId = __v)
    def withOutputJson(__v: _root_.scala.Predef.String): ExecuteResponse = copy(outputJson = __v)
    def withOutputSignature(__v: _root_.scala.Predef.String): ExecuteResponse = copy(outputSignature = __v)
    def withStatus(__v: integration.framework.openlaw.ExecuteResponse.Status): ExecuteResponse = copy(status = __v)
    def withMessage(__v: _root_.scala.Predef.String): ExecuteResponse = copy(message = __v)
    def withServicePublicAddress(__v: _root_.scala.Predef.String): ExecuteResponse = copy(servicePublicAddress = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = callerId
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = actionId
          if (__t != "") __t else null
        }
        case 3 => {
          val __t = requestId
          if (__t != "") __t else null
        }
        case 4 => {
          val __t = outputJson
          if (__t != "") __t else null
        }
        case 5 => {
          val __t = outputSignature
          if (__t != "") __t else null
        }
        case 6 => {
          val __t = status.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
        case 7 => {
          val __t = message
          if (__t != "") __t else null
        }
        case 8 => {
          val __t = servicePublicAddress
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(callerId)
        case 2 => _root_.scalapb.descriptors.PString(actionId)
        case 3 => _root_.scalapb.descriptors.PString(requestId)
        case 4 => _root_.scalapb.descriptors.PString(outputJson)
        case 5 => _root_.scalapb.descriptors.PString(outputSignature)
        case 6 => _root_.scalapb.descriptors.PEnum(status.scalaValueDescriptor)
        case 7 => _root_.scalapb.descriptors.PString(message)
        case 8 => _root_.scalapb.descriptors.PString(servicePublicAddress)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = integration.framework.openlaw.ExecuteResponse
}

object ExecuteResponse extends scalapb.GeneratedMessageCompanion[integration.framework.openlaw.ExecuteResponse] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[integration.framework.openlaw.ExecuteResponse] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): integration.framework.openlaw.ExecuteResponse = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    integration.framework.openlaw.ExecuteResponse(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(2), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(3), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(4), "").asInstanceOf[_root_.scala.Predef.String],
      integration.framework.openlaw.ExecuteResponse.Status.fromValue(__fieldsMap.getOrElse(__fields.get(5), integration.framework.openlaw.ExecuteResponse.Status.FAILURE.javaValueDescriptor).asInstanceOf[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor].getNumber),
      __fieldsMap.getOrElse(__fields.get(6), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(7), "").asInstanceOf[_root_.scala.Predef.String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[integration.framework.openlaw.ExecuteResponse] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      integration.framework.openlaw.ExecuteResponse(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        integration.framework.openlaw.ExecuteResponse.Status.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(integration.framework.openlaw.ExecuteResponse.Status.FAILURE.scalaValueDescriptor).number),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ExternalServiceProto.javaDescriptor.getMessageTypes.get(3)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ExternalServiceProto.scalaDescriptor.messages(3)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 6 => integration.framework.openlaw.ExecuteResponse.Status
    }
  }
  lazy val defaultInstance = integration.framework.openlaw.ExecuteResponse(
    callerId = "",
    actionId = "",
    requestId = "",
    outputJson = "",
    outputSignature = "",
    status = integration.framework.openlaw.ExecuteResponse.Status.FAILURE,
    message = "",
    servicePublicAddress = ""
  )
  /** The possible statuses of the response after the execution is 
    * terminated.
    */
  sealed trait Status extends _root_.scalapb.GeneratedEnum {
    type EnumType = Status
    def isFailure: _root_.scala.Boolean = false
    def isSuccess: _root_.scala.Boolean = false
    def companion: _root_.scalapb.GeneratedEnumCompanion[Status] = integration.framework.openlaw.ExecuteResponse.Status
  }
  
  object Status extends _root_.scalapb.GeneratedEnumCompanion[Status] {
    implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[Status] = this
    @SerialVersionUID(0L)
    case object FAILURE extends Status {
      val value = 0
      val index = 0
      val name = "FAILURE"
      override def isFailure: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object SUCCESS extends Status {
      val value = 1
      val index = 1
      val name = "SUCCESS"
      override def isSuccess: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    final case class Unrecognized(value: _root_.scala.Int) extends Status with _root_.scalapb.UnrecognizedEnum
    
    lazy val values = scala.collection.immutable.Seq(FAILURE, SUCCESS)
    def fromValue(value: _root_.scala.Int): Status = value match {
      case 0 => FAILURE
      case 1 => SUCCESS
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = integration.framework.openlaw.ExecuteResponse.javaDescriptor.getEnumTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = integration.framework.openlaw.ExecuteResponse.scalaDescriptor.enums(0)
  }
  implicit class ExecuteResponseLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, integration.framework.openlaw.ExecuteResponse]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, integration.framework.openlaw.ExecuteResponse](_l) {
    def callerId: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.callerId)((c_, f_) => c_.copy(callerId = f_))
    def actionId: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.actionId)((c_, f_) => c_.copy(actionId = f_))
    def requestId: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.requestId)((c_, f_) => c_.copy(requestId = f_))
    def outputJson: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.outputJson)((c_, f_) => c_.copy(outputJson = f_))
    def outputSignature: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.outputSignature)((c_, f_) => c_.copy(outputSignature = f_))
    def status: _root_.scalapb.lenses.Lens[UpperPB, integration.framework.openlaw.ExecuteResponse.Status] = field(_.status)((c_, f_) => c_.copy(status = f_))
    def message: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.message)((c_, f_) => c_.copy(message = f_))
    def servicePublicAddress: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.servicePublicAddress)((c_, f_) => c_.copy(servicePublicAddress = f_))
  }
  final val CALLERID_FIELD_NUMBER = 1
  final val ACTIONID_FIELD_NUMBER = 2
  final val REQUESTID_FIELD_NUMBER = 3
  final val OUTPUTJSON_FIELD_NUMBER = 4
  final val OUTPUTSIGNATURE_FIELD_NUMBER = 5
  final val STATUS_FIELD_NUMBER = 6
  final val MESSAGE_FIELD_NUMBER = 7
  final val SERVICEPUBLICADDRESS_FIELD_NUMBER = 8
  def of(
    callerId: _root_.scala.Predef.String,
    actionId: _root_.scala.Predef.String,
    requestId: _root_.scala.Predef.String,
    outputJson: _root_.scala.Predef.String,
    outputSignature: _root_.scala.Predef.String,
    status: integration.framework.openlaw.ExecuteResponse.Status,
    message: _root_.scala.Predef.String,
    servicePublicAddress: _root_.scala.Predef.String
  ): _root_.integration.framework.openlaw.ExecuteResponse = _root_.integration.framework.openlaw.ExecuteResponse(
    callerId,
    actionId,
    requestId,
    outputJson,
    outputSignature,
    status,
    message,
    servicePublicAddress
  )
}
