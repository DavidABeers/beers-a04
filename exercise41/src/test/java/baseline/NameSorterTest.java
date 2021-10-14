/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NameSorterTest {

    @Test
    void testReadNames() {
        NameSorter ns = new NameSorter();
        List<String> expected = new ArrayList<>();
        expected.add("Ling, Mai");
        expected.add("Johnson, Jim");
        expected.add("Zarnecki, Sabrina");
        expected.add("Jones, Chris");
        expected.add("Jones, Aaron");
        expected.add("Swift, Geoffrey");
        expected.add("Xiong, Fong");
        ns.readNames("data/exercise41_input.txt");
        List<String> actual = ns.getList();
        for(int i = 0; i<expected.size();i++){
            assertEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    void testSortNames() {
        NameSorter ns = new NameSorter();
        List<String> expected = new ArrayList<>();
        expected.add("Johnson, Jim");
        expected.add("Jones, Aaron");
        expected.add("Jones, Chris");
        expected.add("Ling, Mai");
        expected.add("Swift, Geoffrey");
        expected.add("Xiong, Fong");
        expected.add("Zarnecki, Sabrina");
        ns.readNames("data/exercise41_input.txt");
        ns.sortNames();
        List<String> actual = ns.getList();
        for(int i = 0; i<expected.size();i++){
            assertEquals(expected.get(i), actual.get(i));
        }
    }
    //
    @Test
    void testPrintNamesToFile() {
        NameSorter ns = new NameSorter();
        List<String> expected = new ArrayList<>();
        expected.add("Ling, Mai");
        expected.add("Johnson, Jim");
        expected.add("Zarnecki, Sabrina");
        expected.add("Jones, Chris");
        expected.add("Jones, Aaron");
        expected.add("Swift, Geoffrey");
        expected.add("Xiong, Fong");
        ns.readNames("data/exercise41_input.txt");
        ns.printNamesToFile("data/exercise41_output.txt");
        ns.readNames("data/exercise41_output.txt");
        List<String> actual = ns.getList();
        for(int i = 0; i<expected.size();i++){
            assertEquals(expected.get(i), actual.get(i));
        }
    }
}