package com.chijey.helloservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

@SpringBootApplication
@RestController
public class HelloServiceApplication {
    private static Logger log = LoggerFactory.getLogger(HelloServiceApplication.class);

    @RequestMapping(value = "/greeting")
    public String greet() {
        log.info("Access /greeting");

        List<String> greetings = Arrays.asList("Hi there", "Greetings", "Salutations");
        Random rand = new Random();

        int randomNum = rand.nextInt(greetings.size());
        return greetings.get(randomNum);
    }

    @RequestMapping(value = "/hi_getall")
    public List<String> getall() {
        log.info("Access /getall");

        List<String> greetings = Arrays.asList("Hi there", "Greetings", "Salutations");
        return greetings;
    }

    @RequestMapping(value = "/")
    public String home() {
        log.info("Access /");
        return "Hi!";
    }
    public static void main(String[] args) {
        SpringApplication.run(HelloServiceApplication.class, args);
    }

    @Autowired
    private DummyConfig dummyConfig;

    @GetMapping("/health")
    public String health() {
        return "success";
    }

    @GetMapping("/hello")
    public String hello() {
        return dummyConfig.getMessage()
                + " ["
                + new SimpleDateFormat().format(new Date())
                + "]";
    }


}
