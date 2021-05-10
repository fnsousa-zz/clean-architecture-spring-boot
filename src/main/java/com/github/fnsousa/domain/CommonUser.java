package com.github.fnsousa.domain;

public class CommonUser implements User {

    String name;
    String password;

    public CommonUser(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public CommonUser() {
        super();
    }

    @Override
    public boolean passwordIsValid() {
        return this.password != null && this.password.length() > 5;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPassword() {
        return this.password;
    }
}
