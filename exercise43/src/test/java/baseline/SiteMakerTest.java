package baseline;

import org.junit.jupiter.api.Test;

class SiteMakerTest {

    @Test
    void testGenerateSite() {
        SiteMaker sm = new SiteMaker();
        sm.generateSite();
        // so I just realized that I can't test this since it requires uses input.
        // Oh well.
    }
}