// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LargeObject.proto

package com.recepinanc.samplegrpcserver.sample;

/**
 * Protobuf type {@code LargeObjectResponse}
 */
public  final class LargeObjectResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:LargeObjectResponse)
    LargeObjectResponseOrBuilder {
  // Use LargeObjectResponse.newBuilder() to construct.
  private LargeObjectResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LargeObjectResponse() {
    largeObjects_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private LargeObjectResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              largeObjects_ = new java.util.ArrayList<com.recepinanc.samplegrpcserver.sample.LargeObject>();
              mutable_bitField0_ |= 0x00000001;
            }
            largeObjects_.add(
                input.readMessage(com.recepinanc.samplegrpcserver.sample.LargeObject.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        largeObjects_ = java.util.Collections.unmodifiableList(largeObjects_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.recepinanc.samplegrpcserver.sample.LargeObjectProto.internal_static_LargeObjectResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.recepinanc.samplegrpcserver.sample.LargeObjectProto.internal_static_LargeObjectResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.recepinanc.samplegrpcserver.sample.LargeObjectResponse.class, com.recepinanc.samplegrpcserver.sample.LargeObjectResponse.Builder.class);
  }

  public static final int LARGEOBJECTS_FIELD_NUMBER = 1;
  private java.util.List<com.recepinanc.samplegrpcserver.sample.LargeObject> largeObjects_;
  /**
   * <code>repeated .LargeObject largeObjects = 1;</code>
   */
  public java.util.List<com.recepinanc.samplegrpcserver.sample.LargeObject> getLargeObjectsList() {
    return largeObjects_;
  }
  /**
   * <code>repeated .LargeObject largeObjects = 1;</code>
   */
  public java.util.List<? extends com.recepinanc.samplegrpcserver.sample.LargeObjectOrBuilder> 
      getLargeObjectsOrBuilderList() {
    return largeObjects_;
  }
  /**
   * <code>repeated .LargeObject largeObjects = 1;</code>
   */
  public int getLargeObjectsCount() {
    return largeObjects_.size();
  }
  /**
   * <code>repeated .LargeObject largeObjects = 1;</code>
   */
  public com.recepinanc.samplegrpcserver.sample.LargeObject getLargeObjects(int index) {
    return largeObjects_.get(index);
  }
  /**
   * <code>repeated .LargeObject largeObjects = 1;</code>
   */
  public com.recepinanc.samplegrpcserver.sample.LargeObjectOrBuilder getLargeObjectsOrBuilder(
      int index) {
    return largeObjects_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < largeObjects_.size(); i++) {
      output.writeMessage(1, largeObjects_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < largeObjects_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, largeObjects_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.recepinanc.samplegrpcserver.sample.LargeObjectResponse)) {
      return super.equals(obj);
    }
    com.recepinanc.samplegrpcserver.sample.LargeObjectResponse other = (com.recepinanc.samplegrpcserver.sample.LargeObjectResponse) obj;

    boolean result = true;
    result = result && getLargeObjectsList()
        .equals(other.getLargeObjectsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getLargeObjectsCount() > 0) {
      hash = (37 * hash) + LARGEOBJECTS_FIELD_NUMBER;
      hash = (53 * hash) + getLargeObjectsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.recepinanc.samplegrpcserver.sample.LargeObjectResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.recepinanc.samplegrpcserver.sample.LargeObjectResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.recepinanc.samplegrpcserver.sample.LargeObjectResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.recepinanc.samplegrpcserver.sample.LargeObjectResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.recepinanc.samplegrpcserver.sample.LargeObjectResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.recepinanc.samplegrpcserver.sample.LargeObjectResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.recepinanc.samplegrpcserver.sample.LargeObjectResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.recepinanc.samplegrpcserver.sample.LargeObjectResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.recepinanc.samplegrpcserver.sample.LargeObjectResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.recepinanc.samplegrpcserver.sample.LargeObjectResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.recepinanc.samplegrpcserver.sample.LargeObjectResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code LargeObjectResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:LargeObjectResponse)
      com.recepinanc.samplegrpcserver.sample.LargeObjectResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.recepinanc.samplegrpcserver.sample.LargeObjectProto.internal_static_LargeObjectResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.recepinanc.samplegrpcserver.sample.LargeObjectProto.internal_static_LargeObjectResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.recepinanc.samplegrpcserver.sample.LargeObjectResponse.class, com.recepinanc.samplegrpcserver.sample.LargeObjectResponse.Builder.class);
    }

    // Construct using com.recepinanc.samplegrpcserver.sample.LargeObjectResponse.newBuilder()
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
        getLargeObjectsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (largeObjectsBuilder_ == null) {
        largeObjects_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        largeObjectsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.recepinanc.samplegrpcserver.sample.LargeObjectProto.internal_static_LargeObjectResponse_descriptor;
    }

    public com.recepinanc.samplegrpcserver.sample.LargeObjectResponse getDefaultInstanceForType() {
      return com.recepinanc.samplegrpcserver.sample.LargeObjectResponse.getDefaultInstance();
    }

    public com.recepinanc.samplegrpcserver.sample.LargeObjectResponse build() {
      com.recepinanc.samplegrpcserver.sample.LargeObjectResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.recepinanc.samplegrpcserver.sample.LargeObjectResponse buildPartial() {
      com.recepinanc.samplegrpcserver.sample.LargeObjectResponse result = new com.recepinanc.samplegrpcserver.sample.LargeObjectResponse(this);
      int from_bitField0_ = bitField0_;
      if (largeObjectsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          largeObjects_ = java.util.Collections.unmodifiableList(largeObjects_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.largeObjects_ = largeObjects_;
      } else {
        result.largeObjects_ = largeObjectsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.recepinanc.samplegrpcserver.sample.LargeObjectResponse) {
        return mergeFrom((com.recepinanc.samplegrpcserver.sample.LargeObjectResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.recepinanc.samplegrpcserver.sample.LargeObjectResponse other) {
      if (other == com.recepinanc.samplegrpcserver.sample.LargeObjectResponse.getDefaultInstance()) return this;
      if (largeObjectsBuilder_ == null) {
        if (!other.largeObjects_.isEmpty()) {
          if (largeObjects_.isEmpty()) {
            largeObjects_ = other.largeObjects_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLargeObjectsIsMutable();
            largeObjects_.addAll(other.largeObjects_);
          }
          onChanged();
        }
      } else {
        if (!other.largeObjects_.isEmpty()) {
          if (largeObjectsBuilder_.isEmpty()) {
            largeObjectsBuilder_.dispose();
            largeObjectsBuilder_ = null;
            largeObjects_ = other.largeObjects_;
            bitField0_ = (bitField0_ & ~0x00000001);
            largeObjectsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLargeObjectsFieldBuilder() : null;
          } else {
            largeObjectsBuilder_.addAllMessages(other.largeObjects_);
          }
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.recepinanc.samplegrpcserver.sample.LargeObjectResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.recepinanc.samplegrpcserver.sample.LargeObjectResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.recepinanc.samplegrpcserver.sample.LargeObject> largeObjects_ =
      java.util.Collections.emptyList();
    private void ensureLargeObjectsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        largeObjects_ = new java.util.ArrayList<com.recepinanc.samplegrpcserver.sample.LargeObject>(largeObjects_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.recepinanc.samplegrpcserver.sample.LargeObject, com.recepinanc.samplegrpcserver.sample.LargeObject.Builder, com.recepinanc.samplegrpcserver.sample.LargeObjectOrBuilder> largeObjectsBuilder_;

    /**
     * <code>repeated .LargeObject largeObjects = 1;</code>
     */
    public java.util.List<com.recepinanc.samplegrpcserver.sample.LargeObject> getLargeObjectsList() {
      if (largeObjectsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(largeObjects_);
      } else {
        return largeObjectsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .LargeObject largeObjects = 1;</code>
     */
    public int getLargeObjectsCount() {
      if (largeObjectsBuilder_ == null) {
        return largeObjects_.size();
      } else {
        return largeObjectsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .LargeObject largeObjects = 1;</code>
     */
    public com.recepinanc.samplegrpcserver.sample.LargeObject getLargeObjects(int index) {
      if (largeObjectsBuilder_ == null) {
        return largeObjects_.get(index);
      } else {
        return largeObjectsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .LargeObject largeObjects = 1;</code>
     */
    public Builder setLargeObjects(
        int index, com.recepinanc.samplegrpcserver.sample.LargeObject value) {
      if (largeObjectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLargeObjectsIsMutable();
        largeObjects_.set(index, value);
        onChanged();
      } else {
        largeObjectsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .LargeObject largeObjects = 1;</code>
     */
    public Builder setLargeObjects(
        int index, com.recepinanc.samplegrpcserver.sample.LargeObject.Builder builderForValue) {
      if (largeObjectsBuilder_ == null) {
        ensureLargeObjectsIsMutable();
        largeObjects_.set(index, builderForValue.build());
        onChanged();
      } else {
        largeObjectsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .LargeObject largeObjects = 1;</code>
     */
    public Builder addLargeObjects(com.recepinanc.samplegrpcserver.sample.LargeObject value) {
      if (largeObjectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLargeObjectsIsMutable();
        largeObjects_.add(value);
        onChanged();
      } else {
        largeObjectsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .LargeObject largeObjects = 1;</code>
     */
    public Builder addLargeObjects(
        int index, com.recepinanc.samplegrpcserver.sample.LargeObject value) {
      if (largeObjectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLargeObjectsIsMutable();
        largeObjects_.add(index, value);
        onChanged();
      } else {
        largeObjectsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .LargeObject largeObjects = 1;</code>
     */
    public Builder addLargeObjects(
        com.recepinanc.samplegrpcserver.sample.LargeObject.Builder builderForValue) {
      if (largeObjectsBuilder_ == null) {
        ensureLargeObjectsIsMutable();
        largeObjects_.add(builderForValue.build());
        onChanged();
      } else {
        largeObjectsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .LargeObject largeObjects = 1;</code>
     */
    public Builder addLargeObjects(
        int index, com.recepinanc.samplegrpcserver.sample.LargeObject.Builder builderForValue) {
      if (largeObjectsBuilder_ == null) {
        ensureLargeObjectsIsMutable();
        largeObjects_.add(index, builderForValue.build());
        onChanged();
      } else {
        largeObjectsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .LargeObject largeObjects = 1;</code>
     */
    public Builder addAllLargeObjects(
        java.lang.Iterable<? extends com.recepinanc.samplegrpcserver.sample.LargeObject> values) {
      if (largeObjectsBuilder_ == null) {
        ensureLargeObjectsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, largeObjects_);
        onChanged();
      } else {
        largeObjectsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .LargeObject largeObjects = 1;</code>
     */
    public Builder clearLargeObjects() {
      if (largeObjectsBuilder_ == null) {
        largeObjects_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        largeObjectsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .LargeObject largeObjects = 1;</code>
     */
    public Builder removeLargeObjects(int index) {
      if (largeObjectsBuilder_ == null) {
        ensureLargeObjectsIsMutable();
        largeObjects_.remove(index);
        onChanged();
      } else {
        largeObjectsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .LargeObject largeObjects = 1;</code>
     */
    public com.recepinanc.samplegrpcserver.sample.LargeObject.Builder getLargeObjectsBuilder(
        int index) {
      return getLargeObjectsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .LargeObject largeObjects = 1;</code>
     */
    public com.recepinanc.samplegrpcserver.sample.LargeObjectOrBuilder getLargeObjectsOrBuilder(
        int index) {
      if (largeObjectsBuilder_ == null) {
        return largeObjects_.get(index);  } else {
        return largeObjectsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .LargeObject largeObjects = 1;</code>
     */
    public java.util.List<? extends com.recepinanc.samplegrpcserver.sample.LargeObjectOrBuilder> 
         getLargeObjectsOrBuilderList() {
      if (largeObjectsBuilder_ != null) {
        return largeObjectsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(largeObjects_);
      }
    }
    /**
     * <code>repeated .LargeObject largeObjects = 1;</code>
     */
    public com.recepinanc.samplegrpcserver.sample.LargeObject.Builder addLargeObjectsBuilder() {
      return getLargeObjectsFieldBuilder().addBuilder(
          com.recepinanc.samplegrpcserver.sample.LargeObject.getDefaultInstance());
    }
    /**
     * <code>repeated .LargeObject largeObjects = 1;</code>
     */
    public com.recepinanc.samplegrpcserver.sample.LargeObject.Builder addLargeObjectsBuilder(
        int index) {
      return getLargeObjectsFieldBuilder().addBuilder(
          index, com.recepinanc.samplegrpcserver.sample.LargeObject.getDefaultInstance());
    }
    /**
     * <code>repeated .LargeObject largeObjects = 1;</code>
     */
    public java.util.List<com.recepinanc.samplegrpcserver.sample.LargeObject.Builder> 
         getLargeObjectsBuilderList() {
      return getLargeObjectsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.recepinanc.samplegrpcserver.sample.LargeObject, com.recepinanc.samplegrpcserver.sample.LargeObject.Builder, com.recepinanc.samplegrpcserver.sample.LargeObjectOrBuilder> 
        getLargeObjectsFieldBuilder() {
      if (largeObjectsBuilder_ == null) {
        largeObjectsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.recepinanc.samplegrpcserver.sample.LargeObject, com.recepinanc.samplegrpcserver.sample.LargeObject.Builder, com.recepinanc.samplegrpcserver.sample.LargeObjectOrBuilder>(
                largeObjects_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        largeObjects_ = null;
      }
      return largeObjectsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:LargeObjectResponse)
  }

  // @@protoc_insertion_point(class_scope:LargeObjectResponse)
  private static final com.recepinanc.samplegrpcserver.sample.LargeObjectResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.recepinanc.samplegrpcserver.sample.LargeObjectResponse();
  }

  public static com.recepinanc.samplegrpcserver.sample.LargeObjectResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LargeObjectResponse>
      PARSER = new com.google.protobuf.AbstractParser<LargeObjectResponse>() {
    public LargeObjectResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new LargeObjectResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LargeObjectResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LargeObjectResponse> getParserForType() {
    return PARSER;
  }

  public com.recepinanc.samplegrpcserver.sample.LargeObjectResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
