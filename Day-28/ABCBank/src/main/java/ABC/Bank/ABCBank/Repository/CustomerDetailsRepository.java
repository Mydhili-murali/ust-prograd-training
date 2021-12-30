package ABC.Bank.ABCBank.Repository;

import ABC.Bank.ABCBank.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerDetailsRepository extends JpaRepository<Customer,String> {

}
