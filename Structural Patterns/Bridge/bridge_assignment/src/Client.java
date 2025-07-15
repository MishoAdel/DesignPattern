public class Client {
    public static void main(String[] args) {
        Shape shape1 = new Circle(new GreenColor());
        shape1.drawShape(5);
        shape1.modifyBorder(5,2);


        Shape shape2 = new Triangle(new RedColor());
        shape2.drawShape(4);
        shape2.modifyBorder(4,3);
    }
}
