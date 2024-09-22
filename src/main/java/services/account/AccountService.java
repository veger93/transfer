package services.account;

import entities.Account;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AccountService {

    List<Account> getAllAccounts();
    Account createAccount(Account account);
    Account updateAccount(Long id, Account account);
    void deleteAccount(Long id);
    Account getAccountById(Long id);
}
