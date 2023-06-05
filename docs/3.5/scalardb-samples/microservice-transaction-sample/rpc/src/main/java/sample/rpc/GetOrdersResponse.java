// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sample.proto

package sample.rpc;

/**
 * Protobuf type {@code rpc.GetOrdersResponse}
 */
public final class GetOrdersResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rpc.GetOrdersResponse)
    GetOrdersResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetOrdersResponse.newBuilder() to construct.
  private GetOrdersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetOrdersResponse() {
    order_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetOrdersResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return sample.rpc.Sample.internal_static_rpc_GetOrdersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sample.rpc.Sample.internal_static_rpc_GetOrdersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sample.rpc.GetOrdersResponse.class, sample.rpc.GetOrdersResponse.Builder.class);
  }

  public static final int ORDER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<sample.rpc.Order> order_;
  /**
   * <code>repeated .rpc.Order order = 1;</code>
   */
  @java.lang.Override
  public java.util.List<sample.rpc.Order> getOrderList() {
    return order_;
  }
  /**
   * <code>repeated .rpc.Order order = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends sample.rpc.OrderOrBuilder> 
      getOrderOrBuilderList() {
    return order_;
  }
  /**
   * <code>repeated .rpc.Order order = 1;</code>
   */
  @java.lang.Override
  public int getOrderCount() {
    return order_.size();
  }
  /**
   * <code>repeated .rpc.Order order = 1;</code>
   */
  @java.lang.Override
  public sample.rpc.Order getOrder(int index) {
    return order_.get(index);
  }
  /**
   * <code>repeated .rpc.Order order = 1;</code>
   */
  @java.lang.Override
  public sample.rpc.OrderOrBuilder getOrderOrBuilder(
      int index) {
    return order_.get(index);
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
    for (int i = 0; i < order_.size(); i++) {
      output.writeMessage(1, order_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < order_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, order_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof sample.rpc.GetOrdersResponse)) {
      return super.equals(obj);
    }
    sample.rpc.GetOrdersResponse other = (sample.rpc.GetOrdersResponse) obj;

    if (!getOrderList()
        .equals(other.getOrderList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getOrderCount() > 0) {
      hash = (37 * hash) + ORDER_FIELD_NUMBER;
      hash = (53 * hash) + getOrderList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sample.rpc.GetOrdersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sample.rpc.GetOrdersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sample.rpc.GetOrdersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sample.rpc.GetOrdersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sample.rpc.GetOrdersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sample.rpc.GetOrdersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sample.rpc.GetOrdersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sample.rpc.GetOrdersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static sample.rpc.GetOrdersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static sample.rpc.GetOrdersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sample.rpc.GetOrdersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sample.rpc.GetOrdersResponse parseFrom(
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
  public static Builder newBuilder(sample.rpc.GetOrdersResponse prototype) {
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
   * Protobuf type {@code rpc.GetOrdersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rpc.GetOrdersResponse)
      sample.rpc.GetOrdersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sample.rpc.Sample.internal_static_rpc_GetOrdersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sample.rpc.Sample.internal_static_rpc_GetOrdersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sample.rpc.GetOrdersResponse.class, sample.rpc.GetOrdersResponse.Builder.class);
    }

    // Construct using sample.rpc.GetOrdersResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (orderBuilder_ == null) {
        order_ = java.util.Collections.emptyList();
      } else {
        order_ = null;
        orderBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sample.rpc.Sample.internal_static_rpc_GetOrdersResponse_descriptor;
    }

    @java.lang.Override
    public sample.rpc.GetOrdersResponse getDefaultInstanceForType() {
      return sample.rpc.GetOrdersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public sample.rpc.GetOrdersResponse build() {
      sample.rpc.GetOrdersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public sample.rpc.GetOrdersResponse buildPartial() {
      sample.rpc.GetOrdersResponse result = new sample.rpc.GetOrdersResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(sample.rpc.GetOrdersResponse result) {
      if (orderBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          order_ = java.util.Collections.unmodifiableList(order_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.order_ = order_;
      } else {
        result.order_ = orderBuilder_.build();
      }
    }

    private void buildPartial0(sample.rpc.GetOrdersResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof sample.rpc.GetOrdersResponse) {
        return mergeFrom((sample.rpc.GetOrdersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sample.rpc.GetOrdersResponse other) {
      if (other == sample.rpc.GetOrdersResponse.getDefaultInstance()) return this;
      if (orderBuilder_ == null) {
        if (!other.order_.isEmpty()) {
          if (order_.isEmpty()) {
            order_ = other.order_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOrderIsMutable();
            order_.addAll(other.order_);
          }
          onChanged();
        }
      } else {
        if (!other.order_.isEmpty()) {
          if (orderBuilder_.isEmpty()) {
            orderBuilder_.dispose();
            orderBuilder_ = null;
            order_ = other.order_;
            bitField0_ = (bitField0_ & ~0x00000001);
            orderBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOrderFieldBuilder() : null;
          } else {
            orderBuilder_.addAllMessages(other.order_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              sample.rpc.Order m =
                  input.readMessage(
                      sample.rpc.Order.parser(),
                      extensionRegistry);
              if (orderBuilder_ == null) {
                ensureOrderIsMutable();
                order_.add(m);
              } else {
                orderBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<sample.rpc.Order> order_ =
      java.util.Collections.emptyList();
    private void ensureOrderIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        order_ = new java.util.ArrayList<sample.rpc.Order>(order_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        sample.rpc.Order, sample.rpc.Order.Builder, sample.rpc.OrderOrBuilder> orderBuilder_;

    /**
     * <code>repeated .rpc.Order order = 1;</code>
     */
    public java.util.List<sample.rpc.Order> getOrderList() {
      if (orderBuilder_ == null) {
        return java.util.Collections.unmodifiableList(order_);
      } else {
        return orderBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .rpc.Order order = 1;</code>
     */
    public int getOrderCount() {
      if (orderBuilder_ == null) {
        return order_.size();
      } else {
        return orderBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .rpc.Order order = 1;</code>
     */
    public sample.rpc.Order getOrder(int index) {
      if (orderBuilder_ == null) {
        return order_.get(index);
      } else {
        return orderBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .rpc.Order order = 1;</code>
     */
    public Builder setOrder(
        int index, sample.rpc.Order value) {
      if (orderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrderIsMutable();
        order_.set(index, value);
        onChanged();
      } else {
        orderBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .rpc.Order order = 1;</code>
     */
    public Builder setOrder(
        int index, sample.rpc.Order.Builder builderForValue) {
      if (orderBuilder_ == null) {
        ensureOrderIsMutable();
        order_.set(index, builderForValue.build());
        onChanged();
      } else {
        orderBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rpc.Order order = 1;</code>
     */
    public Builder addOrder(sample.rpc.Order value) {
      if (orderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrderIsMutable();
        order_.add(value);
        onChanged();
      } else {
        orderBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .rpc.Order order = 1;</code>
     */
    public Builder addOrder(
        int index, sample.rpc.Order value) {
      if (orderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrderIsMutable();
        order_.add(index, value);
        onChanged();
      } else {
        orderBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .rpc.Order order = 1;</code>
     */
    public Builder addOrder(
        sample.rpc.Order.Builder builderForValue) {
      if (orderBuilder_ == null) {
        ensureOrderIsMutable();
        order_.add(builderForValue.build());
        onChanged();
      } else {
        orderBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rpc.Order order = 1;</code>
     */
    public Builder addOrder(
        int index, sample.rpc.Order.Builder builderForValue) {
      if (orderBuilder_ == null) {
        ensureOrderIsMutable();
        order_.add(index, builderForValue.build());
        onChanged();
      } else {
        orderBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rpc.Order order = 1;</code>
     */
    public Builder addAllOrder(
        java.lang.Iterable<? extends sample.rpc.Order> values) {
      if (orderBuilder_ == null) {
        ensureOrderIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, order_);
        onChanged();
      } else {
        orderBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .rpc.Order order = 1;</code>
     */
    public Builder clearOrder() {
      if (orderBuilder_ == null) {
        order_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        orderBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .rpc.Order order = 1;</code>
     */
    public Builder removeOrder(int index) {
      if (orderBuilder_ == null) {
        ensureOrderIsMutable();
        order_.remove(index);
        onChanged();
      } else {
        orderBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .rpc.Order order = 1;</code>
     */
    public sample.rpc.Order.Builder getOrderBuilder(
        int index) {
      return getOrderFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .rpc.Order order = 1;</code>
     */
    public sample.rpc.OrderOrBuilder getOrderOrBuilder(
        int index) {
      if (orderBuilder_ == null) {
        return order_.get(index);  } else {
        return orderBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .rpc.Order order = 1;</code>
     */
    public java.util.List<? extends sample.rpc.OrderOrBuilder> 
         getOrderOrBuilderList() {
      if (orderBuilder_ != null) {
        return orderBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(order_);
      }
    }
    /**
     * <code>repeated .rpc.Order order = 1;</code>
     */
    public sample.rpc.Order.Builder addOrderBuilder() {
      return getOrderFieldBuilder().addBuilder(
          sample.rpc.Order.getDefaultInstance());
    }
    /**
     * <code>repeated .rpc.Order order = 1;</code>
     */
    public sample.rpc.Order.Builder addOrderBuilder(
        int index) {
      return getOrderFieldBuilder().addBuilder(
          index, sample.rpc.Order.getDefaultInstance());
    }
    /**
     * <code>repeated .rpc.Order order = 1;</code>
     */
    public java.util.List<sample.rpc.Order.Builder> 
         getOrderBuilderList() {
      return getOrderFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        sample.rpc.Order, sample.rpc.Order.Builder, sample.rpc.OrderOrBuilder> 
        getOrderFieldBuilder() {
      if (orderBuilder_ == null) {
        orderBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            sample.rpc.Order, sample.rpc.Order.Builder, sample.rpc.OrderOrBuilder>(
                order_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        order_ = null;
      }
      return orderBuilder_;
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


    // @@protoc_insertion_point(builder_scope:rpc.GetOrdersResponse)
  }

  // @@protoc_insertion_point(class_scope:rpc.GetOrdersResponse)
  private static final sample.rpc.GetOrdersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sample.rpc.GetOrdersResponse();
  }

  public static sample.rpc.GetOrdersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetOrdersResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetOrdersResponse>() {
    @java.lang.Override
    public GetOrdersResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<GetOrdersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetOrdersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public sample.rpc.GetOrdersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

