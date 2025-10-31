abstract class HouseTemplate {
    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built");
    }


    public void buildFoundation(){
        System.out.println("Foundation is built");
    }

    public void buildWindows(){
        System.out.println("Windows are built");
    }

    public abstract void buildPillars();
    public abstract void buildWalls();
}

class  WoodenHouse extends HouseTemplate{

    @Override
    public void buildPillars() {
        System.out.println("Built pillars for wooden house");
    }

    @Override
    public void buildWalls() {
        System.out.println("Built walls for wooden house");
    }
}

class  GlassHouse extends HouseTemplate{

    @Override
    public void buildPillars() {
        System.out.println("Built pillars for glass house");
    }

    @Override
    public void buildWalls() {
        System.out.println("Built walls for glass house");
    }
}
