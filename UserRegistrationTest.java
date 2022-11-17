package com.bridgelabz.junit_user_registration;

import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validateFirstName("Sourav");
            }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validateLastName("Khare");
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validateEmail("abc.xyz@bl.co.in");
    }
}