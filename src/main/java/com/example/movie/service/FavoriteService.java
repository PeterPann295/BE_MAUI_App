package com.example.movie.service;

import com.example.movie.dto.response.FavoriteResponseDTO;
import com.example.movie.dto.response.PageResponse;
import com.example.movie.model.Favorite;

import java.util.List;

public interface FavoriteService {
    List<Favorite> getFavoriteList();
    int addFavorite(int movieId);
    void deleteFavorite(int id);
}
