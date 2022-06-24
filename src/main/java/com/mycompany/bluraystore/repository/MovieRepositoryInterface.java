package com.mycompany.bluraystore.repository;

import com.mycompany.bluraystore.entity.Movie;

import java.util.List;

public interface MovieRepositoryInterface {

    public void add(Movie movie);

    public List<Movie> list();

}
