abstract class OrderProcessTemplate {
    boolean isGift;

    public final void processOrder(boolean isGift){
        doSelect();
        doPayment();
        if(isGift)
            giftWrap();
        deliver();
    }
    public final void giftWrap(){
        System.out.println("Gift Wrap Successful");
    }

    public abstract void doSelect();
    public abstract void doPayment();
    public abstract void deliver();
}

class NetOrder extends OrderProcessTemplate{

    @Override
    public void doSelect() {
        System.out.println("Items added to cart");
    }

    @Override
    public void doPayment() {
        System.out.println("Payed with paypal/credit card");
    }

    @Override
    public void deliver() {
        System.out.println("Delivered by postage");
    }
}

class StoreOrder extends OrderProcessTemplate{

    @Override
    public void doSelect() {
        System.out.println("Items picked from shelf");
    }

    @Override
    public void doPayment() {
        System.out.println("Payed in cash");
    }

    @Override
    public void deliver() {
        System.out.println("Picked up at counter");
    }
}