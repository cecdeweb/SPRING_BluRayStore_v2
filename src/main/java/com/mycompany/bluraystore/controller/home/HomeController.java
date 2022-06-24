package com.mycompany.bluraystore.controller.home;

import com.mycompany.bluraystore.entity.Movie;
import com.mycompany.bluraystore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private MovieServiceInterface service;

    @RequestMapping("/bluraystore-home")
    public @ModelAttribute("movies") List<Movie> displayHome(){
        return service.getMovieList();
    }


}
