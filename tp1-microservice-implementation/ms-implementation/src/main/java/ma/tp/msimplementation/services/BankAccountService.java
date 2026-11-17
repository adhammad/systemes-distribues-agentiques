package ma.tp.msimplementation.services;

import ma.tp.msimplementation.dtos.BankAccountRequestDTO;
import ma.tp.msimplementation.dtos.BankAccountResponseDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface BankAccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccount);

    public BankAccountResponseDTO updateBankAccount(@PathVariable String id , @RequestBody BankAccountRequestDTO bankAccount);

    public BankAccountResponseDTO getBankAccountById(@PathVariable String id);

    public List<BankAccountResponseDTO> getAllBankAccounts();

    public String deleteBankAccount(@PathVariable String id);
}
