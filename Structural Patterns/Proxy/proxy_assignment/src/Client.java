public class Client {
    public static void main(String[] args) {
        Internet internet = new InternetProxy();

        internet.connectTo("site1");
        internet.connectTo("site2");
    }
}
