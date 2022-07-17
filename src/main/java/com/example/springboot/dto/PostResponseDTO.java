package com.example.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostResponseDTO {
    private long id;
    private AuthorDTO author;
    private String content;
    private List<String> tags;
    private GeoDTO geo;
}
