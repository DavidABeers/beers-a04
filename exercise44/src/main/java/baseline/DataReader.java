/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class DataReader {
    // stores the data from the input file in an object
    Products products;

    // returns what the user searches for
    public String getUserQuery(){
        // open scanner
        Scanner in = new Scanner(System.in);
        // prompt for a query
        System.out.println("What is the Product name? ");
        // return query
        return in.next();
    }

    // get data from the JSON file
    private void jsonToList(){
        // make a reader
        try {
            Reader inputReader = Files.newBufferedReader(Paths.get("data/exercise44_input.json"));
            // convert the input.json to object
            products = new Gson().fromJson(inputReader, Products.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // searches the list for a value with the key "name" matching the query
    public void printQueryResults(){
        this.jsonToList();
        boolean queryNotFound = true;
        // while queryNotFound
        while(queryNotFound){
            String query = this.getUserQuery();
            // for maps in data
            for(Product item : products.getProducts()){
                // if key name value is query,
                if(item.getName().equals(query)){
                    // print values related to that name
                    System.out.println("Name: "+ item.getName() + "\nPrice: " + item.getPrice() + "\nQuantity: "+ item.getQuantity());
                    // set queryNotFound to false
                    queryNotFound = false;
                    break;
                }
            }
            if(queryNotFound){
                System.out.println("Sorry, that product was not found in our inventory.");
            }
        }
    }
}
