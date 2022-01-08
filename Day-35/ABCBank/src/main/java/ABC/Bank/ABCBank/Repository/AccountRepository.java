package ABC.Bank.ABCBank.Repository;

import ABC.Bank.ABCBank.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
