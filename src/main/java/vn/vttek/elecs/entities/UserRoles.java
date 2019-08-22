package vn.vttek.elecs.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@SequenceGenerator(name = "user_rolesIdSeq", sequenceName = "user_roles_id_seq", allocationSize=1)
public class UserRoles implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "user_rolesIdSeq")
    private Long user_role_id;
    
    private String username;
    
    private String role="ROLE_ADMIN";
    
   
    
    public UserRoles() {}

    public UserRoles(String username) {
        this.role = "ROLE_ADMIN";
        this.username = username;
        
        
    }
    public Long getUser_role_id() {
	return user_role_id;
    }

    public void setUser_role_id(Long user_role_id) {
            this.user_role_id = user_role_id;
    }
    
    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
            this.username = username;
    }

    public String getRole() {
            return role;
    }

    public void setRole(String role) {
            this.role = role;
    }

    
    
}
