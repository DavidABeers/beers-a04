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
import java.util.Scanner;

public class WordReplacer {
    private final ArrayList<String> inputStrings = new ArrayList<>();

    // reads data from the input file into stringBeingReplaced
    private void readInput(){
        File input = new File("data/exercise45_input.txt");
        // declare scanner for input
        try {
            Scanner reader = new Scanner(input);
            // while input hasNext
            while(reader.hasNext()){
                // add next to inputStrings
                inputStrings.add(reader.next());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //  replaces all instances of sequenceToReplace in original with replacement, and passes back the new String
    public String replaceInstancesOf(String sequenceToReplace, String replacement){
        this.readInput();
        // for strings in inputStrings
        StringBuilder replacedString = new StringBuilder();
        for(String word:inputStrings){
            // replace sequenceToReplace in word with replacement
            word = word.replaceAll(sequenceToReplace, replacement) + " ";
            replacedString.append(word);
        }
        replacedString.delete(replacedString.length()-1,replacedString.length());
        // build and return a new String with inputStrings
        return replacedString.toString();
    }

    // generates the output file
    public void makeOutputFile(){
        // make a scanner
        Scanner in = new Scanner(System.in);
        // prompt for the output file name
        System.out.println("What would you like to call the output file? ");
        // make the output file
        File output = new File("data/" + in.next());
        try {
            FileWriter writer = new FileWriter(output); // this is closed, and the finally clause wouldn't work as is
            boolean created = output.createNewFile(); // this really only exists to do something with the return value
            // write the result of replaceInstancesOf to the output file.
            writer.write(this.replaceInstancesOf("utilize", "use"));
            if(created){
                System.out.println("Output file created.");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
