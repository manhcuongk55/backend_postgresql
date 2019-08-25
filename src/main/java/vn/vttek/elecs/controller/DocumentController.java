package vn.vttek.elecs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.vttek.elecs.entities.Document;
import vn.vttek.elecs.exception.ResourceNotFoundException;
import vn.vttek.elecs.repository.DocumentRepository;

import javax.validation.Valid;
import java.awt.print.Pageable;

@RestController
public class DocumentController {
    @Autowired
    private DocumentRepository documentRepository;

    @GetMapping("/document")
    public Page<Document> getAccount(Pageable pageable) {
        return (Page<Document>) documentRepository.findAll();
    }


    @PostMapping("/document")
    public Document createDocument(@Valid @RequestBody Document document) {
        return documentRepository.save(document);
    }

    @PutMapping("/document/{documentId}")
    public Document updateDocument(@PathVariable Long documentId,
                                   @Valid @RequestBody Document documentRequest) {
        return documentRepository.findById(documentId)
                .map(document -> {
                    document.setItem_number(documentRequest.getItem_number());
                    document.setModified_on(documentRequest.getModified_on());
                    document.setName(documentRequest.getName());
                    document.setDescription(documentRequest.getDescription());
                    document.setCreated_on(documentRequest.getCreated_on());
                    document.setCreated_by_id(documentRequest.getCreated_by_id());
                    document.setModified_by_id(documentRequest.getModified_by_id());
                    document.setCurrent_state(documentRequest.getCurrent_state());
                    document.setLocked_by_id(documentRequest.getLocked_by_id());
                    document.setIs_current(documentRequest.getIs_current());
                    document.setMinor_rev(documentRequest.getMinor_rev());
                    document.setNot_lockable(documentRequest.getNot_lockable());
                    document.setIs_release(documentRequest.getIs_release());
                    document.setGeneration(documentRequest.getGeneration());
                    document.setNew_version(documentRequest.getNew_version());
                    document.setConfig_id(documentRequest.getConfig_id());
                    document.setPermission_id(documentRequest.getPermission_id());
                    document.setEffected_date(documentRequest.getEffected_date());
                    document.setRelated_date(documentRequest.getRelated_date());
                    document.setAuthoring_tool(documentRequest.getAuthoring_tool());
                    document.setAuthoring_tool_version(documentRequest.getAuthoring_tool_version());
                    document.setHas_files(documentRequest.getHas_files());
                    return documentRepository.save(document);
                }).orElseThrow(() -> new ResourceNotFoundException("document not found with id " + documentId));
    }


    @DeleteMapping("/document/{documentId}")
    public ResponseEntity<?> deleteDocument(@PathVariable Long documentId) {
        return documentRepository.findById(documentId)
                .map(document -> {
                    documentRepository.delete(document);
                    return ResponseEntity.ok().build();
                }).orElseThrow(() -> new ResourceNotFoundException("document not found with id " + documentId));
    }
}
