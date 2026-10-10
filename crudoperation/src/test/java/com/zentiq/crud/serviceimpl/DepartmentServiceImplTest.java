package com.zentiq.crud.serviceimpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import com.zentiq.crud.dto.DepartmentDto;
import com.zentiq.crud.entity.Department;
import com.zentiq.crud.repository.DepartmentRepo;

@ExtendWith(MockitoExtension.class)
class DepartmentServiceImplTest {

    @Mock
    private DepartmentRepo deptRepo;

    @Mock
    private ModelMapper mapper;

    @InjectMocks
    private DepartmentServiceImpl service;

    @Test
    void testSaveDept() {

        // 1. Create DTO
        DepartmentDto dto = new DepartmentDto();

        dto.setDeptName("zentiq");
        dto.setDeptDesc("Software Institute");
        dto.setDeptAddress("Gurugram");
        dto.setDeptCode("ZNT101");

        // 2. Create Entity
        Department entity = new Department();

        entity.setDeptName("zentiq");
        entity.setDeptDesc("Software Institute");
        entity.setDeptAddress("Gurugram");
        entity.setDeptCode("ZNT101");

        // 3. Create Saved Entity
        Department savedEntity = new Department();

        savedEntity.setDeptId(1L);
        savedEntity.setDeptName("zentiq");
        savedEntity.setDeptDesc("Software Institute");
        savedEntity.setDeptAddress("Gurugram");
        savedEntity.setDeptCode("ZNT101");

        // 4. Expected DTO
        DepartmentDto savedDto = new DepartmentDto();

        savedDto.setDeptId(1L);
        savedDto.setDeptName("zentiq");
        savedDto.setDeptDesc("Software Institute");
        savedDto.setDeptAddress("Gurugram");
        savedDto.setDeptCode("ZNT101");

        // 5. Mock ModelMapper DTO -> Entity
        when(mapper.map(dto, Department.class))
                .thenReturn(entity);

        // 6. Mock Repository save
        when(deptRepo.save(entity))
                .thenReturn(savedEntity);

        // 7. Mock ModelMapper Entity -> DTO
        when(mapper.map(savedEntity, DepartmentDto.class))
                .thenReturn(savedDto);

        // 8. Call actual service method
        DepartmentDto result = service.saveDept(dto);

        // 9. Verify result
        assertNotNull(result);

        assertEquals(1L, result.getDeptId());
        assertEquals("zentiq", result.getDeptName());
        assertEquals("Software Institute", result.getDeptDesc());
        assertEquals("Gurugram", result.getDeptAddress());
        assertEquals("ZNT101", result.getDeptCode());
    }
}