package integration.framework.openlaw

import integration.framework.openlaw.ExecuteResponse.Status
import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ExternalServiceTestSuite extends AnyFunSuite {

  test("all fields from ExecuteRequest") {
    def request = ExecuteRequest()
      .withInputJson("{\"test\":\"a\"}")
        .withServicePublicAddress("0x")
        .withRequestId("req1")
        .withActionId("action1")
        .withCallerId("caller1")

    assert(request.inputJson === "{\"test\":\"a\"}")
    assert(request.servicePublicAddress === "0x")
    assert(request.requestId === "req1")
    assert(request.actionId === "action1")
    assert(request.callerId === "caller1")
  }

  test("all fields from ExecuteResponse") {
    def response = ExecuteResponse()
      .withOutputJson("{\"test\":\"b\"}")
      .withOutputSignature("sig1")
      .withServicePublicAddress("0x")
      .withRequestId("req1")
      .withActionId("action1")
      .withCallerId("caller1")
      .withMessage("msg1")
      .withStatus(Status.SUCCESS)

    assert(response.outputJson === "{\"test\":\"b\"}")
    assert(response.outputSignature === "sig1")
    assert(response.servicePublicAddress === "0x")
    assert(response.requestId === "req1")
    assert(response.actionId === "action1")
    assert(response.callerId === "caller1")
    assert(response.message === "msg1")
    assert(response.status.isSuccess)
  }

  test("all fields from EthereumAddressResponse") {
    def response = EthereumAddressResponse()
      .withAddress("0x")
    assert(response.address === "0x")
  }

  test("all fields from MarkupInterfaceResponse") {
    def response = MarkupInterfaceResponse()
      .withDefinition("def1")
    assert(response.definition === "def1")
  }

  test("ExternalService class to make sure it was generated") {
    assert(ExternalServiceGrpc.ExternalService.serviceCompanion != null)
  }

  test("ExternalServiceProto class to make sure was generated") {
    assert(ExternalServiceProto.scalaDescriptor != null)
  }

  test("Empty class to make sure it was generated") {
    assert(Empty() != null)
  }

}
