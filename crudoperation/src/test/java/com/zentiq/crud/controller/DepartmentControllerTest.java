package com.zentiq.crud.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.zentiq.crud.dto.DepartmentDto;
import com.zentiq.crud.service.DepartmentService;

@ExtendWith(MockitoExtension.class)
class DepartmentControllerTest {

    @Mock
    private DepartmentService dservice;

    @InjectMocks
    private DepartmentController controller;

    @Test
    void testSaveDept() {

        // Request DTO
        DepartmentDto requestDto = new DepartmentDto();

        requestDto.setDeptName("zentiq");
        requestDto.setDeptDesc("Software Institute");
        requestDto.setDeptAddress("Gurugram");
        requestDto.setDeptCode("ZNT101");

        // Response DTO
        DepartmentDto responseDto = new DepartmentDto();

        responseDto.setDeptId(1L);
        responseDto.setDeptName("zentiq");
        responseDto.setDeptDesc("Software Institute");
        responseDto.setDeptAddress("Gurugram");
        responseDto.setDeptCode("ZNT101");

        // Mock Service
        when(dservice.saveDept(requestDto))
                .thenReturn(responseDto);

        // Call Controller
        ResponseEntity<DepartmentDto> response =
                controller.saveDept(requestDto);

        // Verify
        assertNotNull(response);
        assertEquals(HttpStatus.CREATED, response.getStatusCode());

        assertNotNull(response.getBody());
        assertEquals(1L, response.getBody().getDeptId());
        assertEquals("zentiq", response.getBody().getDeptName());
        assertEquals("Software Institute",
                response.getBody().getDeptDesc());
        assertEquals("Gurugram",
                response.getBody().getDeptAddress());
        assertEquals("ZNT101",
                response.getBody().getDeptCode());
    }

    @Test
    void testGetDept() {

        // Response DTO
        DepartmentDto responseDto = new DepartmentDto();

        responseDto.setDeptId(1L);
        responseDto.setDeptName("zentiq");
        responseDto.setDeptDesc("Software Institute");
        responseDto.setDeptAddress("Gurugram");
        responseDto.setDeptCode("ZNT101");

        // Mock Service
        when(dservice.getDeptByCode("ZNT101"))
                .thenReturn(responseDto);

        // Call Controller
        ResponseEntity<DepartmentDto> response =
                controller.getDept("ZNT101");

        // Verify
        assertNotNull(response);
        assertEquals(HttpStatus.OK, response.getStatusCode());

        assertNotNull(response.getBody());
        assertEquals(1L, response.getBody().getDeptId());
        assertEquals("zentiq", response.getBody().getDeptName());
        assertEquals("Software Institute",
                response.getBody().getDeptDesc());
        assertEquals("Gurugram",
                response.getBody().getDeptAddress());
        assertEquals("ZNT101",
                response.getBody().getDeptCode());
    }
}