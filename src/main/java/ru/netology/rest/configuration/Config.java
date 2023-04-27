package ru.netology.rest.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import ru.netology.rest.repository.UserRepository;
import ru.netology.rest.resolver.UserArgumentResolver;

import java.util.List;

@Configuration
public class Config implements WebMvcConfigurer {

    @Bean
    public UserRepository userRepository() {
        UserRepository userRepository = new UserRepository();
        UserRepository.initAuthoritiesMap();
        return userRepository;
    }
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        UserArgumentResolver userArgumentResolver = new UserArgumentResolver();
        argumentResolvers.add(userArgumentResolver);
    }
}
