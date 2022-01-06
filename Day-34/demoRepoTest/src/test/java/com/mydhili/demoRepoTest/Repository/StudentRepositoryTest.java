package com.mydhili.demoRepoTest.Repository;

import com.mydhili.demoRepoTest.Entity.Student;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository repo;
@Nested
    public class CheckIfAnEmailExistsOrNot{
    @BeforeEach
    public void setUp(){
        Student student=new Student("Madhu","madhu@gmail.com",24);
        repo.save(student);

    }

    @AfterEach
    public void tearDown(){
        repo.deleteAll();
    }

    @Test
    public void returnsTrueIfEmailExists(){
        Boolean actual=repo.checkIfEmailExists("madhu@gmail.com");
        //Assertions.assertEquals(true,actual);
        assertTrue(actual);
    }
    @Test
    public void returnsFalseIfEmailNotExists(){
        Boolean actual=repo.checkIfEmailExists("nimin@gmail.com");
        Assertions.assertEquals(false,actual);
    }
}

}