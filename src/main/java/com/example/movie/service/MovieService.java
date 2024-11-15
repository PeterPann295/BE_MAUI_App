package com.example.movie.service;

import com.example.movie.dto.response.PageResponse;

public interface MovieService {

    PageResponse getMovies(int pageNo, int pageSize);

}
