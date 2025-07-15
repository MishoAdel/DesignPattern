abstract class Shape {
    protected ColorIInterface color;

    protected Shape(ColorIInterface c){
        this.color = c;
    }

    abstract  void drawShape(int border);
    abstract  void modifyBorder(int border, int increment);
}

class Circle extends Shape {

    protected Circle(ColorIInterface c) {
        super(c);
    }

    @Override
    void drawShape(int border) {
        System.out.println("Shaping Circle");
        color.fillColor(border);
    }

    @Override
    void modifyBorder(int border, int increment) {
        System.out.println("Changing Border");
        border = border * increment;
        drawShape(border);
    }
}

class Triangle extends Shape {

    protected Triangle(ColorIInterface c) {
        super(c);
    }

    @Override
    void drawShape(int border) {
        System.out.println("Shaping Triangle");
        color.fillColor(border);
    }

    @Override
    void modifyBorder(int border, int increment) {
        System.out.println("Changing Border");
        border = border * increment;
        drawShape(border);
    }
}
