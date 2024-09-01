package org.example.codeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodeWarsImplTest {

    CodeWars codeWars = new CodeWarsImpl();

    @Test
    void checkPangramTest() {
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
    void whatCenturyTest() {
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
    void dnaToRnaTest() {
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
    void arrayPlusArrayTest() {
        //given
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] arr3 = {-1, -2, -3};
        int[] arr4 = {-4, -5, -6};

        int[] arr5 = {0, 0, 0};
        int[] arr6 = {4, 5, 6};

        int[] arr7 = {100, 200, 300};
        int[] arr8 = {400, 500, 600};
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

    @Test
    void doubleIntegerTest() {
        //given
        int num = 2;
        //when
        int doubleNum = codeWars.doubleInteger(num);
        //then
        assertEquals(4, doubleNum);
    }

    @Test
    void xorTest() {
        //given
        boolean a = false;
        boolean b = false;
        boolean c = true;
        boolean d = true;
        //when
        boolean xor = codeWars.xor(a, b);
        boolean xor1 = codeWars.xor(a, c);
        boolean xor2 = codeWars.xor(c, a);
        boolean xor3 = codeWars.xor(c, d);
        //then
        assertFalse(xor);
        assertTrue(xor1);
        assertTrue(xor2);
        assertFalse(xor3);
    }

    @Test
    void stantonMeasureTest() {
        //given
        int[] array = {1, 4, 3, 2, 1, 2, 3, 2};
        //when
        int num = codeWars.stantonMeasure(array);
        //then
        assertEquals(3, num);
    }

    @Test
    void daysInTheYearTest() {
        //given
        int year1 = 0;
        int year2 = -64;
        int year3 = 1974;
        int year4 = -10;
        //when
        String result1 = codeWars.daysInTheYear(year1);
        String result2 = codeWars.daysInTheYear(year2);
        String result3 = codeWars.daysInTheYear(year3);
        String result4 = codeWars.daysInTheYear(year4);
        //then
        assertEquals("0 has 366 days", result1);
        assertEquals("-64 has 366 days", result2);
        assertEquals("1974 has 365 days", result3);
        assertEquals("-10 has 365 days", result4);

    }

    @Test
    void multiplesTest() {
        //given
        int m = 3;
        int n = 5;
        //when
        int[] array = codeWars.multiples(m, n);
        //then
        assertArrayEquals(new int[]{5, 10, 15}, array);
        assertEquals(3, array.length);
    }

}