public interface PlayerInterface {
    public void assignWeapon(String weapon);
    public  void mission();
}


class Terrorist implements  PlayerInterface{

    String weapon;
    private final String TASK;

    Terrorist() {
        TASK = "Plant bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terroist with weapon : "+weapon+" and Task :"+TASK);
    }
}

class CounterTerrorist implements  PlayerInterface{

    String weapon;
    private final String TASK;

    CounterTerrorist() {
        TASK = "Defuse bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Counter Terroist with weapon : "+weapon+" and Task :"+TASK);
    }
}
