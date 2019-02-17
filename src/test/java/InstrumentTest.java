import Instruments.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class InstrumentTest {

    Instrument instrument;
    Instrument instrument2;
    Instrument instrument3;
    Instrument instrument4;
    Guitar guitar;

    @Before
    public void setUp(){
        instrument = new Guitar(50,100,"Brown",InstrumentType.STRING, 6, "D", "Wood");
        guitar = new Guitar(50,100,"Brown",InstrumentType.STRING, 6, "D", "Wood");
        instrument2 = new Piano(600, 1200, "White", InstrumentType.KEYBOARD);
        instrument3 = new Saxaphone(70, 140, "Gold", InstrumentType.WOODWIND);
        instrument4 = new Violin(70, 100, "Brown", InstrumentType.STRING);
    }

    @Test
    public void guitarHasNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfString());
    }

    @Test
    public void guitarHasTuner() {
        assertEquals("D", guitar.getTuner());
    }

    @Test
    public void guitarHasMaterial() {
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(6, ((Guitar) instrument).getNumberOfString());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(50, instrument.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(1200, instrument2.getSellPrice());
    }

    @Test
    public void hasColour() {
        assertEquals("Gold", instrument3.getColour());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.STRING, instrument4.getType());
    }

    @Test
    public void InstrumentHasMarkup() {
        assertEquals(50, instrument.calculateMarkup());
    }

    @Test
    public void istrumentsCanPlay() {
        assertEquals("Playing Enter Sandman", guitar.play());
        assertEquals("Playing Nocturnes, Op. 9", instrument2.play());
        assertEquals("Careless Whisper", instrument3.play());
        assertEquals("A Thousand Years", instrument4.play());
    }
}
