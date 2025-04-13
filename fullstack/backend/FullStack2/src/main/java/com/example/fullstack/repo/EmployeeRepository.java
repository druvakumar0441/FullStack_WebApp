package com.example.fullstack.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fullstack.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
