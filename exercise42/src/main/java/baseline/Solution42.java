/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

public class Solution42 {
    public static void main(String[] args) {
        ParsedDataPrinter fp = new ParsedDataPrinter();
        fp.readData("exercise42_input.txt");
        fp.mapData();
        fp.printTabularData();
    }
}
