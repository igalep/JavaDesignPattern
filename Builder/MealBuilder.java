public class MealBuilder {
    public Meal prepareBeefMeal(){
        Meal beefMeal = new Meal();
        beefMeal.addItem(new BeefBurger());
        beefMeal.addItem(new Coke());

        return beefMeal;
    }

    public Meal prepareChickenMeal(){
        Meal chicken = new Meal();
        chicken.addItem(new ChickenBurger());
        chicken.addItem(new Sprite());

        return chicken;
    }
}
