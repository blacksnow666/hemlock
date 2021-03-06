package com.twistlet.hemlock.model.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * HemlockUserRole generated by hbm2java
 */
@Entity
@Table(name="hemlock_user_role"
    , uniqueConstraints = @UniqueConstraint(columnNames={"role_name", "username"}) 
)
public class HemlockUserRole  implements java.io.Serializable {


     private Long id;
     private HemlockUser hemlockUser;
     private HemlockRole hemlockRole;

    public HemlockUserRole() {
    }

    public HemlockUserRole(HemlockUser hemlockUser, HemlockRole hemlockRole) {
       this.hemlockUser = hemlockUser;
       this.hemlockRole = hemlockRole;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="username", nullable=false)
    public HemlockUser getHemlockUser() {
        return this.hemlockUser;
    }
    
    public void setHemlockUser(HemlockUser hemlockUser) {
        this.hemlockUser = hemlockUser;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="role_name", nullable=false)
    public HemlockRole getHemlockRole() {
        return this.hemlockRole;
    }
    
    public void setHemlockRole(HemlockRole hemlockRole) {
        this.hemlockRole = hemlockRole;
    }




}


