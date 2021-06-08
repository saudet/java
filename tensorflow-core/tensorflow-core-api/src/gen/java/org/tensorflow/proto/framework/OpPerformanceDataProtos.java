// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/grappler/costs/op_performance_data.proto

package org.tensorflow.proto.framework;

public final class OpPerformanceDataProtos {
  private OpPerformanceDataProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SessionInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SessionInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_OpInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_OpInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_OpInfo_AttrEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_OpInfo_AttrEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_OpInfo_TensorProperties_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_OpInfo_TensorProperties_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_NormalDistribution_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_NormalDistribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_LogNormalDistribution_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_LogNormalDistribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_OpPerformance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_OpPerformance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_OpPerformance_OpMemory_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_OpPerformance_OpMemory_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_OpPerformanceList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_OpPerformanceList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8tensorflow/core/grappler/costs/op_perf" +
      "ormance_data.proto\022\ntensorflow\032&tensorfl" +
      "ow/core/framework/tensor.proto\032,tensorfl" +
      "ow/core/framework/tensor_shape.proto\032%te" +
      "nsorflow/core/framework/types.proto\032*ten" +
      "sorflow/core/framework/attr_value.proto\032" +
      "0tensorflow/core/protobuf/device_propert" +
      "ies.proto\"+\n\013SessionInfo\022\034\n\024intra_op_par" +
      "allelism\030\001 \001(\003\"\333\003\n\006OpInfo\022\n\n\002op\030\001 \001(\t\022*\n" +
      "\004attr\030\002 \003(\0132\034.tensorflow.OpInfo.AttrEntr" +
      "y\0223\n\006inputs\030\003 \003(\0132#.tensorflow.OpInfo.Te" +
      "nsorProperties\0224\n\007outputs\030\005 \003(\0132#.tensor" +
      "flow.OpInfo.TensorProperties\022,\n\006device\030\004" +
      " \001(\0132\034.tensorflow.DeviceProperties\022-\n\014se" +
      "ssion_info\030\006 \001(\0132\027.tensorflow.SessionInf" +
      "o\032B\n\tAttrEntry\022\013\n\003key\030\001 \001(\t\022$\n\005value\030\002 \001" +
      "(\0132\025.tensorflow.AttrValue:\0028\001\032\214\001\n\020Tensor" +
      "Properties\022#\n\005dtype\030\001 \001(\0162\024.tensorflow.D" +
      "ataType\022+\n\005shape\030\002 \001(\0132\034.tensorflow.Tens" +
      "orShapeProto\022&\n\005value\030\003 \001(\0132\027.tensorflow" +
      ".TensorProto\"/\n\022NormalDistribution\022\n\n\002mu" +
      "\030\001 \001(\001\022\r\n\005sigma\030\002 \001(\001\"2\n\025LogNormalDistri" +
      "bution\022\n\n\002mu\030\001 \001(\001\022\r\n\005sigma\030\002 \001(\001\"\363\004\n\rOp" +
      "Performance\022\036\n\002op\030\001 \001(\0132\022.tensorflow.OpI" +
      "nfo\0221\n\014session_info\030\014 \001(\0132\027.tensorflow.S" +
      "essionInfoB\002\030\001\022\014\n\004node\030\005 \001(\t\022\035\n\025temporar" +
      "y_memory_size\030\002 \001(\003\022\024\n\014compute_cost\030\003 \001(" +
      "\003\022\024\n\014compute_time\030\006 \001(\003\022\023\n\013memory_time\030\007" +
      " \001(\003\022\032\n\022compute_efficiency\030\004 \001(\001\022\031\n\021memo" +
      "ry_efficiency\030\010 \001(\001\022?\n\025execution_time_no" +
      "rmal\030\n \001(\0132\036.tensorflow.NormalDistributi" +
      "onH\000\022F\n\031execution_time_log_normal\030\013 \001(\0132" +
      "!.tensorflow.LogNormalDistributionH\000\0225\n\t" +
      "op_memory\030\t \001(\0132\".tensorflow.OpPerforman" +
      "ce.OpMemory\032\227\001\n\010OpMemory\022\025\n\routput_memor" +
      "y\030\001 \003(\003\022\023\n\013temp_memory\030\002 \001(\003\022\031\n\021persiste" +
      "nt_memory\030\004 \001(\003\022\036\n\022device_temp_memory\030\003 " +
      "\001(\003B\002\030\001\022$\n\030device_persistent_memory\030\005 \001(" +
      "\003B\002\030\001B\020\n\016execution_time\"F\n\021OpPerformance" +
      "List\0221\n\016op_performance\030\001 \003(\0132\031.tensorflo" +
      "w.OpPerformanceB>\n\036org.tensorflow.proto." +
      "frameworkB\027OpPerformanceDataProtosP\001\370\001\001b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.tensorflow.proto.framework.TensorProtos.getDescriptor(),
          org.tensorflow.proto.framework.TensorShapeProtos.getDescriptor(),
          org.tensorflow.proto.framework.TypesProtos.getDescriptor(),
          org.tensorflow.proto.framework.AttrValueProtos.getDescriptor(),
          org.tensorflow.proto.framework.DevicePropertiesProtos.getDescriptor(),
        });
    internal_static_tensorflow_SessionInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_SessionInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SessionInfo_descriptor,
        new java.lang.String[] { "IntraOpParallelism", });
    internal_static_tensorflow_OpInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_OpInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_OpInfo_descriptor,
        new java.lang.String[] { "Op", "Attr", "Inputs", "Outputs", "Device", "SessionInfo", });
    internal_static_tensorflow_OpInfo_AttrEntry_descriptor =
      internal_static_tensorflow_OpInfo_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_OpInfo_AttrEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_OpInfo_AttrEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_OpInfo_TensorProperties_descriptor =
      internal_static_tensorflow_OpInfo_descriptor.getNestedTypes().get(1);
    internal_static_tensorflow_OpInfo_TensorProperties_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_OpInfo_TensorProperties_descriptor,
        new java.lang.String[] { "Dtype", "Shape", "Value", });
    internal_static_tensorflow_NormalDistribution_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_NormalDistribution_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_NormalDistribution_descriptor,
        new java.lang.String[] { "Mu", "Sigma", });
    internal_static_tensorflow_LogNormalDistribution_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tensorflow_LogNormalDistribution_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_LogNormalDistribution_descriptor,
        new java.lang.String[] { "Mu", "Sigma", });
    internal_static_tensorflow_OpPerformance_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_tensorflow_OpPerformance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_OpPerformance_descriptor,
        new java.lang.String[] { "Op", "SessionInfo", "Node", "TemporaryMemorySize", "ComputeCost", "ComputeTime", "MemoryTime", "ComputeEfficiency", "MemoryEfficiency", "ExecutionTimeNormal", "ExecutionTimeLogNormal", "OpMemory", "ExecutionTime", });
    internal_static_tensorflow_OpPerformance_OpMemory_descriptor =
      internal_static_tensorflow_OpPerformance_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_OpPerformance_OpMemory_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_OpPerformance_OpMemory_descriptor,
        new java.lang.String[] { "OutputMemory", "TempMemory", "PersistentMemory", "DeviceTempMemory", "DevicePersistentMemory", });
    internal_static_tensorflow_OpPerformanceList_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_tensorflow_OpPerformanceList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_OpPerformanceList_descriptor,
        new java.lang.String[] { "OpPerformance", });
    org.tensorflow.proto.framework.TensorProtos.getDescriptor();
    org.tensorflow.proto.framework.TensorShapeProtos.getDescriptor();
    org.tensorflow.proto.framework.TypesProtos.getDescriptor();
    org.tensorflow.proto.framework.AttrValueProtos.getDescriptor();
    org.tensorflow.proto.framework.DevicePropertiesProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
