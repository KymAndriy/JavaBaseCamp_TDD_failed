package com.test;

import com.company.EnglishCaesar;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CaesarTest {

    EnglishCaesar unit;

    @Before
    void beforeTest(){
        EnglishCaesar unit = new EnglishCaesar();
    }

    @Test
    public void whenStringUpperReturnFalseAndLowerReturnFalse(){
        assertTrue(!unit.isLowerCase("KUGKJHGKG"));
        assertTrue(unit.isLowerCase("ksjlhkfalkf"));
    }

    @Test
    public void checkCaesarString(){

        assertEquals("axvjrwn unccdln",unit.caesarCipher("romaine lettce", 9));
    }

}
