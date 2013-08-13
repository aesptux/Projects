package com.aesptux.projects.Numbers;

import java.util.Scanner;

public class Factorial {
    public static int factorial_loop() {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int f = 1;
        while (num > 0) {
            f *= num;
            num--;
        }
        return f;

    }

    public static int factorial_recursive(int num) {
        int f;
        if (num == 1 ) return 1;
        f = factorial_recursive(num - 1) * num;
        return f;
    }
}
