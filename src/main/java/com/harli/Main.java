package com.harli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication

@RestController

public class Main {



    public static void main(String[] args) {
        System.out.println("Hello");
        SpringApplication.run(Main.class, args);
    }
    @GetMapping("/greet")
    public GreetResponse greet() {
        GreetResponse response = new GreetResponse("Hello",
                List.of("Java", "Golang", "Javascript"),
                new Person("Alex", 28, 30_000)

        );
        return response;
    }
    record Person (String name, int age, double savings){

    }

    record GreetResponse(String greet,
                         List<String> favProgrammingLanguages,
                         Person person
    ){

    }


}
