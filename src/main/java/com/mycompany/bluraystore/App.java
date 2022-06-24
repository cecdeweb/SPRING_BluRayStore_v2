package com.mycompany.bluraystore;

import com.mycompany.bluraystore.controller.MovieController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@Configuration
//@ComponentScan(basePackages = {
//        "com.mycompany.bluraystore.controller",
//        "com.mycompany.bluraystore.service",
//        "com.mycompany.bluraystore.repository.file"
//})
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
