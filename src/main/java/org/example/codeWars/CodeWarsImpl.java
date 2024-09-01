package org.example.codeWars;

public class CodeWarsImpl implements CodeWars {
    @Override
    public boolean checkPangram(String sentence) {
        boolean[] mark = new boolean[26];
        int index;

        for (int i = 0; i < sentence.length(); i++) {
            if ('A' <= sentence.charAt(i)
                    && sentence.charAt(i) <= 'Z') {
                index = sentence.charAt(i) - 'A';
            } else if ('a' <= sentence.charAt(i)
                    && sentence.charAt(i) <= 'z') {
                index = sentence.charAt(i) - 'a';
            } else {
                continue;
            }
            mark[index] = true;
        }

        for (int i = 0; i <= 25; i++) {
            if (!mark[i]) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String whatCentury(int year) {
        if (year % 100 == 0) {
            year /= 100;
        } else {
            year = (year / 100) + 1;
        }
        String[] suffixes = {"th", "st", "nd", "rd", "th", "th",
                "th", "th", "th", "th"};

        switch (year % 100) {
            case 11:
            case 12:
            case 13:
                return year + "th";
            default:
                return year + suffixes[year % 10];
        }
    }

    @Override
    public String dnaToRna(String dna) {
        if (dna == null){
            return null;
        } else {
            char[] signArray = dna
                    .toUpperCase()
                    .toCharArray();

            StringBuilder dnaBuilder = new StringBuilder();
            for (char c : signArray) {
                if (c == 'G' || c == 'C' || c == 'A') {
                    dnaBuilder.append(c);
                } else if (c == 'T') {
                    dnaBuilder.append('U');
                }
            }
            dna = dnaBuilder.toString();
        }

        return dna;
    }

    @Override
    public int arrayPlusArray(int[] arr1, int[] arr2) {
        int counter = 0;

        for (int j : arr1) {
            counter += j;
        }

        for (int j : arr2) {
            counter += j;
        }

        return counter;
    }

    @Override
    public int doubleInteger(int i) {
        return i * 2;
    }

    @Override
    public boolean xor(boolean a, boolean b) {

        if (a && !b){
            return true;
        } else return !a && b;
    }

    @Override
    public int stantonMeasure(int[] arr) {
        int oneCounter = 0;
        int statCounter = 0;

        for (int k : arr) {
            if (k == 1) {
                oneCounter++;
            }
        }

        for (int j : arr) {
            if (j == oneCounter) {
                statCounter++;
            }
        }

        return statCounter;
    }

    @Override
    public String daysInTheYear(int year) {
        int num;

        if (year % 4 != 0){
            num = 365;
        } else if (year % 400 == 0){
            num = 366;
        } else if (year % 100 == 0) {
            num = 365;
        } else {
            num = 366;
        }

        return year + " has " + num + " days";
    }

    @Override
    public int[] multiples(int m, int n) {
        int multipier = 1;
        int[] array = new int[m];

        for (int i = 0; i < m; i++) {
            array[i] = multipier * n;
            multipier++;
        }

        return array;
    }
}

