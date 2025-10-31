public class Mobile {
    private  MobileState state;

    public Mobile(MobileState state){
        this.state = state;
    }

    public void setState(MobileState state) {
        this.state = state;
    }

    public MobileState getState() {
        return state;
    }

    public void  alert(){
        state.alert();
    }

    public void pressButton(){
        state.pressSwitch(this);
    }
}
