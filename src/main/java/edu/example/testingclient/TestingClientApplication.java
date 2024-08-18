package edu.example.testingclient;

import edu.example.testingclient.entities.Authority;
import edu.example.testingclient.entities.TestCase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static edu.example.testingclient.api.RestApiAccessService.*;

@SpringBootApplication
public class TestingClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestingClientApplication.class, args);
    }



}
