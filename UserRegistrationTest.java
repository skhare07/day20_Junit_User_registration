package com.bridgelabz.junit_user_registration;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean fName = userRegistration.validateFirstName("Sourav");
        assertTrue(fName);
            }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean lName = userRegistration.validateLastName("Khare");
        assertTrue(lName);
        }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean email = userRegistration.validateEmail("abc.xyz@bl.co.in");
        assertTrue(email);
        }
}