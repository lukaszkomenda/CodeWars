package org.example.codeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodeWarsImplTest {

    CodeWars codeWars = new CodeWarsImpl();

    @Test
    void checkPangram(){
        //given
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        String pangram2 = "You shall not pass!";
        //when
        boolean isPangram1 = codeWars.checkPangram(pangram1);
        boolean isPangram2 = codeWars.checkPangram(pangram2);
        //then
        assertTrue(isPangram1);
        assertFalse(isPangram2);
    }

}