package com.openapispringangular.backend.controller;


import com.openapi_spring_angular.api.EmployeeApi;
import com.openapi_spring_angular.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(value = "*")
public class EmployeeController implements EmployeeApi {


    @Override
    public ResponseEntity<List<Employee>> getEmployees() {
        return new ResponseEntity<>(Arrays.asList(new Employee()), HttpStatus.OK);
    }
}
