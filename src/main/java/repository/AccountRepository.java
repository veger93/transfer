package repository;

import entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {// Custom методы, например, найти все счета по номеру телефона

//    List<Account> findByAccountNumber(Long accountNumber);
}
