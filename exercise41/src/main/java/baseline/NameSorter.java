/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameSorter {
    // stores all the names
    private final List<String> names = new ArrayList<>();

    // this is just for testing purposes
    public List<String> getList(){
        return names;
    }

    // reads in the names from input
    public void readNames(String filepath){
        File input = new File(filepath);
        // declare scanner
        try {
            Scanner fileReader = new Scanner(input);
            // while input has next line
            while(fileReader.hasNextLine()){
                // add line to names
                names.add(fileReader.nextLine());
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // sorts the arraylist names alphabetically
    public void sortNames(){
        // for names
        for(int i = 0; i<names.size()-1;i++){
            // if next name is greater than current name
            if(names.get(i).compareTo(names.get(i+1))>0){
                // swap names in arraylist
                String temp = names.get(i);
                names.set(i, names.get(i+1));
                names.set(i+1, temp);
                // reset counter. Removing this assignment in the loop will prevent the list from being fully sorted
                i = 0;
                // a recursive algorithm wouldn't need this but that's kind of annoying to do
            }
        }
        // yes this is a slow algorithm but mergesort is a pain
    }

    // prints all strings in names to the output file
    public void printNamesToFile(String filepath){
        try {
            // this resource is closed, SonarLint is just being dumb
            FileWriter writer = new FileWriter(filepath);
            // for names
            for(String name : names){
                // print names to file
                writer.write(name + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
