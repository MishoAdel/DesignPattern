public abstract class AbstractFactory {
    abstract Hollywood getHollywoodGenre(String genre);
    abstract BollyWood getBollywoodGenre(String genre);
}

class HollyWoodFactory extends AbstractFactory{


    @Override
    Hollywood getHollywoodGenre(String genre) {
        if(genre.equalsIgnoreCase("comedy")){
            return new ComedyHollywood();
        } else if(genre.equalsIgnoreCase("action")){
            return new ActionHollywood();
        }
        return null;
    }

    @Override
    BollyWood getBollywoodGenre(String genre) {
        return null;
    }
}

class BollyWoodFactory extends AbstractFactory{


    @Override
    Hollywood getHollywoodGenre(String genre) {
        return null;
    }

    @Override
    BollyWood getBollywoodGenre(String genre) {
        if(genre.equalsIgnoreCase("comedy")){
            return new ComedyBollyWood();
        } else if(genre.equalsIgnoreCase("action")){
            return new ActionBollyWood();
        }
        return null;

    }
}

