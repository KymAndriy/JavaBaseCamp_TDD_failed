package com.test;

import com.company.EnglishCaesar;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

public class CaesarTest {

    EnglishCaesar unit = new EnglishCaesar();


    @Test
    public void whenStringUpperReturnFalse(){
        assertTrue(unit.isLowerCase("ksjlhkfalkf"));
    }

    @Test
    public void whenTakeUpperOrMixedCaseStringMakeItLower(){
        assertEquals("Yess, someone made it",unit.caesarCipher("sjkaskdh", 9));
        assertNotEquals("Yess, someone made it", unit.caesarCipher("KHLKJLKJKLHJ:VK", 9));
    }

    @Test
    public void checkCaesarString(){

        assertEquals("axvjrwn unccdln",unit.caesarCipher("romaine lettce", 9));
    }

    @Test
    public void testChangeChar(){
        assertEquals('i',unit.replaceChar('a', 9));
    }

}
