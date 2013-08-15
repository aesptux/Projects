package com.aesptux.projects;

import com.aesptux.projects.Numbers.Factorial;
import com.aesptux.projects.Numbers.Fibonacci;
import com.aesptux.projects.Classes.Inventory.Product;
import com.aesptux.projects.Classes.Inventory.Inventory;
import com.aesptux.projects.Text.CountVowels;
import com.aesptux.projects.Text.PigLatin;
import com.aesptux.projects.Text.ReverseString;

public class Main {

    public static void main(String[] args) {
        /*
        FACTORIAL
         */
        //System.out.println(Factorial.factorial_loop());
        //System.out.println(Factorial.factorial_recursive(10));

        /*
        FIBONACCI
         */
        // System.out.println(Fibonacci.Fibonacci(4));

        /*
        INVENTORY
         */
//        Product mouse = new Product();
//        mouse.id = 1;
//        mouse.price = 50;
//        mouse.quantity = 2;
//        Product keyboard = new Product();
//        keyboard.id = 2;
//        keyboard.price = 80;
//        keyboard.quantity = 4;
//
//        Inventory inventory = new Inventory();
//        inventory.addProduct(mouse);
//        inventory.addProduct(keyboard);
//
//        System.out.println("There are " + inventory.getTotalProducts() +
//                " items in the inventory");
//        System.out.println("The total value of the inventory is " +
//                inventory.getTotalValue());

        /*
        REVERSE STRING
         */
        System.out.println(ReverseString.ReverseString("Reverse this string"));

        /*
        PIG LATIN
         */
        System.out.println(PigLatin.PigLatin("Banana"));

        /*
        COUNT VOWELS
         */
        String toCountVowels = "Magical Software";
        Object[] result = CountVowels.CountVowels(toCountVowels);
        System.out.println("Total vowels in " + toCountVowels + " = " +
                result[1]);
        System.out.println(result[0]);

    }
}
