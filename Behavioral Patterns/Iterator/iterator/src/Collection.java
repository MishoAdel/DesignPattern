public interface Collection {
    public Iterator createIterator();
}

class NotificationCollection implements Collection{

    static final int MAXNUMBER = 6;
    int numberOfItems = 0;
    Notification [] notificationsList;

    public NotificationCollection(){
        notificationsList = new Notification[MAXNUMBER];
        addItem("Notification 1");
        addItem("Notification 2");
        addItem("Notification 3");
    }

    public void addItem(String str){

        if(numberOfItems >= MAXNUMBER){
            System.err.println("Full");
        } else{
            notificationsList[numberOfItems] = new Notification(str);
            numberOfItems++;
        }

    }


    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notificationsList);
    }
}
