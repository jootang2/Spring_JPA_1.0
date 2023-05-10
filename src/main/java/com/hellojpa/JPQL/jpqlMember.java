package com.hellojpa.JPQL;

import javax.persistence.*;

@Entity
public class jpqlMember {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private int age;
    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private jpqlTeam jpqlTeam;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
