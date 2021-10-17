package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordReplacerTest {

    @Test
    void testReplaceInstancesOf() {
        WordReplacer wr = new WordReplacer();
        String expected = "One should never use the word \"use\" in writing. Use \"use\" instead. For example, \"She uses an IDE to write her Java programs\" instead of \"She uses an IDE to write her Java programs\".";
        String actual = wr.replaceInstancesOf("utilize", "use");
        assertEquals(expected, actual);
    }

    // the output requires user input and so cannot be tested
}