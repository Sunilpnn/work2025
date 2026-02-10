
package com.diviso.dentCraftCustomer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import com.diviso.dentCraftCustomer.repository.CustomerRepository;

import com.diviso.dentCraftCustomer.model.Customer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import  com.diviso.dentCraftCustomer.service.CustomerService;


@Controller
@RequestMapping("/customers")
public class CustomerController{

@Autowired
private CustomerService customerService;

@GetMapping("/home")
    public String home() {
        return "Home"; // Matches src/main/resources/templates/Home.html
    }


// 1. To OPEN the blank form
@GetMapping("/register")
public String showRegisterPage(Model model) {
    model.addAttribute("customer", new Customer()); 
    return "RegisterCustomer";
}

// 2. To SAVE the filled form
@PostMapping("/createCustomer")
public String createCustomer(@ModelAttribute Customer customer) {
    customerService.createCustomer(customer); 
    return "redirect:/customers/viewAll";
}


@GetMapping("/viewAll")

    public  String   viewAllCustomers(Model model) {
       model.addAttribute("customers", customerService.viewAllCustomers());
     
        return "CustomerView";

    }



@GetMapping("/{id}")
public Customer findById(@PathVariable Long id){

    return customerService.findById(id).orElseThrow(() -> new RuntimeException("Customer not found with id: " + id));

}

@DeleteMapping("/{id}")
public void deleteCustomerById(@PathVariable Long  id){

    customerService.deleteCustomerById(id);

}


@GetMapping("/edit/{id}")
public String  updateCustomer(@PathVariable Long id,Model model){

Customer customer = customerService.findById(id).orElseThrow();

model.addAttribute("customer",customer);

return  "UpdateCustomer";

} 



@PostMapping("/updateCustomer/{id}")

public String updateCustomer(@PathVariable Long id ,@ModelAttribute Customer customer ){

  customerService.updateCustomer(id,customer);

return "redirect:/customers/viewAll";

}



}