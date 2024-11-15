package com.example.movie.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "movies")
@Getter
@Setter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "genre")
    private String genre;
    @Column(name = "description")
    private String description;
    @Column(name = "actors")
    private String actors;
    @Column(name = "poster_url")
    private String posterUrl;

}
