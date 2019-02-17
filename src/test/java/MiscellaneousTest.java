import Miscellaneous.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MiscellaneousTest {

    Miscellaneous miscellaneous;
    Miscellaneous miscellaneous2;
    Miscellaneous miscellaneous3;
    Miscellaneous miscellaneous4;


    @Before
    public void setUp() {
        miscellaneous = new GuitarStrings(4, 8);
        miscellaneous2 = new DrumSticks(5, 10);
        miscellaneous3 = new MusicSheets(1, 3);
        miscellaneous4 = new GuitarPick(1, 2);
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(4, miscellaneous.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(8, miscellaneous.getSellPrice());
    }
}
