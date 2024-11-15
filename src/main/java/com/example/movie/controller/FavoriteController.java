package com.example.movie.controller;

import com.example.movie.dto.response.ResponseData;
import com.example.movie.service.FavoriteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;

@RequestMapping("/api/v1/favorite")
@RestController
@RequiredArgsConstructor
public class FavoriteController {
    private final FavoriteService favoriteService;

    @PostMapping("/")
    public ResponseData addFavorite(@RequestBody int movieId){
        return new ResponseData(HttpStatus.OK.value(), "Add Favorite success", favoriteService.addFavorite(movieId));
    }
    @DeleteMapping("/")
    public ResponseData deleteFavorite(@RequestBody int id){
        favoriteService.deleteFavorite(id);
        return new ResponseData(HttpStatus.OK.value(), "delete Favorite success");
    }
    @GetMapping("/")
    public ResponseData getFavorites(){
        return new ResponseData(HttpStatus.OK.value(), "get Favorites success", favoriteService.getFavoriteList());

    }
}
