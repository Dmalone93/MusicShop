package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private int buyPrice;
    private int sellPrice;
    private String colour;
    private InstrumentType type;

    public Instrument(int buyPrice, int sellPrice, String colour, InstrumentType type){
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.colour = colour;
        this.type = type;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public InstrumentType getType() {
        return type;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }

    public int calculateMarkup(){
        int profit = sellPrice -= buyPrice;
        return profit;
    }
}
