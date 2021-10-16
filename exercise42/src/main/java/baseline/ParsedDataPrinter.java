/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;
// yeah yeah, a printer isn't a file parser per se, but this uses a file parser, which isn't an interface.
// this is better than having to pass in a file parser and using more than one instance
public class ParsedDataPrinter extends FileParser{
    private short getLongestStringLength(String key){
        short length = (short)this.getMappedData().get(0).get(key).length();
        // for maps in mappedData
        for(short i = 1; i<this.getMappedData().size();i++){
            // if value.length > length
            if(this.getMappedData().get(i).get(key).length()>length){
                // length = value.length
                length = (short)this.getMappedData().get(i).get(key).length();
            }
        }
        return length;
    }

    private void printSpacing(short cellWidth, short length){
        for(short i = length; i<cellWidth;i++){
            System.out.print(" ");
        }
    }

    public void printTabularData(){
        short longestLName = this.getLongestStringLength("lName");
        short longestFName = this.getLongestStringLength("fName");
        System.out.print("Last");
        this.printSpacing((short)(longestLName+2), (short)4);
        System.out.print("First");
        this.printSpacing((short)(longestLName+2), (short)5);
        System.out.println("Salary\n--------------------------");
        short lNameLen;
        short fNameLen;
        // for maps in mappedData
        for(short i = 0; i < this.getMappedData().size();i++){
            // I will leave these as local variables because sonarlint tells me to convert to local variables if I do
            lNameLen = (short)this.getMappedData().get(i).get("lName").length();
            fNameLen = (short)this.getMappedData().get(i).get("fName").length();
            // print last name, spaces, first name, spaces, and salary
            System.out.print(this.getMappedData().get(i).get("lName"));
            this.printSpacing((short)(longestLName+2), lNameLen);
            System.out.print(this.getMappedData().get(i).get("fName"));
            this.printSpacing((short)(longestFName+2), fNameLen);
            System.out.println(this.getMappedData().get(i).get("salary"));
        }
    }
}
