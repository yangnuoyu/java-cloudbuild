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

public interface NetworkOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.Network)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Project id containing the defined network and subnetwork. For a peered VPC,
   * this will be the same as the project_id in which the workers are created.
   * For a shared VPC, this will be the project sharing the network with the
   * project_id project in which workers will be created. For custom workers
   * with no VPC, this will be the same as project_id.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Project id containing the defined network and subnetwork. For a peered VPC,
   * this will be the same as the project_id in which the workers are created.
   * For a shared VPC, this will be the project sharing the network with the
   * project_id project in which workers will be created. For custom workers
   * with no VPC, this will be the same as project_id.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Network on which the workers are created.
   * "default" network is used if empty.
   * </pre>
   *
   * <code>string network = 2;</code>
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * Network on which the workers are created.
   * "default" network is used if empty.
   * </pre>
   *
   * <code>string network = 2;</code>
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * Subnetwork on which the workers are created.
   * "default" subnetwork is used if empty.
   * </pre>
   *
   * <code>string subnetwork = 3;</code>
   */
  java.lang.String getSubnetwork();
  /**
   *
   *
   * <pre>
   * Subnetwork on which the workers are created.
   * "default" subnetwork is used if empty.
   * </pre>
   *
   * <code>string subnetwork = 3;</code>
   */
  com.google.protobuf.ByteString getSubnetworkBytes();
}
