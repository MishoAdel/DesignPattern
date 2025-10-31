public class Client {
    private  static  int calculatePrice(ItemElement[] items){
        ShoppingCartVisitor shoppingCartVisitor = new Visitor();
        int sum=0;
        for(ItemElement item:items){
            sum+= item.accept(shoppingCartVisitor);
        }
        return  sum;
    }

    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{new Book(20,"0001"),
                new Book(100,"0002"),
                new Fruit(10,"Bannan",2),
                new Fruit(5,"Apple",5)};
        int total = calculatePrice(items);
        System.out.println("Total cost: "+total);

    }
}
