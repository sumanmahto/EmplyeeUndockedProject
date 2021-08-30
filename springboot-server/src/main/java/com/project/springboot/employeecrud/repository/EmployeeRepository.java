package com.project.springboot.employeecrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.springboot.employeecrud.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
