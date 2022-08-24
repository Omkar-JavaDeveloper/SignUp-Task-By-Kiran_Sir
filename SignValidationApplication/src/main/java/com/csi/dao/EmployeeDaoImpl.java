package com.csi.dao;

import com.csi.model.Employee;
import com.csi.repository.EmployeeRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDaoImpl {

    @Autowired
    EmployeeRepoInterface employeeRepo;

    public void Signup(Employee employee){
        employeeRepo.save(employee);

    }

}
