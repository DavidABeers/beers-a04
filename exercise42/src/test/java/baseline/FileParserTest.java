package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FileParserTest {

    @Test
    void testReadData() {
        FileParser fp = new FileParser();
        List<String> expected = new ArrayList<>();
        expected.add("Ling,Mai,55900");
        expected.add("Johnson,Jim,56500");
        expected.add("Jones,Aaron,46000");
        expected.add("Jones,Chris,34500");
        expected.add("Swift,Geoffrey,14200");
        expected.add("Xiong,Fong,65000");
        expected.add("Zarnecki,Sabrina,51500");
        fp.readData("data/exercise42_input.txt");
        List<String> actual = fp.getData();
        for(int i = 0; i<expected.size();i++){
            assertEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    void mapData() {
        ParsedDataPrinter pdp = new ParsedDataPrinter();
        List<Map<String, String>> expected = new ArrayList<>();
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        Map<String, String> map3 = new HashMap<>();
        Map<String, String> map4 = new HashMap<>();
        Map<String, String> map5 = new HashMap<>();
        Map<String, String> map6 = new HashMap<>();
        Map<String, String> map7 = new HashMap<>();
        map1.put("lName", "Ling");
        map1.put("fName", "Mai");
        map1.put("salary", "55900");
        expected.add(map1);
        map2.put("lName", "Johnson");
        map2.put("fName", "Jim");
        map2.put("salary", "56500");
        expected.add(map2);
        map3.put("lName", "Jones");
        map3.put("fName", "Aaron");
        map3.put("salary", "46000");
        expected.add(map3);
        map4.put("lName", "Jones");
        map4.put("fName", "Chris");
        map4.put("salary", "34500");
        expected.add(map4);
        map5.put("lName", "Swift");
        map5.put("fName", "Geoffrey");
        map5.put("salary", "14200");
        expected.add(map5);
        map6.put("lName", "Xiong");
        map6.put("fName", "Fong");
        map6.put("salary", "65000");
        expected.add(map6);
        map7.put("lName", "Zarnecki");
        map7.put("fName", "Sabrina");
        map7.put("salary", "51500");
        expected.add(map7);
        pdp.readData("data/exercise42_input.txt");
        pdp.mapData();
        List<Map<String, String>> actual = pdp.getMappedData();
        for(short i = 0; i< expected.size();i++){
            assertEquals(expected.get(i), actual.get(i));
        }
    }
}