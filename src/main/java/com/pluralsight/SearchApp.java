package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchApp {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //Create ArrayList of Product Objects
        ArrayList<Product> productList = new ArrayList<>();

        //call getInventory to fill the list


        //display all products
        for (int i = 0; i < productList.size();i++){
            System.out.println( productList.get(i).getId() + " " + productList.get(i).getName() + " $" + productList.get(i).getPrice());
        }

        //Replace the code that loaded the ArrayList with code that reads data from a file
        try {
            FileReader reader = new FileReader("src/main/resources/inventory.csv");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        }catch (Exception e){
            System.out.println("Couldn't Write to file");
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
        ArrayList<Product> productList = new ArrayList<>();

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
