public interface MobileState {
    public  void alert();
    public void pressSwitch(Mobile context);
}

class Vibration implements MobileState{

    @Override
    public void alert() {
        System.out.println("Vibrating");
    }

    @Override
    public void pressSwitch(Mobile context) {
        context.setState(new Silent());
    }
}

class Silent implements MobileState{

    @Override
    public void alert() {
        System.out.println("Silent no alert");
    }

    @Override
    public void pressSwitch(Mobile context) {
        context.setState(new Vibration());
    }
}