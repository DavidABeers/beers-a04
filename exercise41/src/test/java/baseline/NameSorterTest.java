package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NameSorterTest {

    @Test
    void testReadNames() {
        NameSorter ns = new NameSorter();
        List<String> expected = new ArrayList<>();
        File input = new File("exercise41_input.txt");
        expected.add("Ling, mai");
        expected.add("Johnson, Jim");
        expected.add("Zarnecki, Sabrina");
        expected.add("Jones, Chris");
        expected.add("Jones, Aaron");
        expected.add("Swift, Geoffrey");
        expected.add("Xiong, Fong");
        ns.readNames(input);
        List<String> actual = ns.getList();
        for(int i = 0; i<expected.size();i++){
            assertEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    void testSortNames() {

    }

    @Test
    void testPrintNamesToFile() {
    }
}