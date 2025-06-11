public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType){
        if(factoryType.equalsIgnoreCase("Hollywood")){
            return new HollyWoodFactory();
        } else if(factoryType.equalsIgnoreCase("Bollywood")){
            return new BollyWoodFactory();
        }
        return null;
    }
}
