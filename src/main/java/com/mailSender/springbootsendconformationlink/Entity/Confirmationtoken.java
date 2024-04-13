package com.mailSender.springbootsendconformationlink.Entity;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name="ConfirmationToken")
public class Confirmationtoken {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="tokenid")
    private long tokenid;

    @Column(name="Confirmation_Token")
    private String ConfirmationToken;

    @Temporal(TemporalType.TIMESTAMP)
    private Date CreteDate;

    @OneToOne(targetEntity = User.class ,fetch = FetchType.EAGER)
    @JoinColumn(nullable = false,name = "user_id")
    private User user;

    public Confirmationtoken() {
    }

    public Confirmationtoken(User user) {
        this.user = user;
    }
}
