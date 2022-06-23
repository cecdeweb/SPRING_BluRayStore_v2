package com.mycompany.bluraystore.controller;

import com.mycompany.bluraystore.entity.Movie;
import com.mycompany.bluraystore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class MovieController {

    // private MovieService service = new MovieService();
    @Autowired
    private MovieServiceInterface service;

    public void addUsingConsole() {
        // je récupère les infos liées à mon film
        String title, genre;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a title :");
        title = scanner.nextLine();

        System.out.println("Enter a genre :");
        genre = scanner.nextLine();

        // créer mon film
        Movie movie = new Movie();
        movie.setGenre(genre);
        movie.setTitle(title);

        // j'appel le service pour enregistrer mon film

        service.registerMovie(movie);
    }

    public MovieServiceInterface getService() {
        return service;
    }

    public void setService(MovieServiceInterface service) {
        this.service = service;
    }
}
