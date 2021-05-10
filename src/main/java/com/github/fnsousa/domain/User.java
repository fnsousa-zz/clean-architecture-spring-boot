package com.github.fnsousa.domain;

public interface User {

    boolean passwordIsValid();

    String getName();

    String getPassword();

}
