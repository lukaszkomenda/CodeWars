package org.example.codeWars;


import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

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
        if (dna == null) {
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

        if (a && !b) {
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

        if (year % 4 != 0) {
            num = 365;
        } else if (year % 400 == 0) {
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

    @Override
    public int findSmallestInt(int[] args) {
        int num = args[0];

        for (int arg : args) {
            if (num >= arg) {
                num = arg;
            }
        }

        return num;
    }

    @Override
    public String boolToWord(boolean b) {
        if (b) {
            return "Yes";
        } else {
            return "No";
        }
    }

    @Override
    public String grader(double score) {

        if (score > 1 || score < 0.6) {
            return "F";
        } else if (score >= 0.9) {
            return "A";
        } else if (score >= 0.8) {
            return "B";
        } else if (score >= 0.7) {
            return "C";
        } else if (score >= 0.6) {
            return "D";
        } else {
            return "F";
        }
    }

    @Override
    public int liters(double time) {
        double need = 0.5;

        return (int) (need * time);
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int counter = 0;

        for (int j : numbers) {
            if (j % divider == 0) {
                counter++;
            }
        }

        int[] array = new int[counter];
        int n = 0;

        for (int number : numbers) {
            if (number % divider == 0) {
                array[n] = number;
                n++;
            }
        }

        return array;
    }

    @Override
    public String bmi(double weight, double height) {
        double bmiValue = weight / Math.pow(height, 2);

        if (bmiValue <= 18.5) {
            return "Underweight";
        } else if (bmiValue > 18.5 && bmiValue <= 25.0) {
            return "Normal";
        } else if (bmiValue > 25.0 && bmiValue <= 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    @Override
    public Integer basicMath(String op, int v1, int v2) {

        if (Objects.equals(op, "+")) {
            return v1 + v2;
        } else if (Objects.equals(op, "-")) {
            return v1 - v2;
        } else if (Objects.equals(op, "*")) {
            return v1 * v2;
        } else {
            return v1 / v2;
        }

    }

    @Override
    public boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return distanceToPump <= (mpg * fuelLeft);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public boolean setAlarm(boolean employed, boolean vacation) {
        if (employed && vacation) {
            return false;
        } else if (!employed && vacation) {
            return false;
        } else return employed;
    }

    @Override
    public int squareSum(int[] n) {
        int sum = 0;

        for (int j : n) {
            sum += j * j;
        }
        return sum;
    }

    @Override
    public String spinWords(String sentence) {
        StringBuilder sentenceReoriented = new StringBuilder();

        String[] array = sentence.split(" ");

        int numberOfCharacters = array[0].length();

        if (array.length == 1 && numberOfCharacters >= 5) {
            StringBuilder sentenceReverse = new StringBuilder(array[0]);
            return sentenceReverse.reverse().toString();
        }

        for (int i = 0; i < array.length; i++) {

            StringBuilder sentenceReverse = new StringBuilder(array[i]);
            numberOfCharacters = array[i].length();

            if (numberOfCharacters < 5 && i != array.length - 1) {
                sentenceReoriented.append(array[i]).append(" ");
            } else if (numberOfCharacters >= 5 && i != array.length - 1) {
                sentenceReoriented.append(sentenceReverse.reverse()).append(" ");
            } else if (numberOfCharacters < 5 && i == array.length - 1) {
                sentenceReoriented.append(array[i]);
            } else {
                sentenceReoriented.append(sentenceReverse.reverse());
            }
        }

        return sentenceReoriented.toString();
    }

    @Override
    public int enough(int cap, int on, int wait) {
        if (on + wait <= cap) {
            return 0;
        } else {
            return on + wait - cap;
        }
    }

    @Override
    public boolean isEven(double n) {
        return n % 2 == 0;
    }

    @Override
    public String vaporCode(String s) {

        String[] array = s.replaceAll(" ", "")
                .toUpperCase()
                .split("");
        StringBuilder newS = new StringBuilder();

        for (String value : array) {
            newS.append(value).append("  ");
        }

        return newS.toString().trim();
    }

    @Override
    public String capitalize(String s, int[] ind) {

        char[] array = s.toCharArray();

        for (int j : ind) {
            if (j <= s.length()) {
                array[j] = Character.toUpperCase(array[j]);
            }
        }
        return new String(array);
    }

    @Override
    public String abbrevName(String name) {
        int spaceIndex = name.indexOf(" ");

        return name.toUpperCase()
                .charAt(0) + "." + name.toUpperCase()
                .charAt(spaceIndex + 1);
    }

    @Override
    public double twoDecimalPlaces(double number) {

        long factor = (long) Math.pow(10, 2);
        number *= factor;

        long tmp = Math.round(number);
        return (double) tmp / factor;
    }

    @Override
    public int oddOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String areYouPlayingBanjo(String name) {

        if (name.toUpperCase().charAt(0) == 'R') {
            return name + " plays banjo";
        }

        return name + " does not play banjo";
    }

    @Override
    public String replaceDots(String str) {
        return str.replaceAll("\\.", "-");
    }

    @Override
    public int digits(long n) {
        String digits = Long.toString(n);

        return digits.length();
    }

    @Override
    public String[] capitalize(String s) {

        StringBuilder capOdd = new StringBuilder();
        StringBuilder capNonOdd = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            String toUpperCase = s.substring(i, i + 1).toUpperCase();
            String toLowerCase = s.substring(i, i + 1).toLowerCase();
            if (i % 2 == 0) {
                capOdd.append(toUpperCase);
                capNonOdd.append(toLowerCase);
            } else {
                capNonOdd.append(toUpperCase);
                capOdd.append(toLowerCase);
            }
        }

        return new String[]{capOdd.toString(), capNonOdd.toString()};
    }

    @Override
    public String[] stringToArray(String s) {
        return s.split(" ");
    }

    @Override
    public String countingSheep(int num) {

        StringBuilder sb = new StringBuilder();
        int counter = 1;

        while (num != 0) {
            sb.append(counter).append(" sheep...");
            num--;
            counter++;
        }

        return sb.toString();
    }

    @Override
    public String remove(String str) {
        return str.substring(1, str.length() - 1);
    }

    @Override
    public int opposite(int number) {
        return -number;
    }

    @Override
    public String numberToString(int num) {
        return num + "";
    }

    @Override
    public String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    @Override
    public int makeNegative(int x) {
        if (x > 0) {
            return -x;
        }
        return x;
    }

    @Override
    public long[] powersOfTwo(int n) {
        long[] powers = new long[n + 1];

        for (int i = 0; i < powers.length; i++) {
            powers[i] = (long) Math.pow(2, i);
        }

        return powers;
    }

    @Override
    public boolean validatePin(String pin) {

        char[] array = pin.toCharArray();

        for (char c : array) {
            boolean isDigit = Character.isDigit(c);
            if (!isDigit) {
                return false;
            }
        }

        return pin.length() >= 4 && pin.length() <= 6;
    }

    @Override
    public int[] countBy(int x, int n) {

        int[] array = new int[n];
        array[0] = x;

        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + x;
        }

        return array;
    }

    @Override
    public char getChar(int c) {
        return (char) c;
    }

    @Override
    public int minimumSteps(int[] numbers, int k) {

        Arrays.sort(numbers);

        int minA = numbers[0];
        int minB = numbers[1];
        int counter = 0;
        int sum = minA + minB;

        do {
            counter++;
            sum += minA + minB;
        } while (sum < k);

        return counter;
    }

    @Override
    public int findDifference(int[] firstCuboid, int[] secondCuboid) {

        int volume1 = 1;
        int volume2 = 1;

        for (int k : firstCuboid) {
            volume1 *= k;
        }

        for (int j : secondCuboid) {
            volume2 *= j;
        }

        if (volume1 > volume2) {
            return volume1 - volume2;
        } else if (volume2 > volume1) {
            return volume2 - volume1;
        }

        return 0;
    }

    @Override
    public int[] digitize(int n) {

        String str = String.valueOf(n);
        int[] digits = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            digits[i] = Character.digit(str.charAt(i), 10);
        }

        return digits;
    }

    @Override
    public long factorial(int n) {
        long fact = 1;

        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    @Override
    public long factorialStream(int n) {
        return LongStream.rangeClosed(1, n)
                .reduce(1, (long x, long y) -> x * y);
    }

    @Override
    public boolean isAscOrder(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isAscOrderIntStream(int[] arr) {
        return IntStream.range(0, arr.length - 1).noneMatch(i -> arr[i] > arr[i + 1]);
    }

    @Override
    public String longestWord(String wordString) {

        String[] words = wordString.split(" ");
        String max = "";

        for (int i = words.length - 1; i > 0; i--) {
            if (words[i].length() > max.length()) {
                max = words[i];
            }
        }

        return max;
    }

    @Override
    public int sumOfAngles(int n) {
        return (n - 2) * 180;
    }

    @Override
    public int century(int number) {
        if (number % 100 == 0){
            number /= 100;
        } else {
            number = (number / 100) + 1;
        }

        return number;
    }

    @Override
    public int countBits(int n) {
        return Integer.bitCount(n);
    }


}




