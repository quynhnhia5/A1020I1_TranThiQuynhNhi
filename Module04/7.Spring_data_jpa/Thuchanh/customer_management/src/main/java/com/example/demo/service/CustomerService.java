package com.example.demo.service;

import com.example.demo.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
   Page<Customer> findAll(Pageable pageable);
   void saveCustomer(Customer customer);
   void deleteCustomer(int id);

   Customer findById(int id);

   Page<Customer> searchByName(String lastName,Pageable pageable);

}
