package com.example.movie.dto.request;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class FavoriteRequestDTO implements Serializable {
    private int movieId;
}
