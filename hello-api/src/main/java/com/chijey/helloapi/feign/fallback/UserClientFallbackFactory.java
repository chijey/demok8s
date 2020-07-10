package com.chijey.helloapi.feign.fallback;

import com.chijey.helloapi.feign.UserClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component
public class UserClientFallbackFactory implements FallbackFactory<UserClient> {
    @Override
    public UserClient create(Throwable throwable) {
        return new UserClient() {
            @Override
            public List<String> getGreetings() {
                return Arrays.asList("Hello", "tryGetGreetingsElse");
            }
        };
    }
}
