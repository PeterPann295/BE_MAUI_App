package com.example.movie.service.impl;

import com.example.movie.dto.response.MovieReponseDTO;
import com.example.movie.dto.response.PageResponse;
import com.example.movie.model.Movie;
import com.example.movie.repository.MovieRepository;
import com.example.movie.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {
    private final MovieRepository movieRepository;
    @Override
    public PageResponse getMovies(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo, pageSize);
        Page<Movie> pageMovies = movieRepository.findAll(pageable);
        List<MovieReponseDTO> movieReponseDTOS = pageMovies.stream().map(movie -> MovieReponseDTO.builder()
                .id(movie.getId())
                .name(movie.getName())
                .genre(movie.getGenre())
                .actors(movie.getActors())
                .description(movie.getDescription())
                .posterUrl(movie.getPosterUrl())
                .build()).toList();
        return PageResponse.builder()
                .pageNo(pageNo)
                .pageSize(pageSize)
                .totalPage(pageMovies.getTotalPages())
                .items(movieReponseDTOS)
                .build();
    }
}
