package Shop;

import Behaviours.ISell;
import People.Customer;

import java.util.ArrayList;

public class Till {

    private int takings;
    private int spendings;

    public Till(int takings, int spendings) {
        this.takings = takings;
        this.spendings = spendings;
    }

    public int getTakings() {
        return takings;
    }

    public void setTakings(int takings) {
        this.takings = takings;
    }

    public int getSpendings() {
        return spendings;
    }

    public void setSpendings(int spendings) {
        this.spendings = spendings;
    }

    public int addCustomersMoney(ISell item, Till till){
        return item.getSellPrice() + till.getTakings();
    }

}
