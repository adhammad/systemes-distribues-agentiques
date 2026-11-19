package ma.tp.msimplementation.controllers;

import ma.tp.msimplementation.dtos.BankAccountRequestDTO;
import ma.tp.msimplementation.dtos.BankAccountResponseDTO;
import ma.tp.msimplementation.entities.BankAccount;
import ma.tp.msimplementation.services.BankAccountService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class BankAccountGraphQLController {

    private final BankAccountService bankAccountService;

    public BankAccountGraphQLController(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }
    @QueryMapping
    private List<BankAccountResponseDTO> getAllBankAccounts() {
        return bankAccountService.getAllBankAccounts();
    }

    @QueryMapping
    private BankAccountResponseDTO getBankAccountById(@Argument  String id) {
        return bankAccountService.getBankAccountById(id);
    }


    @MutationMapping
    private String deleteBankAccount(@Argument String id) {
        return bankAccountService.deleteBankAccount(id);
    }

    @MutationMapping
    private BankAccountResponseDTO saveBankAccount(@Argument BankAccountRequestDTO bankAccount) {
        return bankAccountService.addAccount(bankAccount);
    }

    @MutationMapping
    private BankAccountResponseDTO updateBankAccount(@Argument String id, @Argument BankAccountRequestDTO bankAccount) {
        return bankAccountService.updateBankAccount(id, bankAccount);
    }


    @SchemaMapping
    public String createdAt(BankAccountResponseDTO account) {
        return account.getCreatedAt() == null ? null
                : account.getCreatedAt().toInstant().toString();
    }
}
