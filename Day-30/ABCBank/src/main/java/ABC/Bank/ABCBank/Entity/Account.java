package ABC.Bank.ABCBank.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
    @Column(nullable = false,unique = true)
    private String accountNumber;
    @Column(nullable = false)
    private String customerName;
    @Id
    private String userName;
    @Column(nullable = false)
    private String ifscCode;
    @Column(nullable = false)
    private String branchName;
    private double accountBalance=1000;

    public Account(){}

    public Account(String accountNumber, String customerName, String userName, String ifscCode, String branchName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.userName = userName;
        this.ifscCode = ifscCode;
        this.branchName = branchName;
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
}
