package item26.generic;

import org.junit.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class AccountRepositoryTest {

    @Test
    public void findById() {
        AccountRepository accountRepository = new AccountRepository();
        Account account = new Account(1L, "whiteship");
        accountRepository.add(account);

        Optional<Account> byId = accountRepository.findById(1L);
        assertTrue(byId.isPresent());
    }

}