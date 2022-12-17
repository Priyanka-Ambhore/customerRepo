package com.example.demo.repository;

import com.example.demo.entity.CustomerEntity;
import com.example.demo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo  extends JpaRepository<CustomerEntity,Integer> {
    Customer findByUserId(int id);
}
