/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/talent/v4beta1/profile.proto

package com.google.cloud.talent.v4beta1;

public interface EmploymentRecordOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.EmploymentRecord)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Start date of the employment.
   * </pre>
   *
   * <code>.google.type.Date start_date = 1;</code>
   *
   * @return Whether the startDate field is set.
   */
  boolean hasStartDate();
  /**
   *
   *
   * <pre>
   * Start date of the employment.
   * </pre>
   *
   * <code>.google.type.Date start_date = 1;</code>
   *
   * @return The startDate.
   */
  com.google.type.Date getStartDate();
  /**
   *
   *
   * <pre>
   * Start date of the employment.
   * </pre>
   *
   * <code>.google.type.Date start_date = 1;</code>
   */
  com.google.type.DateOrBuilder getStartDateOrBuilder();

  /**
   *
   *
   * <pre>
   * End date of the employment.
   * </pre>
   *
   * <code>.google.type.Date end_date = 2;</code>
   *
   * @return Whether the endDate field is set.
   */
  boolean hasEndDate();
  /**
   *
   *
   * <pre>
   * End date of the employment.
   * </pre>
   *
   * <code>.google.type.Date end_date = 2;</code>
   *
   * @return The endDate.
   */
  com.google.type.Date getEndDate();
  /**
   *
   *
   * <pre>
   * End date of the employment.
   * </pre>
   *
   * <code>.google.type.Date end_date = 2;</code>
   */
  com.google.type.DateOrBuilder getEndDateOrBuilder();

  /**
   *
   *
   * <pre>
   * The name of the employer company/organization.
   * For example, "Google", "Alphabet", and so on.
   * Number of characters allowed is 250.
   * </pre>
   *
   * <code>string employer_name = 3;</code>
   *
   * @return The employerName.
   */
  java.lang.String getEmployerName();
  /**
   *
   *
   * <pre>
   * The name of the employer company/organization.
   * For example, "Google", "Alphabet", and so on.
   * Number of characters allowed is 250.
   * </pre>
   *
   * <code>string employer_name = 3;</code>
   *
   * @return The bytes for employerName.
   */
  com.google.protobuf.ByteString getEmployerNameBytes();

  /**
   *
   *
   * <pre>
   * The division name of the employment.
   * For example, division, department, client, and so on.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string division_name = 4;</code>
   *
   * @return The divisionName.
   */
  java.lang.String getDivisionName();
  /**
   *
   *
   * <pre>
   * The division name of the employment.
   * For example, division, department, client, and so on.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string division_name = 4;</code>
   *
   * @return The bytes for divisionName.
   */
  com.google.protobuf.ByteString getDivisionNameBytes();

  /**
   *
   *
   * <pre>
   * The physical address of the employer.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Address address = 5;</code>
   *
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   *
   *
   * <pre>
   * The physical address of the employer.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Address address = 5;</code>
   *
   * @return The address.
   */
  com.google.cloud.talent.v4beta1.Address getAddress();
  /**
   *
   *
   * <pre>
   * The physical address of the employer.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Address address = 5;</code>
   */
  com.google.cloud.talent.v4beta1.AddressOrBuilder getAddressOrBuilder();

  /**
   *
   *
   * <pre>
   * The job title of the employment.
   * For example, "Software Engineer", "Data Scientist", and so on.
   * Number of characters allowed is 250.
   * </pre>
   *
   * <code>string job_title = 6;</code>
   *
   * @return The jobTitle.
   */
  java.lang.String getJobTitle();
  /**
   *
   *
   * <pre>
   * The job title of the employment.
   * For example, "Software Engineer", "Data Scientist", and so on.
   * Number of characters allowed is 250.
   * </pre>
   *
   * <code>string job_title = 6;</code>
   *
   * @return The bytes for jobTitle.
   */
  com.google.protobuf.ByteString getJobTitleBytes();

  /**
   *
   *
   * <pre>
   * The description of job content.
   * Number of characters allowed is 100,000.
   * </pre>
   *
   * <code>string job_description = 7;</code>
   *
   * @return The jobDescription.
   */
  java.lang.String getJobDescription();
  /**
   *
   *
   * <pre>
   * The description of job content.
   * Number of characters allowed is 100,000.
   * </pre>
   *
   * <code>string job_description = 7;</code>
   *
   * @return The bytes for jobDescription.
   */
  com.google.protobuf.ByteString getJobDescriptionBytes();

  /**
   *
   *
   * <pre>
   * If the jobs is a supervisor position.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue is_supervisor = 8;</code>
   *
   * @return Whether the isSupervisor field is set.
   */
  boolean hasIsSupervisor();
  /**
   *
   *
   * <pre>
   * If the jobs is a supervisor position.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue is_supervisor = 8;</code>
   *
   * @return The isSupervisor.
   */
  com.google.protobuf.BoolValue getIsSupervisor();
  /**
   *
   *
   * <pre>
   * If the jobs is a supervisor position.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue is_supervisor = 8;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getIsSupervisorOrBuilder();

  /**
   *
   *
   * <pre>
   * If this employment is self-employed.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue is_self_employed = 9;</code>
   *
   * @return Whether the isSelfEmployed field is set.
   */
  boolean hasIsSelfEmployed();
  /**
   *
   *
   * <pre>
   * If this employment is self-employed.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue is_self_employed = 9;</code>
   *
   * @return The isSelfEmployed.
   */
  com.google.protobuf.BoolValue getIsSelfEmployed();
  /**
   *
   *
   * <pre>
   * If this employment is self-employed.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue is_self_employed = 9;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getIsSelfEmployedOrBuilder();

  /**
   *
   *
   * <pre>
   * If this employment is current.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue is_current = 10;</code>
   *
   * @return Whether the isCurrent field is set.
   */
  boolean hasIsCurrent();
  /**
   *
   *
   * <pre>
   * If this employment is current.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue is_current = 10;</code>
   *
   * @return The isCurrent.
   */
  com.google.protobuf.BoolValue getIsCurrent();
  /**
   *
   *
   * <pre>
   * If this employment is current.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue is_current = 10;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getIsCurrentOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The job title snippet shows how the [job_title][google.cloud.talent.v4beta1.EmploymentRecord.job_title] is related
   * to a search query. It's empty if the [job_title][google.cloud.talent.v4beta1.EmploymentRecord.job_title] isn't related to the
   * search query.
   * </pre>
   *
   * <code>string job_title_snippet = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The jobTitleSnippet.
   */
  java.lang.String getJobTitleSnippet();
  /**
   *
   *
   * <pre>
   * Output only. The job title snippet shows how the [job_title][google.cloud.talent.v4beta1.EmploymentRecord.job_title] is related
   * to a search query. It's empty if the [job_title][google.cloud.talent.v4beta1.EmploymentRecord.job_title] isn't related to the
   * search query.
   * </pre>
   *
   * <code>string job_title_snippet = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for jobTitleSnippet.
   */
  com.google.protobuf.ByteString getJobTitleSnippetBytes();

  /**
   *
   *
   * <pre>
   * Output only. The job description snippet shows how the [job_description][google.cloud.talent.v4beta1.EmploymentRecord.job_description]
   * is related to a search query. It's empty if the [job_description][google.cloud.talent.v4beta1.EmploymentRecord.job_description] isn't
   * related to the search query.
   * </pre>
   *
   * <code>string job_description_snippet = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The jobDescriptionSnippet.
   */
  java.lang.String getJobDescriptionSnippet();
  /**
   *
   *
   * <pre>
   * Output only. The job description snippet shows how the [job_description][google.cloud.talent.v4beta1.EmploymentRecord.job_description]
   * is related to a search query. It's empty if the [job_description][google.cloud.talent.v4beta1.EmploymentRecord.job_description] isn't
   * related to the search query.
   * </pre>
   *
   * <code>string job_description_snippet = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for jobDescriptionSnippet.
   */
  com.google.protobuf.ByteString getJobDescriptionSnippetBytes();

  /**
   *
   *
   * <pre>
   * Output only. The employer name snippet shows how the [employer_name][google.cloud.talent.v4beta1.EmploymentRecord.employer_name] is
   * related to a search query. It's empty if the [employer_name][google.cloud.talent.v4beta1.EmploymentRecord.employer_name] isn't
   * related to the search query.
   * </pre>
   *
   * <code>string employer_name_snippet = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The employerNameSnippet.
   */
  java.lang.String getEmployerNameSnippet();
  /**
   *
   *
   * <pre>
   * Output only. The employer name snippet shows how the [employer_name][google.cloud.talent.v4beta1.EmploymentRecord.employer_name] is
   * related to a search query. It's empty if the [employer_name][google.cloud.talent.v4beta1.EmploymentRecord.employer_name] isn't
   * related to the search query.
   * </pre>
   *
   * <code>string employer_name_snippet = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for employerNameSnippet.
   */
  com.google.protobuf.ByteString getEmployerNameSnippetBytes();
}
