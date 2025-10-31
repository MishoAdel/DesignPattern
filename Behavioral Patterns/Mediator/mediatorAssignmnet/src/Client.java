public class Client {
    public static void main(String[] args) {

        AuctionMediatorImp med = new AuctionMediatorImp();

        BuyerImp buyer1 = new BuyerImp(med,"John");
        BuyerImp buyer2 = new BuyerImp(med,"Alice");
        BuyerImp buyer3 = new BuyerImp(med,"Mason");

        med.addBuyer(buyer1);
        med.addBuyer(buyer2);
        med.addBuyer(buyer3);

        System.out.println("Welcome to the auction  tonight. We are selling a vacation");
        System.out.println("---------------------------------------");
        System.out.println("Waiting for bids");

        med.findHighestBidder();

        buyer1.addBid(1800);
        buyer2.addBid(2000);
        buyer3.addBid(700);

        med.findHighestBidder();

        buyer2.cancelBid();

        med.findHighestBidder();

    }
}
