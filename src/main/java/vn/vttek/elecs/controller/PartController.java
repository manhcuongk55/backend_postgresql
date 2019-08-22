package vn.vttek.elecs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.vttek.elecs.repository.PartRepository;

import javax.servlet.http.Part;
import javax.validation.Valid;

@RestController
public class PartController {
	

	    @Autowired
	    private PartRepository partRepository;

	    @GetMapping("/part")
	    public Iterable<vn.vttek.elecs.entities.Part> getQuestions(Pageable pageable) {
	        return partRepository.findAll();
	    }


	    @PostMapping("/part")
	    public Part createPart(@Valid @RequestBody Part part) {
	        return partRepository.save(part);
	    }

	    @PutMapping("/part/{partId}")
	    public Part updatePart(@PathVariable int partId,
                               @Valid @RequestBody Part partRequest) {
	        return partRepository.findById(partId)
	                .map(part -> {
	                	part.setItem_number(partRequest.getItem_number());
	                	part.setName(partRequest.getName());
	                	part.setDescription(partRequest.getDescription());
	                	part.setCategory(partRequest.getCategory());
	                	part.setManufacturer(partRequest.getManufacturer());
	                	part.setNumber_manufacturer_res(partRequest.getNumber_manufacturer_res());
	                	part.setLead_time(partRequest.getLead_time());
	                	part.setClassification(partRequest.getClassification());
	                	part.setState(partRequest.getState());
	                	part.setCurrent_state(partRequest.getCurrent_state());
	                	part.setVersion(partRequest.getVersion());
	                	part.setCost(partRequest.getCost());
	                	part.setMake_by(partRequest.getMake_by());
	                	part.setUsnit(partRequest.getUnit());
	                	part.setWeight(partRequest.getWeight());
	                	part.setThumbnail(partRequest.getThumbnail());
	                	part.setCreated_by_id(partRequest.getCreated_by_id());
	                	part.setCreated_on(partRequest.getCreated_on());
	                	part.setModified_by_id(partRequest.getModified_by_id());
	                	part.setModified_on(partRequest.getModified_on());
	                	part.setLocked_by_id(partRequest.getLocked_by_id());
	                	part.setNot_lockable(partRequest.getNot_lockable());
	                	part.setConfig_id(partRequest.getConfig_id());
	                	part.setGeneration(partRequest.getGeneration());
	                	part.setRelease_date(partRequest.getRelease_date());
	                	part.setEffective_date(partRequest.getEffective_date());
	                	part.setIs_released(partRequest.getIs_released());
	                	part.setIs_current(partRequest.getIs_current());
	                	part.setMajor_rev(partRequest.getMajor_rev());
	                	part.setHas_change_pending(partRequest.getHas_change_pending());
	                	part.setPermission_id(partRequest.getPermission_id());
	                	part.setExternal_type(partRequest.getExternal_type());
	                	part.setQuantity(partRequest.getQuantity());
	                	part.setSort_order(partRequest.getSort_order());
	                	part.setEeference_designator(partRequest.getReference_designator());
	                	
	                	
	                    return partRepository.save(part);
	                }).orElseThrow(() -> new ResourceNotFoundException("part not found with id " +partId));
	    }


	    @DeleteMapping("/part/{partId}")
	    public ResponseEntity<?> deletePart(@PathVariable Long partId) {
	        return partRepository.findById(partId)
	                .map(part -> {
	                	partRepository.delete(part);
	                    return ResponseEntity.ok().build();
	                }).orElseThrow(() -> new ResourceNotFoundException("part not found with id " + partId));
	    }
	}

