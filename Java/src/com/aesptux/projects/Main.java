package com.aesptux.projects;

import com.aesptux.projects.Numbers.Factorial;
import com.aesptux.projects.Numbers.Fibonacci;
import com.aesptux.projects.Classes.Inventory.Product;
import com.aesptux.projects.Classes.Inventory.Inventory;

public class Main {

    public static void main(String[] args) {
        //System.out.println(Factorial.factorial_loop());
        //System.out.println(Factorial.factorial_recursive(10));

        // System.out.println(Fibonacci.Fibonacci(4));

        // Inventory
        Product mouse = new Product();
        mouse.id = 1;
        mouse.price = 50;
        mouse.quantity = 2;
        Product keyboard = new Product();
        keyboard.id = 2;
        keyboard.price = 80;
        keyboard.quantity = 4;

        Inventory inventory = new Inventory();
        inventory.addProduct(mouse);
        inventory.addProduct(keyboard);

        System.out.println("There are " + inventory.getTotalProducts() +
                " items in the inventory");
        System.out.println("The total value of the inventory is " +
                inventory.getTotalValue());
    }
}
