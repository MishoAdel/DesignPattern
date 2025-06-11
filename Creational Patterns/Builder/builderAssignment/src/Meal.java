import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<MealItem> maelParts;
    public Meal(){
        maelParts = new ArrayList<MealItem>();
    }

    public void add(MealItem item){
        maelParts.add(item);
    }

    public  void show(){
        System.out.println("Meal ready");

        for (MealItem maelPart : maelParts) {
            System.out.println("Item : " + maelPart.name());
            System.out.println("Price : " + maelPart.price());
            System.out.println("Packing : " +maelPart.packing().pack());
            System.out.println();
        }
    }

    public  void getPrice(){
        double totalPrice=0;
        for (MealItem maelPart : maelParts) {
            totalPrice += maelPart.price();
        }
        System.out.println("Total Price : "+ totalPrice);
    }
}
