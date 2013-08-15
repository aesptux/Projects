package com.aesptux.projects.Text;

import java.util.*;

public class CountVowels {
    public static Object[] CountVowels(String s) {
//        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        Hashtable vowels = new Hashtable();
        vowels.put('a', 0);
        vowels.put('e', 0);
        vowels.put('i', 0);
        vowels.put('o', 0);
        vowels.put('u', 0);
        int vowelCount = 0;
        for (int i = 0;i<s.length();i++) {
            char c = s.charAt(i);
            Object val = vowels.get(c);
            if (val != null) {
                vowelCount++;
                int value = (Integer) vowels.get(c);
                vowels.put(c, value + 1);
            }
        }

        return new Object[] {vowels, vowelCount};
    }
}
