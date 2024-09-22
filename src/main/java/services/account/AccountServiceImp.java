package services.account;

import entities.Account;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import repository.AccountRepository;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityNotFoundException;



@Service
public class AccountServiceImp implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImp(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account updateAccount(Long id, Account accountRequest) {
        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Account not found with id " + id));

        account.setAccountNumber(accountRequest.getAccountNumber());
        account.setAmount(accountRequest.getAmount());
        account.setPurpose(accountRequest.getPurpose());
        return accountRepository.save(account);
    }

    @Override
    public void deleteAccount(Long id) {
    Account account = accountRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Account not found with id " + id));

    accountRepository.delete(account);
    }

    @Override
    public Account getAccountById(Long id) {
                Optional<Account> result = accountRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        }else {
            throw new EntityNotFoundException("Account not found with id " + id);
        }
    }


//    @Override
//    public List<Account> getAllAccounts() {
//        return accountRepository.findAll();
//    }
//
//    @Override
//    public Account createAccount(Account account) {
//        return accountRepository.save(account);
//    }
//
//    @Override
//    public Account updateAccount(long id, Account accountRequest) {
//        Account account = accountRepository.findById(id)
//                .orElseThrow(() -> new EntityNotFoundException("Account not found with id " + id));
//
//        account.setAccountNumber(accountRequest.getAccountNumber());
//        account.setAmount(accountRequest.getAmount());
//        account.setPurpose(accountRequest.getPurpose());
//        return accountRepository.save(account);
//    }
//
//    @Override
//    public void deleteAccount(long id) {
//    Account account = accountRepository.findById(id)
//            .orElseThrow(() -> new EntityNotFoundException("Account not found with id " + id));
//
//    accountRepository.delete(account);
//    }
//
//    @Override
//    public Account getAccountById(long id) {
//        Optional<Account> result = accountRepository.findById(id);
//        if (result.isPresent()) {
//            return result.get();
//        }else {
//            throw new EntityNotFoundException("Account not found with id " + id);
//        }
//    }
}
