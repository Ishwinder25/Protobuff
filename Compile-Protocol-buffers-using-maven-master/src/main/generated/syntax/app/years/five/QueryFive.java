// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EduCostQueryFive.proto

package syntax.app.years.five;

public final class QueryFive {
  private QueryFive() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_years_yearsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_years_yearsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_years_yearsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_years_yearsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026EduCostQueryFive.proto\022\005years\":\n\014years" +
      "Request\022\014\n\004Year\030\001 \001(\001\022\014\n\004Type\030\002 \001(\t\022\016\n\006L" +
      "ength\030\003 \001(\t\" \n\ryearsResponse\022\017\n\007message\030" +
      "\001 \001(\t2F\n\020generatorservice\0222\n\005Query\022\023.yea" +
      "rs.yearsRequest\032\024.years.yearsResponseB$\n" +
      "\025syntax.app.years.fiveB\tQueryFiveP\001b\006pro" +
      "to3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_years_yearsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_years_yearsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_years_yearsRequest_descriptor,
        new java.lang.String[] { "Year", "Type", "Length", });
    internal_static_years_yearsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_years_yearsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_years_yearsResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
