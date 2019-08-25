package vn.vttek.elecs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.vttek.elecs.entities.Department;
import vn.vttek.elecs.exception.ResourceNotFoundException;
import vn.vttek.elecs.repository.DepartmentRepository;

import javax.validation.Valid;
import java.awt.print.Pageable;

@RestController
public class DepartmentController {

	    @Autowired
	    private DepartmentRepository departmentRepository;

	    @GetMapping("/department")
	    public Page<Department> getDepartment(Pageable pageable) {
	        return (Page<Department>) departmentRepository.findAll();
	    }


	    @PostMapping("/department")
	    public Department createQuestion(@Valid @RequestBody Department department) {
	        return departmentRepository.save(department);
	    }

	    @PutMapping("/department/{departmentId}")
	    public Department updateDepartment(@PathVariable Long departmentId,
	                                   @Valid @RequestBody Department departmentRequest) {
	        return departmentRepository.findById(departmentId)
	                .map(department -> {
	                	department.setPar_id(departmentRequest.getPar_id());
	                	department.setCode(departmentRequest.getCode());
	                	department.setName(departmentRequest.getName());
	                	department.setDescription(departmentRequest.getDescription());
	                	department.setCreated_on(departmentRequest.getCreated_on());
	                	
	                    return departmentRepository.save(department);
	                }).orElseThrow(() -> new ResourceNotFoundException("department not found with id " + departmentId));
	    }


	    @DeleteMapping("/department/{departmentId}")
	    public ResponseEntity<?> deleteDepartment(@PathVariable Long departmentId) {
	        return departmentRepository.findById(departmentId)
	                .map(department -> {
	                	departmentRepository.delete(department);
	                    return ResponseEntity.ok().build();
	                }).orElseThrow(() -> new ResourceNotFoundException("department not found with id " + departmentId));
	    }
	}

