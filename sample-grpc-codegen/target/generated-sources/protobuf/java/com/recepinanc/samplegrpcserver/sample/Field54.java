// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LargeObject.proto

package com.recepinanc.samplegrpcserver.sample;

/**
 * Protobuf enum {@code Field54}
 */
public enum Field54
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>FIELD_54_0 = 0;</code>
   */
  FIELD_54_0(0),
  /**
   * <code>FIELD_54_1 = 1;</code>
   */
  FIELD_54_1(1),
  /**
   * <code>FIELD_54_2 = 2;</code>
   */
  FIELD_54_2(2),
  /**
   * <code>FIELD_54_3 = 3;</code>
   */
  FIELD_54_3(3),
  /**
   * <code>FIELD_54_4 = 4;</code>
   */
  FIELD_54_4(4),
  /**
   * <code>FIELD_54_5 = 5;</code>
   */
  FIELD_54_5(5),
  /**
   * <code>FIELD_54_6 = 6;</code>
   */
  FIELD_54_6(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>FIELD_54_0 = 0;</code>
   */
  public static final int FIELD_54_0_VALUE = 0;
  /**
   * <code>FIELD_54_1 = 1;</code>
   */
  public static final int FIELD_54_1_VALUE = 1;
  /**
   * <code>FIELD_54_2 = 2;</code>
   */
  public static final int FIELD_54_2_VALUE = 2;
  /**
   * <code>FIELD_54_3 = 3;</code>
   */
  public static final int FIELD_54_3_VALUE = 3;
  /**
   * <code>FIELD_54_4 = 4;</code>
   */
  public static final int FIELD_54_4_VALUE = 4;
  /**
   * <code>FIELD_54_5 = 5;</code>
   */
  public static final int FIELD_54_5_VALUE = 5;
  /**
   * <code>FIELD_54_6 = 6;</code>
   */
  public static final int FIELD_54_6_VALUE = 6;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Field54 valueOf(int value) {
    return forNumber(value);
  }

  public static Field54 forNumber(int value) {
    switch (value) {
      case 0: return FIELD_54_0;
      case 1: return FIELD_54_1;
      case 2: return FIELD_54_2;
      case 3: return FIELD_54_3;
      case 4: return FIELD_54_4;
      case 5: return FIELD_54_5;
      case 6: return FIELD_54_6;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Field54>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Field54> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Field54>() {
          public Field54 findValueByNumber(int number) {
            return Field54.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.recepinanc.samplegrpcserver.sample.LargeObjectProto.getDescriptor()
        .getEnumTypes().get(4);
  }

  private static final Field54[] VALUES = values();

  public static Field54 valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Field54(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Field54)
}
