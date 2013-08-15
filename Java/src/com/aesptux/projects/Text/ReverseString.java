package com.aesptux.projects.Text;


public class ReverseString {

    public static String ReverseString(String s) {

     StringBuilder reversed = new StringBuilder(s);
     return reversed.reverse().toString();
    }
}
