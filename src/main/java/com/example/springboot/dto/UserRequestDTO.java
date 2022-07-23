package com.example.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@AllArgsConstructor
@Data
public class UserRequestDTO {
    @Min(0)
    private long id;
    @NotNull
    @Pattern(regexp = "[A-Za-z0-9]{3,20}")
    @Size(min = 3, max = 100)
    private String login;
    @NotNull
    @Size(min = 8, max = 64)
    private String password;
    @NotNull
    @Size(min = 1, max = 100)
    private List<@NotNull @Pattern(regexp = "ROLE_[A-Z]{1,100}") String> roles;

}