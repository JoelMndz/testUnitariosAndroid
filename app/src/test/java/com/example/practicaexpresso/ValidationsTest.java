package com.example.practicaexpresso;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidationsTest {

    @Test
    public void isEmpy_ReturnTrue(){
        Validations validations = new Validations();
        assertTrue(validations.isEmpy(""));
    }

    @Test
    public void isEmpy_ReturnFalse(){
        Validations validations = new Validations();
        assertFalse(validations.isEmpy("Hola"));
    }

    @Test
    public void emailValid_ReturnTrue(){
        Validations validations = new Validations();
        assertTrue(validations.emailValid("joel@gmail.com"));
    }

    @Test
    public void emailValid_ReturnFalse(){
        Validations validations = new Validations();
        assertFalse(validations.emailValid("joel@hotmail.com"));
    }

    @Test
    public void passwordValid_ReturnTrue(){
        Validations validations = new Validations();
        assertTrue(validations.passwordValid("joel202287"));
    }

    @Test
    public void passwordValid_ReturnFalse(){
        Validations validations = new Validations();
        assertFalse(validations.passwordValid("123"));
    }

}
