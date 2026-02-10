
package com.diviso.dentCraftCustomer.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.diviso.dentCraftCustomer.repository.CustomerRepository;

import com.diviso.dentCraftCustomer.model.Customer;
@Service
public class CustomerService{

@Autowired
private CustomerRepository customerRepository;


public Customer  createCustomer(Customer customer){

   return  customerRepository.save(customer);

} 

public List<Customer> viewAllCustomers(){

return  customerRepository.findAll();
}


public Optional<Customer> findById(Long id){

  return customerRepository.findById(id);   

}


public void deleteCustomerById(Long  id){

 customerRepository.deleteById(id);
  

}


public Customer updateCustomer(Long id,Customer customer){

 Customer existing =   customerRepository.findById(id).orElseThrow(() -> new RuntimeException("Customer not found with id " + id));


    existing.setName(customer.getName());
    existing.setAge(customer.getAge());
    existing.setEmail(customer.getEmail());
    existing.setPhone(customer.getPhone());

    return customerRepository.save(existing);

}




}