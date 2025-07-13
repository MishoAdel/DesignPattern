public class Client {
    public static void main(String[] args) {
        BasicCarCache.loadCache();
        BasicCar bc1= (BasicCar) BasicCarCache.getCar("Green Nano");
        bc1.price = 7000.0;
        System.out.println("Car is " + bc1.getModel()+ "and price : " + bc1.price);

        BasicCar bc2= (BasicCar) BasicCarCache.getCar("Black Ford");
        bc2.price = 9000.0;
        System.out.println("Car is " + bc2.getModel()+ "and price : " + bc2.price);
    }
}
