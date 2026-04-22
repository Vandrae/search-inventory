package com.pluralsight;

import java.util.ArrayList;

public class SearchApp {
    public static void main(String[] args) {
        //Create ArrayList of Product Objects
        Product product1 = new Product(1, "The Beatles: Abbey Road (1969)", 29.99);
        Product product2 = new Product(2, "Crosley CR8005D Cruiser Deluxe Turntable", 89.99);
        Product product3 = new Product(3, "Sony Walkman TPS-L2 Replica Cassette Player", 49.99);
        Product product4 = new Product(4, "Modway Render Vinyl Record Display Stand", 234.99);
        Product product5 = new Product(5, "QFX Shoebox-Style Cassette Tape Player/Recorder", 47.99);

        //call getInventory to fill the list
        ArrayList<Product> productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        System.out.println(productList);

        //display all products
        for (int i = 0; i < productList.size();i++){
            System.out.println( productList.get(i).getId() + " " + productList.get(i).getName() + " " + productList.get(i).getPrice());
        }

    }

    //getInvintrory Method
        //create 5+ product objects
        //add each one to the array list
        //return the array list

}
