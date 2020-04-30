/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.zzsong.netty.thrift.one;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-04-27")
public class Work implements org.apache.thrift.TBase<Work, Work._Fields>, java.io.Serializable, Cloneable, Comparable<Work> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Work");

  private static final org.apache.thrift.protocol.TField PAGE_NO_FIELD_DESC = new org.apache.thrift.protocol.TField("pageNo", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TOTAL_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("totalCount", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField FLAG_FIELD_DESC = new org.apache.thrift.protocol.TField("flag", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField OP_FIELD_DESC = new org.apache.thrift.protocol.TField("op", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField CONTENT_FIELD_DESC = new org.apache.thrift.protocol.TField("content", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new WorkStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new WorkTupleSchemeFactory();

  public int pageNo; // required
  public long totalCount; // required
  public boolean flag; // required
  /**
   * 
   * @see Operation
   */
  public @org.apache.thrift.annotation.Nullable Operation op; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String content; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PAGE_NO((short)1, "pageNo"),
    TOTAL_COUNT((short)2, "totalCount"),
    FLAG((short)3, "flag"),
    /**
     * 
     * @see Operation
     */
    OP((short)4, "op"),
    CONTENT((short)5, "content");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PAGE_NO
          return PAGE_NO;
        case 2: // TOTAL_COUNT
          return TOTAL_COUNT;
        case 3: // FLAG
          return FLAG;
        case 4: // OP
          return OP;
        case 5: // CONTENT
          return CONTENT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __PAGENO_ISSET_ID = 0;
  private static final int __TOTALCOUNT_ISSET_ID = 1;
  private static final int __FLAG_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PAGE_NO, new org.apache.thrift.meta_data.FieldMetaData("pageNo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    tmpMap.put(_Fields.TOTAL_COUNT, new org.apache.thrift.meta_data.FieldMetaData("totalCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "long")));
    tmpMap.put(_Fields.FLAG, new org.apache.thrift.meta_data.FieldMetaData("flag", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL        , "boolean")));
    tmpMap.put(_Fields.OP, new org.apache.thrift.meta_data.FieldMetaData("op", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, Operation.class)));
    tmpMap.put(_Fields.CONTENT, new org.apache.thrift.meta_data.FieldMetaData("content", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "String")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Work.class, metaDataMap);
  }

  public Work() {
  }

  public Work(
    int pageNo,
    long totalCount,
    boolean flag,
    Operation op,
    java.lang.String content)
  {
    this();
    this.pageNo = pageNo;
    setPageNoIsSet(true);
    this.totalCount = totalCount;
    setTotalCountIsSet(true);
    this.flag = flag;
    setFlagIsSet(true);
    this.op = op;
    this.content = content;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Work(Work other) {
    __isset_bitfield = other.__isset_bitfield;
    this.pageNo = other.pageNo;
    this.totalCount = other.totalCount;
    this.flag = other.flag;
    if (other.isSetOp()) {
      this.op = other.op;
    }
    if (other.isSetContent()) {
      this.content = other.content;
    }
  }

  public Work deepCopy() {
    return new Work(this);
  }

  @Override
  public void clear() {
    setPageNoIsSet(false);
    this.pageNo = 0;
    setTotalCountIsSet(false);
    this.totalCount = 0;
    setFlagIsSet(false);
    this.flag = false;
    this.op = null;
    this.content = null;
  }

  public int getPageNo() {
    return this.pageNo;
  }

  public Work setPageNo(int pageNo) {
    this.pageNo = pageNo;
    setPageNoIsSet(true);
    return this;
  }

  public void unsetPageNo() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PAGENO_ISSET_ID);
  }

  /** Returns true if field pageNo is set (has been assigned a value) and false otherwise */
  public boolean isSetPageNo() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PAGENO_ISSET_ID);
  }

  public void setPageNoIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PAGENO_ISSET_ID, value);
  }

  public long getTotalCount() {
    return this.totalCount;
  }

  public Work setTotalCount(long totalCount) {
    this.totalCount = totalCount;
    setTotalCountIsSet(true);
    return this;
  }

  public void unsetTotalCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TOTALCOUNT_ISSET_ID);
  }

  /** Returns true if field totalCount is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TOTALCOUNT_ISSET_ID);
  }

  public void setTotalCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TOTALCOUNT_ISSET_ID, value);
  }

  public boolean isFlag() {
    return this.flag;
  }

  public Work setFlag(boolean flag) {
    this.flag = flag;
    setFlagIsSet(true);
    return this;
  }

  public void unsetFlag() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __FLAG_ISSET_ID);
  }

  /** Returns true if field flag is set (has been assigned a value) and false otherwise */
  public boolean isSetFlag() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __FLAG_ISSET_ID);
  }

  public void setFlagIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __FLAG_ISSET_ID, value);
  }

  /**
   * 
   * @see Operation
   */
  @org.apache.thrift.annotation.Nullable
  public Operation getOp() {
    return this.op;
  }

  /**
   * 
   * @see Operation
   */
  public Work setOp(@org.apache.thrift.annotation.Nullable Operation op) {
    this.op = op;
    return this;
  }

  public void unsetOp() {
    this.op = null;
  }

  /** Returns true if field op is set (has been assigned a value) and false otherwise */
  public boolean isSetOp() {
    return this.op != null;
  }

  public void setOpIsSet(boolean value) {
    if (!value) {
      this.op = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getContent() {
    return this.content;
  }

  public Work setContent(@org.apache.thrift.annotation.Nullable java.lang.String content) {
    this.content = content;
    return this;
  }

  public void unsetContent() {
    this.content = null;
  }

  /** Returns true if field content is set (has been assigned a value) and false otherwise */
  public boolean isSetContent() {
    return this.content != null;
  }

  public void setContentIsSet(boolean value) {
    if (!value) {
      this.content = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PAGE_NO:
      if (value == null) {
        unsetPageNo();
      } else {
        setPageNo((java.lang.Integer)value);
      }
      break;

    case TOTAL_COUNT:
      if (value == null) {
        unsetTotalCount();
      } else {
        setTotalCount((java.lang.Long)value);
      }
      break;

    case FLAG:
      if (value == null) {
        unsetFlag();
      } else {
        setFlag((java.lang.Boolean)value);
      }
      break;

    case OP:
      if (value == null) {
        unsetOp();
      } else {
        setOp((Operation)value);
      }
      break;

    case CONTENT:
      if (value == null) {
        unsetContent();
      } else {
        setContent((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PAGE_NO:
      return getPageNo();

    case TOTAL_COUNT:
      return getTotalCount();

    case FLAG:
      return isFlag();

    case OP:
      return getOp();

    case CONTENT:
      return getContent();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PAGE_NO:
      return isSetPageNo();
    case TOTAL_COUNT:
      return isSetTotalCount();
    case FLAG:
      return isSetFlag();
    case OP:
      return isSetOp();
    case CONTENT:
      return isSetContent();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Work)
      return this.equals((Work)that);
    return false;
  }

  public boolean equals(Work that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_pageNo = true;
    boolean that_present_pageNo = true;
    if (this_present_pageNo || that_present_pageNo) {
      if (!(this_present_pageNo && that_present_pageNo))
        return false;
      if (this.pageNo != that.pageNo)
        return false;
    }

    boolean this_present_totalCount = true;
    boolean that_present_totalCount = true;
    if (this_present_totalCount || that_present_totalCount) {
      if (!(this_present_totalCount && that_present_totalCount))
        return false;
      if (this.totalCount != that.totalCount)
        return false;
    }

    boolean this_present_flag = true;
    boolean that_present_flag = true;
    if (this_present_flag || that_present_flag) {
      if (!(this_present_flag && that_present_flag))
        return false;
      if (this.flag != that.flag)
        return false;
    }

    boolean this_present_op = true && this.isSetOp();
    boolean that_present_op = true && that.isSetOp();
    if (this_present_op || that_present_op) {
      if (!(this_present_op && that_present_op))
        return false;
      if (!this.op.equals(that.op))
        return false;
    }

    boolean this_present_content = true && this.isSetContent();
    boolean that_present_content = true && that.isSetContent();
    if (this_present_content || that_present_content) {
      if (!(this_present_content && that_present_content))
        return false;
      if (!this.content.equals(that.content))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + pageNo;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(totalCount);

    hashCode = hashCode * 8191 + ((flag) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetOp()) ? 131071 : 524287);
    if (isSetOp())
      hashCode = hashCode * 8191 + op.getValue();

    hashCode = hashCode * 8191 + ((isSetContent()) ? 131071 : 524287);
    if (isSetContent())
      hashCode = hashCode * 8191 + content.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Work other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetPageNo()).compareTo(other.isSetPageNo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPageNo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pageNo, other.pageNo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTotalCount()).compareTo(other.isSetTotalCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.totalCount, other.totalCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetFlag()).compareTo(other.isSetFlag());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFlag()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.flag, other.flag);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetOp()).compareTo(other.isSetOp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.op, other.op);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetContent()).compareTo(other.isSetContent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.content, other.content);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Work(");
    boolean first = true;

    sb.append("pageNo:");
    sb.append(this.pageNo);
    first = false;
    if (!first) sb.append(", ");
    sb.append("totalCount:");
    sb.append(this.totalCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("flag:");
    sb.append(this.flag);
    first = false;
    if (!first) sb.append(", ");
    sb.append("op:");
    if (this.op == null) {
      sb.append("null");
    } else {
      sb.append(this.op);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("content:");
    if (this.content == null) {
      sb.append("null");
    } else {
      sb.append(this.content);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class WorkStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public WorkStandardScheme getScheme() {
      return new WorkStandardScheme();
    }
  }

  private static class WorkStandardScheme extends org.apache.thrift.scheme.StandardScheme<Work> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Work struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PAGE_NO
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.pageNo = iprot.readI32();
              struct.setPageNoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOTAL_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.totalCount = iprot.readI64();
              struct.setTotalCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FLAG
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.flag = iprot.readBool();
              struct.setFlagIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // OP
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.op = com.zzsong.netty.thrift.one.Operation.findByValue(iprot.readI32());
              struct.setOpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CONTENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.content = iprot.readString();
              struct.setContentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Work struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PAGE_NO_FIELD_DESC);
      oprot.writeI32(struct.pageNo);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TOTAL_COUNT_FIELD_DESC);
      oprot.writeI64(struct.totalCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FLAG_FIELD_DESC);
      oprot.writeBool(struct.flag);
      oprot.writeFieldEnd();
      if (struct.op != null) {
        oprot.writeFieldBegin(OP_FIELD_DESC);
        oprot.writeI32(struct.op.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.content != null) {
        oprot.writeFieldBegin(CONTENT_FIELD_DESC);
        oprot.writeString(struct.content);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class WorkTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public WorkTupleScheme getScheme() {
      return new WorkTupleScheme();
    }
  }

  private static class WorkTupleScheme extends org.apache.thrift.scheme.TupleScheme<Work> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Work struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPageNo()) {
        optionals.set(0);
      }
      if (struct.isSetTotalCount()) {
        optionals.set(1);
      }
      if (struct.isSetFlag()) {
        optionals.set(2);
      }
      if (struct.isSetOp()) {
        optionals.set(3);
      }
      if (struct.isSetContent()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetPageNo()) {
        oprot.writeI32(struct.pageNo);
      }
      if (struct.isSetTotalCount()) {
        oprot.writeI64(struct.totalCount);
      }
      if (struct.isSetFlag()) {
        oprot.writeBool(struct.flag);
      }
      if (struct.isSetOp()) {
        oprot.writeI32(struct.op.getValue());
      }
      if (struct.isSetContent()) {
        oprot.writeString(struct.content);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Work struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.pageNo = iprot.readI32();
        struct.setPageNoIsSet(true);
      }
      if (incoming.get(1)) {
        struct.totalCount = iprot.readI64();
        struct.setTotalCountIsSet(true);
      }
      if (incoming.get(2)) {
        struct.flag = iprot.readBool();
        struct.setFlagIsSet(true);
      }
      if (incoming.get(3)) {
        struct.op = com.zzsong.netty.thrift.one.Operation.findByValue(iprot.readI32());
        struct.setOpIsSet(true);
      }
      if (incoming.get(4)) {
        struct.content = iprot.readString();
        struct.setContentIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
