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
}

