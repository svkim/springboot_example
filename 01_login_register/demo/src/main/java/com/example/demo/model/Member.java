package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "member")
@Getter
@Setter
public class Member {
    @Id
    @Column(name = "ID", length = 30)
    private String id;

    @Column(name = "PASS", length = 20)
    private String pass;

    @Column(name = "NAME", length = 20)
    private String name;

    @Column(name = "GENDER", length = 20)
    private String gender;

    @Column(name = "BIRTH", length = 10)
    private String birth;

    @Column(name = "INFO", length = 500)
    private String info;
}