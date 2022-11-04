package com.chijey.nacosconsumer.controller;

import com.chijey.helloapi.feign.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class UserController {

    @Autowired
    private UserClient userClient;

	@Value("${useLocalCache:false}")
	private boolean useLocalCache;

    @RequestMapping("/getall")
	public List<String> getAllGreetings() {
		List<String> greetings = userClient.getGreetings();
		return greetings;
	}



	/**
	 * 查看是否获取道nacos配置接口
	 */
	@RequestMapping("/get")
	public boolean get() {
		return useLocalCache;
	}
}
