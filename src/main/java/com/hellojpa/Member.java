package com.hellojpa;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Member {
    @Id //pk
    private Long id;

    private String name;
    @Enumerated(EnumType.STRING)
    private RoleType role;
    private LocalDate regDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoleType getRole() {
        return role;
    }

    public void setRole(RoleType role) {
        this.role = role;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }
}
