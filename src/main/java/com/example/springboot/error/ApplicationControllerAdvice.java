package com.example.springboot.error;


import com.example.springboot.exception.ForbiddenException;
import com.example.springboot.exception.PostNotFoundException;
import com.example.springboot.exception.UserLoginAlreadyRegisteredException;
import com.example.springboot.exception.UserLoginNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationControllerAdvice {


    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponseDTO handle(final MethodArgumentNotValidException e) {
        return new ErrorResponseDTO(ErrorResponseDTO.ARGUMENT_NOT_VALID);
    }
    @ExceptionHandler
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ErrorResponseDTO handle(final ForbiddenException e) {
        return new ErrorResponseDTO(ErrorResponseDTO.EXECUTE_ACCESS_FORBIDDEN);
    }
    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponseDTO handle(final PostNotFoundException e) {
        return new ErrorResponseDTO(ErrorResponseDTO.THE_SERVER_CANNOT_FIND_THE_DATA);
    }
    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponseDTO handle(final UserLoginNotFoundException e) {
        return new ErrorResponseDTO(ErrorResponseDTO.THE_SERVER_CANNOT_FIND_USER_DATA);
    }
    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponseDTO handle(final UserLoginAlreadyRegisteredException e) {
        return new ErrorResponseDTO(ErrorResponseDTO.THE_SERVER_CANNOT_FIND_USER_DATA);
    }

}
