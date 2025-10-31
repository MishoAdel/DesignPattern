abstract class Buyer {

    protected AuctionMediator auctionMediator;
    protected String name;
    protected int bid;

    abstract void addBid(int bid);
    abstract void cancelBid();
    abstract void auctionEnded();

    Buyer(AuctionMediator med, String name){
        this.auctionMediator = med;
        this.name = name;
    }

}

class BuyerImp extends Buyer{


    BuyerImp(AuctionMediator med, String name) {
        super(med, name);
    }

    @Override
    void addBid(int bid) {
        this.bid = bid;
    }

    @Override
    void cancelBid() {
        this.bid = 0;
    }

    @Override
    void auctionEnded() {
        System.out.println("Received message auction has ended: "+ name);
    }

}
