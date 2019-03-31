// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: liquidity_tracker_api.proto

package com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi;

/**
 * Protobuf type {@code com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage}
 */
public  final class LiquidityTrackerIncomingMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage)
    LiquidityTrackerIncomingMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LiquidityTrackerIncomingMessage.newBuilder() to construct.
  private LiquidityTrackerIncomingMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LiquidityTrackerIncomingMessage() {
    type_ = 0;
    value_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LiquidityTrackerIncomingMessage(
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
            int rawValue = input.readEnum();
              @SuppressWarnings("deprecation")
            com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.IncomingMessageType value = com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.IncomingMessageType.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(1, rawValue);
            } else {
              bitField0_ |= 0x00000001;
              type_ = rawValue;
            }
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            value_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
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
    return com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerApi.internal_static_com_baeldung_hexagonalarchitecture_liquiditytracker_protoapi_LiquidityTrackerIncomingMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerApi.internal_static_com_baeldung_hexagonalarchitecture_liquiditytracker_protoapi_LiquidityTrackerIncomingMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage.class, com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage.Builder.class);
  }

  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>required .com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.IncomingMessageType type = 1;</code>
   */
  public boolean hasType() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required .com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.IncomingMessageType type = 1;</code>
   */
  public com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.IncomingMessageType getType() {
    @SuppressWarnings("deprecation")
    com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.IncomingMessageType result = com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.IncomingMessageType.valueOf(type_);
    return result == null ? com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.IncomingMessageType.GET_LIQUIDITY_LIMIT : result;
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private long value_;
  /**
   * <code>optional int64 value = 2;</code>
   */
  public boolean hasValue() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int64 value = 2;</code>
   */
  public long getValue() {
    return value_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasType()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeEnum(1, type_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt64(2, value_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, value_);
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
    if (!(obj instanceof com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage)) {
      return super.equals(obj);
    }
    com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage other = (com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage) obj;

    boolean result = true;
    result = result && (hasType() == other.hasType());
    if (hasType()) {
      result = result && type_ == other.type_;
    }
    result = result && (hasValue() == other.hasValue());
    if (hasValue()) {
      result = result && (getValue()
          == other.getValue());
    }
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
    if (hasType()) {
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
    }
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getValue());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage parseFrom(
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
  public static Builder newBuilder(com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage prototype) {
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
   * Protobuf type {@code com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage)
      com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerApi.internal_static_com_baeldung_hexagonalarchitecture_liquiditytracker_protoapi_LiquidityTrackerIncomingMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerApi.internal_static_com_baeldung_hexagonalarchitecture_liquiditytracker_protoapi_LiquidityTrackerIncomingMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage.class, com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage.Builder.class);
    }

    // Construct using com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage.newBuilder()
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
      type_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      value_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerApi.internal_static_com_baeldung_hexagonalarchitecture_liquiditytracker_protoapi_LiquidityTrackerIncomingMessage_descriptor;
    }

    @java.lang.Override
    public com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage getDefaultInstanceForType() {
      return com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage build() {
      com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage buildPartial() {
      com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage result = new com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.type_ = type_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.value_ = value_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage) {
        return mergeFrom((com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage other) {
      if (other == com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage.getDefaultInstance()) return this;
      if (other.hasType()) {
        setType(other.getType());
      }
      if (other.hasValue()) {
        setValue(other.getValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      if (!hasType()) {
        return false;
      }
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int type_ = 0;
    /**
     * <code>required .com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.IncomingMessageType type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.IncomingMessageType type = 1;</code>
     */
    public com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.IncomingMessageType getType() {
      @SuppressWarnings("deprecation")
      com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.IncomingMessageType result = com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.IncomingMessageType.valueOf(type_);
      return result == null ? com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.IncomingMessageType.GET_LIQUIDITY_LIMIT : result;
    }
    /**
     * <code>required .com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.IncomingMessageType type = 1;</code>
     */
    public Builder setType(com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.IncomingMessageType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>required .com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.IncomingMessageType type = 1;</code>
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private long value_ ;
    /**
     * <code>optional int64 value = 2;</code>
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int64 value = 2;</code>
     */
    public long getValue() {
      return value_;
    }
    /**
     * <code>optional int64 value = 2;</code>
     */
    public Builder setValue(long value) {
      bitField0_ |= 0x00000002;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 value = 2;</code>
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000002);
      value_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage)
  }

  // @@protoc_insertion_point(class_scope:com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage)
  private static final com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage();
  }

  public static com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<LiquidityTrackerIncomingMessage>
      PARSER = new com.google.protobuf.AbstractParser<LiquidityTrackerIncomingMessage>() {
    @java.lang.Override
    public LiquidityTrackerIncomingMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LiquidityTrackerIncomingMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LiquidityTrackerIncomingMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LiquidityTrackerIncomingMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.baeldung.hexagonalarchitecture.liquiditytracker.protoapi.LiquidityTrackerIncomingMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

