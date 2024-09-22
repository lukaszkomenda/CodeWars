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

    @Test
    void findSmallestIntTest() {
        //given
        int[] arr = {78, 56, 232, 12, 11, 43};
        int[] arr1 = {0, Integer.MIN_VALUE, Integer.MAX_VALUE};
        int[] arr2 = {78, 56, -2, 12, 8, -33};
        //when
        int smallestInt = codeWars.findSmallestInt(arr);
        int smallestInt1 = codeWars.findSmallestInt(arr1);
        int smallestInt2 = codeWars.findSmallestInt(arr2);
        //then
        assertEquals(11, smallestInt);
        assertEquals(Integer.MIN_VALUE, smallestInt1);
        assertEquals(-33, smallestInt2);
    }

    @Test
    void boolToWord() {
        //given
        boolean b = true;
        boolean c = false;
        //when
        String word = codeWars.boolToWord(b);
        String word1 = codeWars.boolToWord(c);
        //then
        assertEquals("Yes", word);
        assertEquals("No", word1);
    }

    @Test
    void graderTest() {
        //given
        double score1 = 0.7;
        double score2 = 0.9;
        double score3 = 0.6;
        double score4 = 1.1;
        //when
        //then
        assertEquals("C", codeWars.grader(score1));
        assertEquals("A", codeWars.grader(score2));
        assertEquals("D", codeWars.grader(score3));
        assertEquals("F", codeWars.grader(score4));
    }

    @Test
    void litersTest() {
        //given
        double num = 2;
        double num1 = 0.97;
        double num2 = 14.64;
        double num3 = 1600.2;
        double num4 = 80;
        //when
        int liters = codeWars.liters(num);
        int liters1 = codeWars.liters(num1);
        int liters2 = codeWars.liters(num2);
        int liters3 = codeWars.liters(num3);
        int liters4 = codeWars.liters(num4);
        //then
        assertEquals(1, liters);
        assertEquals(0, liters1);
        assertEquals(7, liters2);
        assertEquals(800, liters3);
        assertEquals(40, liters4);
    }

    @Test
    void divisibleByTest() {
        //given
        int[] array = {1, 2, 3, 4, 5, 6};
        int d = 2;

        int[] array1 = {1, 2, 3, 4, 5, 6};
        int d1 = 3;

        int[] array2 = {0, 1, 2, 3, 4, 5, 6};
        int d2 = 4;
        //when
        int[] newArray = codeWars.divisibleBy(array, d);
        int[] newArray1 = codeWars.divisibleBy(array1, d1);
        int[] newArray2 = codeWars.divisibleBy(array2, d2);
        //then
        assertArrayEquals(new int[]{2, 4, 6}, newArray);
        assertArrayEquals(new int[]{3, 6}, newArray1);
        assertArrayEquals(new int[]{0, 4}, newArray2);
    }

    @Test
    void bmiTest() {
        //given
        double weight = 80;
        double height = 1.8;
        //when
        String result = codeWars.bmi(weight, height);
        //then
        assertEquals("Normal", result);
    }

    @Test
    void basicMathTest() {
        //given
        String op = "+";
        int v1 = 4;
        int v2 = 7;

        String op1 = "-";
        int v3 = 15;
        int v4 = 18;

        String op2 = "*";
        int v5 = 5;
        int v6 = 5;

        String op3 = "/";
        int v7 = 49;
        int v8 = 7;
        //when
        Integer result = codeWars.basicMath(op, v1, v2);
        Integer result1 = codeWars.basicMath(op1, v3, v4);
        Integer result2 = codeWars.basicMath(op2, v5, v6);
        Integer result3 = codeWars.basicMath(op3, v7, v8);
        //then
        assertEquals(11, result);
        assertEquals(-3, result1);
        assertEquals(25, result2);
        assertEquals(7, result3);
    }

    @Test
    void zeroFuelTest() {
        //given
        double dTP = 50;
        double mpg = 25;
        double fL = 2;

        double dTP1 = 100;
        double mpg1 = 50;
        double fL1 = 1;
        //when
        boolean isLoaded = codeWars.zeroFuel(dTP, mpg, fL);
        boolean isLoaded1 = codeWars.zeroFuel(dTP1, mpg1, fL1);
        //then
        assertTrue(isLoaded);
        assertFalse(isLoaded1);
    }

    @Test
    void getVolumeOfCuboidTest() {
        //given
        double length = 1;
        double width = 2;
        double height = 2;

        double length1 = 6.3;
        double width1 = 2;
        double height1 = 5;

        //when
        double result = codeWars.getVolumeOfCuboid(length, width, height);
        double result1 = codeWars.getVolumeOfCuboid(length1, width1, height1);
        //then
        assertEquals(4, result);
        assertEquals(63, result1);
    }

    @Test
    void setAlarmTest() {
        //given
        boolean employed = true;
        boolean vacation = false;

        boolean employed1 = true;
        boolean vacation1 = true;

        boolean employed2 = false;
        boolean vacation2 = false;

        boolean employed3 = false;
        boolean vacation3 = true;
        //when
        boolean isAlarmed = codeWars.setAlarm(employed, vacation);
        boolean isAlarmed1 = codeWars.setAlarm(employed1, vacation1);
        boolean isAlarmed2 = codeWars.setAlarm(employed2, vacation2);
        boolean isAlarmed3 = codeWars.setAlarm(employed3, vacation3);
        //then
        assertTrue(isAlarmed);
        assertFalse(isAlarmed1);
        assertFalse(isAlarmed2);
        assertFalse(isAlarmed3);
    }

    @Test
    void squareSumTest() {
        //given
        int[] array = {1, 2, 2};
        int[] array1 = {1, 2};
        int[] array2 = {5, -3, 4};
        int[] array3 = {};
        //when
        int result = codeWars.squareSum(array);
        int result1 = codeWars.squareSum(array1);
        int result2 = codeWars.squareSum(array2);
        int result3 = codeWars.squareSum(array3);
        //then
        assertEquals(9, result);
        assertEquals(5, result1);
        assertEquals(50, result2);
        assertEquals(0, result3);
    }

    @Test
    void spinWordsTest() {
        //given
        String sentence = "Welcome";
        String sentence1 = "Hey fellow warriors";
        //when
        String spinWords = codeWars.spinWords(sentence);
        String spinWords1 = codeWars.spinWords(sentence1);
        //then
        assertEquals("emocleW", spinWords);
        assertEquals("Hey wollef sroirraw", spinWords1);
    }

    @Test
    void enoughTest() {
        //given
        int cap = 10;
        int on = 5;
        int wait = 5;

        int cap1 = 100;
        int on1 = 60;
        int wait1 = 50;

        int cap2 = 20;
        int on2 = 5;
        int wait2 = 5;
        //when
        int result = codeWars.enough(cap, on, wait);
        int result1 = codeWars.enough(cap1, on1, wait1);
        int result2 = codeWars.enough(cap2, on2, wait2);
        //then
        assertEquals(0, result);
        assertEquals(10, result1);
        assertEquals(0, result2);
    }

    @Test
    void isEvenTest() {
        //given
        double num = 0;
        double num1 = 0.5;
        double num2 = 1;
        double num3 = 2;
        double num4 = -4;
        //when
        boolean isEven = codeWars.isEven(num);
        boolean isEven1 = codeWars.isEven(num1);
        boolean isEven2 = codeWars.isEven(num2);
        boolean isEven3 = codeWars.isEven(num3);
        boolean isEven4 = codeWars.isEven(num4);
        //then
        assertTrue(isEven);
        assertFalse(isEven1);
        assertFalse(isEven2);
        assertTrue(isEven3);
        assertTrue(isEven4);
    }

}