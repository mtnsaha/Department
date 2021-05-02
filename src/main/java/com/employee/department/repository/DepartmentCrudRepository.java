package com.employee.department.repository;

import com.employee.department.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentCrudRepository extends JpaRepository<Department,String> {

    Department findBydepartmentName(Department department);



}
