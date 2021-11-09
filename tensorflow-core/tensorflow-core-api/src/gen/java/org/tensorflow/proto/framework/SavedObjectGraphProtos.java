// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/saved_object_graph.proto

package org.tensorflow.proto.framework;

public final class SavedObjectGraphProtos {
  private SavedObjectGraphProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SavedObjectGraph_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SavedObjectGraph_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SavedObjectGraph_ConcreteFunctionsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SavedObjectGraph_ConcreteFunctionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SavedObject_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SavedObject_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SavedObject_SaveableObjectsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SavedObject_SaveableObjectsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SavedUserObject_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SavedUserObject_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SavedAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SavedAsset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SavedFunction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SavedFunction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CapturedTensor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_CapturedTensor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SavedConcreteFunction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SavedConcreteFunction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SavedBareConcreteFunction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SavedBareConcreteFunction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SavedConstant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SavedConstant_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SavedVariable_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SavedVariable_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_FunctionSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_FunctionSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SavedResource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SavedResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SaveableObject_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SaveableObject_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1tensorflow/core/protobuf/saved_object_" +
      "graph.proto\022\ntensorflow\032\031google/protobuf" +
      "/any.proto\032,tensorflow/core/framework/te" +
      "nsor_shape.proto\032%tensorflow/core/framew" +
      "ork/types.proto\032(tensorflow/core/framewo" +
      "rk/variable.proto\032(tensorflow/core/frame" +
      "work/versions.proto\032%tensorflow/core/pro" +
      "tobuf/struct.proto\0325tensorflow/core/prot" +
      "obuf/trackable_object_graph.proto\"\350\001\n\020Sa" +
      "vedObjectGraph\022&\n\005nodes\030\001 \003(\0132\027.tensorfl" +
      "ow.SavedObject\022O\n\022concrete_functions\030\002 \003" +
      "(\01323.tensorflow.SavedObjectGraph.Concret" +
      "eFunctionsEntry\032[\n\026ConcreteFunctionsEntr" +
      "y\022\013\n\003key\030\001 \001(\t\0220\n\005value\030\002 \001(\0132!.tensorfl" +
      "ow.SavedConcreteFunction:\0028\001\"\336\006\n\013SavedOb" +
      "ject\022R\n\010children\030\001 \003(\0132@.tensorflow.Trac" +
      "kableObjectGraph.TrackableObject.ObjectR" +
      "eference\022^\n\016slot_variables\030\003 \003(\0132F.tenso" +
      "rflow.TrackableObjectGraph.TrackableObje" +
      "ct.SlotVariableReference\0222\n\013user_object\030" +
      "\004 \001(\0132\033.tensorflow.SavedUserObjectH\000\022\'\n\005" +
      "asset\030\005 \001(\0132\026.tensorflow.SavedAssetH\000\022-\n" +
      "\010function\030\006 \001(\0132\031.tensorflow.SavedFuncti" +
      "onH\000\022-\n\010variable\030\007 \001(\0132\031.tensorflow.Save" +
      "dVariableH\000\022G\n\026bare_concrete_function\030\010 " +
      "\001(\0132%.tensorflow.SavedBareConcreteFuncti" +
      "onH\000\022-\n\010constant\030\t \001(\0132\031.tensorflow.Save" +
      "dConstantH\000\022-\n\010resource\030\n \001(\0132\031.tensorfl" +
      "ow.SavedResourceH\000\0225\n\017captured_tensor\030\014 " +
      "\001(\0132\032.tensorflow.CapturedTensorH\000\022F\n\020sav" +
      "eable_objects\030\013 \003(\0132,.tensorflow.SavedOb" +
      "ject.SaveableObjectsEntry\022\027\n\017registered_" +
      "name\030\r \001(\t\0223\n\025serialized_user_proto\030\016 \001(" +
      "\0132\024.google.protobuf.Any\032R\n\024SaveableObjec" +
      "tsEntry\022\013\n\003key\030\001 \001(\t\022)\n\005value\030\002 \001(\0132\032.te" +
      "nsorflow.SaveableObject:\0028\001B\006\n\004kindJ\004\010\002\020" +
      "\003R\nattributes\"d\n\017SavedUserObject\022\022\n\niden" +
      "tifier\030\001 \001(\t\022\'\n\007version\030\002 \001(\0132\026.tensorfl" +
      "ow.VersionDef\022\024\n\010metadata\030\003 \001(\tB\002\030\001\"*\n\nS" +
      "avedAsset\022\034\n\024asset_file_def_index\030\001 \001(\005\"" +
      "\\\n\rSavedFunction\022\032\n\022concrete_functions\030\001" +
      " \003(\t\022/\n\rfunction_spec\030\002 \001(\0132\030.tensorflow" +
      ".FunctionSpec\"9\n\016CapturedTensor\022\014\n\004name\030" +
      "\001 \001(\t\022\031\n\021concrete_function\030\002 \001(\t\"\250\001\n\025Sav" +
      "edConcreteFunction\022\024\n\014bound_inputs\030\002 \003(\005" +
      "\022B\n\035canonicalized_input_signature\030\003 \001(\0132" +
      "\033.tensorflow.StructuredValue\0225\n\020output_s" +
      "ignature\030\004 \001(\0132\033.tensorflow.StructuredVa" +
      "lue\"\255\001\n\031SavedBareConcreteFunction\022\036\n\026con" +
      "crete_function_name\030\001 \001(\t\022\031\n\021argument_ke" +
      "ywords\030\002 \003(\t\022$\n\034allowed_positional_argum" +
      "ents\030\003 \001(\003\022/\n\rfunction_spec\030\004 \001(\0132\030.tens" +
      "orflow.FunctionSpec\"\"\n\rSavedConstant\022\021\n\t" +
      "operation\030\001 \001(\t\"\327\002\n\rSavedVariable\022#\n\005dty" +
      "pe\030\001 \001(\0162\024.tensorflow.DataType\022+\n\005shape\030" +
      "\002 \001(\0132\034.tensorflow.TensorShapeProto\022\021\n\tt" +
      "rainable\030\003 \001(\010\022<\n\017synchronization\030\004 \001(\0162" +
      "#.tensorflow.VariableSynchronization\0224\n\013" +
      "aggregation\030\005 \001(\0162\037.tensorflow.VariableA" +
      "ggregation\022\014\n\004name\030\006 \001(\t\022\016\n\006device\030\007 \001(\t" +
      "\022O\n,experimental_distributed_variable_co" +
      "mponents\030\010 \003(\0132\031.tensorflow.SavedVariabl" +
      "e\"\373\001\n\014FunctionSpec\0220\n\013fullargspec\030\001 \001(\0132" +
      "\033.tensorflow.StructuredValue\022\021\n\tis_metho" +
      "d\030\002 \001(\010\0224\n\017input_signature\030\005 \001(\0132\033.tenso" +
      "rflow.StructuredValue\0228\n\013jit_compile\030\006 \001" +
      "(\0162#.tensorflow.FunctionSpec.JitCompile\"" +
      "*\n\nJitCompile\022\013\n\007DEFAULT\020\000\022\006\n\002ON\020\001\022\007\n\003OF" +
      "F\020\002J\004\010\003\020\004J\004\010\004\020\005\"\037\n\rSavedResource\022\016\n\006devi" +
      "ce\030\001 \001(\t\"A\n\016SaveableObject\022\025\n\rsave_funct" +
      "ion\030\002 \001(\005\022\030\n\020restore_function\030\003 \001(\005B\224\001\n\036" +
      "org.tensorflow.proto.frameworkB\026SavedObj" +
      "ectGraphProtosP\001ZUgithub.com/tensorflow/" +
      "tensorflow/tensorflow/go/core/protobuf/f" +
      "or_core_protos_go_proto\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          org.tensorflow.proto.framework.TensorShapeProtos.getDescriptor(),
          org.tensorflow.proto.framework.TypesProtos.getDescriptor(),
          org.tensorflow.proto.framework.VariableProtos.getDescriptor(),
          org.tensorflow.proto.framework.VersionsProtos.getDescriptor(),
          org.tensorflow.proto.framework.StructProtos.getDescriptor(),
          org.tensorflow.proto.framework.TrackableObjectGraphProtos.getDescriptor(),
        });
    internal_static_tensorflow_SavedObjectGraph_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_SavedObjectGraph_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SavedObjectGraph_descriptor,
        new java.lang.String[] { "Nodes", "ConcreteFunctions", });
    internal_static_tensorflow_SavedObjectGraph_ConcreteFunctionsEntry_descriptor =
      internal_static_tensorflow_SavedObjectGraph_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_SavedObjectGraph_ConcreteFunctionsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SavedObjectGraph_ConcreteFunctionsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_SavedObject_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_SavedObject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SavedObject_descriptor,
        new java.lang.String[] { "Children", "SlotVariables", "UserObject", "Asset", "Function", "Variable", "BareConcreteFunction", "Constant", "Resource", "CapturedTensor", "SaveableObjects", "RegisteredName", "SerializedUserProto", "Kind", });
    internal_static_tensorflow_SavedObject_SaveableObjectsEntry_descriptor =
      internal_static_tensorflow_SavedObject_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_SavedObject_SaveableObjectsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SavedObject_SaveableObjectsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_SavedUserObject_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_SavedUserObject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SavedUserObject_descriptor,
        new java.lang.String[] { "Identifier", "Version", "Metadata", });
    internal_static_tensorflow_SavedAsset_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tensorflow_SavedAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SavedAsset_descriptor,
        new java.lang.String[] { "AssetFileDefIndex", });
    internal_static_tensorflow_SavedFunction_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_tensorflow_SavedFunction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SavedFunction_descriptor,
        new java.lang.String[] { "ConcreteFunctions", "FunctionSpec", });
    internal_static_tensorflow_CapturedTensor_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_tensorflow_CapturedTensor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_CapturedTensor_descriptor,
        new java.lang.String[] { "Name", "ConcreteFunction", });
    internal_static_tensorflow_SavedConcreteFunction_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_tensorflow_SavedConcreteFunction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SavedConcreteFunction_descriptor,
        new java.lang.String[] { "BoundInputs", "CanonicalizedInputSignature", "OutputSignature", });
    internal_static_tensorflow_SavedBareConcreteFunction_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_tensorflow_SavedBareConcreteFunction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SavedBareConcreteFunction_descriptor,
        new java.lang.String[] { "ConcreteFunctionName", "ArgumentKeywords", "AllowedPositionalArguments", "FunctionSpec", });
    internal_static_tensorflow_SavedConstant_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_tensorflow_SavedConstant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SavedConstant_descriptor,
        new java.lang.String[] { "Operation", });
    internal_static_tensorflow_SavedVariable_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_tensorflow_SavedVariable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SavedVariable_descriptor,
        new java.lang.String[] { "Dtype", "Shape", "Trainable", "Synchronization", "Aggregation", "Name", "Device", "ExperimentalDistributedVariableComponents", });
    internal_static_tensorflow_FunctionSpec_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_tensorflow_FunctionSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_FunctionSpec_descriptor,
        new java.lang.String[] { "Fullargspec", "IsMethod", "InputSignature", "JitCompile", });
    internal_static_tensorflow_SavedResource_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_tensorflow_SavedResource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SavedResource_descriptor,
        new java.lang.String[] { "Device", });
    internal_static_tensorflow_SaveableObject_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_tensorflow_SaveableObject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SaveableObject_descriptor,
        new java.lang.String[] { "SaveFunction", "RestoreFunction", });
    com.google.protobuf.AnyProto.getDescriptor();
    org.tensorflow.proto.framework.TensorShapeProtos.getDescriptor();
    org.tensorflow.proto.framework.TypesProtos.getDescriptor();
    org.tensorflow.proto.framework.VariableProtos.getDescriptor();
    org.tensorflow.proto.framework.VersionsProtos.getDescriptor();
    org.tensorflow.proto.framework.StructProtos.getDescriptor();
    org.tensorflow.proto.framework.TrackableObjectGraphProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
