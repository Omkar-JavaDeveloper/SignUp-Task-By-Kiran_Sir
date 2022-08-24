package com.csi.controller;


import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    EmployeeDaoImpl employeeDao;

    @PostMapping("/signup")
    public ResponseEntity<String> signup( @RequestBody Employee employee){

        employeeDao.Signup(employee);

        return ResponseEntity.ok("");
    }

}
