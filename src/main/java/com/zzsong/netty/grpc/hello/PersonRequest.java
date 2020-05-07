// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package com.zzsong.netty.grpc.hello;

/**
 * Protobuf type {@code com.zzsong.netty.grpc.hello.PersonRequest}
 */
public  final class PersonRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.zzsong.netty.grpc.hello.PersonRequest)
    PersonRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PersonRequest.newBuilder() to construct.
  private PersonRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PersonRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PersonRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PersonRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            sex_ = input.readInt32();
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
    return com.zzsong.netty.grpc.hello.HelloWorldServer.internal_static_com_zzsong_netty_grpc_hello_PersonRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.zzsong.netty.grpc.hello.HelloWorldServer.internal_static_com_zzsong_netty_grpc_hello_PersonRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.zzsong.netty.grpc.hello.PersonRequest.class, com.zzsong.netty.grpc.hello.PersonRequest.Builder.class);
  }

  public static final int SEX_FIELD_NUMBER = 1;
  private int sex_;
  /**
   * <code>int32 sex = 1;</code>
   * @return The sex.
   */
  public int getSex() {
    return sex_;
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
    if (sex_ != 0) {
      output.writeInt32(1, sex_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sex_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, sex_);
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
    if (!(obj instanceof com.zzsong.netty.grpc.hello.PersonRequest)) {
      return super.equals(obj);
    }
    com.zzsong.netty.grpc.hello.PersonRequest other = (com.zzsong.netty.grpc.hello.PersonRequest) obj;

    if (getSex()
        != other.getSex()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SEX_FIELD_NUMBER;
    hash = (53 * hash) + getSex();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.zzsong.netty.grpc.hello.PersonRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zzsong.netty.grpc.hello.PersonRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zzsong.netty.grpc.hello.PersonRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zzsong.netty.grpc.hello.PersonRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zzsong.netty.grpc.hello.PersonRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zzsong.netty.grpc.hello.PersonRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zzsong.netty.grpc.hello.PersonRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zzsong.netty.grpc.hello.PersonRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zzsong.netty.grpc.hello.PersonRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.zzsong.netty.grpc.hello.PersonRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zzsong.netty.grpc.hello.PersonRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zzsong.netty.grpc.hello.PersonRequest parseFrom(
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
  public static Builder newBuilder(com.zzsong.netty.grpc.hello.PersonRequest prototype) {
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
   * Protobuf type {@code com.zzsong.netty.grpc.hello.PersonRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.zzsong.netty.grpc.hello.PersonRequest)
      com.zzsong.netty.grpc.hello.PersonRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.zzsong.netty.grpc.hello.HelloWorldServer.internal_static_com_zzsong_netty_grpc_hello_PersonRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zzsong.netty.grpc.hello.HelloWorldServer.internal_static_com_zzsong_netty_grpc_hello_PersonRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zzsong.netty.grpc.hello.PersonRequest.class, com.zzsong.netty.grpc.hello.PersonRequest.Builder.class);
    }

    // Construct using com.zzsong.netty.grpc.hello.PersonRequest.newBuilder()
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
      sex_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.zzsong.netty.grpc.hello.HelloWorldServer.internal_static_com_zzsong_netty_grpc_hello_PersonRequest_descriptor;
    }

    @java.lang.Override
    public com.zzsong.netty.grpc.hello.PersonRequest getDefaultInstanceForType() {
      return com.zzsong.netty.grpc.hello.PersonRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.zzsong.netty.grpc.hello.PersonRequest build() {
      com.zzsong.netty.grpc.hello.PersonRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.zzsong.netty.grpc.hello.PersonRequest buildPartial() {
      com.zzsong.netty.grpc.hello.PersonRequest result = new com.zzsong.netty.grpc.hello.PersonRequest(this);
      result.sex_ = sex_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.zzsong.netty.grpc.hello.PersonRequest) {
        return mergeFrom((com.zzsong.netty.grpc.hello.PersonRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.zzsong.netty.grpc.hello.PersonRequest other) {
      if (other == com.zzsong.netty.grpc.hello.PersonRequest.getDefaultInstance()) return this;
      if (other.getSex() != 0) {
        setSex(other.getSex());
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
      com.zzsong.netty.grpc.hello.PersonRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.zzsong.netty.grpc.hello.PersonRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int sex_ ;
    /**
     * <code>int32 sex = 1;</code>
     * @return The sex.
     */
    public int getSex() {
      return sex_;
    }
    /**
     * <code>int32 sex = 1;</code>
     * @param value The sex to set.
     * @return This builder for chaining.
     */
    public Builder setSex(int value) {
      
      sex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 sex = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSex() {
      
      sex_ = 0;
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


    // @@protoc_insertion_point(builder_scope:com.zzsong.netty.grpc.hello.PersonRequest)
  }

  // @@protoc_insertion_point(class_scope:com.zzsong.netty.grpc.hello.PersonRequest)
  private static final com.zzsong.netty.grpc.hello.PersonRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.zzsong.netty.grpc.hello.PersonRequest();
  }

  public static com.zzsong.netty.grpc.hello.PersonRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PersonRequest>
      PARSER = new com.google.protobuf.AbstractParser<PersonRequest>() {
    @java.lang.Override
    public PersonRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PersonRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PersonRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PersonRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.zzsong.netty.grpc.hello.PersonRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

