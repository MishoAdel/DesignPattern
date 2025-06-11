public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        BuilderInterface carBuilder = new Car();
        BuilderInterface motorcycleBuilder = new Motorcycle();

        director.construct(carBuilder);
        director.construct(motorcycleBuilder);

        Product car = carBuilder.getProduct();
        Product motorcycle = motorcycleBuilder.getProduct();
        car.show();
        motorcycle.show();
    }
}
