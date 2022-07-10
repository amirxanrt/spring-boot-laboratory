package com.example.springboot.controller;


import com.example.springboot.dto.PostRequestDTO;
import com.example.springboot.dto.PostResponseDTO;
import com.example.springboot.dto.UserRequestDTO;
import com.example.springboot.dto.UserResponseDTO;
import com.example.springboot.manager.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService service;

    @GetMapping("/post")
    public List<PostResponseDTO> getAll() {
        final List<PostResponseDTO> responseDTO = service.getAll();
        return responseDTO;
    }

    // TODO: http://localhost:8080/post/1
    @GetMapping("/post/{id}")
    public PostResponseDTO getById(@PathVariable final long id) {
        final PostResponseDTO responseDTO = service.getById(id);
        return responseDTO;
    }

    @PostMapping("/post")
    public PostResponseDTO create(@RequestBody final PostRequestDTO requestDTO) {
        final PostResponseDTO responseDTO = service.create(requestDTO);
        return responseDTO;
    }

    @PutMapping("/post")
    public PostResponseDTO update(@RequestBody final PostRequestDTO requestDTO) {
        final PostResponseDTO responseDTO = service.update(requestDTO);
        return responseDTO;
    }

    @DeleteMapping("/post/{id}")
    public void deleteById(@PathVariable final long id) {
        service.deleteById(id);
    }
}



