import java.util.HashMap;
import java.util.Map;

class RobotFactory {
    Map<String,RobotInterface> shapes = new HashMap<String,RobotInterface>();

    public int totalObjectsCreated(){
        return shapes.size();
    }

    public  RobotInterface getRobotFromFactory(String robotType) throws Exception{
        RobotInterface myRobot = null;
        if(shapes.containsKey(robotType)){
            myRobot = shapes.get(robotType);
        }else{
            switch (robotType){
                case "king":
                    System.out.println("We don't have a king robot, we are creating a new one");
                    myRobot = new Robot("king");
                    shapes.put("king",myRobot);
                    break;
                case "queen":
                    System.out.println("We don't have a queen robot, we are creating a new one");
                    myRobot = new Robot("queen");
                    shapes.put("queen",myRobot);
                    break;
                default:
                    throw  new Exception("Robot factory only produces king or queen robots");
            }
        }
            return myRobot;
    }
}
