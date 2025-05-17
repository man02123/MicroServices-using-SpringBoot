package com.microservices.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.department.entity.Department;
import com.microservices.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartMent(@RequestBody Department department) {

        log.info("Inside Save DepartMent Function");

        return departmentService.saveDepartMent(department);
    }

    @GetMapping("/{id}")
    public Department getDepartmentbyID(@PathVariable("id") Long Id) {

        log.info("Inside the department by Id method");

        return departmentService.getDepartmentbyID(Id);
    }
}
