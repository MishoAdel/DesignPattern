import java.util.ArrayList;

interface AuctionMediator {

    public Buyer findHighestBidder();
    public void addBuyer(Buyer buyer);
}

class AuctionMediatorImp implements  AuctionMediator{

    private ArrayList<Buyer> buyerList;

    AuctionMediatorImp(){
        buyerList = new ArrayList<Buyer>();
    }

    @Override
    public Buyer findHighestBidder() {
        if(buyerList.isEmpty()){
            return null;
        }
        Buyer highest = buyerList.get(1);
        for(Buyer b:buyerList){
            if(highest.bid < b.bid){
                highest = b;
            }
            b.auctionEnded();
        }
        System.out.println(highest.name + " won the bid with " + highest.bid );

        return  highest;
    }

    @Override
    public void addBuyer(Buyer buyer) {
        buyerList.add(buyer);
        System.out.println(buyer.name +" was added to the buyers list");
    }
}
