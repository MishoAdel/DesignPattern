public class Item {
    private  String upcCode;
    private int price;
    public Item(String code, int price){
        this.price = price;
        this.upcCode = code;
    }

    public int getPrice() {
        return price;
    }

    public String getUpcCode() {
        return upcCode;
    }


}
