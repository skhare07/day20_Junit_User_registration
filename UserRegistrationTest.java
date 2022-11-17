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
}
