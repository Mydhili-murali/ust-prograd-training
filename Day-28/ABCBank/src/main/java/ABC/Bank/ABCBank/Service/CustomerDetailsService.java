package ABC.Bank.ABCBank.Service;

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

}
