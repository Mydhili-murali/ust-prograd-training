package ABC.Bank.ABCBank.Service;

import ABC.Bank.ABCBank.Entity.Account;
import ABC.Bank.ABCBank.Entity.Customer;
import ABC.Bank.ABCBank.Repository.CustomerDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerDetailsService {
@Autowired
    private CustomerDetailsRepository customerRepo;
    public Customer saveCustomer(Customer customer){
        // validations // error checkings...
        return customerRepo.save(customer);

    }
    public List<Customer> listAll(){
        return customerRepo.findAll();
    }

    public Customer findById(String username){
        return customerRepo.getById(username);
}
    public boolean existsById(String username) { return customerRepo.existsById(username);}


//    public Customer updateDetails(String userName,String name,String password,String address,String phNo,String branch){
//        return customerRepo.updateDetails(userName, name, password, address, phNo, branch);
//    }
    //public Customer findByAccountNumber(String accountNumber){return customerRepo.findAllByAccountNumber(accountNumber);}

}
