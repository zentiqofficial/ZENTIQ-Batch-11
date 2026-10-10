package com.zentiq.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zentiq.crud.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {
	
	Department findByDeptCode(String deptCode);

}
