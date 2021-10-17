/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 David Beers
 */
package basline;

import java.util.ArrayList;
import java.util.Scanner;

public class FrequencyChecker {
    private ArrayList<String> words = new ArrayList<>();
    private ArrayList<Integer> frequency = new ArrayList<>();

    public ArrayList<Integer> getFrequency() {
        return frequency;
    }

    // reads the input file word by word
    public void getInput(){
        boolean newWord = true;
        // create file object
        // create scanner for file object
        // String word = scanner next
        // words add word
        // frequency add 1
        // while scanner has another word:
            // word = scanner next
            // for strings in words
                // if word = words.get(num)
                    // frequency.set(i, frequency.get(i)+1)
                    // newWord = false
            // if newWord
                // words add word
                // frequency add 1
    }

    // prints the words and frequency as a histogram
    public void printHistogram(){
        // for size of words
            // print words(i)
            // for frequency(i)
                // print an asterisk
    }
}
