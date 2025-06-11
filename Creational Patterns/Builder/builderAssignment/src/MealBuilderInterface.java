public interface MealBuilderInterface {
    void AddBurger();
    void AddDrink();
    Meal getMeal();
}

class VegiMealBuilder implements MealBuilderInterface {

    private Meal meal = new Meal();

    @Override
    public void AddBurger() {
        meal.add(new VegiBurger());
    }

    @Override
    public void AddDrink() {
        meal.add(new Coke());
    }

    @Override
    public Meal getMeal() {
        return meal;
    }


}

class NonVegiMealBuilder implements MealBuilderInterface{

    private Meal meal = new Meal();

    @Override
    public void AddBurger() {
        meal.add(new ChickenBurger());
    }

    @Override
    public void AddDrink() {
        meal.add(new Pepsi());
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
