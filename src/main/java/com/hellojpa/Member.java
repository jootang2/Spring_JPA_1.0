package com.hellojpa;

import javax.persistence.*;

@Entity
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;
    @Column(name = "USERNAME", nullable = false)
    private String username;
    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;
}
