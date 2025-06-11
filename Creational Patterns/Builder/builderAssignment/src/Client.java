public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        MealBuilderInterface vegiMealBuilder = new VegiMealBuilder();
        MealBuilderInterface nonVegiMealBuilder = new NonVegiMealBuilder();

        director.construct(vegiMealBuilder);
        director.construct(nonVegiMealBuilder);

        Meal vegiMeal = vegiMealBuilder.getMeal();
        Meal noVegiMeal = nonVegiMealBuilder.getMeal();
        vegiMeal.show();
        vegiMeal.getPrice();
        noVegiMeal.show();
        noVegiMeal.getPrice();
    }
}
