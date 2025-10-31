public abstract  class RemoteControl{
    public  abstract  void pressSwitch(TV context);
}

class On extends RemoteControl{

    @Override
    public void pressSwitch(TV context) {
        System.out.println("I was already on. Going off now");
        context.setState(new Off());
    }
}

class Off extends RemoteControl{

    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am off. Going on now");
        context.setState(new On());
    }
}