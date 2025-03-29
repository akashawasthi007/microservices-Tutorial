package com.userService.userService.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {

    @Id
    @Column(name="ID")
    private String userId;

    @Column(name="NAME",length = 20)
    private String name;

    
    @Column(name="EMAIL")
    private String email;

    
    @Column(name="ABOUT")
    private String about;


    public User orElseThrow(Object object) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'orElseThrow'");
    }

}
