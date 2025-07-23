public class Client {
    public static void main(String[] args) throws Exception {
        RobotFactory robotFactory = new RobotFactory();

        RobotInterface robot1 = robotFactory.getRobotFromFactory("king");
        robot1.setColor("Red");
        robot1.print();

        System.out.println(robotFactory.totalObjectsCreated());

        RobotInterface robot2 = robotFactory.getRobotFromFactory("king");
        robot2.setColor("Green");
        robot2.print();

        System.out.println(robotFactory.totalObjectsCreated());

        RobotInterface robot3 = robotFactory.getRobotFromFactory("king");
        robot3.setColor("Blue");
        robot3.print();

        System.out.println(robotFactory.totalObjectsCreated());

        RobotInterface robot4 = robotFactory.getRobotFromFactory("queen");
        robot4.setColor("Yellow");
        robot4.print();

        System.out.println(robotFactory.totalObjectsCreated());

        RobotInterface robot5 = robotFactory.getRobotFromFactory("queen");
        robot5.setColor("Black");
        robot5.print();

        System.out.println(robotFactory.totalObjectsCreated());
    }
}
