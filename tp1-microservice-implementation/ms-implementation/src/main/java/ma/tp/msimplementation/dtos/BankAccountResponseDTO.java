package ma.tp.msimplementation.dtos;

import lombok.*;
import ma.tp.msimplementation.enums.AccountType;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BankAccountResponseDTO {
    private String id;
    private Date createdAt;
    private Double balance;
    private String currency;
    private AccountType accountType;
}
