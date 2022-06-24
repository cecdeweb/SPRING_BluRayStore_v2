package com.mycompany.bluraystore;

import com.mycompany.bluraystore.controller.MovieController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@PropertySource("classpath:application.properties")
public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = SpringApplication.run(App.class);

        MovieController controller = context.getBean(MovieController.class);

        controller.addUsingConsole();

    }
}
