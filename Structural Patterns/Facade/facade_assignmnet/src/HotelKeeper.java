public class HotelKeeper {
    public  VegMenu getVegMenu(){
        VegRestaurant vegRestaurant = new VegRestaurant();
        VegMenu vegMenu = (VegMenu) vegRestaurant.getMenus();
        return vegMenu;
    }

    public  NonVegMenu getNonVegMenu(){
        NonVegRestaurant nonVegRestaurant = new NonVegRestaurant();
        NonVegMenu nonVegMenu = (NonVegMenu) nonVegRestaurant.getMenus();
        return nonVegMenu;
    }

    public  Both getBothMenu(){
        VegNonBothRestaurant vegNonBothRestaurant = new VegNonBothRestaurant();
        Both bothMenu = (Both) vegNonBothRestaurant.getMenus();
        return bothMenu;
    }
}
