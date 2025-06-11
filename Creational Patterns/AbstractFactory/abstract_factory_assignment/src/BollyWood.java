interface BollyWood {
    void getMovieName();
}

class ComedyBollyWood implements BollyWood{

    @Override
    public void getMovieName() {
        System.out.println("A Comedy Bollywood Movie");
    }
}
class ActionBollyWood implements BollyWood{

    @Override
    public void getMovieName() {
        System.out.println("An Action Bollywood Movie");
    }
}

