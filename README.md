# Department
create table employee(  
  employee_id    number(4),  
  employee_name    varchar2(10),   
 employee_location VARCHAR2(8), 
 employee_phone_no    number(10), 
 dept_no number(4),
 
  constraint employee primary key (employee_id),  
  constraint fk_deptno foreign key (dept_no) references department (dept_no)  
)


create table department (
dept_no number(4),
department_name varchar2(20) not null,
constraint pk_dept primary key (dept_no)

)
