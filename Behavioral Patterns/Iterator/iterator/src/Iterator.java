public interface Iterator {
    boolean hasNext();
    Notification next();
}

class NotificationIterator implements Iterator{

    Notification [] notificationsList;
    int pos = 0;

    public NotificationIterator(Notification[] notifications){
        this.notificationsList = notifications;
    }

    @Override
    public boolean hasNext() {
        return pos <= notificationsList.length && notificationsList[pos] != null;
    }

    @Override
    public Notification next() {
        Notification notification = this.notificationsList[pos];
        pos++;
        return notification;
    }
}
