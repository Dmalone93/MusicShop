package Instruments;

public class Piano extends Instrument{

    private String type;

    public Piano(int buyPrice, int sellPrice, String colour, InstrumentType type) {
        super(buyPrice, sellPrice, colour, type);
    }

    public String play() {
        return "Playing Nocturnes, Op. 9";
    }
}
