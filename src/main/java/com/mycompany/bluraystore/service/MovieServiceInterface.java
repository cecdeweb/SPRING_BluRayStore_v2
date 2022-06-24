package com.mycompany.bluraystore.service;

import com.mycompany.bluraystore.entity.Movie;

import java.util.List;

public interface MovieServiceInterface {

    public void registerMovie(Movie movie);

    public List<Movie> getMovieList();

}
