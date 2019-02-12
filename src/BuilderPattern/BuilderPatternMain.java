package BuilderPattern;

public class BuilderPatternMain {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();

        vegMeal.showItems();
        vegMeal.showPrice();

        Meal beefMeal = mealBuilder.prepareBeefMeal();

        beefMeal.showItems();
        beefMeal.showPrice();

    }

}
