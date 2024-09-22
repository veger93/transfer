//package dto;
//
//import com.fasterxml.jackson.annotation.JsonProperty;
//import lombok.*;
//import lombok.experimental.FieldDefaults;
//
//import java.sql.Timestamp;
//
//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@FieldDefaults(level = AccessLevel.PRIVATE)
//public class AuditDto {
//
//    Long id;
//    @JsonProperty("entity_type")
//    String entityType;
//    @JsonProperty("operation_type")
//    String operationType;
//    @JsonProperty("created_by")
//    String createdBy;
//    @JsonProperty("modified_by")
//    String modifiedBy;
//    @JsonProperty("created_at")
//    Timestamp createdAt;
//    @JsonProperty("modified_at")
//    Timestamp modifiedAt;
//    @JsonProperty("new_entity_json")
//    String newEntityJson;
//    @JsonProperty("entity_json")
//    String entityJson;
//}
