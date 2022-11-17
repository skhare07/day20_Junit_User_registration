package com.bridgelabz.junit_user_registration;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean fName = userRegistration.validateFirstName("Sourav");
        Assertions.assertTrue(fName);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean lName = userRegistration.validateLastName("Khare");
        Assertions.assertTrue(lName);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean email = userRegistration.validateEmail("abc.xyz@bl.co.in");
        Assertions.assertTrue(email);
    }

    @Test
    public void givenPhoneNumber_WhenProperWithSpace_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean phoneNumber = userRegistration.validatePhoneNumber("91 9876543210");
        Assertions.assertTrue(phoneNumber);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue(){
        UserRegistration userRegistration = new UserRegistration();
        boolean email = userRegistration.validatePassword("qwertyui");
        Assertions.assertTrue(email);
    }

}