package com.mailSender.springbootsendconformationlink.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

   @Column(name="user_id")
    private String user_Id;

    private String emailId;
    private String password;
     @Column(name="first_name")
    private String firstName;
     @Column(name="last_name")
    private String lastName;

     private Boolean isEnabled;



}
