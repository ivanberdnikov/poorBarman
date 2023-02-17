package Ingridients.Liquids.NonAlcohol;

import Ingridients.Liquids.Liquids;

public class Juice extends Liquids {
    public Juice(String name, int price, double volume) {
        this.name = name;
        this.price = price;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return ("Сок - " + name + ", " + "стоимость - " + price + " руб. Объем - " + volume);
    }
}