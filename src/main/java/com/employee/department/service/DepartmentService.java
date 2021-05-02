package com.employee.department.service;

import com.employee.department.model.Department;
import com.employee.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    public void addDepartment(Department department) {
        departmentRepository.addDepartment(department);


    }

    public Department getDepartment(Department departmentName) {
    return departmentRepository.getDepartment(departmentName);
    }
}
