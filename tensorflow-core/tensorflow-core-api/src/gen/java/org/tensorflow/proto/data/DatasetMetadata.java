// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/dataset_metadata.proto

package org.tensorflow.proto.data;

public final class DatasetMetadata {
  private DatasetMetadata() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MetadataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:tensorflow.data.Metadata)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes name = 1;</code>
     */
    com.google.protobuf.ByteString getName();
  }
  /**
   * <pre>
   * next: 2
   * </pre>
   *
   * Protobuf type {@code tensorflow.data.Metadata}
   */
  public  static final class Metadata extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:tensorflow.data.Metadata)
      MetadataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Metadata.newBuilder() to construct.
    private Metadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Metadata() {
      name_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Metadata();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Metadata(
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
            case 10: {

              name_ = input.readBytes();
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
      return org.tensorflow.proto.data.DatasetMetadata.internal_static_tensorflow_data_Metadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.proto.data.DatasetMetadata.internal_static_tensorflow_data_Metadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.proto.data.DatasetMetadata.Metadata.class, org.tensorflow.proto.data.DatasetMetadata.Metadata.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString name_;
    /**
     * <code>bytes name = 1;</code>
     */
    public com.google.protobuf.ByteString getName() {
      return name_;
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
      if (!name_.isEmpty()) {
        output.writeBytes(1, name_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!name_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, name_);
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
      if (!(obj instanceof org.tensorflow.proto.data.DatasetMetadata.Metadata)) {
        return super.equals(obj);
      }
      org.tensorflow.proto.data.DatasetMetadata.Metadata other = (org.tensorflow.proto.data.DatasetMetadata.Metadata) obj;

      if (!getName()
          .equals(other.getName())) return false;
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
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.tensorflow.proto.data.DatasetMetadata.Metadata parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tensorflow.proto.data.DatasetMetadata.Metadata parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tensorflow.proto.data.DatasetMetadata.Metadata parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tensorflow.proto.data.DatasetMetadata.Metadata parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tensorflow.proto.data.DatasetMetadata.Metadata parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tensorflow.proto.data.DatasetMetadata.Metadata parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tensorflow.proto.data.DatasetMetadata.Metadata parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tensorflow.proto.data.DatasetMetadata.Metadata parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tensorflow.proto.data.DatasetMetadata.Metadata parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.tensorflow.proto.data.DatasetMetadata.Metadata parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tensorflow.proto.data.DatasetMetadata.Metadata parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tensorflow.proto.data.DatasetMetadata.Metadata parseFrom(
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
    public static Builder newBuilder(org.tensorflow.proto.data.DatasetMetadata.Metadata prototype) {
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
     * next: 2
     * </pre>
     *
     * Protobuf type {@code tensorflow.data.Metadata}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:tensorflow.data.Metadata)
        org.tensorflow.proto.data.DatasetMetadata.MetadataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.tensorflow.proto.data.DatasetMetadata.internal_static_tensorflow_data_Metadata_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.tensorflow.proto.data.DatasetMetadata.internal_static_tensorflow_data_Metadata_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.tensorflow.proto.data.DatasetMetadata.Metadata.class, org.tensorflow.proto.data.DatasetMetadata.Metadata.Builder.class);
      }

      // Construct using org.tensorflow.proto.data.DatasetMetadata.Metadata.newBuilder()
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
        name_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.tensorflow.proto.data.DatasetMetadata.internal_static_tensorflow_data_Metadata_descriptor;
      }

      @java.lang.Override
      public org.tensorflow.proto.data.DatasetMetadata.Metadata getDefaultInstanceForType() {
        return org.tensorflow.proto.data.DatasetMetadata.Metadata.getDefaultInstance();
      }

      @java.lang.Override
      public org.tensorflow.proto.data.DatasetMetadata.Metadata build() {
        org.tensorflow.proto.data.DatasetMetadata.Metadata result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.tensorflow.proto.data.DatasetMetadata.Metadata buildPartial() {
        org.tensorflow.proto.data.DatasetMetadata.Metadata result = new org.tensorflow.proto.data.DatasetMetadata.Metadata(this);
        result.name_ = name_;
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
        if (other instanceof org.tensorflow.proto.data.DatasetMetadata.Metadata) {
          return mergeFrom((org.tensorflow.proto.data.DatasetMetadata.Metadata)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.tensorflow.proto.data.DatasetMetadata.Metadata other) {
        if (other == org.tensorflow.proto.data.DatasetMetadata.Metadata.getDefaultInstance()) return this;
        if (other.getName() != com.google.protobuf.ByteString.EMPTY) {
          setName(other.getName());
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
        org.tensorflow.proto.data.DatasetMetadata.Metadata parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.tensorflow.proto.data.DatasetMetadata.Metadata) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.ByteString name_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes name = 1;</code>
       */
      public com.google.protobuf.ByteString getName() {
        return name_;
      }
      /**
       * <code>bytes name = 1;</code>
       */
      public Builder setName(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes name = 1;</code>
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
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


      // @@protoc_insertion_point(builder_scope:tensorflow.data.Metadata)
    }

    // @@protoc_insertion_point(class_scope:tensorflow.data.Metadata)
    private static final org.tensorflow.proto.data.DatasetMetadata.Metadata DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.tensorflow.proto.data.DatasetMetadata.Metadata();
    }

    public static org.tensorflow.proto.data.DatasetMetadata.Metadata getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Metadata>
        PARSER = new com.google.protobuf.AbstractParser<Metadata>() {
      @java.lang.Override
      public Metadata parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Metadata(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Metadata> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Metadata> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.tensorflow.proto.data.DatasetMetadata.Metadata getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_data_Metadata_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_data_Metadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0tensorflow/core/framework/dataset_meta" +
      "data.proto\022\017tensorflow.data\"\030\n\010Metadata\022" +
      "\014\n\004name\030\001 \001(\014Bt\n\031org.tensorflow.proto.da" +
      "taZWgithub.com/tensorflow/tensorflow/ten" +
      "sorflow/go/core/framework/dataset_metada" +
      "ta_go_protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_tensorflow_data_Metadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_data_Metadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_data_Metadata_descriptor,
        new java.lang.String[] { "Name", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
