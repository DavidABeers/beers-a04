/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;
// yeah yeah, a printer isn't a file parser per se, but this uses a file parser, which isn't an interface.
// this is better than having to pass in a file parser
public class ParsedDataPrinter extends FileParser{
    private short getLongestStringLength(String key){
        short length = (short)this.getMappedData().get(0).get(key).length();
        // for maps in mappedData
            // if value.length > length
                // length = value.length
        return length;
    }

    public void printTabularData(){
        short lNameLength = getLongestStringLength("lName");
        short fNameLength = getLongestStringLength("fName");
        // for maps in mappedData
            // print last name, spaces, first name, spaces, and salary
    }
}
