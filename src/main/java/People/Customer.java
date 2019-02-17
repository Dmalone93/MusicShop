package People;
import Behaviours.ISell;
import java.util.ArrayList;

    public class Customer extends Person {

        private ArrayList<ISell> items;


     public Customer(int money, String name) {
        super(money, name);
        this.items = new ArrayList<ISell>();
    }

    public void buyItem(ISell item){
         this.items.add(item);
    }

        public int getItems() {
            return items.size();
        }

        public int itemBought(Customer customer, ISell item){
            int remainingMoney = customer.getMoney() - item.getSellPrice();
            return remainingMoney;
        }
    }


