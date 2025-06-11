public class Client {
    public static void main(String[] args) {
        System.out.println("***Singleton Pattern Demo");
        System.out.println("Trying to make captain for our team");
        Captain captain1 = Captain.getInstance();
        System.out.println("Trying to make another captain");
        Captain captain2 = Captain.getInstance();
        System.out.println("You already have a captain go for a toss");
        if(captain1 == captain2)
            System.out.println("captain1 and captain2 are the same instance");

    }
}
