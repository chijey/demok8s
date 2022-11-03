package com.chijey.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
public class ProviderApplication {
    @RequestMapping(value = "/hi_getall")
    public List<String> getall() {
        List<String> greetings = Arrays.asList("Hi there", "Greetings", "Salutations");
        return greetings;
    }
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

}
