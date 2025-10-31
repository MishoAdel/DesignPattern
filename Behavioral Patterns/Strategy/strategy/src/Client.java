public class Client {
    public static void main(String[] args) {
        Item item1 = new Item("0001", 10);
        Item item2 = new Item("0002", 40);

        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        shoppingCart.pay(new PaypalStrategy("user","password"));
        shoppingCart.pay(new CreditCardStrategy("1","2","3","4"));
    }
}
