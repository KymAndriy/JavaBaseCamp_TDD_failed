package com.test;

import com.company.EnglishCaesar;
import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CaesarTest {

    @Test
    public void isStringInLowerCase(){
        EnglishCaesar unit = new EnglishCaesar();

       assertTrue(unit.isLowerCase());
    }

}
