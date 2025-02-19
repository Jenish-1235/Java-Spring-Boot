package com.java.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);

        // Not creating object for alien manually... and using the container to get the object from spring itself...

        Alien alien = context.getBean(Alien.class);
        alien.code();

        Alien alien2 = context.getBean(Alien.class);
        alien2.code();

    }

}
