// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fmessage.proto

package com.appjishu.fpush.core.proto;

/**
 * Protobuf type {@code com.appjishu.fpush.core.proto.FHeader}
 */
public  final class FHeader extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.appjishu.fpush.core.proto.FHeader)
    FHeaderOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FHeader.newBuilder() to construct.
  private FHeader(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FHeader() {
    sessionId_ = 0L;
    type_ = 0;
    priority_ = 0;
    regId_ = "";
    alias_ = "";
    account_ = "";
    resultCode_ = "";
    resultText_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FHeader(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            sessionId_ = input.readInt64();
            break;
          }
          case 16: {

            type_ = input.readInt32();
            break;
          }
          case 24: {

            priority_ = input.readInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            regId_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            alias_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            account_ = s;
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            resultCode_ = s;
            break;
          }
          case 66: {
            java.lang.String s = input.readStringRequireUtf8();

            resultText_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.appjishu.fpush.core.proto.FMessageCollection.internal_static_com_appjishu_fpush_core_proto_FHeader_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appjishu.fpush.core.proto.FMessageCollection.internal_static_com_appjishu_fpush_core_proto_FHeader_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appjishu.fpush.core.proto.FHeader.class, com.appjishu.fpush.core.proto.FHeader.Builder.class);
  }

  public static final int SESSIONID_FIELD_NUMBER = 1;
  private long sessionId_;
  /**
   * <code>int64 sessionId = 1;</code>
   */
  public long getSessionId() {
    return sessionId_;
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_;
  /**
   * <code>int32 type = 2;</code>
   */
  public int getType() {
    return type_;
  }

  public static final int PRIORITY_FIELD_NUMBER = 3;
  private int priority_;
  /**
   * <code>int32 priority = 3;</code>
   */
  public int getPriority() {
    return priority_;
  }

  public static final int REGID_FIELD_NUMBER = 4;
  private volatile java.lang.Object regId_;
  /**
   * <code>string regId = 4;</code>
   */
  public java.lang.String getRegId() {
    java.lang.Object ref = regId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      regId_ = s;
      return s;
    }
  }
  /**
   * <code>string regId = 4;</code>
   */
  public com.google.protobuf.ByteString
      getRegIdBytes() {
    java.lang.Object ref = regId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      regId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ALIAS_FIELD_NUMBER = 5;
  private volatile java.lang.Object alias_;
  /**
   * <code>string alias = 5;</code>
   */
  public java.lang.String getAlias() {
    java.lang.Object ref = alias_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      alias_ = s;
      return s;
    }
  }
  /**
   * <code>string alias = 5;</code>
   */
  public com.google.protobuf.ByteString
      getAliasBytes() {
    java.lang.Object ref = alias_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      alias_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCOUNT_FIELD_NUMBER = 6;
  private volatile java.lang.Object account_;
  /**
   * <code>string account = 6;</code>
   */
  public java.lang.String getAccount() {
    java.lang.Object ref = account_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      account_ = s;
      return s;
    }
  }
  /**
   * <code>string account = 6;</code>
   */
  public com.google.protobuf.ByteString
      getAccountBytes() {
    java.lang.Object ref = account_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      account_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESULTCODE_FIELD_NUMBER = 7;
  private volatile java.lang.Object resultCode_;
  /**
   * <code>string resultCode = 7;</code>
   */
  public java.lang.String getResultCode() {
    java.lang.Object ref = resultCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resultCode_ = s;
      return s;
    }
  }
  /**
   * <code>string resultCode = 7;</code>
   */
  public com.google.protobuf.ByteString
      getResultCodeBytes() {
    java.lang.Object ref = resultCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resultCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESULTTEXT_FIELD_NUMBER = 8;
  private volatile java.lang.Object resultText_;
  /**
   * <code>string resultText = 8;</code>
   */
  public java.lang.String getResultText() {
    java.lang.Object ref = resultText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resultText_ = s;
      return s;
    }
  }
  /**
   * <code>string resultText = 8;</code>
   */
  public com.google.protobuf.ByteString
      getResultTextBytes() {
    java.lang.Object ref = resultText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resultText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (sessionId_ != 0L) {
      output.writeInt64(1, sessionId_);
    }
    if (type_ != 0) {
      output.writeInt32(2, type_);
    }
    if (priority_ != 0) {
      output.writeInt32(3, priority_);
    }
    if (!getRegIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, regId_);
    }
    if (!getAliasBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, alias_);
    }
    if (!getAccountBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, account_);
    }
    if (!getResultCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, resultCode_);
    }
    if (!getResultTextBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, resultText_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sessionId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, sessionId_);
    }
    if (type_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, type_);
    }
    if (priority_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, priority_);
    }
    if (!getRegIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, regId_);
    }
    if (!getAliasBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, alias_);
    }
    if (!getAccountBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, account_);
    }
    if (!getResultCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, resultCode_);
    }
    if (!getResultTextBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, resultText_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.appjishu.fpush.core.proto.FHeader)) {
      return super.equals(obj);
    }
    com.appjishu.fpush.core.proto.FHeader other = (com.appjishu.fpush.core.proto.FHeader) obj;

    boolean result = true;
    result = result && (getSessionId()
        == other.getSessionId());
    result = result && (getType()
        == other.getType());
    result = result && (getPriority()
        == other.getPriority());
    result = result && getRegId()
        .equals(other.getRegId());
    result = result && getAlias()
        .equals(other.getAlias());
    result = result && getAccount()
        .equals(other.getAccount());
    result = result && getResultCode()
        .equals(other.getResultCode());
    result = result && getResultText()
        .equals(other.getResultText());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SESSIONID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSessionId());
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType();
    hash = (37 * hash) + PRIORITY_FIELD_NUMBER;
    hash = (53 * hash) + getPriority();
    hash = (37 * hash) + REGID_FIELD_NUMBER;
    hash = (53 * hash) + getRegId().hashCode();
    hash = (37 * hash) + ALIAS_FIELD_NUMBER;
    hash = (53 * hash) + getAlias().hashCode();
    hash = (37 * hash) + ACCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAccount().hashCode();
    hash = (37 * hash) + RESULTCODE_FIELD_NUMBER;
    hash = (53 * hash) + getResultCode().hashCode();
    hash = (37 * hash) + RESULTTEXT_FIELD_NUMBER;
    hash = (53 * hash) + getResultText().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appjishu.fpush.core.proto.FHeader parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appjishu.fpush.core.proto.FHeader parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appjishu.fpush.core.proto.FHeader parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appjishu.fpush.core.proto.FHeader parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appjishu.fpush.core.proto.FHeader parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appjishu.fpush.core.proto.FHeader parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appjishu.fpush.core.proto.FHeader parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appjishu.fpush.core.proto.FHeader parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appjishu.fpush.core.proto.FHeader parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appjishu.fpush.core.proto.FHeader parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appjishu.fpush.core.proto.FHeader parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appjishu.fpush.core.proto.FHeader parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.appjishu.fpush.core.proto.FHeader prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.appjishu.fpush.core.proto.FHeader}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.appjishu.fpush.core.proto.FHeader)
      com.appjishu.fpush.core.proto.FHeaderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appjishu.fpush.core.proto.FMessageCollection.internal_static_com_appjishu_fpush_core_proto_FHeader_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appjishu.fpush.core.proto.FMessageCollection.internal_static_com_appjishu_fpush_core_proto_FHeader_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appjishu.fpush.core.proto.FHeader.class, com.appjishu.fpush.core.proto.FHeader.Builder.class);
    }

    // Construct using com.appjishu.fpush.core.proto.FHeader.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      sessionId_ = 0L;

      type_ = 0;

      priority_ = 0;

      regId_ = "";

      alias_ = "";

      account_ = "";

      resultCode_ = "";

      resultText_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appjishu.fpush.core.proto.FMessageCollection.internal_static_com_appjishu_fpush_core_proto_FHeader_descriptor;
    }

    @java.lang.Override
    public com.appjishu.fpush.core.proto.FHeader getDefaultInstanceForType() {
      return com.appjishu.fpush.core.proto.FHeader.getDefaultInstance();
    }

    @java.lang.Override
    public com.appjishu.fpush.core.proto.FHeader build() {
      com.appjishu.fpush.core.proto.FHeader result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.appjishu.fpush.core.proto.FHeader buildPartial() {
      com.appjishu.fpush.core.proto.FHeader result = new com.appjishu.fpush.core.proto.FHeader(this);
      result.sessionId_ = sessionId_;
      result.type_ = type_;
      result.priority_ = priority_;
      result.regId_ = regId_;
      result.alias_ = alias_;
      result.account_ = account_;
      result.resultCode_ = resultCode_;
      result.resultText_ = resultText_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.appjishu.fpush.core.proto.FHeader) {
        return mergeFrom((com.appjishu.fpush.core.proto.FHeader)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appjishu.fpush.core.proto.FHeader other) {
      if (other == com.appjishu.fpush.core.proto.FHeader.getDefaultInstance()) return this;
      if (other.getSessionId() != 0L) {
        setSessionId(other.getSessionId());
      }
      if (other.getType() != 0) {
        setType(other.getType());
      }
      if (other.getPriority() != 0) {
        setPriority(other.getPriority());
      }
      if (!other.getRegId().isEmpty()) {
        regId_ = other.regId_;
        onChanged();
      }
      if (!other.getAlias().isEmpty()) {
        alias_ = other.alias_;
        onChanged();
      }
      if (!other.getAccount().isEmpty()) {
        account_ = other.account_;
        onChanged();
      }
      if (!other.getResultCode().isEmpty()) {
        resultCode_ = other.resultCode_;
        onChanged();
      }
      if (!other.getResultText().isEmpty()) {
        resultText_ = other.resultText_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.appjishu.fpush.core.proto.FHeader parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appjishu.fpush.core.proto.FHeader) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long sessionId_ ;
    /**
     * <code>int64 sessionId = 1;</code>
     */
    public long getSessionId() {
      return sessionId_;
    }
    /**
     * <code>int64 sessionId = 1;</code>
     */
    public Builder setSessionId(long value) {
      
      sessionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 sessionId = 1;</code>
     */
    public Builder clearSessionId() {
      
      sessionId_ = 0L;
      onChanged();
      return this;
    }

    private int type_ ;
    /**
     * <code>int32 type = 2;</code>
     */
    public int getType() {
      return type_;
    }
    /**
     * <code>int32 type = 2;</code>
     */
    public Builder setType(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 type = 2;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private int priority_ ;
    /**
     * <code>int32 priority = 3;</code>
     */
    public int getPriority() {
      return priority_;
    }
    /**
     * <code>int32 priority = 3;</code>
     */
    public Builder setPriority(int value) {
      
      priority_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 priority = 3;</code>
     */
    public Builder clearPriority() {
      
      priority_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object regId_ = "";
    /**
     * <code>string regId = 4;</code>
     */
    public java.lang.String getRegId() {
      java.lang.Object ref = regId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        regId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string regId = 4;</code>
     */
    public com.google.protobuf.ByteString
        getRegIdBytes() {
      java.lang.Object ref = regId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        regId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string regId = 4;</code>
     */
    public Builder setRegId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      regId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string regId = 4;</code>
     */
    public Builder clearRegId() {
      
      regId_ = getDefaultInstance().getRegId();
      onChanged();
      return this;
    }
    /**
     * <code>string regId = 4;</code>
     */
    public Builder setRegIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      regId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object alias_ = "";
    /**
     * <code>string alias = 5;</code>
     */
    public java.lang.String getAlias() {
      java.lang.Object ref = alias_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        alias_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string alias = 5;</code>
     */
    public com.google.protobuf.ByteString
        getAliasBytes() {
      java.lang.Object ref = alias_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        alias_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string alias = 5;</code>
     */
    public Builder setAlias(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      alias_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string alias = 5;</code>
     */
    public Builder clearAlias() {
      
      alias_ = getDefaultInstance().getAlias();
      onChanged();
      return this;
    }
    /**
     * <code>string alias = 5;</code>
     */
    public Builder setAliasBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      alias_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object account_ = "";
    /**
     * <code>string account = 6;</code>
     */
    public java.lang.String getAccount() {
      java.lang.Object ref = account_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        account_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string account = 6;</code>
     */
    public com.google.protobuf.ByteString
        getAccountBytes() {
      java.lang.Object ref = account_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        account_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string account = 6;</code>
     */
    public Builder setAccount(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      account_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string account = 6;</code>
     */
    public Builder clearAccount() {
      
      account_ = getDefaultInstance().getAccount();
      onChanged();
      return this;
    }
    /**
     * <code>string account = 6;</code>
     */
    public Builder setAccountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      account_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object resultCode_ = "";
    /**
     * <code>string resultCode = 7;</code>
     */
    public java.lang.String getResultCode() {
      java.lang.Object ref = resultCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resultCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string resultCode = 7;</code>
     */
    public com.google.protobuf.ByteString
        getResultCodeBytes() {
      java.lang.Object ref = resultCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resultCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string resultCode = 7;</code>
     */
    public Builder setResultCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resultCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string resultCode = 7;</code>
     */
    public Builder clearResultCode() {
      
      resultCode_ = getDefaultInstance().getResultCode();
      onChanged();
      return this;
    }
    /**
     * <code>string resultCode = 7;</code>
     */
    public Builder setResultCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resultCode_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object resultText_ = "";
    /**
     * <code>string resultText = 8;</code>
     */
    public java.lang.String getResultText() {
      java.lang.Object ref = resultText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resultText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string resultText = 8;</code>
     */
    public com.google.protobuf.ByteString
        getResultTextBytes() {
      java.lang.Object ref = resultText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resultText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string resultText = 8;</code>
     */
    public Builder setResultText(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resultText_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string resultText = 8;</code>
     */
    public Builder clearResultText() {
      
      resultText_ = getDefaultInstance().getResultText();
      onChanged();
      return this;
    }
    /**
     * <code>string resultText = 8;</code>
     */
    public Builder setResultTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resultText_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.appjishu.fpush.core.proto.FHeader)
  }

  // @@protoc_insertion_point(class_scope:com.appjishu.fpush.core.proto.FHeader)
  private static final com.appjishu.fpush.core.proto.FHeader DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appjishu.fpush.core.proto.FHeader();
  }

  public static com.appjishu.fpush.core.proto.FHeader getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FHeader>
      PARSER = new com.google.protobuf.AbstractParser<FHeader>() {
    @java.lang.Override
    public FHeader parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FHeader(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FHeader> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FHeader> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.appjishu.fpush.core.proto.FHeader getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

