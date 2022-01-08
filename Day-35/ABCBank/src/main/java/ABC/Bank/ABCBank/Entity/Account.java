package ABC.Bank.ABCBank.Entity;

import javax.persistence.*;

@Entity
public class Account {
    @Id
    @GeneratedValue
    private Long accountNumber;
    @Column(nullable = false)
    private String ifscCode;
    @Column(nullable = false)
    private String branchName;
    private double accountBalance=1000;

    @OneToOne
    private Customer customer;

    public Account(){}

    public Account(String ifscCode, String branchName) {
        this.ifscCode = ifscCode;
        this.branchName = branchName;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }


    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
