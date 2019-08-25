package vn.vttek.elecs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.vttek.elecs.entities.GroupUser;
import vn.vttek.elecs.exception.ResourceNotFoundException;
import vn.vttek.elecs.repository.GroupUserRepository;

import javax.validation.Valid;

@RestController
public class GroupUserController {

    @Autowired
    private GroupUserRepository groupuserRepository;

    @GetMapping("/groupuser")
    public Page<GroupUser> getGroupUser(Pageable pageable) {
        return (Page<GroupUser>) groupuserRepository.findAll();
    }


    @PostMapping("/groupuser")
    public GroupUser createGroupUser(@Valid @RequestBody GroupUser groupuser) {
        return groupuserRepository.save(groupuser);
    }

    @PutMapping("/groupuser/{groupuserId}")
    public GroupUser updateGroupUser(@PathVariable Long groupuserId,
                                     @Valid @RequestBody GroupUser groupuserRequest) {
        return groupuserRepository.findById(groupuserId)
                .map(groupuser -> {
                    groupuser.setPermission(groupuserRequest.getPermission());
                    groupuser.setGroup_name(groupuserRequest.getGroup_name());
                    groupuser.setCreated_on(groupuserRequest.getCreated_on());

                    return groupuserRepository.save(groupuser);
                }).orElseThrow(() -> new ResourceNotFoundException("groupuser not found with id " + groupuserId));
    }


    @DeleteMapping("/groupuser/{groupuserId}")
    public ResponseEntity<?> deleteGroupUser(@PathVariable Long groupuserId) {
        return groupuserRepository.findById(groupuserId)
                .map(groupuser -> {
                    groupuserRepository.delete(groupuser);
                    return ResponseEntity.ok().build();
                }).orElseThrow(() -> new ResourceNotFoundException("groupuser not found with id " + groupuserId));
    }
}

