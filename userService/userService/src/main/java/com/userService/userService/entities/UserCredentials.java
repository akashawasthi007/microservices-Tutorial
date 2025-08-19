package com.userService.userService.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@ToString(exclude = "user")
@Builder
@Table(name="user_Credentials")
public class UserCredentials {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // primary key of this table

    @Column(nullable = false, unique = true)
    public String username;

    @Column(nullable = false)
    public String password; // Should be stored hashed, not plain text

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "ID", nullable = false)
    @JsonIgnore
    public User user;

}
