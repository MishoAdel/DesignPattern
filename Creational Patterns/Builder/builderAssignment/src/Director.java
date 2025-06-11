public class Director {
    MealBuilderInterface myBuilder;

    public void construct(MealBuilderInterface builder){
        myBuilder = builder;
        builder.AddBurger();
        builder.AddDrink();
    }
}
