import Behaviours.ISell;
import Instruments.*;
import Miscellaneous.*;
import People.Customer;
import Shop.Till;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ShopTest {

    Shop shop;
    Till till;
    Instrument instrument;
    Instrument instrument2;
    Instrument instrument3;
    Instrument instrument4;
    Miscellaneous miscellaneous;
    Miscellaneous miscellaneous2;
    Miscellaneous miscellaneous3;
    Miscellaneous miscellaneous4;
    Customer customer;

    @Before
    public void setUp() throws Exception {

        miscellaneous = new GuitarStrings(4, 8);
        miscellaneous2 = new DrumSticks(5, 10);
        miscellaneous3 = new MusicSheets(1, 3);
        miscellaneous4 = new GuitarPick(1, 2);
        instrument = new Guitar(50,100,"Brown", InstrumentType.STRING, 6, "D", "Wood");
        instrument2 = new Piano(600, 1200, "White", InstrumentType.KEYBOARD);
        instrument3 = new Saxaphone(70, 140, "Gold", InstrumentType.WOODWIND);
        instrument4 = new Violin(70, 100, "Brown", InstrumentType.STRING);
        till = new Till(0,0);
        shop = new Shop(till);
        shop.addstock(miscellaneous);
        shop.addstock(miscellaneous2);
        shop.addstock(miscellaneous3);
        shop.addstock(miscellaneous4);
        shop.addstock(instrument);
        shop.addstock(instrument2);
        shop.addstock(instrument3);
        shop.addstock(instrument4);


        customer = new Customer(300, "Declan");
    }

    @Test
    public void checkStockSize() {
        assertEquals(8, shop.getStock());
    }

    @Test
    public void checkStockSizeWhenRemoved() {
        shop.removeStock(miscellaneous);
        assertEquals(7, shop.getStock());
    }

    @Test
    public void hasInstrumentBuyPrice() {
        assertEquals(600, shop.instrumentPrice(instrument2));
    }

    @Test
    public void hasInstrumentSellPrice() {
        assertEquals(1200, shop.instrumentSellPrice(instrument2));
    }

    @Test
    public void getAllTakings() {
        assertEquals(801, shop.getAllTakings());
    }

    @Test
    public void canShopSellToCustomer() {
        shop.sellToCustomer(till, instrument, customer, shop);
//        assertEquals(851, shop.getAllTakings());
        assertEquals(1, customer.getItems());
        assertEquals(7, shop.getStock());
        assertEquals(200, customer.itemBought(customer, instrument));
        assertEquals(100, till.addCustomersMoney(instrument, till));
    }

    @Test
    public void canGetAllSellPrice(){
        assertEquals(1563, shop.getAllSales());
    }

    @Test
    public void canGetShopTotalProfit(){
        assertEquals(762, shop.totalShopProfit());
    }
}
