/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import java.io.File;

public class Solution41 {
    public static void main(String[] args) {
        NameSorter ns = new NameSorter();
        ns.readNames("data/exercise41_input.txt");
        ns.sortNames();
        ns.printNamesToFile();
    }
}
