package com.zentiq.crud.service;

import com.zentiq.crud.dto.DepartmentDto;

public interface DepartmentService {
	
	DepartmentDto saveDept(DepartmentDto dto);
	
	DepartmentDto getDeptByCode(String deptCode);
}
