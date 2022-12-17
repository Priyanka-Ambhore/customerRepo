package com.example.demo.model;

import lombok.*;
@Data
@AllArgsConstructor(staticName="build")
@NoArgsConstructor
public class Customer {

    private int id;
    private String name;
    private  int age;

}
