package com.example.springboot.error;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.ExceptionHandler;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class ErrorResponseDTO {

    public static final String SERVER_ERROR = "server_error";
    public static final String ARGUMENT_NOT_VALID = "argument_not_valid";
    private  String  message;
}
