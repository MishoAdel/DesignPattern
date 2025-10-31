public class NotificationsBar {
    NotificationCollection notificationCollection;

    public NotificationsBar(NotificationCollection notifications){
        this.notificationCollection = notifications;
    }

    public void printNotification(){
        Iterator iterator = notificationCollection.createIterator();
        while(iterator.hasNext()){
            Notification notification = iterator.next();
            System.out.println(notification.getNotification());
        }
    }
}
