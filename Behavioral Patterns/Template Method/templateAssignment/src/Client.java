public class Client {
    public static void main(String[] args) {
        OrderProcessTemplate storeOrder = new StoreOrder();
        OrderProcessTemplate netOrder = new NetOrder();

        storeOrder.processOrder(false);

        netOrder.processOrder(true);
    }
}
