package com.example.movie.dto.response;

import com.example.movie.model.Movie;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class FavoriteResponseDTO {

    private int id;

    private Movie movie;
}
