package com.userService.userService.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter(AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long userId;

    @Column(name="NAME",length = 20)
    private String name;

    
    @Column(name="EMAIL")
    private String email;

    
    @Column(name="ABOUT")
    private String about;

    @Transient
    public List<Rating> ratings=new ArrayList<>();
    
    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = true)
    public UserCredentials userCredentials;

}
