/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-12-4")
public class Workflow implements org.apache.thrift.TBase<Workflow, Workflow._Fields>, java.io.Serializable, Cloneable, Comparable<Workflow> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Workflow");

  private static final org.apache.thrift.protocol.TField TEMPLATE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("templateId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField GRAPH_FIELD_DESC = new org.apache.thrift.protocol.TField("graph", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField IMAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("image", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField WORKFLOW_INPUTS_FIELD_DESC = new org.apache.thrift.protocol.TField("workflowInputs", org.apache.thrift.protocol.TType.LIST, (short)5);
  private static final org.apache.thrift.protocol.TField WORKFLOW_OUTPUTS_FIELD_DESC = new org.apache.thrift.protocol.TField("workflowOutputs", org.apache.thrift.protocol.TType.LIST, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new WorkflowStandardSchemeFactory());
    schemes.put(TupleScheme.class, new WorkflowTupleSchemeFactory());
  }

  private String templateId; // required
  private String name; // required
  private String graph; // optional
  private ByteBuffer image; // optional
  private List<org.apache.airavata.model.application.io.InputDataObjectType> workflowInputs; // optional
  private List<org.apache.airavata.model.application.io.OutputDataObjectType> workflowOutputs; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TEMPLATE_ID((short)1, "templateId"),
    NAME((short)2, "name"),
    GRAPH((short)3, "graph"),
    IMAGE((short)4, "image"),
    WORKFLOW_INPUTS((short)5, "workflowInputs"),
    WORKFLOW_OUTPUTS((short)6, "workflowOutputs");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TEMPLATE_ID
          return TEMPLATE_ID;
        case 2: // NAME
          return NAME;
        case 3: // GRAPH
          return GRAPH;
        case 4: // IMAGE
          return IMAGE;
        case 5: // WORKFLOW_INPUTS
          return WORKFLOW_INPUTS;
        case 6: // WORKFLOW_OUTPUTS
          return WORKFLOW_OUTPUTS;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.GRAPH,_Fields.IMAGE,_Fields.WORKFLOW_INPUTS,_Fields.WORKFLOW_OUTPUTS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TEMPLATE_ID, new org.apache.thrift.meta_data.FieldMetaData("templateId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GRAPH, new org.apache.thrift.meta_data.FieldMetaData("graph", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IMAGE, new org.apache.thrift.meta_data.FieldMetaData("image", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.WORKFLOW_INPUTS, new org.apache.thrift.meta_data.FieldMetaData("workflowInputs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.airavata.model.application.io.InputDataObjectType.class))));
    tmpMap.put(_Fields.WORKFLOW_OUTPUTS, new org.apache.thrift.meta_data.FieldMetaData("workflowOutputs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.airavata.model.application.io.OutputDataObjectType.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Workflow.class, metaDataMap);
  }

  public Workflow() {
    this.templateId = "DO_NOT_SET_AT_CLIENTS";

  }

  public Workflow(
    String templateId,
    String name)
  {
    this();
    this.templateId = templateId;
    this.name = name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Workflow(Workflow other) {
    if (other.isSetTemplateId()) {
      this.templateId = other.templateId;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetGraph()) {
      this.graph = other.graph;
    }
    if (other.isSetImage()) {
      this.image = org.apache.thrift.TBaseHelper.copyBinary(other.image);
    }
    if (other.isSetWorkflowInputs()) {
      List<org.apache.airavata.model.application.io.InputDataObjectType> __this__workflowInputs = new ArrayList<org.apache.airavata.model.application.io.InputDataObjectType>(other.workflowInputs.size());
      for (org.apache.airavata.model.application.io.InputDataObjectType other_element : other.workflowInputs) {
        __this__workflowInputs.add(new org.apache.airavata.model.application.io.InputDataObjectType(other_element));
      }
      this.workflowInputs = __this__workflowInputs;
    }
    if (other.isSetWorkflowOutputs()) {
      List<org.apache.airavata.model.application.io.OutputDataObjectType> __this__workflowOutputs = new ArrayList<org.apache.airavata.model.application.io.OutputDataObjectType>(other.workflowOutputs.size());
      for (org.apache.airavata.model.application.io.OutputDataObjectType other_element : other.workflowOutputs) {
        __this__workflowOutputs.add(new org.apache.airavata.model.application.io.OutputDataObjectType(other_element));
      }
      this.workflowOutputs = __this__workflowOutputs;
    }
  }

  public Workflow deepCopy() {
    return new Workflow(this);
  }

  @Override
  public void clear() {
    this.templateId = "DO_NOT_SET_AT_CLIENTS";

    this.name = null;
    this.graph = null;
    this.image = null;
    this.workflowInputs = null;
    this.workflowOutputs = null;
  }

  public String getTemplateId() {
    return this.templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public void unsetTemplateId() {
    this.templateId = null;
  }

  /** Returns true if field templateId is set (has been assigned a value) and false otherwise */
  public boolean isSetTemplateId() {
    return this.templateId != null;
  }

  public void setTemplateIdIsSet(boolean value) {
    if (!value) {
      this.templateId = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getGraph() {
    return this.graph;
  }

  public void setGraph(String graph) {
    this.graph = graph;
  }

  public void unsetGraph() {
    this.graph = null;
  }

  /** Returns true if field graph is set (has been assigned a value) and false otherwise */
  public boolean isSetGraph() {
    return this.graph != null;
  }

  public void setGraphIsSet(boolean value) {
    if (!value) {
      this.graph = null;
    }
  }

  public byte[] getImage() {
    setImage(org.apache.thrift.TBaseHelper.rightSize(image));
    return image == null ? null : image.array();
  }

  public ByteBuffer bufferForImage() {
    return org.apache.thrift.TBaseHelper.copyBinary(image);
  }

  public void setImage(byte[] image) {
    this.image = image == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(image, image.length));
  }

  public void setImage(ByteBuffer image) {
    this.image = org.apache.thrift.TBaseHelper.copyBinary(image);
  }

  public void unsetImage() {
    this.image = null;
  }

  /** Returns true if field image is set (has been assigned a value) and false otherwise */
  public boolean isSetImage() {
    return this.image != null;
  }

  public void setImageIsSet(boolean value) {
    if (!value) {
      this.image = null;
    }
  }

  public int getWorkflowInputsSize() {
    return (this.workflowInputs == null) ? 0 : this.workflowInputs.size();
  }

  public java.util.Iterator<org.apache.airavata.model.application.io.InputDataObjectType> getWorkflowInputsIterator() {
    return (this.workflowInputs == null) ? null : this.workflowInputs.iterator();
  }

  public void addToWorkflowInputs(org.apache.airavata.model.application.io.InputDataObjectType elem) {
    if (this.workflowInputs == null) {
      this.workflowInputs = new ArrayList<org.apache.airavata.model.application.io.InputDataObjectType>();
    }
    this.workflowInputs.add(elem);
  }

  public List<org.apache.airavata.model.application.io.InputDataObjectType> getWorkflowInputs() {
    return this.workflowInputs;
  }

  public void setWorkflowInputs(List<org.apache.airavata.model.application.io.InputDataObjectType> workflowInputs) {
    this.workflowInputs = workflowInputs;
  }

  public void unsetWorkflowInputs() {
    this.workflowInputs = null;
  }

  /** Returns true if field workflowInputs is set (has been assigned a value) and false otherwise */
  public boolean isSetWorkflowInputs() {
    return this.workflowInputs != null;
  }

  public void setWorkflowInputsIsSet(boolean value) {
    if (!value) {
      this.workflowInputs = null;
    }
  }

  public int getWorkflowOutputsSize() {
    return (this.workflowOutputs == null) ? 0 : this.workflowOutputs.size();
  }

  public java.util.Iterator<org.apache.airavata.model.application.io.OutputDataObjectType> getWorkflowOutputsIterator() {
    return (this.workflowOutputs == null) ? null : this.workflowOutputs.iterator();
  }

  public void addToWorkflowOutputs(org.apache.airavata.model.application.io.OutputDataObjectType elem) {
    if (this.workflowOutputs == null) {
      this.workflowOutputs = new ArrayList<org.apache.airavata.model.application.io.OutputDataObjectType>();
    }
    this.workflowOutputs.add(elem);
  }

  public List<org.apache.airavata.model.application.io.OutputDataObjectType> getWorkflowOutputs() {
    return this.workflowOutputs;
  }

  public void setWorkflowOutputs(List<org.apache.airavata.model.application.io.OutputDataObjectType> workflowOutputs) {
    this.workflowOutputs = workflowOutputs;
  }

  public void unsetWorkflowOutputs() {
    this.workflowOutputs = null;
  }

  /** Returns true if field workflowOutputs is set (has been assigned a value) and false otherwise */
  public boolean isSetWorkflowOutputs() {
    return this.workflowOutputs != null;
  }

  public void setWorkflowOutputsIsSet(boolean value) {
    if (!value) {
      this.workflowOutputs = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TEMPLATE_ID:
      if (value == null) {
        unsetTemplateId();
      } else {
        setTemplateId((String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case GRAPH:
      if (value == null) {
        unsetGraph();
      } else {
        setGraph((String)value);
      }
      break;

    case IMAGE:
      if (value == null) {
        unsetImage();
      } else {
        setImage((ByteBuffer)value);
      }
      break;

    case WORKFLOW_INPUTS:
      if (value == null) {
        unsetWorkflowInputs();
      } else {
        setWorkflowInputs((List<org.apache.airavata.model.application.io.InputDataObjectType>)value);
      }
      break;

    case WORKFLOW_OUTPUTS:
      if (value == null) {
        unsetWorkflowOutputs();
      } else {
        setWorkflowOutputs((List<org.apache.airavata.model.application.io.OutputDataObjectType>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TEMPLATE_ID:
      return getTemplateId();

    case NAME:
      return getName();

    case GRAPH:
      return getGraph();

    case IMAGE:
      return getImage();

    case WORKFLOW_INPUTS:
      return getWorkflowInputs();

    case WORKFLOW_OUTPUTS:
      return getWorkflowOutputs();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TEMPLATE_ID:
      return isSetTemplateId();
    case NAME:
      return isSetName();
    case GRAPH:
      return isSetGraph();
    case IMAGE:
      return isSetImage();
    case WORKFLOW_INPUTS:
      return isSetWorkflowInputs();
    case WORKFLOW_OUTPUTS:
      return isSetWorkflowOutputs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Workflow)
      return this.equals((Workflow)that);
    return false;
  }

  public boolean equals(Workflow that) {
    if (that == null)
      return false;

    boolean this_present_templateId = true && this.isSetTemplateId();
    boolean that_present_templateId = true && that.isSetTemplateId();
    if (this_present_templateId || that_present_templateId) {
      if (!(this_present_templateId && that_present_templateId))
        return false;
      if (!this.templateId.equals(that.templateId))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_graph = true && this.isSetGraph();
    boolean that_present_graph = true && that.isSetGraph();
    if (this_present_graph || that_present_graph) {
      if (!(this_present_graph && that_present_graph))
        return false;
      if (!this.graph.equals(that.graph))
        return false;
    }

    boolean this_present_image = true && this.isSetImage();
    boolean that_present_image = true && that.isSetImage();
    if (this_present_image || that_present_image) {
      if (!(this_present_image && that_present_image))
        return false;
      if (!this.image.equals(that.image))
        return false;
    }

    boolean this_present_workflowInputs = true && this.isSetWorkflowInputs();
    boolean that_present_workflowInputs = true && that.isSetWorkflowInputs();
    if (this_present_workflowInputs || that_present_workflowInputs) {
      if (!(this_present_workflowInputs && that_present_workflowInputs))
        return false;
      if (!this.workflowInputs.equals(that.workflowInputs))
        return false;
    }

    boolean this_present_workflowOutputs = true && this.isSetWorkflowOutputs();
    boolean that_present_workflowOutputs = true && that.isSetWorkflowOutputs();
    if (this_present_workflowOutputs || that_present_workflowOutputs) {
      if (!(this_present_workflowOutputs && that_present_workflowOutputs))
        return false;
      if (!this.workflowOutputs.equals(that.workflowOutputs))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_templateId = true && (isSetTemplateId());
    list.add(present_templateId);
    if (present_templateId)
      list.add(templateId);

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_graph = true && (isSetGraph());
    list.add(present_graph);
    if (present_graph)
      list.add(graph);

    boolean present_image = true && (isSetImage());
    list.add(present_image);
    if (present_image)
      list.add(image);

    boolean present_workflowInputs = true && (isSetWorkflowInputs());
    list.add(present_workflowInputs);
    if (present_workflowInputs)
      list.add(workflowInputs);

    boolean present_workflowOutputs = true && (isSetWorkflowOutputs());
    list.add(present_workflowOutputs);
    if (present_workflowOutputs)
      list.add(workflowOutputs);

    return list.hashCode();
  }

  @Override
  public int compareTo(Workflow other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTemplateId()).compareTo(other.isSetTemplateId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTemplateId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.templateId, other.templateId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGraph()).compareTo(other.isSetGraph());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGraph()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.graph, other.graph);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetImage()).compareTo(other.isSetImage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetImage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.image, other.image);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWorkflowInputs()).compareTo(other.isSetWorkflowInputs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWorkflowInputs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.workflowInputs, other.workflowInputs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWorkflowOutputs()).compareTo(other.isSetWorkflowOutputs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWorkflowOutputs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.workflowOutputs, other.workflowOutputs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Workflow(");
    boolean first = true;

    sb.append("templateId:");
    if (this.templateId == null) {
      sb.append("null");
    } else {
      sb.append(this.templateId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (isSetGraph()) {
      if (!first) sb.append(", ");
      sb.append("graph:");
      if (this.graph == null) {
        sb.append("null");
      } else {
        sb.append(this.graph);
      }
      first = false;
    }
    if (isSetImage()) {
      if (!first) sb.append(", ");
      sb.append("image:");
      if (this.image == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.image, sb);
      }
      first = false;
    }
    if (isSetWorkflowInputs()) {
      if (!first) sb.append(", ");
      sb.append("workflowInputs:");
      if (this.workflowInputs == null) {
        sb.append("null");
      } else {
        sb.append(this.workflowInputs);
      }
      first = false;
    }
    if (isSetWorkflowOutputs()) {
      if (!first) sb.append(", ");
      sb.append("workflowOutputs:");
      if (this.workflowOutputs == null) {
        sb.append("null");
      } else {
        sb.append(this.workflowOutputs);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetTemplateId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'templateId' is unset! Struct:" + toString());
    }

    if (!isSetName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class WorkflowStandardSchemeFactory implements SchemeFactory {
    public WorkflowStandardScheme getScheme() {
      return new WorkflowStandardScheme();
    }
  }

  private static class WorkflowStandardScheme extends StandardScheme<Workflow> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Workflow struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TEMPLATE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.templateId = iprot.readString();
              struct.setTemplateIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // GRAPH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.graph = iprot.readString();
              struct.setGraphIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // IMAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.image = iprot.readBinary();
              struct.setImageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // WORKFLOW_INPUTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.workflowInputs = new ArrayList<org.apache.airavata.model.application.io.InputDataObjectType>(_list0.size);
                org.apache.airavata.model.application.io.InputDataObjectType _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new org.apache.airavata.model.application.io.InputDataObjectType();
                  _elem1.read(iprot);
                  struct.workflowInputs.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setWorkflowInputsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // WORKFLOW_OUTPUTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.workflowOutputs = new ArrayList<org.apache.airavata.model.application.io.OutputDataObjectType>(_list3.size);
                org.apache.airavata.model.application.io.OutputDataObjectType _elem4;
                for (int _i5 = 0; _i5 < _list3.size; ++_i5)
                {
                  _elem4 = new org.apache.airavata.model.application.io.OutputDataObjectType();
                  _elem4.read(iprot);
                  struct.workflowOutputs.add(_elem4);
                }
                iprot.readListEnd();
              }
              struct.setWorkflowOutputsIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Workflow struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.templateId != null) {
        oprot.writeFieldBegin(TEMPLATE_ID_FIELD_DESC);
        oprot.writeString(struct.templateId);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.graph != null) {
        if (struct.isSetGraph()) {
          oprot.writeFieldBegin(GRAPH_FIELD_DESC);
          oprot.writeString(struct.graph);
          oprot.writeFieldEnd();
        }
      }
      if (struct.image != null) {
        if (struct.isSetImage()) {
          oprot.writeFieldBegin(IMAGE_FIELD_DESC);
          oprot.writeBinary(struct.image);
          oprot.writeFieldEnd();
        }
      }
      if (struct.workflowInputs != null) {
        if (struct.isSetWorkflowInputs()) {
          oprot.writeFieldBegin(WORKFLOW_INPUTS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.workflowInputs.size()));
            for (org.apache.airavata.model.application.io.InputDataObjectType _iter6 : struct.workflowInputs)
            {
              _iter6.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.workflowOutputs != null) {
        if (struct.isSetWorkflowOutputs()) {
          oprot.writeFieldBegin(WORKFLOW_OUTPUTS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.workflowOutputs.size()));
            for (org.apache.airavata.model.application.io.OutputDataObjectType _iter7 : struct.workflowOutputs)
            {
              _iter7.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class WorkflowTupleSchemeFactory implements SchemeFactory {
    public WorkflowTupleScheme getScheme() {
      return new WorkflowTupleScheme();
    }
  }

  private static class WorkflowTupleScheme extends TupleScheme<Workflow> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Workflow struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.templateId);
      oprot.writeString(struct.name);
      BitSet optionals = new BitSet();
      if (struct.isSetGraph()) {
        optionals.set(0);
      }
      if (struct.isSetImage()) {
        optionals.set(1);
      }
      if (struct.isSetWorkflowInputs()) {
        optionals.set(2);
      }
      if (struct.isSetWorkflowOutputs()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetGraph()) {
        oprot.writeString(struct.graph);
      }
      if (struct.isSetImage()) {
        oprot.writeBinary(struct.image);
      }
      if (struct.isSetWorkflowInputs()) {
        {
          oprot.writeI32(struct.workflowInputs.size());
          for (org.apache.airavata.model.application.io.InputDataObjectType _iter8 : struct.workflowInputs)
          {
            _iter8.write(oprot);
          }
        }
      }
      if (struct.isSetWorkflowOutputs()) {
        {
          oprot.writeI32(struct.workflowOutputs.size());
          for (org.apache.airavata.model.application.io.OutputDataObjectType _iter9 : struct.workflowOutputs)
          {
            _iter9.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Workflow struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.templateId = iprot.readString();
      struct.setTemplateIdIsSet(true);
      struct.name = iprot.readString();
      struct.setNameIsSet(true);
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.graph = iprot.readString();
        struct.setGraphIsSet(true);
      }
      if (incoming.get(1)) {
        struct.image = iprot.readBinary();
        struct.setImageIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list10 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.workflowInputs = new ArrayList<org.apache.airavata.model.application.io.InputDataObjectType>(_list10.size);
          org.apache.airavata.model.application.io.InputDataObjectType _elem11;
          for (int _i12 = 0; _i12 < _list10.size; ++_i12)
          {
            _elem11 = new org.apache.airavata.model.application.io.InputDataObjectType();
            _elem11.read(iprot);
            struct.workflowInputs.add(_elem11);
          }
        }
        struct.setWorkflowInputsIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.workflowOutputs = new ArrayList<org.apache.airavata.model.application.io.OutputDataObjectType>(_list13.size);
          org.apache.airavata.model.application.io.OutputDataObjectType _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = new org.apache.airavata.model.application.io.OutputDataObjectType();
            _elem14.read(iprot);
            struct.workflowOutputs.add(_elem14);
          }
        }
        struct.setWorkflowOutputsIsSet(true);
      }
    }
  }

}

