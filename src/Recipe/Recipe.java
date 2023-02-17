package Recipe;

import Ingridients.Liquids.Alcohol.Vodka;
import Ingridients.Liquids.NonAlcohol.Juice;

public class Recipe {
    public Recipe(String name, int countIngridients, String description) {
        this.name = name;
        this.countIngridients = countIngridients;
        this.description = description;
    }

    public void RecipeVodkaJuice(String name, int countIngridients, String description, Vodka vodka, Juice juice) {
        this.name = name;
        this.countIngridients = countIngridients;
        this.description = description;
        this.vodka = vodka;
        this.juice = juice;
    }

    String name;
    int countIngridients;
    String description;
    Vodka vodka;
    Juice juice;
    Recipe vodkaSok = new Recipe("Водка с соком", 2, "Обычный легкий коктейль для вечеринки");
}