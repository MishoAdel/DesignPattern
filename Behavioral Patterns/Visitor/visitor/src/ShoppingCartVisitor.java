public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}

class Visitor implements ShoppingCartVisitor{



    @Override
    public int visit(Book book) {
        int cost=0;
        if(book.getPrice()>50)
            cost = book.getPrice()-5;
        else
            cost = book.getPrice();
        System.out.println("Books ISBN: "+ book.getIsbnNumber() +" and Cost: "+ cost);
        return  cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getWeight()* fruit.getPricePerKG();
        System.out.println("Fruit: "+ fruit.getName()+" and Cost: "+ cost);
        return  cost;
    }
}
