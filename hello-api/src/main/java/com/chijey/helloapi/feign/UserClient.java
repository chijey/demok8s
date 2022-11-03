package com.chijey.helloapi.feign;

import com.chijey.helloapi.feign.fallback.UserClientFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "hello-service", url = "http://hello-service:8083", fallbackFactory = UserClientFallbackFactory.class)
public interface UserClient  {
    @RequestMapping(method = RequestMethod.GET, value = "/hi_getall", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    List<String> getGreetings();


}
