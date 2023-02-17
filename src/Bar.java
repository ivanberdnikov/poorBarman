import Ingridients.Liquids.Alcohol.Vodka;
import Ingridients.Liquids.NonAlcohol.Juice;

public class Bar {
    private int count;
    private int allPrice;
    private int countVodka;
    private int countJuice;

    public int getCountVodka() {
        return countVodka;
    }
    public int getCountJuice() {
        return countJuice;
    }

    public int getCount() {
        return count;
    }

    public int getAllPrice() {
        return allPrice;
    }

    public void addVodka(String name, int degree, int price, double volume) {
        Vodka vodka = new Vodka(name, degree, price, volume);
        System.out.println(vodka);
        count += 1;
        countVodka += 1;
        allPrice += price;
    }

    public void addJuice(String name, int price, double volume) {
        Juice juice = new Juice(name,price, volume);
        System.out.println(juice);
        count += 1;
        countJuice += 1;
        allPrice += price;
    }

    @Override
    public String toString() {
        return ("В вашем баре находится: " + getCount() + " бутылки на общую стоимость " + getAllPrice() + " руб." +
                "\nИз них: \n" + "Водка - " + getCountVodka() + " шт." + "\nСок - " + getCountJuice() + " шт.");
    }
}