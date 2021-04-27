// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/snapshot.proto

package org.tensorflow.proto.data.experimental;

public final class SnapshotProtos {
  private SnapshotProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_data_experimental_SnapshotRecord_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_data_experimental_SnapshotRecord_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_data_experimental_SnapshotMetadataRecord_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_data_experimental_SnapshotMetadataRecord_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_data_experimental_TensorMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_data_experimental_TensorMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_data_experimental_SnapshotTensorMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_data_experimental_SnapshotTensorMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'tensorflow/core/protobuf/snapshot.prot" +
      "o\022\034tensorflow.data.experimental\032&tensorf" +
      "low/core/framework/tensor.proto\032,tensorf" +
      "low/core/framework/tensor_shape.proto\032%t" +
      "ensorflow/core/framework/types.proto\"9\n\016" +
      "SnapshotRecord\022\'\n\006tensor\030\001 \003(\0132\027.tensorf" +
      "low.TensorProto\"\270\001\n\026SnapshotMetadataReco" +
      "rd\022\022\n\ngraph_hash\030\001 \001(\t\022\016\n\006run_id\030\002 \001(\t\022\032" +
      "\n\022creation_timestamp\030\003 \001(\003\022\017\n\007version\030\004 " +
      "\001(\003\022#\n\005dtype\030\005 \003(\0162\024.tensorflow.DataType" +
      "\022\024\n\014num_elements\030\006 \001(\003\022\022\n\tfinalized\030\350\007 \001" +
      "(\010\"_\n\016TensorMetadata\0222\n\014tensor_shape\030\002 \001" +
      "(\0132\034.tensorflow.TensorShapeProto\022\031\n\021tens" +
      "or_size_bytes\030\003 \001(\003\"_\n\026SnapshotTensorMet" +
      "adata\022E\n\017tensor_metadata\030\001 \003(\0132,.tensorf" +
      "low.data.experimental.TensorMetadataB:\n&" +
      "org.tensorflow.proto.data.experimentalB\016" +
      "SnapshotProtosP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.tensorflow.proto.framework.TensorProtos.getDescriptor(),
          org.tensorflow.proto.framework.TensorShapeProtos.getDescriptor(),
          org.tensorflow.proto.framework.TypesProtos.getDescriptor(),
        });
    internal_static_tensorflow_data_experimental_SnapshotRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_data_experimental_SnapshotRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_data_experimental_SnapshotRecord_descriptor,
        new java.lang.String[] { "Tensor", });
    internal_static_tensorflow_data_experimental_SnapshotMetadataRecord_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_data_experimental_SnapshotMetadataRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_data_experimental_SnapshotMetadataRecord_descriptor,
        new java.lang.String[] { "GraphHash", "RunId", "CreationTimestamp", "Version", "Dtype", "NumElements", "Finalized", });
    internal_static_tensorflow_data_experimental_TensorMetadata_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_data_experimental_TensorMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_data_experimental_TensorMetadata_descriptor,
        new java.lang.String[] { "TensorShape", "TensorSizeBytes", });
    internal_static_tensorflow_data_experimental_SnapshotTensorMetadata_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tensorflow_data_experimental_SnapshotTensorMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_data_experimental_SnapshotTensorMetadata_descriptor,
        new java.lang.String[] { "TensorMetadata", });
    org.tensorflow.proto.framework.TensorProtos.getDescriptor();
    org.tensorflow.proto.framework.TensorShapeProtos.getDescriptor();
    org.tensorflow.proto.framework.TypesProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
