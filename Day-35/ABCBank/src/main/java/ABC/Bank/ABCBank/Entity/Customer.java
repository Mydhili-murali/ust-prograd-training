package ABC.Bank.ABCBank.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {

    @Column(nullable = false)
    private String customerName; //not null
    @Column(nullable = false)
    private String address;
    @Id
    @Column(nullable = false)
    private String userName;    // not null,unique
    @Column(nullable = false)
    private String password;    //not null
    @Column(nullable = false, unique = true)
    private String phoneNumber; //not null, unique
    @Column(nullable = false)
    private String emailId;

    @JsonIgnore
    @OneToOne
    private Account account;

    public Customer() {
    }

    public Customer(String customerName, String address, String userName, String password, String phoneNumber, String emailId) {
        this.customerName = customerName;
        this.address = address;
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
