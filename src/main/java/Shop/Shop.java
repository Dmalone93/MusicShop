package Shop;

import Behaviours.ISell;
import Instruments.Instrument;
import Miscellaneous.Miscellaneous;
import People.Customer;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;
    Till till;
    private int takings;
    private int spendings;


    public Shop(Till till) {
        this.stock = new ArrayList<ISell>();
        this.till = till;
    }

    public ArrayList<ISell> getAllStock(){
        return this.stock;
    }

    public int getStock() {
        return stock.size();
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public Till getTill() {
        return till;
    }

    public void setTill(Till till) {
        this.till = till;
    }


    public void addstock(ISell item){
        this.stock.add(item);
    }

    public void removeStock(ISell item){
        this.stock.remove(item);
    }

    public int getProfit(ISell item){
        return item.calculateMarkup();
    }

    public int instrumentPrice(Instrument item){
        return item.getBuyPrice();
    }

    public int instrumentSellPrice(Instrument item){
        return item.getSellPrice();
    }

    public int getMiscPrice(Miscellaneous item){
        return item.getBuyPrice();
    }

    public int getMiscSellPrice(Miscellaneous item){
        return item.getSellPrice();
    }

    public int getAllTakings(){
        int total = 0;
        for(ISell item : this.stock){
            total += item.getBuyPrice();
        }
        return total;
    }

    public int getAllSales(){
        int total = 0;
        for(ISell item : this.stock){
            total += item.getSellPrice();
        }
        return total;
    }

    public int totalShopProfit(){
        int total = getAllSales() - getAllTakings();
        return total;
    }

    public void sellToCustomer(Till till, ISell item, Customer customer, Shop shop) {
        customer.buyItem(item);
        customer.itemBought(customer, item);
        shop.removeStock(item);
        till.addCustomersMoney(item, till);


    }
}
