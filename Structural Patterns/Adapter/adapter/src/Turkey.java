interface Turkey {
    public void gobble();
    public  void fly();
}

class  WildTurkey implements Turkey{

    @Override
    public void gobble() {
        System.out.println("Gobble");
    }

    @Override
    public void fly() {
        System.out.println("I am flying a short distance");
    }
}