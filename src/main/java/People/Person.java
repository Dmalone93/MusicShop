package People;

import Behaviours.ISell;

import java.util.ArrayList;

public class Person {

    private int money;
    private String name;

    public Person(int money, String name) {
        this.money = money;
        this.name = name;
    }

    public int getMoney() {
        return this.money;
    }

    public String getName() {
        return name;
    }
}
