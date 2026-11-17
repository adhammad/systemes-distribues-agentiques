package ma.tp.msimplementation.repositories;

import ma.tp.msimplementation.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
}
