/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 David Beers
 */
package basline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyCheckerTest {

    @Test
    void getInput() {
        FrequencyChecker fc = new FrequencyChecker();
        fc.getInput();
        int[] expected = {7, 2, 1};
        ArrayList<Integer> actual = fc.getFrequency();
        for(int i  =0;i<expected.length;i++){
            assertEquals(expected[i], actual.get(i));
        }
    }
}