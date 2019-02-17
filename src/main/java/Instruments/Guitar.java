package Instruments;

public class Guitar extends Instrument{

    private int numberOfString;
    private String tuner;
    private String material;

    public Guitar(int buyPrice, int sellPrice, String colour, InstrumentType type, int numberOfString, String tuner, String material) {
        super(buyPrice, sellPrice, colour, type);
        this.numberOfString = numberOfString;
        this.tuner = tuner;
        this.material = material;
    }

    public String play() {
        return "Playing Enter Sandman";

    }

    public int getNumberOfString() {
        return numberOfString;
    }

    public void setNumberOfString(int numberOfString) {
        this.numberOfString = numberOfString;
    }

    public String getTuner() {
        return tuner;
    }

    public void setTuner(String tuner) {
        this.tuner = tuner;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
