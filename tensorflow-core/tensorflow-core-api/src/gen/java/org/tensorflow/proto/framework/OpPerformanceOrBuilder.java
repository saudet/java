// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/grappler/costs/op_performance_data.proto

package org.tensorflow.proto.framework;

public interface OpPerformanceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.OpPerformance)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The op
   * </pre>
   *
   * <code>.tensorflow.OpInfo op = 1;</code>
   */
  boolean hasOp();
  /**
   * <pre>
   * The op
   * </pre>
   *
   * <code>.tensorflow.OpInfo op = 1;</code>
   */
  org.tensorflow.proto.framework.OpInfo getOp();
  /**
   * <pre>
   * The op
   * </pre>
   *
   * <code>.tensorflow.OpInfo op = 1;</code>
   */
  org.tensorflow.proto.framework.OpInfoOrBuilder getOpOrBuilder();

  /**
   * <pre>
   * Information about the session configs.
   * </pre>
   *
   * <code>.tensorflow.SessionInfo session_info = 12 [deprecated = true];</code>
   */
  @java.lang.Deprecated boolean hasSessionInfo();
  /**
   * <pre>
   * Information about the session configs.
   * </pre>
   *
   * <code>.tensorflow.SessionInfo session_info = 12 [deprecated = true];</code>
   */
  @java.lang.Deprecated org.tensorflow.proto.framework.SessionInfo getSessionInfo();
  /**
   * <pre>
   * Information about the session configs.
   * </pre>
   *
   * <code>.tensorflow.SessionInfo session_info = 12 [deprecated = true];</code>
   */
  @java.lang.Deprecated org.tensorflow.proto.framework.SessionInfoOrBuilder getSessionInfoOrBuilder();

  /**
   * <pre>
   * The node name (optional). Makes it easier to associate the performance data
   * with a specific graph node.
   * </pre>
   *
   * <code>string node = 5;</code>
   */
  java.lang.String getNode();
  /**
   * <pre>
   * The node name (optional). Makes it easier to associate the performance data
   * with a specific graph node.
   * </pre>
   *
   * <code>string node = 5;</code>
   */
  com.google.protobuf.ByteString
      getNodeBytes();

  /**
   * <pre>
   * Temporary memory used by this node (in bytes).
   * </pre>
   *
   * <code>int64 temporary_memory_size = 2;</code>
   */
  long getTemporaryMemorySize();

  /**
   * <pre>
   * Time it takes to run the op (in nanoseconds).
   * </pre>
   *
   * <code>int64 compute_cost = 3;</code>
   */
  long getComputeCost();

  /**
   * <pre>
   * Analytical compute cost (in nanoseconds).
   * </pre>
   *
   * <code>int64 compute_time = 6;</code>
   */
  long getComputeTime();

  /**
   * <pre>
   * Analytical memory access cost (in nanoseconds).
   * </pre>
   *
   * <code>int64 memory_time = 7;</code>
   */
  long getMemoryTime();

  /**
   * <pre>
   * Percentage of theoretical compute performance.
   * </pre>
   *
   * <code>double compute_efficiency = 4;</code>
   */
  double getComputeEfficiency();

  /**
   * <pre>
   * Percentage of theoretical memory performance.
   * </pre>
   *
   * <code>double memory_efficiency = 8;</code>
   */
  double getMemoryEfficiency();

  /**
   * <code>.tensorflow.NormalDistribution execution_time_normal = 10;</code>
   */
  boolean hasExecutionTimeNormal();
  /**
   * <code>.tensorflow.NormalDistribution execution_time_normal = 10;</code>
   */
  org.tensorflow.proto.framework.NormalDistribution getExecutionTimeNormal();
  /**
   * <code>.tensorflow.NormalDistribution execution_time_normal = 10;</code>
   */
  org.tensorflow.proto.framework.NormalDistributionOrBuilder getExecutionTimeNormalOrBuilder();

  /**
   * <code>.tensorflow.LogNormalDistribution execution_time_log_normal = 11;</code>
   */
  boolean hasExecutionTimeLogNormal();
  /**
   * <code>.tensorflow.LogNormalDistribution execution_time_log_normal = 11;</code>
   */
  org.tensorflow.proto.framework.LogNormalDistribution getExecutionTimeLogNormal();
  /**
   * <code>.tensorflow.LogNormalDistribution execution_time_log_normal = 11;</code>
   */
  org.tensorflow.proto.framework.LogNormalDistributionOrBuilder getExecutionTimeLogNormalOrBuilder();

  /**
   * <code>.tensorflow.OpPerformance.OpMemory op_memory = 9;</code>
   */
  boolean hasOpMemory();
  /**
   * <code>.tensorflow.OpPerformance.OpMemory op_memory = 9;</code>
   */
  org.tensorflow.proto.framework.OpPerformance.OpMemory getOpMemory();
  /**
   * <code>.tensorflow.OpPerformance.OpMemory op_memory = 9;</code>
   */
  org.tensorflow.proto.framework.OpPerformance.OpMemoryOrBuilder getOpMemoryOrBuilder();

  public org.tensorflow.proto.framework.OpPerformance.ExecutionTimeCase getExecutionTimeCase();
}
