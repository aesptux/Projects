package com.aesptux.projects.Numbers;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static List<Integer> Fibonacci(int num) {
        List<Integer> fiboList = new ArrayList<Integer>();
        fiboList.add(1);
        while (fiboList.size() < num) {
            if (fiboList.size() == 1) {
                fiboList.add(1);
            } else {
                fiboList.add(fiboList.get(fiboList.size() - 1) + fiboList
                        .get(fiboList.size() - 2));
            }

        }

        return fiboList;

    }
}
