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

public interface BuildOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.Build)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Unique identifier of the build.
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Output only. Unique identifier of the build.
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. ID of the project.
   * </pre>
   *
   * <code>string project_id = 16;</code>
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Output only. ID of the project.
   * </pre>
   *
   * <code>string project_id = 16;</code>
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. Status of the build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Build.Status status = 2;</code>
   */
  int getStatusValue();
  /**
   *
   *
   * <pre>
   * Output only. Status of the build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Build.Status status = 2;</code>
   */
  com.google.cloudbuild.v1.Build.Status getStatus();

  /**
   *
   *
   * <pre>
   * Output only. Customer-readable message about the current status.
   * </pre>
   *
   * <code>string status_detail = 24;</code>
   */
  java.lang.String getStatusDetail();
  /**
   *
   *
   * <pre>
   * Output only. Customer-readable message about the current status.
   * </pre>
   *
   * <code>string status_detail = 24;</code>
   */
  com.google.protobuf.ByteString getStatusDetailBytes();

  /**
   *
   *
   * <pre>
   * The location of the source files to build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Source source = 3;</code>
   */
  boolean hasSource();
  /**
   *
   *
   * <pre>
   * The location of the source files to build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Source source = 3;</code>
   */
  com.google.cloudbuild.v1.Source getSource();
  /**
   *
   *
   * <pre>
   * The location of the source files to build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Source source = 3;</code>
   */
  com.google.cloudbuild.v1.SourceOrBuilder getSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The operations to be performed on the workspace.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuildStep steps = 11;</code>
   */
  java.util.List<com.google.cloudbuild.v1.BuildStep> getStepsList();
  /**
   *
   *
   * <pre>
   * Required. The operations to be performed on the workspace.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuildStep steps = 11;</code>
   */
  com.google.cloudbuild.v1.BuildStep getSteps(int index);
  /**
   *
   *
   * <pre>
   * Required. The operations to be performed on the workspace.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuildStep steps = 11;</code>
   */
  int getStepsCount();
  /**
   *
   *
   * <pre>
   * Required. The operations to be performed on the workspace.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuildStep steps = 11;</code>
   */
  java.util.List<? extends com.google.cloudbuild.v1.BuildStepOrBuilder> getStepsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The operations to be performed on the workspace.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuildStep steps = 11;</code>
   */
  com.google.cloudbuild.v1.BuildStepOrBuilder getStepsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Results of the build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Results results = 10;</code>
   */
  boolean hasResults();
  /**
   *
   *
   * <pre>
   * Output only. Results of the build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Results results = 10;</code>
   */
  com.google.cloudbuild.v1.Results getResults();
  /**
   *
   *
   * <pre>
   * Output only. Results of the build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Results results = 10;</code>
   */
  com.google.cloudbuild.v1.ResultsOrBuilder getResultsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time at which the request to create the build was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time at which the request to create the build was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time at which the request to create the build was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time at which execution of the build was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7;</code>
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Time at which execution of the build was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7;</code>
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Time at which execution of the build was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time at which execution of the build was finished.
   * The difference between finish_time and start_time is the duration of the
   * build's execution.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp finish_time = 8;</code>
   */
  boolean hasFinishTime();
  /**
   *
   *
   * <pre>
   * Output only. Time at which execution of the build was finished.
   * The difference between finish_time and start_time is the duration of the
   * build's execution.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp finish_time = 8;</code>
   */
  com.google.protobuf.Timestamp getFinishTime();
  /**
   *
   *
   * <pre>
   * Output only. Time at which execution of the build was finished.
   * The difference between finish_time and start_time is the duration of the
   * build's execution.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp finish_time = 8;</code>
   */
  com.google.protobuf.TimestampOrBuilder getFinishTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Amount of time that this build should be allowed to run, to second
   * granularity. If this amount of time elapses, work on the build will cease
   * and the build status will be `TIMEOUT`.
   * Default time is ten minutes.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 12;</code>
   */
  boolean hasTimeout();
  /**
   *
   *
   * <pre>
   * Amount of time that this build should be allowed to run, to second
   * granularity. If this amount of time elapses, work on the build will cease
   * and the build status will be `TIMEOUT`.
   * Default time is ten minutes.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 12;</code>
   */
  com.google.protobuf.Duration getTimeout();
  /**
   *
   *
   * <pre>
   * Amount of time that this build should be allowed to run, to second
   * granularity. If this amount of time elapses, work on the build will cease
   * and the build status will be `TIMEOUT`.
   * Default time is ten minutes.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 12;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeoutOrBuilder();

  /**
   *
   *
   * <pre>
   * A list of images to be pushed upon the successful completion of all build
   * steps.
   * The images are pushed using the builder service account's credentials.
   * The digests of the pushed images will be stored in the `Build` resource's
   * results field.
   * If any of the images fail to be pushed, the build status is marked
   * `FAILURE`.
   * </pre>
   *
   * <code>repeated string images = 13;</code>
   */
  java.util.List<java.lang.String> getImagesList();
  /**
   *
   *
   * <pre>
   * A list of images to be pushed upon the successful completion of all build
   * steps.
   * The images are pushed using the builder service account's credentials.
   * The digests of the pushed images will be stored in the `Build` resource's
   * results field.
   * If any of the images fail to be pushed, the build status is marked
   * `FAILURE`.
   * </pre>
   *
   * <code>repeated string images = 13;</code>
   */
  int getImagesCount();
  /**
   *
   *
   * <pre>
   * A list of images to be pushed upon the successful completion of all build
   * steps.
   * The images are pushed using the builder service account's credentials.
   * The digests of the pushed images will be stored in the `Build` resource's
   * results field.
   * If any of the images fail to be pushed, the build status is marked
   * `FAILURE`.
   * </pre>
   *
   * <code>repeated string images = 13;</code>
   */
  java.lang.String getImages(int index);
  /**
   *
   *
   * <pre>
   * A list of images to be pushed upon the successful completion of all build
   * steps.
   * The images are pushed using the builder service account's credentials.
   * The digests of the pushed images will be stored in the `Build` resource's
   * results field.
   * If any of the images fail to be pushed, the build status is marked
   * `FAILURE`.
   * </pre>
   *
   * <code>repeated string images = 13;</code>
   */
  com.google.protobuf.ByteString getImagesBytes(int index);

  /**
   *
   *
   * <pre>
   * Artifacts produced by the build that should be uploaded upon
   * successful completion of all build steps.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Artifacts artifacts = 37;</code>
   */
  boolean hasArtifacts();
  /**
   *
   *
   * <pre>
   * Artifacts produced by the build that should be uploaded upon
   * successful completion of all build steps.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Artifacts artifacts = 37;</code>
   */
  com.google.cloudbuild.v1.Artifacts getArtifacts();
  /**
   *
   *
   * <pre>
   * Artifacts produced by the build that should be uploaded upon
   * successful completion of all build steps.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Artifacts artifacts = 37;</code>
   */
  com.google.cloudbuild.v1.ArtifactsOrBuilder getArtifactsOrBuilder();

  /**
   *
   *
   * <pre>
   * Google Cloud Storage bucket where logs should be written (see
   * [Bucket Name
   * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
   * Logs file names will be of the format `${logs_bucket}/log-${build_id}.txt`.
   * </pre>
   *
   * <code>string logs_bucket = 19;</code>
   */
  java.lang.String getLogsBucket();
  /**
   *
   *
   * <pre>
   * Google Cloud Storage bucket where logs should be written (see
   * [Bucket Name
   * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
   * Logs file names will be of the format `${logs_bucket}/log-${build_id}.txt`.
   * </pre>
   *
   * <code>string logs_bucket = 19;</code>
   */
  com.google.protobuf.ByteString getLogsBucketBytes();

  /**
   *
   *
   * <pre>
   * Output only. A permanent fixed identifier for source.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.SourceProvenance source_provenance = 21;</code>
   */
  boolean hasSourceProvenance();
  /**
   *
   *
   * <pre>
   * Output only. A permanent fixed identifier for source.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.SourceProvenance source_provenance = 21;</code>
   */
  com.google.cloudbuild.v1.SourceProvenance getSourceProvenance();
  /**
   *
   *
   * <pre>
   * Output only. A permanent fixed identifier for source.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.SourceProvenance source_provenance = 21;</code>
   */
  com.google.cloudbuild.v1.SourceProvenanceOrBuilder getSourceProvenanceOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The ID of the `BuildTrigger` that triggered this build, if it
   * was triggered automatically.
   * </pre>
   *
   * <code>string build_trigger_id = 22;</code>
   */
  java.lang.String getBuildTriggerId();
  /**
   *
   *
   * <pre>
   * Output only. The ID of the `BuildTrigger` that triggered this build, if it
   * was triggered automatically.
   * </pre>
   *
   * <code>string build_trigger_id = 22;</code>
   */
  com.google.protobuf.ByteString getBuildTriggerIdBytes();

  /**
   *
   *
   * <pre>
   * Special options for this build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.BuildOptions options = 23;</code>
   */
  boolean hasOptions();
  /**
   *
   *
   * <pre>
   * Special options for this build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.BuildOptions options = 23;</code>
   */
  com.google.cloudbuild.v1.BuildOptions getOptions();
  /**
   *
   *
   * <pre>
   * Special options for this build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.BuildOptions options = 23;</code>
   */
  com.google.cloudbuild.v1.BuildOptionsOrBuilder getOptionsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. URL to logs for this build in Google Cloud Console.
   * </pre>
   *
   * <code>string log_url = 25;</code>
   */
  java.lang.String getLogUrl();
  /**
   *
   *
   * <pre>
   * Output only. URL to logs for this build in Google Cloud Console.
   * </pre>
   *
   * <code>string log_url = 25;</code>
   */
  com.google.protobuf.ByteString getLogUrlBytes();

  /**
   *
   *
   * <pre>
   * Substitutions data for `Build` resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; substitutions = 29;</code>
   */
  int getSubstitutionsCount();
  /**
   *
   *
   * <pre>
   * Substitutions data for `Build` resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; substitutions = 29;</code>
   */
  boolean containsSubstitutions(java.lang.String key);
  /** Use {@link #getSubstitutionsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getSubstitutions();
  /**
   *
   *
   * <pre>
   * Substitutions data for `Build` resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; substitutions = 29;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getSubstitutionsMap();
  /**
   *
   *
   * <pre>
   * Substitutions data for `Build` resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; substitutions = 29;</code>
   */
  java.lang.String getSubstitutionsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Substitutions data for `Build` resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; substitutions = 29;</code>
   */
  java.lang.String getSubstitutionsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Tags for annotation of a `Build`. These are not docker tags.
   * </pre>
   *
   * <code>repeated string tags = 31;</code>
   */
  java.util.List<java.lang.String> getTagsList();
  /**
   *
   *
   * <pre>
   * Tags for annotation of a `Build`. These are not docker tags.
   * </pre>
   *
   * <code>repeated string tags = 31;</code>
   */
  int getTagsCount();
  /**
   *
   *
   * <pre>
   * Tags for annotation of a `Build`. These are not docker tags.
   * </pre>
   *
   * <code>repeated string tags = 31;</code>
   */
  java.lang.String getTags(int index);
  /**
   *
   *
   * <pre>
   * Tags for annotation of a `Build`. These are not docker tags.
   * </pre>
   *
   * <code>repeated string tags = 31;</code>
   */
  com.google.protobuf.ByteString getTagsBytes(int index);

  /**
   *
   *
   * <pre>
   * Secrets to decrypt using Cloud Key Management Service.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Secret secrets = 32;</code>
   */
  java.util.List<com.google.cloudbuild.v1.Secret> getSecretsList();
  /**
   *
   *
   * <pre>
   * Secrets to decrypt using Cloud Key Management Service.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Secret secrets = 32;</code>
   */
  com.google.cloudbuild.v1.Secret getSecrets(int index);
  /**
   *
   *
   * <pre>
   * Secrets to decrypt using Cloud Key Management Service.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Secret secrets = 32;</code>
   */
  int getSecretsCount();
  /**
   *
   *
   * <pre>
   * Secrets to decrypt using Cloud Key Management Service.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Secret secrets = 32;</code>
   */
  java.util.List<? extends com.google.cloudbuild.v1.SecretOrBuilder> getSecretsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Secrets to decrypt using Cloud Key Management Service.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Secret secrets = 32;</code>
   */
  com.google.cloudbuild.v1.SecretOrBuilder getSecretsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Stores timing information for phases of the build. Valid keys
   * are:
   * * BUILD: time to execute all build steps
   * * PUSH: time to push all specified images.
   * * FETCHSOURCE: time to fetch source.
   * If the build does not specify source or images,
   * these keys will not be included.
   * </pre>
   *
   * <code>map&lt;string, .google.devtools.cloudbuild.v1.TimeSpan&gt; timing = 33;</code>
   */
  int getTimingCount();
  /**
   *
   *
   * <pre>
   * Output only. Stores timing information for phases of the build. Valid keys
   * are:
   * * BUILD: time to execute all build steps
   * * PUSH: time to push all specified images.
   * * FETCHSOURCE: time to fetch source.
   * If the build does not specify source or images,
   * these keys will not be included.
   * </pre>
   *
   * <code>map&lt;string, .google.devtools.cloudbuild.v1.TimeSpan&gt; timing = 33;</code>
   */
  boolean containsTiming(java.lang.String key);
  /** Use {@link #getTimingMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloudbuild.v1.TimeSpan> getTiming();
  /**
   *
   *
   * <pre>
   * Output only. Stores timing information for phases of the build. Valid keys
   * are:
   * * BUILD: time to execute all build steps
   * * PUSH: time to push all specified images.
   * * FETCHSOURCE: time to fetch source.
   * If the build does not specify source or images,
   * these keys will not be included.
   * </pre>
   *
   * <code>map&lt;string, .google.devtools.cloudbuild.v1.TimeSpan&gt; timing = 33;</code>
   */
  java.util.Map<java.lang.String, com.google.cloudbuild.v1.TimeSpan> getTimingMap();
  /**
   *
   *
   * <pre>
   * Output only. Stores timing information for phases of the build. Valid keys
   * are:
   * * BUILD: time to execute all build steps
   * * PUSH: time to push all specified images.
   * * FETCHSOURCE: time to fetch source.
   * If the build does not specify source or images,
   * these keys will not be included.
   * </pre>
   *
   * <code>map&lt;string, .google.devtools.cloudbuild.v1.TimeSpan&gt; timing = 33;</code>
   */
  com.google.cloudbuild.v1.TimeSpan getTimingOrDefault(
      java.lang.String key, com.google.cloudbuild.v1.TimeSpan defaultValue);
  /**
   *
   *
   * <pre>
   * Output only. Stores timing information for phases of the build. Valid keys
   * are:
   * * BUILD: time to execute all build steps
   * * PUSH: time to push all specified images.
   * * FETCHSOURCE: time to fetch source.
   * If the build does not specify source or images,
   * these keys will not be included.
   * </pre>
   *
   * <code>map&lt;string, .google.devtools.cloudbuild.v1.TimeSpan&gt; timing = 33;</code>
   */
  com.google.cloudbuild.v1.TimeSpan getTimingOrThrow(java.lang.String key);
}
