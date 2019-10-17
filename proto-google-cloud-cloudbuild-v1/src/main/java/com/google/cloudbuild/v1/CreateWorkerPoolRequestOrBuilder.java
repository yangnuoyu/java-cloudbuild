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

public interface CreateWorkerPoolRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.CreateWorkerPoolRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * ID of the parent project.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * ID of the parent project.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * `WorkerPool` resource to create.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.WorkerPool worker_pool = 2;</code>
   */
  boolean hasWorkerPool();
  /**
   *
   *
   * <pre>
   * `WorkerPool` resource to create.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.WorkerPool worker_pool = 2;</code>
   */
  com.google.cloudbuild.v1.WorkerPool getWorkerPool();
  /**
   *
   *
   * <pre>
   * `WorkerPool` resource to create.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.WorkerPool worker_pool = 2;</code>
   */
  com.google.cloudbuild.v1.WorkerPoolOrBuilder getWorkerPoolOrBuilder();
}
