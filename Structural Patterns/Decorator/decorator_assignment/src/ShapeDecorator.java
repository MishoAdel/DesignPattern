public class ShapeDecorator implements Shape {
    Shape shape;

    ShapeDecorator(Shape shape){
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}


class RedShapeDecorator extends  ShapeDecorator{

    RedShapeDecorator(Shape shape) {
        super(shape);
    }

    void setRedBorder(){
        System.out.println("Border Red");
    }

    @Override
    public  void draw(){
        super.draw();
        this.setRedBorder();
    }
}
