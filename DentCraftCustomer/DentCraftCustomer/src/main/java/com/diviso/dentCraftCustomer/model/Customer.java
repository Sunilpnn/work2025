package com.diviso.dentCraftCustomer.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//Database should generate ID automatically.”
import jakarta.persistence.GeneratedValue;

//Use database auto-increment
import jakarta.persistence.GenerationType;


@Entity
public class Customer{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

private String name;
private Integer age;
private String email;
private String phone;



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

    
    public  Integer  getAge() {
        return age;
    }

    public void setAge(Integer  age) {
        this.age = age;
    }

 
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString(){

     return "Name " +   name + "Age " +  age + "Email" +  email + "Phoen " +  phone;

    }
    
}