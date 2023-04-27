package ru.netology.rest.repository;

import ru.netology.rest.authorities.Authorities;
import ru.netology.rest.model.User;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
public class UserRepository {

    public static final Map<String, User> authoritiesMap = new ConcurrentHashMap<>();

    public static void initAuthoritiesMap() {
        User user1 = new User("Sergey", "12345", List.of(Authorities.READ, Authorities.WRITE, Authorities.DELETE));
        User user2 = new User("Elena", "56789", List.of(Authorities.READ, Authorities.WRITE));
        User user3 = new User("Andrey", "qwerty", List.of(Authorities.READ));

        authoritiesMap.put(user1.getUser(), user1);
        authoritiesMap.put(user2.getUser(), user2);
        authoritiesMap.put(user3.getUser(), user3);
    }

    public List<Authorities> getUserAuthorities(User user) {
        User searchUser = authoritiesMap.get(user);
        return (searchUser != null && searchUser.getPassword().equals(password) ? searchUser.getAuthorities() : Collections.emptyList());
    }
}
