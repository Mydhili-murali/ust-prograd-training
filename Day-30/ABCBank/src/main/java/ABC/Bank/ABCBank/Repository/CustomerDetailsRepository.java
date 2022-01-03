package ABC.Bank.ABCBank.Repository;

import ABC.Bank.ABCBank.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface CustomerDetailsRepository extends JpaRepository<Customer,String> {
//    @Modifying
//    @Query("update Customer u set u.customer_name = :name, u.password=:password,u.address= :address,u.phone_number=:phNo,u.branch_name=:branch where u.user_name = :userName")
//    Customer updateDetails(@Param(value = "userName") String username, @Param(value = "name") String name,@Param(value = "password") String password, @Param(value = "address") String address,@Param(value = "phNo") String phNo, @Param(value = "branch") String branch );


    public Customer findAllByAccountNumber(String accountNumber);
}
