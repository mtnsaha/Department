package com.employee.department.controller;


import com.employee.department.model.Department;
import com.employee.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @PostMapping("/addDepartment")
    public void addDepartment(@RequestBody Department department) {
        departmentService.addDepartment(department);

    }


/*@GetMapping("/getDepartment")
public Department getDepartment(@RequestParam String departmentName){
        return departmentService.getDepartment(departmentName);

}*/
    @PostMapping("/getDepartment")
    public Department getDepartment(@RequestBody Department department){
        return departmentService.getDepartment(department);

    }


}
