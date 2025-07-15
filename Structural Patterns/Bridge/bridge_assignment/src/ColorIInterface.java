public interface ColorIInterface {
    void fillColor(int border);
}

class RedColor implements ColorIInterface{

    @Override
    public void fillColor(int border) {
        System.out.println("Filled with red for "+border+" inches");
    }
}

class GreenColor implements ColorIInterface{

    @Override
    public void fillColor(int border) {
        System.out.println("Filled with green for "+border+" inches");
    }
}

