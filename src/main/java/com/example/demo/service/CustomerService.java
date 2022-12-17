package com.example.demo.service;

import com.example.demo.entity.CustomerEntity;
import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;
  private   List<CustomerEntity> customerEntities;
    public CustomerEntity saveCustomer(Customer customer) {
        CustomerEntity customerEntity = CustomerEntity.build(customer.getId(), customer.getName(), customer.getAge());
        customerEntity.setUserId(customer.getId());
        customerEntity.setName(customer.getName());
        customerEntity.setAge(customer.getAge());
        customerEntities = new ArrayList<>();
        customerEntities.add(customerEntity);
        return customerEntity;
        // return customerRepo.save(customerEntity);
    }

    public Customer getCustomer(int id) {
        Customer customer = new Customer();
        customer.setId(customerEntities.get(id).getUserId());
        customer.setName(customerEntities.get(id).getName());
        customer.setAge(customerEntities.get(id).getAge());
        return customer;
     //   return customerRepo.findByUserId(id);
    }

    public List<CustomerEntity> getCustomers() {
      return  customerEntities;
      //  return customerRepo.findAll();
    }
}
