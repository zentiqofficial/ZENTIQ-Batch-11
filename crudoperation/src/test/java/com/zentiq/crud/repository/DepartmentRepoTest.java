package com.zentiq.crud.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;

import com.zentiq.crud.entity.Department;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class DepartmentRepoTest {

    @Autowired
    private DepartmentRepo deptRepo;

    @Test
    void testSaveDepartment() {

        Department dept = new Department();

        dept.setDeptName("zentiq");
        dept.setDeptDesc("Software Institute");
        dept.setDeptAddress("Gurugram");
        dept.setDeptCode("ZNT101");

        Department savedDept = deptRepo.save(dept);

        assertNotNull(savedDept);
        assertNotNull(savedDept.getDeptId());

        assertEquals("zentiq", savedDept.getDeptName());
        assertEquals("Software Institute",
                savedDept.getDeptDesc());
        assertEquals("Gurugram",
                savedDept.getDeptAddress());
        assertEquals("ZNT101",
                savedDept.getDeptCode());
    }

    @Test
    void testFindByDeptCode() {

        Department dept = new Department();

        dept.setDeptName("zentiq");
        dept.setDeptDesc("Software Institute");
        dept.setDeptAddress("Gurugram");
        dept.setDeptCode("ZNT101");

        deptRepo.save(dept);

        Department result =
                deptRepo.findByDeptCode("ZNT101");

        assertNotNull(result);

        assertEquals("zentiq", result.getDeptName());
        assertEquals("Software Institute",
                result.getDeptDesc());
        assertEquals("Gurugram",
                result.getDeptAddress());
        assertEquals("ZNT101",
                result.getDeptCode());
    }
}