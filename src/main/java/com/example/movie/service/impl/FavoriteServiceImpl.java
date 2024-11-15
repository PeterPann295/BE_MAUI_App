package com.example.movie.service.impl;

import com.example.movie.model.Favorite;
import com.example.movie.model.Movie;
import com.example.movie.repository.FavoriteRepository;
import com.example.movie.repository.MovieRepository;
import com.example.movie.service.FavoriteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FavoriteServiceImpl implements FavoriteService {
    private final FavoriteRepository favoriteRepository;
    private final MovieRepository movieRepository;

    @Override
    public List<Favorite> getFavoriteList() {
        return favoriteRepository.findAll();
    }

    @Override
    public int addFavorite(int movieId) {
        Movie movie = movieRepository.findById(movieId).orElseThrow(() -> new RuntimeException("Movie not found"));
        Favorite favorite = Favorite.builder()
                .movie(movie)
                .build();
        favoriteRepository.save(favorite);
        return favorite.getId();

    }

    @Override
    public void deleteFavorite(int id) {
        favoriteRepository.deleteById(id);
    }
}
