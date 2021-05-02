package com.employee.department.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "Department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "department_generator")
    @SequenceGenerator(name="department_generator", sequenceName = "department_seq", allocationSize = 1)
    @Column(name = "dept_no")
    int departmentNo;
    @Column(name = "department_name")
    String departmentName;


}
