package com.example.movie.dto.response;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MovieReponseDTO {

    private int id;
    private String name;
    private String genre;
    private String description;
    private String actors;
    private String posterUrl;
}
