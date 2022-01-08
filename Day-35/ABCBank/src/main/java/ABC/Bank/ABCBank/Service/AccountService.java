package ABC.Bank.ABCBank.Service;

import ABC.Bank.ABCBank.Entity.Account;
import ABC.Bank.ABCBank.Entity.Customer;
import ABC.Bank.ABCBank.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountRepository repo;
    public Account saveAccount(Account account){
        // validations // error checkings...
        return repo.save(account);

    }
//    public List<Account> listAll(){
//        return repo.findAll();
//    }
//
    public Account findById(Long accountNumber){
        return repo.getById(accountNumber);
    }
//    public boolean existsById(String username) { return repo.existsById(accountNumber);}

    //public Customer findByAccountNumber(String accountNumber){return customerRepo.findAllByAccountNumber(accountNumber);}



}
