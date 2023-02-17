package Ingridients.Liquids.Alcohol;

public class Vodka extends LiquidsAlcohol{
    public Vodka (String name, int degree, int price, double volume){
        this.name = name;
        this.degree = degree;
        this.price = price;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return ("Водка - " + name + ", градусов " + degree + ", " +
                "стоимость - " + price + " руб. Объем - " + volume);
    }
}