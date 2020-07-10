package com.chijey.clientservice;

import com.chijey.helloapi.feign.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class UserController {

    @Autowired
    private UserClient userClient;

    @RequestMapping("/getall-hi")
	public List<String> getAllGreetings() {
		List<String> greetings = userClient.getGreetings();
		return greetings;
	}
}
