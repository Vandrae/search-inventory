package com.pluralsight;

import java.util.ArrayList;

public class SearchApp {
    public static void main(String[] args) {
        //Create ArrayList of Product Objects
        Product product1 = new Product(01, "The Beatles: Abbey Road (1969)", 29.99);
        Product product2 = new Product(02, "Crosley CR8005D Cruiser Deluxe Turntable", 89.99);
        Product product3 = new Product(03, "Sony Walkman TPS-L2 Replica Cassette Player", 49.99);
        Product product4 = new Product(04, "Modway Render Vinyl Record Display Stand", 234.99);
        Product product5 = new Product(05, "QFX Shoebox-Style Cassette Tape Player/Recorder", 47.99);
        ArrayList<Product> productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        System.out.println(productList);

        //call getInventory to fill the list

        //display all products
    }

    //getInvintrory Method
        //create 5+ product objects
        //add each one to the array list
        //return the array list

}
