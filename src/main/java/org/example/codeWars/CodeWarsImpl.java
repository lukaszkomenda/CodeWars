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
}

