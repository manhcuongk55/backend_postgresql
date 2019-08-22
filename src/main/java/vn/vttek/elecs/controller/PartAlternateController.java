package vn.vttek.elecs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.vttek.elecs.entities.PartAlternate;
import vn.vttek.elecs.repository.PartAlternateRepository;

import javax.validation.Valid;

@RestController
public class PartAlternateController {
	
	    @Autowired
	    private PartAlternateRepository partalternateRepository;

	    @GetMapping("/partalternate")
	    public Page<PartAlternate> getPartAlternate(Pageable pageable) {
	        return (Page<PartAlternate>) partalternateRepository.findAll();
	    }


	    @PostMapping("/partalternate")
	    public PartAlternate createPartAlternate(@Valid @RequestBody PartAlternate partalternate) {
	        return partalternateRepository.save(partalternate);
	    }

	    @PutMapping("/partalternate/{partalternateId}")
	    public PartAlternate updatePartAlternate(@PathVariable int partalternateId,
	                                   @Valid @RequestBody PartAlternate questionRequest) {
	        return questionRepository.findById(partalternateId)
	                .map(partalternate -> {
	                	partalternate.setClassification(partalternateRequest.getClassification());
	                	partalternate.setCreate_on(partalternateRequest.getCreate_on());
	                	partalternate.setManufacturer(partalternateRequest.getManufacturer());
	                	partalternate.setCreated_by_id(partalternateRequest.getCreated_by_id());
	                	partalternate.setModified_on(partalternateRequest.getModified_on());
	                	partalternate.setModified_by_id(partalternateRequest.getModified_by_id());
	                	partalternate.setState(partalternateRequest.getState());
	                	partalternate.setLocked_by_id(partalternateRequest.getLocked_by_id());
	                	partalternate.setCurrent_state(partalternateRequest.getCurrent_state());
	                	partalternate.setMajor_rev(partalternateRequest.getMajor_rev());
	                	partalternate.setIs_current(partalternateRequest.getIs_current());
	                	partalternate.setIs_released(partalternateRequest.getIs_released());
	                	partalternate.setNot_lockable(partalternateRequest.getNot_lockable());
	                	partalternate.setGeneration(partalternateRequest.getGeneration());
	                	partalternate.setPermission_id(partalternateRequest.getPermission_id());
	                	partalternate.setConfig_id(partalternateRequest.getConfig_id());
	                	partalternate.setSource_id(partalternateRequest.getSource_id());
	                	partalternate.setRelated_id(partalternateRequest.getRelated_id());
	                	partalternate.Setsort_order(partalternateRequest.getSort_order());
	                    return questionRepository.save(question);
	                }).orElseThrow(() -> new ResourceNotFoundException("Question not found with id " + partalternateId));
	    }


	    @DeleteMapping("/questions/{questionId}")
	    public ResponseEntity<?> deleteQuestion(@PathVariable Long questionId) {
	        return questionRepository.findById(questionId)
	                .map(question -> {
	                    questionRepository.delete(question);
	                    return ResponseEntity.ok().build();
	                }).orElseThrow(() -> new ResourceNotFoundException("partalternate not found with id " + partalternateId));
	    }
	}

