interface Internet {
    void connectTo(String site);
}

class RealInternet implements Internet{

    @Override
    public void connectTo(String site) {
        System.out.println("Connecting to "+site);
    }
}


