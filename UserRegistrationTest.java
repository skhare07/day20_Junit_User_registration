package com.bridgelabz.junit_user_registration;

import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
       boolean fName = userRegistration.validateFirstName("Sourav");
        Assertions.assertTrue(fName);
    }
}
