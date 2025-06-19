package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;

/**
 * Department Service
 */
@Service
@Transactional
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    public Department findOne(Long id) {
        return departmentRepository.getById(id);
    }
}
