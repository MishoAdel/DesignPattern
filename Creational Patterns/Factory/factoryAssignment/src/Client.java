public class Client {

    public static void main(String[] args){
        ConcreteAnimalFactory concreteAnimalFactory = new ConcreteAnimalFactory();
        Animal animal1= concreteAnimalFactory.getAnimal("Duck");
        animal1.eat();
        animal1.walk();
        Animal animal2= concreteAnimalFactory.getAnimal("Tiger");
        animal2.eat();
        animal2.walk();

    }
}
