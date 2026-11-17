package ma.tp.msimplementation;

import ma.tp.msimplementation.entities.BankAccount;
import ma.tp.msimplementation.enums.AccountType;
import ma.tp.msimplementation.repositories.BankAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class MsImplementationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsImplementationApplication.class, args);
	}


    @Bean
    CommandLineRunner Start(BankAccountRepository bankAccountRepository) {
        return args -> {
            for (int i = 1; i <= 30; i++) {
                BankAccount account = BankAccount.builder()
                        .id(UUID.randomUUID().toString())
                        .accountType(Math.random() < 0.5 ? AccountType.DEBIT : AccountType.CREDIT)
                        .balance(Math.random() * 10000)
                        .currency("MAD")
                        .createdAt(new Date())
                        .build();
                bankAccountRepository.save(account);
            }


        };
    }

}
