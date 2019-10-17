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

public interface BuildTriggerOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.BuildTrigger)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Unique identifier of the trigger.
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Output only. Unique identifier of the trigger.
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Human-readable description of this trigger.
   * </pre>
   *
   * <code>string description = 10;</code>
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Human-readable description of this trigger.
   * </pre>
   *
   * <code>string description = 10;</code>
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Template describing the types of source changes to trigger a build.
   * Branch and tag names in trigger templates are interpreted as regular
   * expressions. Any branch or tag change that matches that regular expression
   * will trigger a build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.RepoSource trigger_template = 7;</code>
   */
  boolean hasTriggerTemplate();
  /**
   *
   *
   * <pre>
   * Template describing the types of source changes to trigger a build.
   * Branch and tag names in trigger templates are interpreted as regular
   * expressions. Any branch or tag change that matches that regular expression
   * will trigger a build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.RepoSource trigger_template = 7;</code>
   */
  com.google.cloudbuild.v1.RepoSource getTriggerTemplate();
  /**
   *
   *
   * <pre>
   * Template describing the types of source changes to trigger a build.
   * Branch and tag names in trigger templates are interpreted as regular
   * expressions. Any branch or tag change that matches that regular expression
   * will trigger a build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.RepoSource trigger_template = 7;</code>
   */
  com.google.cloudbuild.v1.RepoSourceOrBuilder getTriggerTemplateOrBuilder();

  /**
   *
   *
   * <pre>
   * Contents of the build template.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Build build = 4;</code>
   */
  boolean hasBuild();
  /**
   *
   *
   * <pre>
   * Contents of the build template.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Build build = 4;</code>
   */
  com.google.cloudbuild.v1.Build getBuild();
  /**
   *
   *
   * <pre>
   * Contents of the build template.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Build build = 4;</code>
   */
  com.google.cloudbuild.v1.BuildOrBuilder getBuildOrBuilder();

  /**
   *
   *
   * <pre>
   * Path, from the source root, to a file whose contents is used for the
   * template.
   * </pre>
   *
   * <code>string filename = 8;</code>
   */
  java.lang.String getFilename();
  /**
   *
   *
   * <pre>
   * Path, from the source root, to a file whose contents is used for the
   * template.
   * </pre>
   *
   * <code>string filename = 8;</code>
   */
  com.google.protobuf.ByteString getFilenameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Time when the trigger was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the trigger was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the trigger was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * If true, the trigger will never result in a build.
   * </pre>
   *
   * <code>bool disabled = 9;</code>
   */
  boolean getDisabled();

  /**
   *
   *
   * <pre>
   * Substitutions data for Build resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; substitutions = 11;</code>
   */
  int getSubstitutionsCount();
  /**
   *
   *
   * <pre>
   * Substitutions data for Build resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; substitutions = 11;</code>
   */
  boolean containsSubstitutions(java.lang.String key);
  /** Use {@link #getSubstitutionsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getSubstitutions();
  /**
   *
   *
   * <pre>
   * Substitutions data for Build resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; substitutions = 11;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getSubstitutionsMap();
  /**
   *
   *
   * <pre>
   * Substitutions data for Build resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; substitutions = 11;</code>
   */
  java.lang.String getSubstitutionsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Substitutions data for Build resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; substitutions = 11;</code>
   */
  java.lang.String getSubstitutionsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * ignored_files and included_files are file glob matches using
   * http://godoc/pkg/path/filepath#Match extended with support for "**".
   * If ignored_files and changed files are both empty, then they are
   * not used to determine whether or not to trigger a build.
   * If ignored_files is not empty, then we ignore any files that match
   * any of the ignored_file globs. If the change has no files that are
   * outside of the ignored_files globs, then we do not trigger a build.
   * </pre>
   *
   * <code>repeated string ignored_files = 15;</code>
   */
  java.util.List<java.lang.String> getIgnoredFilesList();
  /**
   *
   *
   * <pre>
   * ignored_files and included_files are file glob matches using
   * http://godoc/pkg/path/filepath#Match extended with support for "**".
   * If ignored_files and changed files are both empty, then they are
   * not used to determine whether or not to trigger a build.
   * If ignored_files is not empty, then we ignore any files that match
   * any of the ignored_file globs. If the change has no files that are
   * outside of the ignored_files globs, then we do not trigger a build.
   * </pre>
   *
   * <code>repeated string ignored_files = 15;</code>
   */
  int getIgnoredFilesCount();
  /**
   *
   *
   * <pre>
   * ignored_files and included_files are file glob matches using
   * http://godoc/pkg/path/filepath#Match extended with support for "**".
   * If ignored_files and changed files are both empty, then they are
   * not used to determine whether or not to trigger a build.
   * If ignored_files is not empty, then we ignore any files that match
   * any of the ignored_file globs. If the change has no files that are
   * outside of the ignored_files globs, then we do not trigger a build.
   * </pre>
   *
   * <code>repeated string ignored_files = 15;</code>
   */
  java.lang.String getIgnoredFiles(int index);
  /**
   *
   *
   * <pre>
   * ignored_files and included_files are file glob matches using
   * http://godoc/pkg/path/filepath#Match extended with support for "**".
   * If ignored_files and changed files are both empty, then they are
   * not used to determine whether or not to trigger a build.
   * If ignored_files is not empty, then we ignore any files that match
   * any of the ignored_file globs. If the change has no files that are
   * outside of the ignored_files globs, then we do not trigger a build.
   * </pre>
   *
   * <code>repeated string ignored_files = 15;</code>
   */
  com.google.protobuf.ByteString getIgnoredFilesBytes(int index);

  /**
   *
   *
   * <pre>
   * If any of the files altered in the commit pass the ignored_files
   * filter and included_files is empty, then as far as this filter is
   * concerned, we should trigger the build.
   * If any of the files altered in the commit pass the ignored_files
   * filter and included_files is not empty, then we make sure that at
   * least one of those files matches a included_files glob. If not,
   * then we do not trigger a build.
   * </pre>
   *
   * <code>repeated string included_files = 16;</code>
   */
  java.util.List<java.lang.String> getIncludedFilesList();
  /**
   *
   *
   * <pre>
   * If any of the files altered in the commit pass the ignored_files
   * filter and included_files is empty, then as far as this filter is
   * concerned, we should trigger the build.
   * If any of the files altered in the commit pass the ignored_files
   * filter and included_files is not empty, then we make sure that at
   * least one of those files matches a included_files glob. If not,
   * then we do not trigger a build.
   * </pre>
   *
   * <code>repeated string included_files = 16;</code>
   */
  int getIncludedFilesCount();
  /**
   *
   *
   * <pre>
   * If any of the files altered in the commit pass the ignored_files
   * filter and included_files is empty, then as far as this filter is
   * concerned, we should trigger the build.
   * If any of the files altered in the commit pass the ignored_files
   * filter and included_files is not empty, then we make sure that at
   * least one of those files matches a included_files glob. If not,
   * then we do not trigger a build.
   * </pre>
   *
   * <code>repeated string included_files = 16;</code>
   */
  java.lang.String getIncludedFiles(int index);
  /**
   *
   *
   * <pre>
   * If any of the files altered in the commit pass the ignored_files
   * filter and included_files is empty, then as far as this filter is
   * concerned, we should trigger the build.
   * If any of the files altered in the commit pass the ignored_files
   * filter and included_files is not empty, then we make sure that at
   * least one of those files matches a included_files glob. If not,
   * then we do not trigger a build.
   * </pre>
   *
   * <code>repeated string included_files = 16;</code>
   */
  com.google.protobuf.ByteString getIncludedFilesBytes(int index);

  public com.google.cloudbuild.v1.BuildTrigger.BuildTemplateCase getBuildTemplateCase();
}
