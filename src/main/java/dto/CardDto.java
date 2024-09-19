package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CardDto {

    Long id;
    @JsonProperty("card_number")
    Long cardNumber;
    BigDecimal amount;
    String purpose;
    @JsonProperty("account_details_id")
    Long accountDetailsId;
}
