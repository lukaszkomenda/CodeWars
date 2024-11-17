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

    @Test
    void vaporCodeTest() {
        //given
        String str = "Lets go to the movies";
        String str1 = "Why isnt my code working";
        //when
        String vaporcode = codeWars.vaporCode(str);
        String vaporcode1 = codeWars.vaporCode(str1);
        //then
        assertEquals("L  E  T  S  G  O  T  O  T  H  E  M  O  V  I  E  S", vaporcode);
        assertEquals("W  H  Y  I  S  N  T  M  Y  C  O  D  E  W  O  R  K  I  N  G", vaporcode1);
    }

    @Test
    void capitalizeTest() {
        //given
        String s = "abcdef";
        int[] ind = {1, 2, 5};

        String s1 = "abcdef";
        int[] ind1 = {1, 2, 5, 100};

        String s2 = "codewars";
        int[] ind2 = {1, 3, 5, 50};

        String s3 = "abracadabra";
        int[] ind3 = {2, 6, 9, 10};

        String s4 = "codewarriors";
        int[] ind4 = {5};
        //when
        String capitalize = codeWars.capitalize(s, ind);
        String capitalize1 = codeWars.capitalize(s1, ind1);
        String capitalize2 = codeWars.capitalize(s2, ind2);
        String capitalize3 = codeWars.capitalize(s3, ind3);
        String capitalize4 = codeWars.capitalize(s4, ind4);
        //then
        assertEquals("aBCdeF", capitalize);
        assertEquals("aBCdeF", capitalize1);
        assertEquals("cOdEwArs", capitalize2);
        assertEquals("abRacaDabRA", capitalize3);
        assertEquals("codewArriors", capitalize4);
    }

    @Test
    void abbrevNameTest() {
        //given
        String str = "Sam Harris";
        String str1 = "Patrick Feenan";
        String str2 = "Evan Cole";
        String str3 = "P Favuzzi";
        String str4 = "David Mendieta";
        //when
        String newStr = codeWars.abbrevName(str);
        String newStr1 = codeWars.abbrevName(str1);
        String newStr2 = codeWars.abbrevName(str2);
        String newStr3 = codeWars.abbrevName(str3);
        String newStr4 = codeWars.abbrevName(str4);
        //then
        assertEquals("S.H", newStr);
        assertEquals("P.F", newStr1);
        assertEquals("E.C", newStr2);
        assertEquals("P.F", newStr3);
        assertEquals("D.M", newStr4);
    }

    @Test
    void TwoDecimalPlacesTest() {
        //given
        double number = 4.659725356;
        double number1 = 173735326.3783732637948948;
        //when
        double roundNumber = codeWars.twoDecimalPlaces(number);
        double roundNumber1 = codeWars.twoDecimalPlaces(number1);
        //then
        assertEquals(4.66, roundNumber);
        assertEquals(173735326.38, roundNumber1);
    }

    @Test
    void oddOneTest() {
        //given
        int[] array = {2, 4, 6, 7, 10};
        int[] array1 = {2, 16, 98, 10, 13, 78};
        int[] array2 = {4, -8, 98, -12, -7, 90, 100};
        int[] array3 = {2, 4, 6, 8};
        //when
        int index = codeWars.oddOne(array);
        int index1 = codeWars.oddOne(array1);
        int index2 = codeWars.oddOne(array2);
        int index3 = codeWars.oddOne(array3);
        //then
        assertEquals(3, index);
        assertEquals(4, index1);
        assertEquals(4, index2);
        assertEquals(-1, index3);
    }

    @Test
    void areYouPlayingBanjoTest() {
        //given
        String name = "Martin";
        String name1 = "Rikke";
        String name2 = "rolf";
        String name3 = "bravo";
        //when
        String areYouPlayingBanjo = codeWars.areYouPlayingBanjo(name);
        String areYouPlayingBanjo1 = codeWars.areYouPlayingBanjo(name1);
        String areYouPlayingBanjo2 = codeWars.areYouPlayingBanjo(name2);
        String areYouPlayingBanjo3 = codeWars.areYouPlayingBanjo(name3);
        //then
        assertEquals("Martin does not play banjo", areYouPlayingBanjo);
        assertEquals("Rikke plays banjo", areYouPlayingBanjo1);
        assertEquals("rolf plays banjo", areYouPlayingBanjo2);
        assertEquals("bravo does not play banjo", areYouPlayingBanjo3);
    }

    @Test
    void replaceDotsTest() {
        //given
        final String str = "one.two.three";
        //when
        String newStr = codeWars.replaceDots(str);
        //then
        assertEquals("one-two-three", newStr);
    }

    @Test
    void digitsTest() {
        //given
        long n = 5L;
        long n1 = 12345L;
        long n2 = 9876543210L;
        //when
        int countDigits = codeWars.digits(n);
        int countDigits1 = codeWars.digits(n1);
        int countDigits2 = codeWars.digits(n2);
        //then
        assertEquals(1, countDigits);
        assertEquals(5, countDigits1);
        assertEquals(10, countDigits2);
    }

    @Test
    void capitalizeArrayTest() {
        //given
        String str = "abcdef";
        String str1 = "codewars";
        String str2 = "abracadabra";
        String str3 = "codewarriors";
        //when
        String[] strings = codeWars.capitalize(str);
        String[] strings1 = codeWars.capitalize(str1);
        String[] strings2 = codeWars.capitalize(str2);
        String[] strings3 = codeWars.capitalize(str3);
        //then
        String[] expectedArray = {"AbCdEf", "aBcDeF"};
        assertArrayEquals(expectedArray, strings);

        String[] expectedArray1 = {"CoDeWaRs", "cOdEwArS"};
        assertArrayEquals(expectedArray1, strings1);

        String[] expectedArray2 = {"AbRaCaDaBrA", "aBrAcAdAbRa"};
        assertArrayEquals(expectedArray2, strings2);

        String[] expectedArray3 = {"CoDeWaRrIoRs", "cOdEwArRiOrS"};
        assertArrayEquals(expectedArray3, strings3);
    }

    @Test
    void stringToArrayTest() {
        //given
        String str = "Robin Singh";
        String str1 = "I love arrays they are my favorite";
        //when
        String[] strings = codeWars.stringToArray(str);
        String[] strings1 = codeWars.stringToArray(str1);
        //then
        String[] expectedArray = {"Robin", "Singh"};
        assertArrayEquals(expectedArray, strings);

        String[] expectedArray1 = {"I", "love", "arrays", "they", "are", "my", "favorite"};
        assertArrayEquals(expectedArray1, strings1);
    }

    @Test
    void countingSheepTest() {
        //given
        int num = 0;
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        //when
        String result = codeWars.countingSheep(num);
        String result1 = codeWars.countingSheep(num1);
        String result2 = codeWars.countingSheep(num2);
        String result3 = codeWars.countingSheep(num3);
        //then
        assertEquals("", result);
        assertEquals("1 sheep...", result1);
        assertEquals("1 sheep...2 sheep...", result2);
        assertEquals("1 sheep...2 sheep...3 sheep...", result3);
    }

    @Test
    void removeTest() {
        //given
        String str = "eloquent";
        String str1 = "country";
        String str2 = "person";
        String str3 = "place";
        //when
        String newStr = codeWars.remove(str);
        String newStr1 = codeWars.remove(str1);
        String newStr2 = codeWars.remove(str2);
        String newStr3 = codeWars.remove(str3);
        //then
        assertEquals("loquen", newStr);
        assertEquals("ountr", newStr1);
        assertEquals("erso", newStr2);
        assertEquals("lac", newStr3);
    }

    @Test
    void oppositeTest() {
        //given
        int num = 1;
        //when
        int opposite = codeWars.opposite(num);
        //then
        assertEquals(-1, opposite);
    }

    @Test
    void numberToStringTest() {
        //given
        int num = 67;
        int num1 = 123;
        int num2 = 999;
        //when
        String numberToString = codeWars.numberToString(num);
        String numberToString1 = codeWars.numberToString(num1);
        String numberToString2 = codeWars.numberToString(num2);
        //then
        assertEquals("67", numberToString);
        assertEquals("123", numberToString1);
        assertEquals("999", numberToString2);
    }

    @Test
    void reverseStringTest() {
        //given
        String str = "world";
        //when
        String newStr = codeWars.reverseString(str);
        //then
        assertEquals("dlrow", newStr);
    }

    @Test
    void makeNegativeTest() {
        //given
        int num = 42;
        //when
        int newNum = codeWars.makeNegative(num);
        //then
        assertEquals(-42, newNum);
    }

    @Test
    void powersOfTwoTest() {
        //given
        int num = 0;
        int num1 = 1;
        int num2 = 4;
        //when
        long[] powersOfTwo = codeWars.powersOfTwo(num);
        long[] powersOfTwo1 = codeWars.powersOfTwo(num1);
        long[] powersOfTwo2 = codeWars.powersOfTwo(num2);
        //then
        long[] expectedArray = {1};
        assertArrayEquals(expectedArray, powersOfTwo);

        long[] expectedArray1 = {1, 2};
        assertArrayEquals(expectedArray1, powersOfTwo1);

        long[] expectedArray2 = {1, 2, 4, 8, 16};
        assertArrayEquals(expectedArray2, powersOfTwo2);
    }

    @Test
    void validatePinTest() {
        //given
        String pin = "1";
        String pin1 = "12";
        String pin2 = "123";
        String pin3 = "12345";
        String pin4 = "-1234";
        //when
        boolean isValid = codeWars.validatePin(pin);
        boolean isValid1 = codeWars.validatePin(pin1);
        boolean isValid2 = codeWars.validatePin(pin2);
        boolean isValid3 = codeWars.validatePin(pin3);
        boolean isValid4 = codeWars.validatePin(pin4);
        //then
        assertFalse(isValid);
        assertFalse(isValid1);
        assertFalse(isValid2);
        assertTrue(isValid3);
        assertFalse(isValid4);
    }
}