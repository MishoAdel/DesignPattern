class Client{
    public  static  void main(String[] args){
//        code for abstract method
//        Shape shape1 = new RectangleFactory().getShape();
//        shape1.draw();
//        Shape shape2 = new CircleFactory().getShape();
//        shape2.draw();
//        Shape shape3 = new SquareFactory().getShape();
//        shape3.draw();

//        code for concrete method
//        ConcreteShapeFactory shapeFactory = new ConcreteShapeFactory();
//        Shape shape1 =shapeFactory.getShape("CIRCLE");
//        shape1.draw();
//        Shape shape2 =shapeFactory.getShape("RECTANGLE");
//        shape2.draw();
//        Shape shape3 =shapeFactory.getShape("SQUARE");
//        shape3.draw();

//        code for static method
        Shape shape1 = StaticShapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = StaticShapeFactory.getShape("RECTANGLE");
        shape2.draw();
        Shape shape3 = StaticShapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
