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
@Table(name = "card_transfer", schema = "transfer")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotNull
    @Column(name = "card_number", precision = 16)
    Long cardNumber;

    @NotNull
    @Column(name = "amount")
    BigDecimal amount;

    @Column(name = "purpose")
    String purpose;

    @NotNull
    @Column(name = "account_details_id")
    Long accountDetailsId;
}
