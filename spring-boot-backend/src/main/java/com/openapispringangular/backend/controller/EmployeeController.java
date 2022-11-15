package com.openapispringangular.backend.controller;


import com.openapi_spring_angular.api.EmployeeApi;
import com.openapi_spring_angular.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin(value = "*")
public class EmployeeController implements EmployeeApi {


    @Override
    public ResponseEntity<List<Employee>> getEmployees() {
        Employee e1 = new Employee();
        e1.setId(UUID.randomUUID());
        e1.setName("E1");
        e1.setEmail("e1@gmail.com");
        Employee e2 = new Employee();
        e2.setId(UUID.randomUUID());
        e2.setName("E2");
        e2.setEmail("e2@gmail.com");
        return new ResponseEntity<>(Arrays.asList(e1, e2), HttpStatus.OK);
    }
}
