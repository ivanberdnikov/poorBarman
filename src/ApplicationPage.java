import Ingridients.Liquids.Alcohol.Vodka;
import Recipe.Recipe;

import java.util.Scanner;

public class ApplicationPage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Привет! Введи свое имя, фамилию, возраст через пробел");
//        String user = scanner.nextLine();
//        String[] arrayUser;
//        arrayUser = user.split(" ");
//        UserInfo userinfo = new UserInfo(arrayUser[0], arrayUser[1], Integer.parseInt(arrayUser[2]));
//        System.out.println(userinfo);
        Bar bar = new Bar();
        System.out.println(bar);

        bar.addVodka("Талка", 40, 900, 0.5);
        Vodka talka = new Vodka("talka", 40, 900, 0.5);
        bar.addVodka("Столичная", 40, 500, 0.5);
        bar.addJuice("Апельсиновый", 100, 0.5);
        System.out.println(bar);

    }
}