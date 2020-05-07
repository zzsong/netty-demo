// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package com.zzsong.netty.grpc.hello;

/**
 * Protobuf type {@code com.zzsong.netty.grpc.hello.CatReplyList}
 */
public  final class CatReplyList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.zzsong.netty.grpc.hello.CatReplyList)
    CatReplyListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CatReplyList.newBuilder() to construct.
  private CatReplyList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CatReplyList() {
    catReply_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CatReplyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CatReplyList(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              catReply_ = new java.util.ArrayList<com.zzsong.netty.grpc.hello.CatReply>();
              mutable_bitField0_ |= 0x00000001;
            }
            catReply_.add(
                input.readMessage(com.zzsong.netty.grpc.hello.CatReply.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        catReply_ = java.util.Collections.unmodifiableList(catReply_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.zzsong.netty.grpc.hello.HelloWorldServer.internal_static_com_zzsong_netty_grpc_hello_CatReplyList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.zzsong.netty.grpc.hello.HelloWorldServer.internal_static_com_zzsong_netty_grpc_hello_CatReplyList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.zzsong.netty.grpc.hello.CatReplyList.class, com.zzsong.netty.grpc.hello.CatReplyList.Builder.class);
  }

  public static final int CATREPLY_FIELD_NUMBER = 1;
  private java.util.List<com.zzsong.netty.grpc.hello.CatReply> catReply_;
  /**
   * <code>repeated .com.zzsong.netty.grpc.hello.CatReply catReply = 1;</code>
   */
  public java.util.List<com.zzsong.netty.grpc.hello.CatReply> getCatReplyList() {
    return catReply_;
  }
  /**
   * <code>repeated .com.zzsong.netty.grpc.hello.CatReply catReply = 1;</code>
   */
  public java.util.List<? extends com.zzsong.netty.grpc.hello.CatReplyOrBuilder> 
      getCatReplyOrBuilderList() {
    return catReply_;
  }
  /**
   * <code>repeated .com.zzsong.netty.grpc.hello.CatReply catReply = 1;</code>
   */
  public int getCatReplyCount() {
    return catReply_.size();
  }
  /**
   * <code>repeated .com.zzsong.netty.grpc.hello.CatReply catReply = 1;</code>
   */
  public com.zzsong.netty.grpc.hello.CatReply getCatReply(int index) {
    return catReply_.get(index);
  }
  /**
   * <code>repeated .com.zzsong.netty.grpc.hello.CatReply catReply = 1;</code>
   */
  public com.zzsong.netty.grpc.hello.CatReplyOrBuilder getCatReplyOrBuilder(
      int index) {
    return catReply_.get(index);
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
    for (int i = 0; i < catReply_.size(); i++) {
      output.writeMessage(1, catReply_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < catReply_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, catReply_.get(i));
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
    if (!(obj instanceof com.zzsong.netty.grpc.hello.CatReplyList)) {
      return super.equals(obj);
    }
    com.zzsong.netty.grpc.hello.CatReplyList other = (com.zzsong.netty.grpc.hello.CatReplyList) obj;

    if (!getCatReplyList()
        .equals(other.getCatReplyList())) return false;
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
    if (getCatReplyCount() > 0) {
      hash = (37 * hash) + CATREPLY_FIELD_NUMBER;
      hash = (53 * hash) + getCatReplyList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.zzsong.netty.grpc.hello.CatReplyList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zzsong.netty.grpc.hello.CatReplyList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zzsong.netty.grpc.hello.CatReplyList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zzsong.netty.grpc.hello.CatReplyList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zzsong.netty.grpc.hello.CatReplyList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zzsong.netty.grpc.hello.CatReplyList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zzsong.netty.grpc.hello.CatReplyList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zzsong.netty.grpc.hello.CatReplyList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zzsong.netty.grpc.hello.CatReplyList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.zzsong.netty.grpc.hello.CatReplyList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zzsong.netty.grpc.hello.CatReplyList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zzsong.netty.grpc.hello.CatReplyList parseFrom(
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
  public static Builder newBuilder(com.zzsong.netty.grpc.hello.CatReplyList prototype) {
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
   * Protobuf type {@code com.zzsong.netty.grpc.hello.CatReplyList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.zzsong.netty.grpc.hello.CatReplyList)
      com.zzsong.netty.grpc.hello.CatReplyListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.zzsong.netty.grpc.hello.HelloWorldServer.internal_static_com_zzsong_netty_grpc_hello_CatReplyList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zzsong.netty.grpc.hello.HelloWorldServer.internal_static_com_zzsong_netty_grpc_hello_CatReplyList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zzsong.netty.grpc.hello.CatReplyList.class, com.zzsong.netty.grpc.hello.CatReplyList.Builder.class);
    }

    // Construct using com.zzsong.netty.grpc.hello.CatReplyList.newBuilder()
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
        getCatReplyFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (catReplyBuilder_ == null) {
        catReply_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        catReplyBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.zzsong.netty.grpc.hello.HelloWorldServer.internal_static_com_zzsong_netty_grpc_hello_CatReplyList_descriptor;
    }

    @java.lang.Override
    public com.zzsong.netty.grpc.hello.CatReplyList getDefaultInstanceForType() {
      return com.zzsong.netty.grpc.hello.CatReplyList.getDefaultInstance();
    }

    @java.lang.Override
    public com.zzsong.netty.grpc.hello.CatReplyList build() {
      com.zzsong.netty.grpc.hello.CatReplyList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.zzsong.netty.grpc.hello.CatReplyList buildPartial() {
      com.zzsong.netty.grpc.hello.CatReplyList result = new com.zzsong.netty.grpc.hello.CatReplyList(this);
      int from_bitField0_ = bitField0_;
      if (catReplyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          catReply_ = java.util.Collections.unmodifiableList(catReply_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.catReply_ = catReply_;
      } else {
        result.catReply_ = catReplyBuilder_.build();
      }
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
      if (other instanceof com.zzsong.netty.grpc.hello.CatReplyList) {
        return mergeFrom((com.zzsong.netty.grpc.hello.CatReplyList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.zzsong.netty.grpc.hello.CatReplyList other) {
      if (other == com.zzsong.netty.grpc.hello.CatReplyList.getDefaultInstance()) return this;
      if (catReplyBuilder_ == null) {
        if (!other.catReply_.isEmpty()) {
          if (catReply_.isEmpty()) {
            catReply_ = other.catReply_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCatReplyIsMutable();
            catReply_.addAll(other.catReply_);
          }
          onChanged();
        }
      } else {
        if (!other.catReply_.isEmpty()) {
          if (catReplyBuilder_.isEmpty()) {
            catReplyBuilder_.dispose();
            catReplyBuilder_ = null;
            catReply_ = other.catReply_;
            bitField0_ = (bitField0_ & ~0x00000001);
            catReplyBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCatReplyFieldBuilder() : null;
          } else {
            catReplyBuilder_.addAllMessages(other.catReply_);
          }
        }
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
      com.zzsong.netty.grpc.hello.CatReplyList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.zzsong.netty.grpc.hello.CatReplyList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.zzsong.netty.grpc.hello.CatReply> catReply_ =
      java.util.Collections.emptyList();
    private void ensureCatReplyIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        catReply_ = new java.util.ArrayList<com.zzsong.netty.grpc.hello.CatReply>(catReply_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.zzsong.netty.grpc.hello.CatReply, com.zzsong.netty.grpc.hello.CatReply.Builder, com.zzsong.netty.grpc.hello.CatReplyOrBuilder> catReplyBuilder_;

    /**
     * <code>repeated .com.zzsong.netty.grpc.hello.CatReply catReply = 1;</code>
     */
    public java.util.List<com.zzsong.netty.grpc.hello.CatReply> getCatReplyList() {
      if (catReplyBuilder_ == null) {
        return java.util.Collections.unmodifiableList(catReply_);
      } else {
        return catReplyBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.zzsong.netty.grpc.hello.CatReply catReply = 1;</code>
     */
    public int getCatReplyCount() {
      if (catReplyBuilder_ == null) {
        return catReply_.size();
      } else {
        return catReplyBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.zzsong.netty.grpc.hello.CatReply catReply = 1;</code>
     */
    public com.zzsong.netty.grpc.hello.CatReply getCatReply(int index) {
      if (catReplyBuilder_ == null) {
        return catReply_.get(index);
      } else {
        return catReplyBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.zzsong.netty.grpc.hello.CatReply catReply = 1;</code>
     */
    public Builder setCatReply(
        int index, com.zzsong.netty.grpc.hello.CatReply value) {
      if (catReplyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCatReplyIsMutable();
        catReply_.set(index, value);
        onChanged();
      } else {
        catReplyBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.zzsong.netty.grpc.hello.CatReply catReply = 1;</code>
     */
    public Builder setCatReply(
        int index, com.zzsong.netty.grpc.hello.CatReply.Builder builderForValue) {
      if (catReplyBuilder_ == null) {
        ensureCatReplyIsMutable();
        catReply_.set(index, builderForValue.build());
        onChanged();
      } else {
        catReplyBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.zzsong.netty.grpc.hello.CatReply catReply = 1;</code>
     */
    public Builder addCatReply(com.zzsong.netty.grpc.hello.CatReply value) {
      if (catReplyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCatReplyIsMutable();
        catReply_.add(value);
        onChanged();
      } else {
        catReplyBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.zzsong.netty.grpc.hello.CatReply catReply = 1;</code>
     */
    public Builder addCatReply(
        int index, com.zzsong.netty.grpc.hello.CatReply value) {
      if (catReplyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCatReplyIsMutable();
        catReply_.add(index, value);
        onChanged();
      } else {
        catReplyBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.zzsong.netty.grpc.hello.CatReply catReply = 1;</code>
     */
    public Builder addCatReply(
        com.zzsong.netty.grpc.hello.CatReply.Builder builderForValue) {
      if (catReplyBuilder_ == null) {
        ensureCatReplyIsMutable();
        catReply_.add(builderForValue.build());
        onChanged();
      } else {
        catReplyBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.zzsong.netty.grpc.hello.CatReply catReply = 1;</code>
     */
    public Builder addCatReply(
        int index, com.zzsong.netty.grpc.hello.CatReply.Builder builderForValue) {
      if (catReplyBuilder_ == null) {
        ensureCatReplyIsMutable();
        catReply_.add(index, builderForValue.build());
        onChanged();
      } else {
        catReplyBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.zzsong.netty.grpc.hello.CatReply catReply = 1;</code>
     */
    public Builder addAllCatReply(
        java.lang.Iterable<? extends com.zzsong.netty.grpc.hello.CatReply> values) {
      if (catReplyBuilder_ == null) {
        ensureCatReplyIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, catReply_);
        onChanged();
      } else {
        catReplyBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.zzsong.netty.grpc.hello.CatReply catReply = 1;</code>
     */
    public Builder clearCatReply() {
      if (catReplyBuilder_ == null) {
        catReply_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        catReplyBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.zzsong.netty.grpc.hello.CatReply catReply = 1;</code>
     */
    public Builder removeCatReply(int index) {
      if (catReplyBuilder_ == null) {
        ensureCatReplyIsMutable();
        catReply_.remove(index);
        onChanged();
      } else {
        catReplyBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.zzsong.netty.grpc.hello.CatReply catReply = 1;</code>
     */
    public com.zzsong.netty.grpc.hello.CatReply.Builder getCatReplyBuilder(
        int index) {
      return getCatReplyFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.zzsong.netty.grpc.hello.CatReply catReply = 1;</code>
     */
    public com.zzsong.netty.grpc.hello.CatReplyOrBuilder getCatReplyOrBuilder(
        int index) {
      if (catReplyBuilder_ == null) {
        return catReply_.get(index);  } else {
        return catReplyBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.zzsong.netty.grpc.hello.CatReply catReply = 1;</code>
     */
    public java.util.List<? extends com.zzsong.netty.grpc.hello.CatReplyOrBuilder> 
         getCatReplyOrBuilderList() {
      if (catReplyBuilder_ != null) {
        return catReplyBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(catReply_);
      }
    }
    /**
     * <code>repeated .com.zzsong.netty.grpc.hello.CatReply catReply = 1;</code>
     */
    public com.zzsong.netty.grpc.hello.CatReply.Builder addCatReplyBuilder() {
      return getCatReplyFieldBuilder().addBuilder(
          com.zzsong.netty.grpc.hello.CatReply.getDefaultInstance());
    }
    /**
     * <code>repeated .com.zzsong.netty.grpc.hello.CatReply catReply = 1;</code>
     */
    public com.zzsong.netty.grpc.hello.CatReply.Builder addCatReplyBuilder(
        int index) {
      return getCatReplyFieldBuilder().addBuilder(
          index, com.zzsong.netty.grpc.hello.CatReply.getDefaultInstance());
    }
    /**
     * <code>repeated .com.zzsong.netty.grpc.hello.CatReply catReply = 1;</code>
     */
    public java.util.List<com.zzsong.netty.grpc.hello.CatReply.Builder> 
         getCatReplyBuilderList() {
      return getCatReplyFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.zzsong.netty.grpc.hello.CatReply, com.zzsong.netty.grpc.hello.CatReply.Builder, com.zzsong.netty.grpc.hello.CatReplyOrBuilder> 
        getCatReplyFieldBuilder() {
      if (catReplyBuilder_ == null) {
        catReplyBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.zzsong.netty.grpc.hello.CatReply, com.zzsong.netty.grpc.hello.CatReply.Builder, com.zzsong.netty.grpc.hello.CatReplyOrBuilder>(
                catReply_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        catReply_ = null;
      }
      return catReplyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.zzsong.netty.grpc.hello.CatReplyList)
  }

  // @@protoc_insertion_point(class_scope:com.zzsong.netty.grpc.hello.CatReplyList)
  private static final com.zzsong.netty.grpc.hello.CatReplyList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.zzsong.netty.grpc.hello.CatReplyList();
  }

  public static com.zzsong.netty.grpc.hello.CatReplyList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CatReplyList>
      PARSER = new com.google.protobuf.AbstractParser<CatReplyList>() {
    @java.lang.Override
    public CatReplyList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CatReplyList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CatReplyList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CatReplyList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.zzsong.netty.grpc.hello.CatReplyList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

