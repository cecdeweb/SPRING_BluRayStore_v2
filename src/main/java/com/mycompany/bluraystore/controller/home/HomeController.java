package com.mycompany.bluraystore.controller.home;

import com.mycompany.bluraystore.entity.Movie;
import com.mycompany.bluraystore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private MovieServiceInterface service;

// 1 ERE FACON DE FAIRE
//    @RequestMapping("/bluraystore-home")
//    public @ModelAttribute("movies") List<Movie> displayHome(){
//        return service.getMovieList();
//    }

    // 2 EME FACON DE FAIRE
    @RequestMapping("/bluraystore-home")
    public String displayHome(Model model){
        model.addAttribute("movies", service.getMovieList());
        return "bluraystore-home";
    }

}
