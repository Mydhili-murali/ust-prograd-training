package ABC.Bank.ABCBank.Repository;

import ABC.Bank.ABCBank.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface CustomerDetailsRepository extends JpaRepository<Customer,String> {

    //public Customer findAllByAccountNumber(String accountNumber);
}
