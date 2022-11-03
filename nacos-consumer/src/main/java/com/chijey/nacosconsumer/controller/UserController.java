package com.chijey.nacosconsumer.controller;

import com.chijey.helloapi.feign.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class UserController {

    @Autowired
    private UserClient userClient;

    @RequestMapping("/getall")
	public List<String> getAllGreetings() {
		List<String> greetings = userClient.getGreetings();
		return greetings;
	}
}
