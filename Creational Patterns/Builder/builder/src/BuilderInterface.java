interface BuilderInterface {
    void buildBody();
    void insertWheels();
    void addHeadLights();
    Product getProduct();
}

class Car implements BuilderInterface{

    private  Product product = new Product();

    @Override
    public void buildBody() {
        product.add("Added car body");
    }

    @Override
    public void insertWheels() {
        product.add("AAdded 4 wheels");
    }

    @Override
    public void addHeadLights() {
        product.add("AAdded 2 head lights");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}

class Motorcycle implements BuilderInterface{

    private  Product product = new Product();

    @Override
    public void buildBody() {
        product.add("AAdded motorcycle body");
    }

    @Override
    public void insertWheels() {
        product.add("AAdded 2 wheels");
    }

    @Override
    public void addHeadLights() {
        product.add("AAdded 1 head lights");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
