package com.aesptux.projects;

import com.aesptux.projects.Numbers.Factorial;

public class Main {

    public static void main(String[] args) {
        System.out.println(Factorial.factorial_loop());
        System.out.println(Factorial.factorial_recursive(10));
    }
}
