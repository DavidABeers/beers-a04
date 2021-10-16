/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileParser {
    // stores data to be parsed
    private final List<String> data = new ArrayList<>();
    // stores organized data
    private final List<Map<String, String>> mappedData = new ArrayList<>();

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
        File input = new File(inputPath);
        try {
            // declare scanner
            Scanner fileReader = new Scanner(input);
            // while input has next line
            while(fileReader.hasNextLine()){
                // add next line to data
                data.add(fileReader.nextLine());
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // gets the next comma in stringToParse
    private short getNextCommaPos(String stringToParse){
        short commaPos = 0;
        // for substrings in string
        for(short i = 0; i<stringToParse.length();i++){
            // if substring is ","
            if(stringToParse.charAt(i) == ','){
                commaPos = i;
                break;
            }
        }
        // return i
        return commaPos;
    }

    // assign data to maps and add those maps to mappedData
    public void mapData(){
        short firstCommaPos;
        short secondCommaPos;
        //for strings in data
        for(String employee : data){
            // get firstCommaPos
            firstCommaPos = getNextCommaPos(employee);
            // get secondCommaPos
            secondCommaPos = (short)(getNextCommaPos(employee.substring(firstCommaPos+1)) + firstCommaPos+1);
            // new map
            Map<String, String> dataMap = new HashMap<>();
            // map lName to string until firstCommaPos
            dataMap.put("lName", employee.substring(0,firstCommaPos));
            // map fName to string between firstCommaPos and secondCommaPos
            dataMap.put("fName", employee.substring(firstCommaPos+1, secondCommaPos));
            // map salary to string after secondCommaPos
            dataMap.put("salary", employee.substring(secondCommaPos+1));
            // add new map to mappedData
            mappedData.add(dataMap);
        }
    }
}
