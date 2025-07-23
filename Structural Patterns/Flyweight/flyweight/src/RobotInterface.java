public interface RobotInterface {
    public  void print();

    void setColor(String color);
}
class Robot implements RobotInterface{

    String robotType;
    public String robotColor;

    public  Robot(String robotType){
        this.robotType = robotType;
    }

    @Override
    public void print() {
    System.out.println("This is a "+robotType+" type robot with "+robotColor+" color.");
    }

    @Override
    public void setColor(String color) {
        this.robotColor = color;
    }
}