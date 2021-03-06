package com.example.demo.service;

import com.example.demo.model.User;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    public Page<User> findAll(Pageable pageable);
}
