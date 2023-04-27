package ru.netology.rest.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import ru.netology.rest.authorities.Authorities;

import java.util.List;

public class User {
    @Size (min = 2,max = 20)
    @NotBlank
    @NotEmpty
    @NotNull
    private String user;
    @Size (min = 5,max = 20)
    @NotBlank
    @NotEmpty
    @NotNull
    private String password;

    private List <Authorities> authorities;

    public User(String user, String password, List<Authorities> authorities) {
        this.user = user;
        this.password = password;
        this.authorities = authorities;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Authorities> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authorities> authorities) {
        this.authorities = authorities;
    }

    @Override
    public String toString() {
        return "User{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", authorities=" + authorities +
                '}';
    }
}
