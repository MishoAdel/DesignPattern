public class Client {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediatorImp();

        User user1 = new UserImp(chatMediator,"John");
        User user2 = new UserImp(chatMediator,"Mark");
        User user3 = new UserImp(chatMediator,"Alice");
        User user4 = new UserImp(chatMediator,"Jennifer");
        User user5 = new UserImp(chatMediator,"Mary");

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);
        chatMediator.addUser(user4);
        chatMediator.addUser(user5);

        user1.send("Hi All!");
    }
}
