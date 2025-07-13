import java.util.Hashtable;

public class BasicCarCache {
    private static Hashtable<String, BasicCar> carMap = new Hashtable<String, BasicCar>();

    public static  BasicCar getCar(String carId){
        BasicCar cachedCar = carMap.get(carId);
        try {
            return (BasicCar) cachedCar.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public static  void loadCache(){
        BasicCar nano = new Nano("Green Nano");
        nano.price = 2000.0;
        carMap.put("Green Nano",nano);

        BasicCar ford = new Nano("Black Ford");
        ford.price = 3000.0;
        carMap.put("Black Ford",ford);



    }

}
