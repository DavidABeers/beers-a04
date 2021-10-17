/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SiteMaker {
    private static final String SITE_PATH = "data/website/";

    // gets user's response to prompt
    public String getPromptedUserInput(String prompt){
        // create scanner
        Scanner in = new Scanner(System.in);
        // ask for an input
        System.out.println(prompt);
        // return the input
        return in.nextLine();
    }

    // creates a folder in folderPath
    private void generateFolder(String folderPath){
        // create folder with folderPath
        File dir = new File(folderPath);
        // if created, print the directory created
        if(dir.mkdirs()){
            System.out.printf("created %s%n", folderPath);
        }
    }
    // creates the html file with title and author name
    private void generateHTML(String title, String author, String path){
        // makes the file object
        File html = new File(path+"/index.html");
        // create the file
        try {
            if(html.createNewFile()){
                // if created, print the file directory made
                System.out.println("Created " + html.getPath());
                // create a fileWriter
                FileWriter writer = new FileWriter(html); // this resource is closed sonarlint is being dumb
                // write in the title and author
                writer.write("<title>"+title+"</title>\n<meta>"+author+"</meta>");
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Creates the site folders and files
    public void generateSite(){
        // ask for and store the site name
        String name = this.getPromptedUserInput("Site Name: ");
        // ask for and store the author
        String author = this.getPromptedUserInput("Author: ");
        // ask for and store if the user wants a JS folder
        String js = this.getPromptedUserInput("Do you want a folder for JavaScript?");
        // ask for and store if the user wants a CSS folder
        String css = this.getPromptedUserInput("Do you want a folder for CSS?");
        // create folder, and if the folder is created, print that was created.
        this.generateFolder(SITE_PATH +name);
        // create html file, and if the html file is created, print that it was
        this.generateHTML(name, author, (SITE_PATH +name));
        // if the user wants a js folder, make one and print it was made if it was created
        if(js.equalsIgnoreCase("y")){
            this.generateFolder(SITE_PATH +name+"/JS");
        }
        // if the user wants a css folder, make one and print it was made if it was created
        if(css.equalsIgnoreCase("y")){
            this.generateFolder(SITE_PATH +name+"/CSS");
        }
    }
}
