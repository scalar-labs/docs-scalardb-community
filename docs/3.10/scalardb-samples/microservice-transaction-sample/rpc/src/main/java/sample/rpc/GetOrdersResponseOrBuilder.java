// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sample.proto

package sample.rpc;

public interface GetOrdersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpc.GetOrdersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .rpc.Order order = 1;</code>
   */
  java.util.List<sample.rpc.Order> 
      getOrderList();
  /**
   * <code>repeated .rpc.Order order = 1;</code>
   */
  sample.rpc.Order getOrder(int index);
  /**
   * <code>repeated .rpc.Order order = 1;</code>
   */
  int getOrderCount();
  /**
   * <code>repeated .rpc.Order order = 1;</code>
   */
  java.util.List<? extends sample.rpc.OrderOrBuilder> 
      getOrderOrBuilderList();
  /**
   * <code>repeated .rpc.Order order = 1;</code>
   */
  sample.rpc.OrderOrBuilder getOrderOrBuilder(
      int index);
}