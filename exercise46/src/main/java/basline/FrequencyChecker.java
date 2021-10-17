/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 David Beers
 */
package basline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FrequencyChecker {
    private final List<String> words = new ArrayList<>();
    private final List<Integer> frequency = new ArrayList<>();

    public List<Integer> getFrequency() {
        return frequency;
    }

    // reads the input file word by word
    public void getInput(){
        boolean newWord;
        // create file object
        File input = new File("data/exercise46_input.txt");
        // create scanner for file object
        try {
            Scanner in = new Scanner(input);
            // String word = scanner next
            String word = in.next();
            // words add word
            words.add(word);
            // frequency add 1
            frequency.add(1);
            // while scanner has another word:
            while(in.hasNext()){
                newWord = true;
                // word = scanner next
                word = in.next();
                // for strings in words
                for(short i = 0;i<words.size();i++){
                    // if word = words.get(num)
                    if(word.equals(words.get(i))){
                        // update frequency for that word
                        frequency.set(i, frequency.get(i)+1);
                        // set newWord to false
                        newWord = false;
                    }
                }
                // if newWord
                if(newWord){
                    // words add word
                    words.add(word);
                    // frequency add 1
                    frequency.add(1);
                }
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void sortWordsAndFrequency(){
        for(int i = 0; i< words.size()-1;i++){
            if(frequency.get(i) < frequency.get(i+1)){
                String tempWord = words.get(i);
                int tempFreq = frequency.get(i);
                words.set(i, words.get(i+1));
                frequency.set(i, frequency.get(i+1));
                words.set(i+1, tempWord);
                frequency.set(i+1, tempFreq);
            }
        }
    }

    private short longestWordLength(){
        short length = 0;
        for(String word:words){
            if(word.length()>length){
                length = (short)word.length();
            }
        }
        return length;
    }

    // prints the words and frequency as a histogram
    public void printHistogram(){
        this.sortWordsAndFrequency();
        short longest = this.longestWordLength();
        // for size of words
        for(short i = 0; i<words.size();i++){
            // print words(i)
            System.out.print(words.get(i)+":");
            for(int j = words.get(i).length(); j < longest+2;j++){
                System.out.print(" ");
            }
            // for frequency(i)
            for(short j = 0; j < frequency.get(i);j++){
                // print an asterisk
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
