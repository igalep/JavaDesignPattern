public class BuilderMain {
    public static void main(String [] args){
        MealBuilder mealBuilder = new MealBuilder();

        Meal beefMeal = mealBuilder.prepareBeefMeal();
        System.out.println("Beef Meal");
        beefMeal.showItems();
        System.out.println("Total Cost: " + beefMeal.getCost());


        Meal ChickenMeal = mealBuilder.prepareChickenMeal();
        System.out.println("Chicken Meal");
        ChickenMeal.showItems();
        System.out.println("Total Cost: " + ChickenMeal.getCost());
    }
}
