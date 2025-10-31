public class Client {
    public static void main(String[] args) {
        NotificationCollection nc = new NotificationCollection();
        NotificationsBar nb = new NotificationsBar(nc);
        nb.printNotification();
    }
}
