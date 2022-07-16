package com.example.springboot.manager;

import com.example.springboot.dto.PostRequestDTO;
import com.example.springboot.dto.PostResponseDTO;
import com.example.springboot.dto.UserRequestDTO;
import com.example.springboot.dto.UserResponseDTO;
import com.example.springboot.entity.PostEntity;
import com.example.springboot.entity.UserEntity;
import com.example.springboot.exception.UserNotFoundException;
import com.example.springboot.repository.PostRepository;
import com.example.springboot.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
@Transactional
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    private final Function<PostEntity, PostResponseDTO> postEntityToPostResponseDTO= postEntity -> new PostResponseDTO(postEntity.getId(), postEntity.getName(), postEntity.getContent());
    public List<PostResponseDTO> getAll() {
        return postRepository.findAll().stream()
                .map(postEntityToPostResponseDTO)
                .collect(Collectors.toList());

    }

    public PostResponseDTO getById(final long id) {
        return postRepository.findById(id)
                .map(postEntityToPostResponseDTO)
                .orElseThrow(UserNotFoundException::new)
                ;
    }

    public PostResponseDTO create(final PostRequestDTO requestDTO) {
        final PostEntity postEntity = new PostEntity();
        final PostEntity savedEntity = postRepository.save(postEntity);
        return postEntityToPostResponseDTO.apply(savedEntity);

    }

    public PostResponseDTO update(final PostRequestDTO requestDTO) {
        final PostEntity postEntity = postRepository.getReferenceById((requestDTO.getId()));
        postEntity.setName(requestDTO.getName());
        postEntity.setContent(requestDTO.getContent());
        //postEntity.setTags(requestDTO.getTags());
        return postEntityToPostResponseDTO.apply((postEntity));
    }

    public void deleteById(final long id) {
        postRepository.deleteById(id);
    }
}

