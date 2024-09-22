package entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "account_transfer", schema = "transfer")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotNull
    @Column(name = "account_number", length = 20)
    Long accountNumber;

    @NotNull
    @Column(name = "amount")
    BigDecimal amount;

    @Column(name = "purpose")
    String purpose;

    @NotNull
    @Column(name = "account_details_id")
    Long accountDetailsId;
}
