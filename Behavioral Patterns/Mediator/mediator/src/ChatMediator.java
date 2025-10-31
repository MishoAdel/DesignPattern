import java.util.ArrayList;
import java.util.List;

interface ChatMediator {
    public  void sendMessage(String msg,User user);
    void addUser(User user);
}

class  ChatMediatorImp implements ChatMediator{

    private List<User> userList;

    public ChatMediatorImp(){
        userList = new ArrayList<User>();
    }

    @Override
    public void sendMessage(String msg, User user) {
        for(User u:userList){
            if(u != user){
                u.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.userList.add(user);
    }
}