public class Client {
    public static void main(String[] args) {
        Image image = new ProxyImage("img.jpg");
        System.out.println("Starting Display:");
        image.display();
        image.display();
    }
}
