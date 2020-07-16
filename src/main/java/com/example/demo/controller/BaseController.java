package com.example.demo.controller;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class BaseController {
    public Pageable getPageConfig(int offset, int limmit, String sortBY, boolean sortAsc) {
        Sort sortConf = sortAsc ? Sort.by(sortBY) : Sort.by(sortBY).descending();
        return PageRequest.of(offset, limmit, sortConf);
    }
}
