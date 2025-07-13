public class Client {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("The turkey says :");
        turkey.gobble();
        turkey.fly();
        System.out.println("The duck says :");
        duck.quack();
        duck.fly();
        System.out.println("The turkey adapter says :");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
