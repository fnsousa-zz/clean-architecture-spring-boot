package com.github.fnsousa.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserUnitTest {

    @Test
    public void passwordSizeLessThanFive() {
        User user = new CommonUser("unitTest", "123");
        assertThat(user.passwordIsValid()).isFalse();
    }

}
