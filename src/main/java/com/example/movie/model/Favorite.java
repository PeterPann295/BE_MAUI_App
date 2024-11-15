package com.example.movie.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "favorites")
@Getter
@Setter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class Favorite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

}
