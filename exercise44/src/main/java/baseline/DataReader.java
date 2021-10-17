package baseline;

import com.google.gson.Gson;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataReader {
    // stores the data from the input file in a list
    // might have to change this to a list of product objects, not sure
    List<Map<?, ?>> data = new ArrayList<>();

    // returns what the user searches for
    public String getUserQuery(){
        // open scanner
        // prompt for a query
        // return query
    }

    // get data from the JSON file
    private void jsonToList(){
        Gson input = new Gson();
        // make a reader
        Reader inputReader = Files.newBufferedReader(Paths.get("data/exercise44_input.json"));
        // convert the input.json to maps
        // add maps to list
    }
    // searches the list for a value with the key "name" matching the query
    public void printQueryResults(){
        boolean queryNotFound = true;
        // while queryNotFound
        String query = this.getUserQuery();
        // for maps in data
        // if key = name and value is query,
            // print values related to that name
            // queryNotFound = false;
    }
}
