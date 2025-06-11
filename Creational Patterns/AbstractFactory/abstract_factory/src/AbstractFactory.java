public abstract class AbstractFactory {

    abstract  Color getColor(String colorType);
    abstract  Shape getShape(String shapeType);
}

class ShapeFactory extends  AbstractFactory{


    @Override
    Color getColor(String colorType) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }else if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }

}

class ColorFactory extends AbstractFactory{

    @Override
    Color getColor(String colorType) {
       if (colorType.equalsIgnoreCase("RED")){
            return new Red();
        }else if (colorType.equalsIgnoreCase("GREEN")){
            return new Green();
        }else if (colorType.equalsIgnoreCase("BlEU")){
            return new Bleu();
        }
        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        return null;
    }
}

