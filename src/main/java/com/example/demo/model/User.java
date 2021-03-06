package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "users")
@Entity
@Data
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String email;
}


