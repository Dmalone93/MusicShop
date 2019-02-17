package Instruments;

public class Saxaphone extends Instrument{

    public Saxaphone(int buyPrice, int sellPrice, String colour, InstrumentType type) {
        super(buyPrice, sellPrice, colour, type);
    }


    public String play() {
        return "Careless Whisper";
    }
}
