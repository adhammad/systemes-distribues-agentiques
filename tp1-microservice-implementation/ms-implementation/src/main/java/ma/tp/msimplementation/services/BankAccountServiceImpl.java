package ma.tp.msimplementation.services;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import ma.tp.msimplementation.dtos.BankAccountRequestDTO;
import ma.tp.msimplementation.dtos.BankAccountResponseDTO;
import ma.tp.msimplementation.entities.BankAccount;
import ma.tp.msimplementation.mapper.BankAccountMapper;
import ma.tp.msimplementation.repositories.BankAccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@Service
@Transactional
public class BankAccountServiceImpl implements BankAccountService {

    private final BankAccountRepository bankAccountRepository;
    private final BankAccountMapper bankAccountMapper;

    public BankAccountServiceImpl(BankAccountRepository bankAccountRepository, BankAccountMapper bankAccountMapper) {
        this.bankAccountRepository = bankAccountRepository;
        this.bankAccountMapper = bankAccountMapper;
    }

    @Override
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDto) {
        return bankAccountMapper.toBankAccountResponseDTO(bankAccountRepository.save(bankAccountMapper.toBankAccount(bankAccountDto)));
    }

    @Override
    public BankAccountResponseDTO updateBankAccount(String id, BankAccountRequestDTO bankAccountDto) {
        return bankAccountRepository.findById(id)
                .map(existing -> {
                    if(bankAccountDto.getAccountType() != null) existing.setAccountType(bankAccountDto.getAccountType());
                    if(bankAccountDto.getBalance() != null) existing.setBalance(bankAccountDto.getBalance());
                    if(bankAccountDto.getCurrency() != null) existing.setCurrency(bankAccountDto.getCurrency());
                    BankAccount updated = bankAccountRepository.save(existing);
                    return bankAccountMapper.toBankAccountResponseDTO(updated);
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Bank account not found"));
    }

    @Override
    public BankAccountResponseDTO getBankAccountById(String id) {
        return bankAccountRepository.findById(id).map(
                bankAccountMapper::toBankAccountResponseDTO
        ).orElseThrow(this::notFound);
    }

    @Override
    public List<BankAccountResponseDTO> getAllBankAccounts() {
        return bankAccountMapper.toBankAccountResponseDTOList(bankAccountRepository.findAll());
    }

    @Override
    public String deleteBankAccount(String id) {
        if (!bankAccountRepository.existsById(id)) {
            throw notFound();
        }
        bankAccountRepository.deleteById(id);
        return "Bank account with ID " + id + " deleted successfully";
    }

    private ResponseStatusException notFound() {
        return new ResponseStatusException(HttpStatus.NOT_FOUND, "Bank account not found");
    }
}
