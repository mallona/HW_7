package com.company;

import java.util.Objects;

public class Users {
    String login;
    String password;
    Types type;

    public Users(String login, String password, Types type) {
        this.login = login;
        this.password = password;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(login, users.login) && Objects.equals(password, users.password) && type == users.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, type);
    }
}
