/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import java.io.File;

public class SiteMaker {
    // gets user's response to prompt
    public String getPromptedUserInput(String prompt){
        // create scanner
        // ask for an input
        // return the input
    }

    // creates a folder in folderPath
    private void generateFolder(String folderPath){
        // create folder with folderPath
        // if created, print the directory created
    }
    // creates the html file with title and author name
    private void generateHTML(String title, String author, String path){
        // makes the file object
        File html = new File(path+".html");
        // create the file
        // if created, print the file directory made
        // create a fileWriter
        // write in the title and author
    }

    // Creates the site folders and files
    public void generateSite(){
        // ask for and store the site name
        // ask for and store the author
        // ask for and store if the user wants a JS folder
        // ask for and store if the user wants a CSS folder
        // create folder, and if the folder is created, print that was created.
        // create html file, and if the html file is created, print that it was
        // if the user wants a js folder, make one and print it was made if it was created
        // if the user wants a css folder, make one and print it was made if it was created
    }
}
