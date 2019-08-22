package vn.vttek.elecs.controller;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import vn.vttek.elecs.entities.ProductModel;
import vn.vttek.elecs.repository.ProductModelRepository;

import javax.validation.Valid;

@RestController
public class ProductModelController {
	

	    @Autowired
	    private ProductModelRepository productmodelRepository;

	    @GetMapping("/productmodel")
	    public Page<ProductModel> getProductModel(Pageable pageable) {
	        return (Page<ProductModel>) productmodelRepository.findAll();
	    }


	    @PostMapping("/productmodel")
	    public ProductModel createProductModel(@Valid @RequestBody ProductModel productmodel) {
	        return productmodelRepository.save(productmodel);
	    }

	    @PutMapping("/productmodel/{productmodeld}")
	    public ProductModel updateProductModel(@PathVariable Long productmodeld,
	                                   @Valid @RequestBody Question questionRequest) {
	        return productmodelRepository.findById(productmodeld)
	                .map(productmodel -> {
	                	productmodel.setId_product(productmodelRequest.getId_product());
	                	productmodel.setId_model(productmodelRequest.getId_model());
	                	productmodel.setCreated_by_id(productmodelRequest.getCreated_by_id());
	                	productmodel.setCreated_on(productmodelRequest.getCreated_on());
	                	productmodel.setModified_by_id(productmodelRequest.getModified_by_id());
	                	productmodel.setModified_on(productmodelRequest.getModified_on());
	                    return productmodelRepository.save(productmodel);
	                }).orElseThrow(() -> new ResourceNotFoundException("productmodel not found with id " + productmodelId));
	    }


	    @DeleteMapping("/productmodel/{productmodelId}")
	    public ResponseEntity<?> deleteQuestion(@PathVariable Long questionId) {
	        return questionRepository.findById(questionId)
	                .map(question -> {
	                    questionRepository.delete(question);
	                    return ResponseEntity.ok().build();
	                }).orElseThrow(() -> new ResourceNotFoundException("Question not found with id " + questionId));
	    }
	}

