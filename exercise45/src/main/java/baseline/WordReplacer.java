/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import java.io.File;
import java.util.ArrayList;

public class WordReplacer {
    private final ArrayList<String> inputStrings = new ArrayList<>();

    // reads data from the input file into stringBeingReplaced
    private void readInput(){
        File input = new File("data/exercise45_input.txt");
        // declare scanner for input
        // while input hasNext
            // add next to inputStrings
    }

    //  replaces all instances of sequenceToReplace in original with replacement, and passes back the new String
    public String replaceInstancesOf(String sequenceToReplace, String replacement){
        this.readInput();
        StringBuilder editor = new StringBuilder();
        // for strings in inputStrings
            // get the next index of sequenceToReplace
            // replace sequenceToReplace in inputStrings.get at the index with replacement
        // build and return a new String with inputStrings
    }

    // generates the output file
    public void makeOutputFile(){
        // make a scanner
        // prompt for the output file name
        // make the output file
        // write the result of replaceInstancesOf to the output file.

    }

}
