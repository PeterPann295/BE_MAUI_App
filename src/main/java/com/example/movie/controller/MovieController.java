package com.example.movie.controller;

import com.example.movie.dto.response.ResponseData;
import com.example.movie.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/movie")
@RestController
@RequiredArgsConstructor
public class MovieController {
    private final MovieService movieService;

    @GetMapping("/list")
    public ResponseData getMovies(@RequestParam(defaultValue = "0") int pageNo, @RequestParam(defaultValue = "5") int pageSize){
        return new ResponseData(HttpStatus.OK.value(), "Get list movies success", movieService.getMovies(pageNo, pageSize));
    }
}
