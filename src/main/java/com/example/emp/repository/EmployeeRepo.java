package com.example.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.emp.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
 
}
