package com.pluralsight;

import java.util.ArrayList;

public class SearchApp {
    public static void main(String[] args) {
        //Create ArrayList of Product Objects
        ArrayList<Product> productList = new ArrayList<Product>();

        //call getInventory to fill the list
        productList = getInventory();

        //display all products
        for (int i = 0; i < productList.size();i++){
            System.out.println( productList.get(i).getId() + " " + productList.get(i).getName() + " $" + productList.get(i).getPrice());
        }
    }

    //Method need the Arraylist type to return to productList
    public static ArrayList<Product> getInventory(){
        //create 5+ product objects
        Product product1 = new Product(1, "The Beatles: Abbey Road (1969)", 29.99);
        Product product2 = new Product(2, "Crosley CR8005D Cruiser Deluxe Turntable", 89.99);
        Product product3 = new Product(3, "Sony Walkman TPS-L2 Replica Cassette Player", 49.99);
        Product product4 = new Product(4, "Modway Render Vinyl Record Display Stand", 234.99);
        Product product5 = new Product(5, "QFX Shoebox-Style Cassette Tape Player/Recorder", 47.99);
        ArrayList<Product> productList = new ArrayList<Product>();

        //add each one to the array list
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);

        //return the array list
        return productList;
    }


}
