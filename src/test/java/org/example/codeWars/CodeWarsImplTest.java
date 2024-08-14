package org.example.codeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodeWarsImplTest {

    CodeWars codeWars = new CodeWarsImpl();

    @Test
    void checkPangramTest(){
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

    @Test
    void whatCenturyTest(){
        //given
        int year1 = 1999;
        int year2 = 2011;
        int year3 = 2154;
        int year4 = 2259;
        //when
        String century1 = codeWars.whatCentury(year1);
        String century2 = codeWars.whatCentury(year2);
        String century3 = codeWars.whatCentury(year3);
        String century4 = codeWars.whatCentury(year4);
        //then
        assertEquals("20th", century1);
        assertEquals("21st", century2);
        assertEquals("22nd", century3);
        assertEquals("23rd", century4);
    }

    @Test
    void dnaToRnaTest(){
        //given
        String bio1 = "TTTT";
        String bio2 = "GCAT";
        //when
        String rna1 = codeWars.dnaToRna(bio1);
        String rna2 = codeWars.dnaToRna(bio2);
        //then
        assertEquals("UUUU", rna1);
        assertEquals("GCAU", rna2);
    }

    @Test
    void arrayPlusArrayTest(){
        //given
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        int[] arr3 = {-1,-2,-3};
        int[] arr4 = {-4,-5,-6};

        int[] arr5 = {0,0,0};
        int[] arr6 = {4,5,6};

        int[] arr7 = {100,200,300};
        int[] arr8 = {400,500,600};
        //when
        int sum1 = codeWars.arrayPlusArray(arr1, arr2);
        int sum2 = codeWars.arrayPlusArray(arr3, arr4);
        int sum3 = codeWars.arrayPlusArray(arr5, arr6);
        int sum4 = codeWars.arrayPlusArray(arr7, arr8);
        //then
        assertEquals(21, sum1);
        assertEquals(-21, sum2);
        assertEquals(15, sum3);
        assertEquals(2100, sum4);
    }

}