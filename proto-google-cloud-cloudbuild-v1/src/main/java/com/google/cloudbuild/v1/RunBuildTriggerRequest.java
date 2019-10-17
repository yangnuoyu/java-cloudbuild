/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

package com.google.cloudbuild.v1;

/**
 *
 *
 * <pre>
 * Specifies a build trigger to run and the source to use.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v1.RunBuildTriggerRequest}
 */
public final class RunBuildTriggerRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v1.RunBuildTriggerRequest)
    RunBuildTriggerRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RunBuildTriggerRequest.newBuilder() to construct.
  private RunBuildTriggerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RunBuildTriggerRequest() {
    projectId_ = "";
    triggerId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private RunBuildTriggerRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              projectId_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              triggerId_ = s;
              break;
            }
          case 26:
            {
              com.google.cloudbuild.v1.RepoSource.Builder subBuilder = null;
              if (source_ != null) {
                subBuilder = source_.toBuilder();
              }
              source_ =
                  input.readMessage(
                      com.google.cloudbuild.v1.RepoSource.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(source_);
                source_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloudbuild.v1.Cloudbuild
        .internal_static_google_devtools_cloudbuild_v1_RunBuildTriggerRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloudbuild.v1.Cloudbuild
        .internal_static_google_devtools_cloudbuild_v1_RunBuildTriggerRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloudbuild.v1.RunBuildTriggerRequest.class,
            com.google.cloudbuild.v1.RunBuildTriggerRequest.Builder.class);
  }

  public static final int PROJECT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object projectId_;
  /**
   *
   *
   * <pre>
   * ID of the project.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * ID of the project.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  public com.google.protobuf.ByteString getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRIGGER_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object triggerId_;
  /**
   *
   *
   * <pre>
   * ID of the trigger.
   * </pre>
   *
   * <code>string trigger_id = 2;</code>
   */
  public java.lang.String getTriggerId() {
    java.lang.Object ref = triggerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      triggerId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * ID of the trigger.
   * </pre>
   *
   * <code>string trigger_id = 2;</code>
   */
  public com.google.protobuf.ByteString getTriggerIdBytes() {
    java.lang.Object ref = triggerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      triggerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOURCE_FIELD_NUMBER = 3;
  private com.google.cloudbuild.v1.RepoSource source_;
  /**
   *
   *
   * <pre>
   * Source to build against this trigger.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.RepoSource source = 3;</code>
   */
  public boolean hasSource() {
    return source_ != null;
  }
  /**
   *
   *
   * <pre>
   * Source to build against this trigger.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.RepoSource source = 3;</code>
   */
  public com.google.cloudbuild.v1.RepoSource getSource() {
    return source_ == null ? com.google.cloudbuild.v1.RepoSource.getDefaultInstance() : source_;
  }
  /**
   *
   *
   * <pre>
   * Source to build against this trigger.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.RepoSource source = 3;</code>
   */
  public com.google.cloudbuild.v1.RepoSourceOrBuilder getSourceOrBuilder() {
    return getSource();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getProjectIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, projectId_);
    }
    if (!getTriggerIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, triggerId_);
    }
    if (source_ != null) {
      output.writeMessage(3, getSource());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProjectIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, projectId_);
    }
    if (!getTriggerIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, triggerId_);
    }
    if (source_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getSource());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloudbuild.v1.RunBuildTriggerRequest)) {
      return super.equals(obj);
    }
    com.google.cloudbuild.v1.RunBuildTriggerRequest other =
        (com.google.cloudbuild.v1.RunBuildTriggerRequest) obj;

    if (!getProjectId().equals(other.getProjectId())) return false;
    if (!getTriggerId().equals(other.getTriggerId())) return false;
    if (hasSource() != other.hasSource()) return false;
    if (hasSource()) {
      if (!getSource().equals(other.getSource())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    hash = (37 * hash) + TRIGGER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTriggerId().hashCode();
    if (hasSource()) {
      hash = (37 * hash) + SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getSource().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloudbuild.v1.RunBuildTriggerRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.RunBuildTriggerRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.RunBuildTriggerRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.RunBuildTriggerRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.RunBuildTriggerRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.RunBuildTriggerRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.RunBuildTriggerRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.RunBuildTriggerRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.RunBuildTriggerRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.RunBuildTriggerRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.RunBuildTriggerRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.RunBuildTriggerRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloudbuild.v1.RunBuildTriggerRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Specifies a build trigger to run and the source to use.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v1.RunBuildTriggerRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v1.RunBuildTriggerRequest)
      com.google.cloudbuild.v1.RunBuildTriggerRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_RunBuildTriggerRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_RunBuildTriggerRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloudbuild.v1.RunBuildTriggerRequest.class,
              com.google.cloudbuild.v1.RunBuildTriggerRequest.Builder.class);
    }

    // Construct using com.google.cloudbuild.v1.RunBuildTriggerRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      projectId_ = "";

      triggerId_ = "";

      if (sourceBuilder_ == null) {
        source_ = null;
      } else {
        source_ = null;
        sourceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_RunBuildTriggerRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.RunBuildTriggerRequest getDefaultInstanceForType() {
      return com.google.cloudbuild.v1.RunBuildTriggerRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.RunBuildTriggerRequest build() {
      com.google.cloudbuild.v1.RunBuildTriggerRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.RunBuildTriggerRequest buildPartial() {
      com.google.cloudbuild.v1.RunBuildTriggerRequest result =
          new com.google.cloudbuild.v1.RunBuildTriggerRequest(this);
      result.projectId_ = projectId_;
      result.triggerId_ = triggerId_;
      if (sourceBuilder_ == null) {
        result.source_ = source_;
      } else {
        result.source_ = sourceBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloudbuild.v1.RunBuildTriggerRequest) {
        return mergeFrom((com.google.cloudbuild.v1.RunBuildTriggerRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloudbuild.v1.RunBuildTriggerRequest other) {
      if (other == com.google.cloudbuild.v1.RunBuildTriggerRequest.getDefaultInstance())
        return this;
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        onChanged();
      }
      if (!other.getTriggerId().isEmpty()) {
        triggerId_ = other.triggerId_;
        onChanged();
      }
      if (other.hasSource()) {
        mergeSource(other.getSource());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloudbuild.v1.RunBuildTriggerRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloudbuild.v1.RunBuildTriggerRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object projectId_ = "";
    /**
     *
     *
     * <pre>
     * ID of the project.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * ID of the project.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public com.google.protobuf.ByteString getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * ID of the project.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public Builder setProjectId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      projectId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * ID of the project.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public Builder clearProjectId() {

      projectId_ = getDefaultInstance().getProjectId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * ID of the project.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public Builder setProjectIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      projectId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object triggerId_ = "";
    /**
     *
     *
     * <pre>
     * ID of the trigger.
     * </pre>
     *
     * <code>string trigger_id = 2;</code>
     */
    public java.lang.String getTriggerId() {
      java.lang.Object ref = triggerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        triggerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * ID of the trigger.
     * </pre>
     *
     * <code>string trigger_id = 2;</code>
     */
    public com.google.protobuf.ByteString getTriggerIdBytes() {
      java.lang.Object ref = triggerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        triggerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * ID of the trigger.
     * </pre>
     *
     * <code>string trigger_id = 2;</code>
     */
    public Builder setTriggerId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      triggerId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * ID of the trigger.
     * </pre>
     *
     * <code>string trigger_id = 2;</code>
     */
    public Builder clearTriggerId() {

      triggerId_ = getDefaultInstance().getTriggerId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * ID of the trigger.
     * </pre>
     *
     * <code>string trigger_id = 2;</code>
     */
    public Builder setTriggerIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      triggerId_ = value;
      onChanged();
      return this;
    }

    private com.google.cloudbuild.v1.RepoSource source_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloudbuild.v1.RepoSource,
            com.google.cloudbuild.v1.RepoSource.Builder,
            com.google.cloudbuild.v1.RepoSourceOrBuilder>
        sourceBuilder_;
    /**
     *
     *
     * <pre>
     * Source to build against this trigger.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.RepoSource source = 3;</code>
     */
    public boolean hasSource() {
      return sourceBuilder_ != null || source_ != null;
    }
    /**
     *
     *
     * <pre>
     * Source to build against this trigger.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.RepoSource source = 3;</code>
     */
    public com.google.cloudbuild.v1.RepoSource getSource() {
      if (sourceBuilder_ == null) {
        return source_ == null ? com.google.cloudbuild.v1.RepoSource.getDefaultInstance() : source_;
      } else {
        return sourceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Source to build against this trigger.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.RepoSource source = 3;</code>
     */
    public Builder setSource(com.google.cloudbuild.v1.RepoSource value) {
      if (sourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        sourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Source to build against this trigger.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.RepoSource source = 3;</code>
     */
    public Builder setSource(com.google.cloudbuild.v1.RepoSource.Builder builderForValue) {
      if (sourceBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        sourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Source to build against this trigger.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.RepoSource source = 3;</code>
     */
    public Builder mergeSource(com.google.cloudbuild.v1.RepoSource value) {
      if (sourceBuilder_ == null) {
        if (source_ != null) {
          source_ =
              com.google.cloudbuild.v1.RepoSource.newBuilder(source_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        sourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Source to build against this trigger.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.RepoSource source = 3;</code>
     */
    public Builder clearSource() {
      if (sourceBuilder_ == null) {
        source_ = null;
        onChanged();
      } else {
        source_ = null;
        sourceBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Source to build against this trigger.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.RepoSource source = 3;</code>
     */
    public com.google.cloudbuild.v1.RepoSource.Builder getSourceBuilder() {

      onChanged();
      return getSourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Source to build against this trigger.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.RepoSource source = 3;</code>
     */
    public com.google.cloudbuild.v1.RepoSourceOrBuilder getSourceOrBuilder() {
      if (sourceBuilder_ != null) {
        return sourceBuilder_.getMessageOrBuilder();
      } else {
        return source_ == null ? com.google.cloudbuild.v1.RepoSource.getDefaultInstance() : source_;
      }
    }
    /**
     *
     *
     * <pre>
     * Source to build against this trigger.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.RepoSource source = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloudbuild.v1.RepoSource,
            com.google.cloudbuild.v1.RepoSource.Builder,
            com.google.cloudbuild.v1.RepoSourceOrBuilder>
        getSourceFieldBuilder() {
      if (sourceBuilder_ == null) {
        sourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloudbuild.v1.RepoSource,
                com.google.cloudbuild.v1.RepoSource.Builder,
                com.google.cloudbuild.v1.RepoSourceOrBuilder>(
                getSource(), getParentForChildren(), isClean());
        source_ = null;
      }
      return sourceBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v1.RunBuildTriggerRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v1.RunBuildTriggerRequest)
  private static final com.google.cloudbuild.v1.RunBuildTriggerRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloudbuild.v1.RunBuildTriggerRequest();
  }

  public static com.google.cloudbuild.v1.RunBuildTriggerRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RunBuildTriggerRequest> PARSER =
      new com.google.protobuf.AbstractParser<RunBuildTriggerRequest>() {
        @java.lang.Override
        public RunBuildTriggerRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new RunBuildTriggerRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<RunBuildTriggerRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RunBuildTriggerRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloudbuild.v1.RunBuildTriggerRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
