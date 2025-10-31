abstract class User {
    protected ChatMediator chatMediator;
    protected  String name;

    User(ChatMediator cm,String MyName){
        chatMediator = cm;
        name = MyName;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);

}

class UserImp extends User{


    UserImp(ChatMediator cm, String MyName) {
        super(cm, MyName);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + " sending message :"+ msg);
        chatMediator.sendMessage(msg,this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + " receiving message :"+ msg);
    }
}
