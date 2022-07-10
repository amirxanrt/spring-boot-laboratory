package com.example.springboot.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PostEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;

    @Column(unique = true, nullable = false, columnDefinition = "TEXT")
    private String login;
    @Column(nullable = false,columnDefinition = "TEXT")
    private String password;

    @Column(unique = true, nullable = false, columnDefinition = "TEXT")
    private String name;

    @Column(nullable = false,columnDefinition = "TEXT")
    private String content;


}
