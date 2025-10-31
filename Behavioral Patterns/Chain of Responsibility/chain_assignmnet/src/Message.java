enum MessagePriority {
    Normal,
    High
}

public class Message {
    public String text;
    public  MessagePriority priority;

    public Message(String msg, MessagePriority priority){
        this.priority = priority;
        this.text = msg;
    }
}
