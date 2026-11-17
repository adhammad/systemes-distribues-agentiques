package ma.tp.msimplementation.controllers;

import ma.tp.msimplementation.dtos.BankAccountRequestDTO;
import ma.tp.msimplementation.dtos.BankAccountResponseDTO;
import ma.tp.msimplementation.entities.BankAccount;
import ma.tp.msimplementation.repositories.BankAccountRepository;
import ma.tp.msimplementation.services.BankAccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/accounts")
public class BankAccountController {

    private final BankAccountService bankAccountService;

    public BankAccountController(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }
    @GetMapping("")
    private List<BankAccountResponseDTO> getAllBankAccounts() {
        return bankAccountService.getAllBankAccounts();
    }

    @GetMapping("/{id}")
    private BankAccountResponseDTO getBankAccountById(@PathVariable String id) {
        return bankAccountService.getBankAccountById(id);
    }


    @DeleteMapping("/{id}")
    private String deleteBankAccount(@PathVariable String id) {
        return bankAccountService.deleteBankAccount(id);
    }

    @PostMapping("/new")
    private BankAccountResponseDTO saveBankAccount(@RequestBody BankAccountRequestDTO bankAccount) {
        return bankAccountService.addAccount(bankAccount);
    }

    @PutMapping("/{id}")
    private BankAccountResponseDTO updateBankAccount(@PathVariable String id, @RequestBody BankAccountRequestDTO bankAccount) {
        return bankAccountService.updateBankAccount(id, bankAccount);
    }

}
