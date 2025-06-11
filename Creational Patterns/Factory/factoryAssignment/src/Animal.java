interface Animal {
     void  walk();
     void eat();
}

 class Duck implements Animal{

    @Override
    public void walk() {
        System.out.println("Duck Walking");
    }

    @Override
    public void eat() {
        System.out.println("Duck Eating");
    }
}

class  Tiger implements  Animal{
    @Override
    public void walk() {
        System.out.println("Tiger Walking");
    }

    @Override
    public void eat() {
        System.out.println("Tiger Walking");
    }
}
