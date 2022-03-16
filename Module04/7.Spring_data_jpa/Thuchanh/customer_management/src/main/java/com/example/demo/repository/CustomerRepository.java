package com.example.demo.repository;

import com.example.demo.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
    @Query(value="select * from customers where lastName like concat('%',?1,'%') ",
            countQuery="select count(*) from customers where lastName like concat('%',?1,'%') ",
            nativeQuery=true )
    Page<Customer> searchByName(String LastName, Pageable pageable);
}
