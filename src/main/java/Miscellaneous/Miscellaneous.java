package Miscellaneous;
import Behaviours.ISell;

public abstract class Miscellaneous implements ISell {
    private int buyPrice;
    private int sellPrice;

    public Miscellaneous(int buyPrice, int sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
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
        sellPrice = sellPrice;
    }

    public int calculateMarkup(){
        int profit = sellPrice -= buyPrice;
        return profit;
    }
}
