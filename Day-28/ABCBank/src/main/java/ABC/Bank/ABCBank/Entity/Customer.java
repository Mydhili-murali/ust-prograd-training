package ABC.Bank.ABCBank.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

    @Column(nullable = false)
    private String customerName; //not null
    @Column(nullable= false)
    private String address;
    @Id
    @Column(nullable = false)
    private String userName;    // not null,unique
    @Column(nullable = false)
    private String password;    //not null
    @Column(nullable = false, unique = true)
    private String phoneNumber; //not null, unique

    @Column(nullable = false, unique = true)
    private String accountNumber;   //not null,unique
    @Column(nullable = false)
    private String branchName;  //not null

    public Customer(){}

    public Customer(String customerName, String address, String userName, String password, String phoneNumber, String accountNumber, String branchName) {
        this.customerName = customerName;
        this.address = address;
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.branchName = branchName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
}
