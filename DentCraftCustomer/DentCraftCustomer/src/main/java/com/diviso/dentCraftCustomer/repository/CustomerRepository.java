
package com.diviso.dentCraftCustomer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diviso.dentCraftCustomer.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{





}