// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LargeObject.proto

package com.recepinanc.samplegrpcserver.sample;

/**
 * Protobuf enum {@code Field5}
 */
public enum Field5
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>FIELD_5_0 = 0;</code>
   */
  FIELD_5_0(0),
  /**
   * <code>FIELD_5_1 = 1;</code>
   */
  FIELD_5_1(1),
  /**
   * <code>FIELD_5_2 = 2;</code>
   */
  FIELD_5_2(2),
  /**
   * <code>FIELD_5_3 = 3;</code>
   */
  FIELD_5_3(3),
  /**
   * <code>FIELD_5_4 = 4;</code>
   */
  FIELD_5_4(4),
  /**
   * <code>FIELD_5_5 = 5;</code>
   */
  FIELD_5_5(5),
  /**
   * <code>FIELD_5_6 = 6;</code>
   */
  FIELD_5_6(6),
  /**
   * <code>FIELD_5_7 = 7;</code>
   */
  FIELD_5_7(7),
  /**
   * <code>FIELD_5_8 = 8;</code>
   */
  FIELD_5_8(8),
  /**
   * <code>FIELD_5_9 = 9;</code>
   */
  FIELD_5_9(9),
  /**
   * <code>FIELD_5_10 = 10;</code>
   */
  FIELD_5_10(10),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>FIELD_5_0 = 0;</code>
   */
  public static final int FIELD_5_0_VALUE = 0;
  /**
   * <code>FIELD_5_1 = 1;</code>
   */
  public static final int FIELD_5_1_VALUE = 1;
  /**
   * <code>FIELD_5_2 = 2;</code>
   */
  public static final int FIELD_5_2_VALUE = 2;
  /**
   * <code>FIELD_5_3 = 3;</code>
   */
  public static final int FIELD_5_3_VALUE = 3;
  /**
   * <code>FIELD_5_4 = 4;</code>
   */
  public static final int FIELD_5_4_VALUE = 4;
  /**
   * <code>FIELD_5_5 = 5;</code>
   */
  public static final int FIELD_5_5_VALUE = 5;
  /**
   * <code>FIELD_5_6 = 6;</code>
   */
  public static final int FIELD_5_6_VALUE = 6;
  /**
   * <code>FIELD_5_7 = 7;</code>
   */
  public static final int FIELD_5_7_VALUE = 7;
  /**
   * <code>FIELD_5_8 = 8;</code>
   */
  public static final int FIELD_5_8_VALUE = 8;
  /**
   * <code>FIELD_5_9 = 9;</code>
   */
  public static final int FIELD_5_9_VALUE = 9;
  /**
   * <code>FIELD_5_10 = 10;</code>
   */
  public static final int FIELD_5_10_VALUE = 10;


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
  public static Field5 valueOf(int value) {
    return forNumber(value);
  }

  public static Field5 forNumber(int value) {
    switch (value) {
      case 0: return FIELD_5_0;
      case 1: return FIELD_5_1;
      case 2: return FIELD_5_2;
      case 3: return FIELD_5_3;
      case 4: return FIELD_5_4;
      case 5: return FIELD_5_5;
      case 6: return FIELD_5_6;
      case 7: return FIELD_5_7;
      case 8: return FIELD_5_8;
      case 9: return FIELD_5_9;
      case 10: return FIELD_5_10;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Field5>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Field5> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Field5>() {
          public Field5 findValueByNumber(int number) {
            return Field5.forNumber(number);
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
        .getEnumTypes().get(0);
  }

  private static final Field5[] VALUES = values();

  public static Field5 valueOf(
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

  private Field5(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Field5)
}
