package com.example.springboot.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AuthRequestDTO {

    private String  login;
    private String  password;
}
