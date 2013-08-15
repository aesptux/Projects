package com.aesptux.projects.Text;


public class PigLatin {
    public static String PigLatin(String s) {
        char firstLetter = s.charAt(0);
        s = s.substring(1, s.length());

        return s + '-' + firstLetter + "ay";
    }
}
