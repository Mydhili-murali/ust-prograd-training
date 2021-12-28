package mydhili.JpaDemo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name; //not null
    private String branch;
    private Float marks;
    @Column(nullable= false)
    private Integer age;  //not null
    @Column(nullable = false, unique = true, updatable= false)
    private String phoneNumber; // shows as phone_number in table

    public Student(){} //default constructor

    public Student(String name, String branch, Float marks, Integer age, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.marks = marks;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Float getMarks() {
        return marks;
    }

    public void setMarks(Float marks) {
        this.marks = marks;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
