package com.example.demo.controller;

import com.example.demo.entity.CustomerEntity;
import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable int id){
       return ResponseEntity.ok(customerService.getCustomer(id));
    }
    @GetMapping("/fetchAll")
    public ResponseEntity<List<CustomerEntity>> getCustomers(){
        return ResponseEntity.ok(customerService.getCustomers());
    }
    @PostMapping("/signUp")
     public ResponseEntity<CustomerEntity> savCustomer(@RequestBody Customer customer)
    {
        return new ResponseEntity<>(customerService.saveCustomer(customer), HttpStatus.CREATED);
    }
}
