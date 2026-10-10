package com.zentiq.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zentiq.crud.dto.DepartmentDto;
import com.zentiq.crud.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService dservice;

	@PostMapping("/savedept")
	public ResponseEntity<DepartmentDto> saveDept(@RequestBody DepartmentDto deptDto) {
		DepartmentDto savedDto = dservice.saveDept(deptDto);
		return new ResponseEntity<>(savedDto, HttpStatus.CREATED);
	}

	@GetMapping("/getdept")
	public ResponseEntity<DepartmentDto> getDept(@RequestParam String code){
		DepartmentDto deptDto = dservice.getDeptByCode(code);
		return new ResponseEntity<>(deptDto, HttpStatus.OK);
	}
}
