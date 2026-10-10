package com.zentiq.crud.serviceimpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zentiq.crud.dto.DepartmentDto;
import com.zentiq.crud.entity.Department;
import com.zentiq.crud.repository.DepartmentRepo;
import com.zentiq.crud.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepo deptRepo;
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public DepartmentDto saveDept(DepartmentDto dto) {
		
		Department entity = mapper.map(dto,  Department.class);
		
		Department savedEntity = deptRepo.save(entity);
		
		DepartmentDto deptDto = mapper.map(savedEntity, DepartmentDto.class);
		
		return deptDto;
		
	}

	@Override
	public DepartmentDto getDeptByCode(String deptCode) {
	
		Department dept =deptRepo.findByDeptCode(deptCode);
		
		DepartmentDto dto = mapper.map(dept, DepartmentDto.class);
		
		return dto;
	}
	
	

}
