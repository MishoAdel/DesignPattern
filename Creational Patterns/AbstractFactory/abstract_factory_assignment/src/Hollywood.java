interface Hollywood {
    void getMovieName();
}

class ComedyHollywood implements Hollywood{

    @Override
    public void getMovieName() {
        System.out.println("A Comedy Hollywood Movie");
    }
}
class ActionHollywood implements Hollywood{

    @Override
    public void getMovieName() {
        System.out.println("An Action Hollywood Movie");
    }
}

