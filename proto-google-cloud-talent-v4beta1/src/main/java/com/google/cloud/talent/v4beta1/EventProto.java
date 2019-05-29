// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/event.proto

package com.google.cloud.talent.v4beta1;

public final class EventProto {
  private EventProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ClientEvent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ClientEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_JobEvent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_JobEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ProfileEvent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ProfileEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/cloud/talent/v4beta1/event.prot"
          + "o\022\033google.cloud.talent.v4beta1\032\034google/a"
          + "pi/annotations.proto\032\037google/protobuf/ti"
          + "mestamp.proto\"\202\002\n\013ClientEvent\022\022\n\nrequest"
          + "_id\030\001 \001(\t\022\020\n\010event_id\030\002 \001(\t\022/\n\013create_ti"
          + "me\030\004 \001(\0132\032.google.protobuf.Timestamp\022:\n\t"
          + "job_event\030\005 \001(\0132%.google.cloud.talent.v4"
          + "beta1.JobEventH\000\022B\n\rprofile_event\030\006 \001(\0132"
          + ").google.cloud.talent.v4beta1.ProfileEve"
          + "ntH\000\022\023\n\013event_notes\030\t \001(\tB\007\n\005event\"\354\003\n\010J"
          + "obEvent\022@\n\004type\030\001 \001(\01622.google.cloud.tal"
          + "ent.v4beta1.JobEvent.JobEventType\022\014\n\004job"
          + "s\030\002 \003(\t\022\017\n\007profile\030\003 \001(\t\"\376\002\n\014JobEventTyp"
          + "e\022\036\n\032JOB_EVENT_TYPE_UNSPECIFIED\020\000\022\016\n\nIMP"
          + "RESSION\020\001\022\010\n\004VIEW\020\002\022\021\n\rVIEW_REDIRECT\020\003\022\025"
          + "\n\021APPLICATION_START\020\004\022\026\n\022APPLICATION_FIN"
          + "ISH\020\005\022 \n\034APPLICATION_QUICK_SUBMISSION\020\006\022"
          + "\030\n\024APPLICATION_REDIRECT\020\007\022!\n\035APPLICATION"
          + "_START_FROM_SEARCH\020\010\022$\n APPLICATION_REDI"
          + "RECT_FROM_SEARCH\020\t\022\036\n\032APPLICATION_COMPAN"
          + "Y_SUBMIT\020\n\022\014\n\010BOOKMARK\020\013\022\020\n\014NOTIFICATION"
          + "\020\014\022\t\n\005HIRED\020\r\022\013\n\007SENT_CV\020\016\022\025\n\021INTERVIEW_"
          + "GRANTED\020\017\"\330\001\n\014ProfileEvent\022H\n\004type\030\001 \001(\016"
          + "2:.google.cloud.talent.v4beta1.ProfileEv"
          + "ent.ProfileEventType\022\020\n\010profiles\030\002 \003(\t\022\014"
          + "\n\004jobs\030\006 \003(\t\"^\n\020ProfileEventType\022\"\n\036PROF"
          + "ILE_EVENT_TYPE_UNSPECIFIED\020\000\022\016\n\nIMPRESSI"
          + "ON\020\001\022\010\n\004VIEW\020\002\022\014\n\010BOOKMARK\020\003Bx\n\037com.goog"
          + "le.cloud.talent.v4beta1B\nEventProtoP\001ZAg"
          + "oogle.golang.org/genproto/googleapis/clo"
          + "ud/talent/v4beta1;talent\242\002\003CTSb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_talent_v4beta1_ClientEvent_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_ClientEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ClientEvent_descriptor,
            new java.lang.String[] {
              "RequestId",
              "EventId",
              "CreateTime",
              "JobEvent",
              "ProfileEvent",
              "EventNotes",
              "Event",
            });
    internal_static_google_cloud_talent_v4beta1_JobEvent_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4beta1_JobEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_JobEvent_descriptor,
            new java.lang.String[] {
              "Type", "Jobs", "Profile",
            });
    internal_static_google_cloud_talent_v4beta1_ProfileEvent_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_talent_v4beta1_ProfileEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ProfileEvent_descriptor,
            new java.lang.String[] {
              "Type", "Profiles", "Jobs",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
