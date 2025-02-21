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


/*
    Almost all the attributes we used with spring framework can be used as annotations in spring boot and core purpose of using spring boot is to spend
    less time on configurations.


    Different layers :-

    Client

    Server :- 1. Controller , 2. Service, 3. Repository..

    1. Accepts request and responds to requests.
    2. Service layer, works for all the processing of data and computations on server.
    3. Repository collects and dumps data in database and basically acts as data providing layer to service layer and
    service layer provides the response to controller to propagate back to client.

 */