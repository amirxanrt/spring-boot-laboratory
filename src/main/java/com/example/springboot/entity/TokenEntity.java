package com.example.springboot.entity;


import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.time.Instant;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tokens")
@Getter
@Setter
public class TokenEntity {
    @Id
    private String token;

    @ManyToOne
    private  UserEntity user;

    @Column(insertable = false,
            updatable = false,
            nullable = false,
            columnDefinition = "TIMESTAMPTZ NOT NULL DEFAULT CURRENT_TIMESTAMP"
    )
    private Instant created;
}
