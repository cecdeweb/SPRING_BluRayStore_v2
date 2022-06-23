package com.mycompany.bluraystore.repository.file;

import com.mycompany.bluraystore.entity.Movie;
import com.mycompany.bluraystore.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Repository
public class FileMovieRepository implements MovieRepositoryInterface {

    @Value("${bluraystore_file}")
    private File file;


    public void add(Movie movie) {

        FileWriter writer;

        try{
            writer = new FileWriter(file,true);
            writer.write(movie.getTitle() + ";" + movie.getGenre() + "\n");
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Movie called " + movie.getTitle() + " has been added to your file text!");
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

}
