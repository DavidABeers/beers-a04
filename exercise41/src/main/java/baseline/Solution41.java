/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import java.io.File;

public class Solution41 {
    public static void main(String[] args) {
        NameSorter ns = new NameSorter();
        File input = new File("exercise41_input.txt");
        File output = new File("exercise41_output.txt");
        ns.readNames(input);
        ns.sortNames();
        ns.printNamesToFile(output);
    }
}
