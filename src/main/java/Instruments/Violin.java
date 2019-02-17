package Instruments;

public class Violin extends Instrument{

    public Violin(int buyPrice, int sellPrice, String colour, InstrumentType type) {
        super(buyPrice, sellPrice, colour, type);
    }

    public String play(){
        return "A Thousand Years";
    }
}
