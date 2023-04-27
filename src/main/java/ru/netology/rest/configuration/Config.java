package ru.netology.rest.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.rest.repository.UserRepository;

@Configuration
public class Config {

    @Bean
    public UserRepository userRepository() {
        UserRepository userRepository = new UserRepository();
        UserRepository.initAuthoritiesMap();
        return userRepository;
    }

}
