package ma.tp.msimplementation.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.tp.msimplementation.enums.AccountType;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BankAccountRequestDTO {
    private Double balance;
    private String currency;
    private AccountType accountType;
}
