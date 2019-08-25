package vn.vttek.elecs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.vttek.elecs.entities.File;
import vn.vttek.elecs.exception.ResourceNotFoundException;
import vn.vttek.elecs.repository.FileRepository;

import javax.validation.Valid;
import java.awt.print.Pageable;

@RestController
public class FileController {


    @Autowired
    private FileRepository fileRepository;

    @GetMapping("/file")
    public Page<File> getFile(Pageable pageable) {
        return (Page<File>) fileRepository.findAll();
    }


    @PostMapping("/file")
    public File createFile(@Valid @RequestBody File file) {
        return fileRepository.save(file);
    }

    @PutMapping("/file/{fileId}")
    public File updateFile(@PathVariable Long fileId,
                           @Valid @RequestBody File fileRequest) {
        return fileRepository.findById(fileId)
                .map(file -> {
                    file.setPar_id(fileRequest.getPar_id());
                    file.setDescription(fileRequest.getDescription());
                    file.setCode(fileRequest.getCode());
                    file.setName(fileRequest.getName());
                    file.setCreated_on(fileRequest.getCreated_on());

                    return fileRepository.save(file);
                }).orElseThrow(() -> new ResourceNotFoundException("file not found with id " + fileId));
    }


    @DeleteMapping("/file/{fileId}")
    public ResponseEntity<?> deleteFile(@PathVariable Long fileId) {
        return fileRepository.findById(fileId)
                .map(file -> {
                    fileRepository.delete(file);
                    return ResponseEntity.ok().build();
                }).orElseThrow(() -> new ResourceNotFoundException("file not found with id " + fileId));
    }
}

