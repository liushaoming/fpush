// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fmessage.proto

package com.appjishu.fpush.core.proto;

public final class FMessageCollection {
  private FMessageCollection() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_appjishu_fpush_core_proto_FHeader_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_appjishu_fpush_core_proto_FHeader_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_appjishu_fpush_core_proto_FBody_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_appjishu_fpush_core_proto_FBody_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_appjishu_fpush_core_proto_FMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_appjishu_fpush_core_proto_FMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016fmessage.proto\022\035com.appjishu.fpush.cor" +
      "e.proto\"\223\001\n\007FHeader\022\021\n\tsessionId\030\001 \001(\003\022\014" +
      "\n\004type\030\002 \001(\005\022\020\n\010priority\030\003 \001(\005\022\r\n\005regId\030" +
      "\004 \001(\t\022\r\n\005alias\030\005 \001(\t\022\017\n\007account\030\006 \001(\t\022\022\n" +
      "\nresultCode\030\007 \001(\t\022\022\n\nresultText\030\010 \001(\t\"\374\001" +
      "\n\005FBody\022\023\n\013collapseKey\030\001 \001(\t\022\017\n\007payload\030" +
      "\002 \001(\t\022\r\n\005title\030\003 \001(\t\022\023\n\013description\030\004 \001(" +
      "\t\022\022\n\nnotifyType\030\005 \001(\005\022\022\n\ntimeToLive\030\006 \001(" +
      "\003\022\023\n\013passThrough\030\007 \001(\005\022\020\n\010notifyId\030\010 \001(\005" +
      "\022\036\n\026restrictedPackageNames\030\t \001(\t\022\r\n\005extr" +
      "a\030\n \001(\t\022\027\n\017apsProperFields\030\013 \001(\t\022\022\n\ntime" +
      "ToSend\030\014 \001(\003\"v\n\010FMessage\0226\n\006header\030\001 \001(\013" +
      "2&.com.appjishu.fpush.core.proto.FHeader" +
      "\0222\n\004body\030\002 \001(\0132$.com.appjishu.fpush.core" +
      ".proto.FBodyB5\n\035com.appjishu.fpush.core." +
      "protoB\022FMessageCollectionP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_appjishu_fpush_core_proto_FHeader_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_appjishu_fpush_core_proto_FHeader_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_appjishu_fpush_core_proto_FHeader_descriptor,
        new java.lang.String[] { "SessionId", "Type", "Priority", "RegId", "Alias", "Account", "ResultCode", "ResultText", });
    internal_static_com_appjishu_fpush_core_proto_FBody_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_appjishu_fpush_core_proto_FBody_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_appjishu_fpush_core_proto_FBody_descriptor,
        new java.lang.String[] { "CollapseKey", "Payload", "Title", "Description", "NotifyType", "TimeToLive", "PassThrough", "NotifyId", "RestrictedPackageNames", "Extra", "ApsProperFields", "TimeToSend", });
    internal_static_com_appjishu_fpush_core_proto_FMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_appjishu_fpush_core_proto_FMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_appjishu_fpush_core_proto_FMessage_descriptor,
        new java.lang.String[] { "Header", "Body", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
