package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "Customer_Tbl")
@Data
@AllArgsConstructor(staticName="build")
@NoArgsConstructor
public class CustomerEntity {

    @Id
    private int userId;
    private String name;
    private int age;
}
