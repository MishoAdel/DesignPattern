public abstract class BasicCar implements Cloneable{
     String model;
    private String name;
     double price=1000.0;

    public void changePrice(double newPrice){
        this.price = newPrice;
    }

    public String getModel(){
        return this.model;
    }

    public  String getName(){
        return  this.name;
    }

    public BasicCar clone() throws CloneNotSupportedException{
        return (BasicCar) super.clone();
    }
}

class Ford extends BasicCar{
    Ford(String modelName){
        model = modelName;
    }

    @Override
    public Ford clone() throws CloneNotSupportedException{
        return (Ford) super.clone();
    }

}

class Nano extends BasicCar{
    Nano(String modelName){
        model = modelName;
    }

    @Override
    public Nano clone() throws CloneNotSupportedException{
        return (Nano) super.clone();
    }

}
