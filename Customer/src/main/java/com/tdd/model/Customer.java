package com.tdd.model;
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
 private Integer id;

private String name;
private int age;
private String email;
private int phone;


 public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


 public String getName() {

        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

 
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString(){

     return "Name " +   name + "Age " +  age + "Email" +  email + "Phoen " +  phone;

    }



}