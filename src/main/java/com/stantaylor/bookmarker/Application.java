package com.stantaylor.bookmarker;

import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    private static SessionFactory factory;

    public static void main(String[] args) throws Exception {

        SpringApplication.run(Application.class, args);

    }

}
