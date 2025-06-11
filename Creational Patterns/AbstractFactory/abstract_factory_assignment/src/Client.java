public class Client {
    public static void main(String[] args) {
        AbstractFactory hollyWoodFactory = FactoryProducer.getFactory("hollywood");
        Hollywood movie1 =hollyWoodFactory.getHollywoodGenre("Comedy");
        movie1.getMovieName();
        Hollywood movie2 =hollyWoodFactory.getHollywoodGenre("action");
        movie2.getMovieName();

        AbstractFactory bollyWoodFactory = FactoryProducer.getFactory("bollywood");
        BollyWood movie3= bollyWoodFactory.getBollywoodGenre("comedy");
        movie3.getMovieName();
        BollyWood movie4= bollyWoodFactory.getBollywoodGenre("action");
        movie4.getMovieName();
    }
}
