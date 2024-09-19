package entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "audit", schema = "transfer")
public class Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotNull
    @Column(name = "entity_type", length = 40)
    String entityType;

    @NotNull
    @Column(name = "operation_type", length = 255)
    String operationType;

    @NotNull
    @Column(name = "created_by", length = 255)
    String createdBy;

    @Column(name = "modified_by", length = 255)
    String modifiedBy;

    @NotNull
    @Column(name = "created_at")
    Timestamp createdAt;

    @Column(name = "modified_at")
    Timestamp modifiedAt;

    //private Instant createAt = Instant.now();

    @Column(name = "new_entity_json")
    String newEntityJson;

    @NotNull
    @Column(name = "entity_json")
    String entityJson;
}
