package com.aesptux.projects.Classes.Inventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<Product> productList = new ArrayList<Product>();

    public void addProduct(Product product) {
        productList.add(product);
    }

    public int getTotalProducts() {
        return productList.size();
    }

    public int getTotalValue() {
        // get total value of the inventory
        int total = 0;
        for (Product p: productList) {
            total += p.quantity * p.price;
        }

        return total;
    }


}
