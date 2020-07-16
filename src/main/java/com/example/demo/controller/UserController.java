package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.data.domain.Pageable;

@RestController
public class UserController extends BaseController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/user")
    public ResponseEntity<Object> getAll(@RequestParam(value = "offset", defaultValue = "0") int offset,
                                         @RequestParam(value = "limmit", defaultValue = "50") int limmit,
                                         @RequestParam(value = "sortBy", defaultValue = "name") String sortBY,
                                         @RequestParam(value = "sortAsc", defaultValue = "true") boolean sortAsc) {
        Pageable pageable = getPageConfig(offset, limmit, sortBY, sortAsc);
        return new ResponseEntity<>(userService.findAll(pageable), HttpStatus.OK);
    }
}
