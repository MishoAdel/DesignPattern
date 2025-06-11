public interface MealItem {
     double price();
     String name();
     public Packing packing();
}

abstract class Burger implements MealItem{
    public Packing packing(){
        return new WrapperFoil();
    }
}

class VegiBurger extends Burger{

    @Override
    public double price() {
        return 5.0;
    }

    @Override
    public String name() {
        return "Vegi Burger";
    }
}

class ChickenBurger extends Burger{

    @Override
    public double price() {
        return 10.0;
    }

    @Override
    public String name() {
        return "chicken Burger";
    }
}

abstract class ColdDrink implements MealItem {
    public Packing packing(){
        return new Bottle();
    }
}

class Pepsi extends ColdDrink{

    @Override
    public double price() {
        return 3.0;
    }

    @Override
    public String name() {
        return "Pepsi";
    }


}

class Coke extends ColdDrink{

    @Override
    public double price() {
        return 4.0;
    }

    @Override
    public String name() {
        return "Coke";
    }
}

interface Packing{
    public String pack();

}

class WrapperFoil implements Packing{
    @Override
    public String pack() {
        return "Wrapper Foil";
    }
}

class Bottle implements Packing{
    @Override
    public String pack() {
        return "Bottle";
    }
}

