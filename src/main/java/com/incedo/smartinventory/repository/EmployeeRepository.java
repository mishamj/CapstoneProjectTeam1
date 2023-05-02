package com.incedo.smartinventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incedo.smartinventory.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	Employee findByUsername(String username);

//	Employee saveOrUpdate(Employee employee);
	
//	Employee findByEmpId(Long id);
	
	/* Employee findByFirstName(String name); */

}
