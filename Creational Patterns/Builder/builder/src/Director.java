public class Director {
    BuilderInterface myBuilder;

    public void construct(BuilderInterface builder){
        myBuilder = builder;
        builder.buildBody();
        builder.addHeadLights();
        builder.insertWheels();
    }
}
