public interface Shape {
    void draw();
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}