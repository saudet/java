// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/dataset_options.proto

package org.tensorflow.proto.data;

/**
 * <pre>
 * next: 3
 * </pre>
 *
 * Protobuf type {@code tensorflow.data.ThreadingOptions}
 */
public  final class ThreadingOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.data.ThreadingOptions)
    ThreadingOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ThreadingOptions.newBuilder() to construct.
  private ThreadingOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ThreadingOptions() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ThreadingOptions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ThreadingOptions(
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
            optionalMaxIntraOpParallelismCase_ = 1;
            optionalMaxIntraOpParallelism_ = input.readInt32();
            break;
          }
          case 16: {
            optionalPrivateThreadpoolSizeCase_ = 2;
            optionalPrivateThreadpoolSize_ = input.readInt32();
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
    return org.tensorflow.proto.data.DatasetOptionsProtos.internal_static_tensorflow_data_ThreadingOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.proto.data.DatasetOptionsProtos.internal_static_tensorflow_data_ThreadingOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.proto.data.ThreadingOptions.class, org.tensorflow.proto.data.ThreadingOptions.Builder.class);
  }

  private int optionalMaxIntraOpParallelismCase_ = 0;
  private java.lang.Object optionalMaxIntraOpParallelism_;
  public enum OptionalMaxIntraOpParallelismCase
      implements com.google.protobuf.Internal.EnumLite {
    MAX_INTRA_OP_PARALLELISM(1),
    OPTIONALMAXINTRAOPPARALLELISM_NOT_SET(0);
    private final int value;
    private OptionalMaxIntraOpParallelismCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OptionalMaxIntraOpParallelismCase valueOf(int value) {
      return forNumber(value);
    }

    public static OptionalMaxIntraOpParallelismCase forNumber(int value) {
      switch (value) {
        case 1: return MAX_INTRA_OP_PARALLELISM;
        case 0: return OPTIONALMAXINTRAOPPARALLELISM_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public OptionalMaxIntraOpParallelismCase
  getOptionalMaxIntraOpParallelismCase() {
    return OptionalMaxIntraOpParallelismCase.forNumber(
        optionalMaxIntraOpParallelismCase_);
  }

  private int optionalPrivateThreadpoolSizeCase_ = 0;
  private java.lang.Object optionalPrivateThreadpoolSize_;
  public enum OptionalPrivateThreadpoolSizeCase
      implements com.google.protobuf.Internal.EnumLite {
    PRIVATE_THREADPOOL_SIZE(2),
    OPTIONALPRIVATETHREADPOOLSIZE_NOT_SET(0);
    private final int value;
    private OptionalPrivateThreadpoolSizeCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OptionalPrivateThreadpoolSizeCase valueOf(int value) {
      return forNumber(value);
    }

    public static OptionalPrivateThreadpoolSizeCase forNumber(int value) {
      switch (value) {
        case 2: return PRIVATE_THREADPOOL_SIZE;
        case 0: return OPTIONALPRIVATETHREADPOOLSIZE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public OptionalPrivateThreadpoolSizeCase
  getOptionalPrivateThreadpoolSizeCase() {
    return OptionalPrivateThreadpoolSizeCase.forNumber(
        optionalPrivateThreadpoolSizeCase_);
  }

  public static final int MAX_INTRA_OP_PARALLELISM_FIELD_NUMBER = 1;
  /**
   * <code>int32 max_intra_op_parallelism = 1;</code>
   */
  public int getMaxIntraOpParallelism() {
    if (optionalMaxIntraOpParallelismCase_ == 1) {
      return (java.lang.Integer) optionalMaxIntraOpParallelism_;
    }
    return 0;
  }

  public static final int PRIVATE_THREADPOOL_SIZE_FIELD_NUMBER = 2;
  /**
   * <code>int32 private_threadpool_size = 2;</code>
   */
  public int getPrivateThreadpoolSize() {
    if (optionalPrivateThreadpoolSizeCase_ == 2) {
      return (java.lang.Integer) optionalPrivateThreadpoolSize_;
    }
    return 0;
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
    if (optionalMaxIntraOpParallelismCase_ == 1) {
      output.writeInt32(
          1, (int)((java.lang.Integer) optionalMaxIntraOpParallelism_));
    }
    if (optionalPrivateThreadpoolSizeCase_ == 2) {
      output.writeInt32(
          2, (int)((java.lang.Integer) optionalPrivateThreadpoolSize_));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (optionalMaxIntraOpParallelismCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(
            1, (int)((java.lang.Integer) optionalMaxIntraOpParallelism_));
    }
    if (optionalPrivateThreadpoolSizeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(
            2, (int)((java.lang.Integer) optionalPrivateThreadpoolSize_));
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
    if (!(obj instanceof org.tensorflow.proto.data.ThreadingOptions)) {
      return super.equals(obj);
    }
    org.tensorflow.proto.data.ThreadingOptions other = (org.tensorflow.proto.data.ThreadingOptions) obj;

    if (!getOptionalMaxIntraOpParallelismCase().equals(other.getOptionalMaxIntraOpParallelismCase())) return false;
    switch (optionalMaxIntraOpParallelismCase_) {
      case 1:
        if (getMaxIntraOpParallelism()
            != other.getMaxIntraOpParallelism()) return false;
        break;
      case 0:
      default:
    }
    if (!getOptionalPrivateThreadpoolSizeCase().equals(other.getOptionalPrivateThreadpoolSizeCase())) return false;
    switch (optionalPrivateThreadpoolSizeCase_) {
      case 2:
        if (getPrivateThreadpoolSize()
            != other.getPrivateThreadpoolSize()) return false;
        break;
      case 0:
      default:
    }
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
    switch (optionalMaxIntraOpParallelismCase_) {
      case 1:
        hash = (37 * hash) + MAX_INTRA_OP_PARALLELISM_FIELD_NUMBER;
        hash = (53 * hash) + getMaxIntraOpParallelism();
        break;
      case 0:
      default:
    }
    switch (optionalPrivateThreadpoolSizeCase_) {
      case 2:
        hash = (37 * hash) + PRIVATE_THREADPOOL_SIZE_FIELD_NUMBER;
        hash = (53 * hash) + getPrivateThreadpoolSize();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.proto.data.ThreadingOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.data.ThreadingOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.data.ThreadingOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.data.ThreadingOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.data.ThreadingOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.data.ThreadingOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.data.ThreadingOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.data.ThreadingOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.data.ThreadingOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.data.ThreadingOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.data.ThreadingOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.data.ThreadingOptions parseFrom(
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
  public static Builder newBuilder(org.tensorflow.proto.data.ThreadingOptions prototype) {
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
   * <pre>
   * next: 3
   * </pre>
   *
   * Protobuf type {@code tensorflow.data.ThreadingOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.data.ThreadingOptions)
      org.tensorflow.proto.data.ThreadingOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.proto.data.DatasetOptionsProtos.internal_static_tensorflow_data_ThreadingOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.proto.data.DatasetOptionsProtos.internal_static_tensorflow_data_ThreadingOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.proto.data.ThreadingOptions.class, org.tensorflow.proto.data.ThreadingOptions.Builder.class);
    }

    // Construct using org.tensorflow.proto.data.ThreadingOptions.newBuilder()
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
      optionalMaxIntraOpParallelismCase_ = 0;
      optionalMaxIntraOpParallelism_ = null;
      optionalPrivateThreadpoolSizeCase_ = 0;
      optionalPrivateThreadpoolSize_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.proto.data.DatasetOptionsProtos.internal_static_tensorflow_data_ThreadingOptions_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.proto.data.ThreadingOptions getDefaultInstanceForType() {
      return org.tensorflow.proto.data.ThreadingOptions.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.proto.data.ThreadingOptions build() {
      org.tensorflow.proto.data.ThreadingOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.proto.data.ThreadingOptions buildPartial() {
      org.tensorflow.proto.data.ThreadingOptions result = new org.tensorflow.proto.data.ThreadingOptions(this);
      if (optionalMaxIntraOpParallelismCase_ == 1) {
        result.optionalMaxIntraOpParallelism_ = optionalMaxIntraOpParallelism_;
      }
      if (optionalPrivateThreadpoolSizeCase_ == 2) {
        result.optionalPrivateThreadpoolSize_ = optionalPrivateThreadpoolSize_;
      }
      result.optionalMaxIntraOpParallelismCase_ = optionalMaxIntraOpParallelismCase_;
      result.optionalPrivateThreadpoolSizeCase_ = optionalPrivateThreadpoolSizeCase_;
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
      if (other instanceof org.tensorflow.proto.data.ThreadingOptions) {
        return mergeFrom((org.tensorflow.proto.data.ThreadingOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.proto.data.ThreadingOptions other) {
      if (other == org.tensorflow.proto.data.ThreadingOptions.getDefaultInstance()) return this;
      switch (other.getOptionalMaxIntraOpParallelismCase()) {
        case MAX_INTRA_OP_PARALLELISM: {
          setMaxIntraOpParallelism(other.getMaxIntraOpParallelism());
          break;
        }
        case OPTIONALMAXINTRAOPPARALLELISM_NOT_SET: {
          break;
        }
      }
      switch (other.getOptionalPrivateThreadpoolSizeCase()) {
        case PRIVATE_THREADPOOL_SIZE: {
          setPrivateThreadpoolSize(other.getPrivateThreadpoolSize());
          break;
        }
        case OPTIONALPRIVATETHREADPOOLSIZE_NOT_SET: {
          break;
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
      org.tensorflow.proto.data.ThreadingOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.proto.data.ThreadingOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int optionalMaxIntraOpParallelismCase_ = 0;
    private java.lang.Object optionalMaxIntraOpParallelism_;
    public OptionalMaxIntraOpParallelismCase
        getOptionalMaxIntraOpParallelismCase() {
      return OptionalMaxIntraOpParallelismCase.forNumber(
          optionalMaxIntraOpParallelismCase_);
    }

    public Builder clearOptionalMaxIntraOpParallelism() {
      optionalMaxIntraOpParallelismCase_ = 0;
      optionalMaxIntraOpParallelism_ = null;
      onChanged();
      return this;
    }

    private int optionalPrivateThreadpoolSizeCase_ = 0;
    private java.lang.Object optionalPrivateThreadpoolSize_;
    public OptionalPrivateThreadpoolSizeCase
        getOptionalPrivateThreadpoolSizeCase() {
      return OptionalPrivateThreadpoolSizeCase.forNumber(
          optionalPrivateThreadpoolSizeCase_);
    }

    public Builder clearOptionalPrivateThreadpoolSize() {
      optionalPrivateThreadpoolSizeCase_ = 0;
      optionalPrivateThreadpoolSize_ = null;
      onChanged();
      return this;
    }


    /**
     * <code>int32 max_intra_op_parallelism = 1;</code>
     */
    public int getMaxIntraOpParallelism() {
      if (optionalMaxIntraOpParallelismCase_ == 1) {
        return (java.lang.Integer) optionalMaxIntraOpParallelism_;
      }
      return 0;
    }
    /**
     * <code>int32 max_intra_op_parallelism = 1;</code>
     */
    public Builder setMaxIntraOpParallelism(int value) {
      optionalMaxIntraOpParallelismCase_ = 1;
      optionalMaxIntraOpParallelism_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 max_intra_op_parallelism = 1;</code>
     */
    public Builder clearMaxIntraOpParallelism() {
      if (optionalMaxIntraOpParallelismCase_ == 1) {
        optionalMaxIntraOpParallelismCase_ = 0;
        optionalMaxIntraOpParallelism_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>int32 private_threadpool_size = 2;</code>
     */
    public int getPrivateThreadpoolSize() {
      if (optionalPrivateThreadpoolSizeCase_ == 2) {
        return (java.lang.Integer) optionalPrivateThreadpoolSize_;
      }
      return 0;
    }
    /**
     * <code>int32 private_threadpool_size = 2;</code>
     */
    public Builder setPrivateThreadpoolSize(int value) {
      optionalPrivateThreadpoolSizeCase_ = 2;
      optionalPrivateThreadpoolSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 private_threadpool_size = 2;</code>
     */
    public Builder clearPrivateThreadpoolSize() {
      if (optionalPrivateThreadpoolSizeCase_ == 2) {
        optionalPrivateThreadpoolSizeCase_ = 0;
        optionalPrivateThreadpoolSize_ = null;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:tensorflow.data.ThreadingOptions)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.data.ThreadingOptions)
  private static final org.tensorflow.proto.data.ThreadingOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.proto.data.ThreadingOptions();
  }

  public static org.tensorflow.proto.data.ThreadingOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ThreadingOptions>
      PARSER = new com.google.protobuf.AbstractParser<ThreadingOptions>() {
    @java.lang.Override
    public ThreadingOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ThreadingOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ThreadingOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ThreadingOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.proto.data.ThreadingOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

