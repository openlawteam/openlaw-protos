// package: integration.framework.openlaw
// file: ExternalService.proto

import * as jspb from "google-protobuf";

export class EthereumAddressResponse extends jspb.Message {
  getAddress(): string;
  setAddress(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): EthereumAddressResponse.AsObject;
  static toObject(includeInstance: boolean, msg: EthereumAddressResponse): EthereumAddressResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: EthereumAddressResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): EthereumAddressResponse;
  static deserializeBinaryFromReader(message: EthereumAddressResponse, reader: jspb.BinaryReader): EthereumAddressResponse;
}

export namespace EthereumAddressResponse {
  export type AsObject = {
    address: string,
  }
}

export class MarkupInterfaceResponse extends jspb.Message {
  getDefinition(): string;
  setDefinition(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): MarkupInterfaceResponse.AsObject;
  static toObject(includeInstance: boolean, msg: MarkupInterfaceResponse): MarkupInterfaceResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: MarkupInterfaceResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): MarkupInterfaceResponse;
  static deserializeBinaryFromReader(message: MarkupInterfaceResponse, reader: jspb.BinaryReader): MarkupInterfaceResponse;
}

export namespace MarkupInterfaceResponse {
  export type AsObject = {
    definition: string,
  }
}

export class ExecuteRequest extends jspb.Message {
  getCallerid(): string;
  setCallerid(value: string): void;

  getActionid(): string;
  setActionid(value: string): void;

  getRequestid(): string;
  setRequestid(value: string): void;

  getInputjson(): string;
  setInputjson(value: string): void;

  getServicepublicaddress(): string;
  setServicepublicaddress(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ExecuteRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ExecuteRequest): ExecuteRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ExecuteRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ExecuteRequest;
  static deserializeBinaryFromReader(message: ExecuteRequest, reader: jspb.BinaryReader): ExecuteRequest;
}

export namespace ExecuteRequest {
  export type AsObject = {
    callerid: string,
    actionid: string,
    requestid: string,
    inputjson: string,
    servicepublicaddress: string,
  }
}

export class ExecuteResponse extends jspb.Message {
  getCallerid(): string;
  setCallerid(value: string): void;

  getActionid(): string;
  setActionid(value: string): void;

  getRequestid(): string;
  setRequestid(value: string): void;

  getOutputjson(): string;
  setOutputjson(value: string): void;

  getOutputsignature(): string;
  setOutputsignature(value: string): void;

  getStatus(): ExecuteResponse.StatusMap[keyof ExecuteResponse.StatusMap];
  setStatus(value: ExecuteResponse.StatusMap[keyof ExecuteResponse.StatusMap]): void;

  getMessage(): string;
  setMessage(value: string): void;

  getServicepublicaddress(): string;
  setServicepublicaddress(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ExecuteResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ExecuteResponse): ExecuteResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ExecuteResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ExecuteResponse;
  static deserializeBinaryFromReader(message: ExecuteResponse, reader: jspb.BinaryReader): ExecuteResponse;
}

export namespace ExecuteResponse {
  export type AsObject = {
    callerid: string,
    actionid: string,
    requestid: string,
    outputjson: string,
    outputsignature: string,
    status: ExecuteResponse.StatusMap[keyof ExecuteResponse.StatusMap],
    message: string,
    servicepublicaddress: string,
  }

  export interface StatusMap {
    FAILURE: 0;
    SUCCESS: 1;
  }

  export const Status: StatusMap;
}

export class Empty extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Empty.AsObject;
  static toObject(includeInstance: boolean, msg: Empty): Empty.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Empty, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Empty;
  static deserializeBinaryFromReader(message: Empty, reader: jspb.BinaryReader): Empty;
}

export namespace Empty {
  export type AsObject = {
  }
}

