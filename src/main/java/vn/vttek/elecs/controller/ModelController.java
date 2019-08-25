package vn.vttek.elecs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.vttek.elecs.entities.Model;
import vn.vttek.elecs.exception.ResourceNotFoundException;
import vn.vttek.elecs.repository.ModelRepository;

import javax.validation.Valid;

@RestController
public class ModelController{
	    @Autowired
	    private ModelRepository modelRepository;

	    @GetMapping("/model")
	    public Page<Model> getModel(Pageable pageable) {
	    	return (Page<Model>) modelRepository.findAll();
	    }


	    @PostMapping("/model")
	    public Model createModel(@Valid @RequestBody Model model) {
	        return modelRepository.save(model);
	    }

	    @PutMapping("/model/{modelId}")
	    public Model updateModel(@PathVariable Long modelId,
	                                   @Valid @RequestBody Model modelRequest) {
	        return modelRepository.findById(modelId)
	                .map(model -> {
	                	model.setId_part_number(modelRequest.getId_part_number());
	                	model.setDescription(modelRequest.getDescription());
	                	model.setItem_number(modelRequest.getItem_number());
	                	model.setName(modelRequest.getName());
	                	model.setVersion_number(modelRequest.getVersion_number());
	                	model.setRelease_number(modelRequest.getRelease_number());
	                	model.setCreated_by_id(modelRequest.getCreated_by_id());
	                    return modelRepository.save(model);
	                }).orElseThrow(() -> new ResourceNotFoundException("model not found with id " + modelId));
	    }


	    @DeleteMapping("/model/{modelId}")
	    public ResponseEntity<?> deleteModel(@PathVariable Long modelId) {
	        return modelRepository.findById(modelId)
	                .map(model -> {
	                	modelRepository.delete(model);
	                    return ResponseEntity.ok().build();
	                }).orElseThrow(() -> new ResourceNotFoundException("model not found with id " + modelId));
	    }
}
