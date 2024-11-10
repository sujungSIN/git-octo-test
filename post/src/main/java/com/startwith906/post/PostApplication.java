package com.startwith906.post;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class PostApplication {

    public static void main(String[] args){
        SpringApplication.run(PostApplication.class, args);
    }

    @GetMapping(value = "/")
    public String doGetHelloWorld() {
        return "Hello World";
    }

    @GetMapping(value = "/post")
    public String doGetHelloWorldPost() {
        return "Hello World(우정정보센터)";
    }


}
