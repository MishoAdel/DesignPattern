public class Client {
    public static void main(String[] args) {
        MobileState initialState = new Vibration() ;

        Mobile mobile = new Mobile(initialState);
        mobile.alert();
        mobile.alert();
        mobile.pressButton();
        mobile.alert();
        mobile.alert();
        mobile.alert();
        mobile.pressButton();
        mobile.alert();
    }
}
