package com.employee.department.repository;

import com.employee.department.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentRepository {
    @Autowired
    DepartmentCrudRepository departmentCrudRepository;

    public void addDepartment(Department department) {

        departmentCrudRepository.save(department);

    }

    public Department getDepartment(Department departmentName) {

        return departmentCrudRepository.findBydepartmentName(departmentName);
    }
}
