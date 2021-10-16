/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FileParser {
    // stores data to be parsed
    private List<String> data = new ArrayList<>();
    // stores organized data
    private List<Map<String, String>> mappedData = new ArrayList<>();

    // this is just to test readData
    public List<String> getData(){
        return data;
    }

    // returns data for printing
    public List<Map<String, String>> getMappedData() {
        return mappedData;
    }

    // reads in data from the input file
    public void readData(String inputPath){
        // declare file object input with path inputPath
        // declare scanner
        // while input has another line
            // add nextline to data
    }

    // gets the next comma in stringToParse
    private short getNextCommaPos(String stringToParse){
        // for substrings in string
            // if substring is ","
                // return i
    }

    // assign data to maps and add those maps to mappedData
    public void mapData(){
        short firstCommaPos;
        short secondCommaPos;
        //for strings in data
            // get firstCommaPos
            // get secondCommaPos
            // new map
            // map lName to string until firstCommaPos
            // map fName to string between firstCommaPos and secondCommaPos
            // map salary to string after secondCommaPos
            // add new map to mappedData
    }
}
