package com.example.freemoneynoscam.checkemail;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckEmailTest {
    //Arrange
    CheckEmail checkE = new CheckEmail();

    @Test
    void checkEmail() {
        String emailValid = "thon0101@stud.kea.dk";
        String emailInvalid = "thon@dk";
        String isThisValid = ".@";
        //Act
        boolean result1 = checkE.CheckEmail(emailValid);
        boolean result2 = checkE.CheckEmail(emailInvalid);
        boolean result3 = checkE.CheckEmail(isThisValid);
        //Assert
        assertEquals(true,result1);
        assertEquals(false,result2);
        assertEquals(false, result3);

    }
}