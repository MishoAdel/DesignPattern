interface Color {
    void fill();
}

class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Filling with Red");
    }
}

class Green implements Color{
    @Override
    public void fill() {
        System.out.println("Filling with Green");
    }
}

class Bleu implements Color{
    @Override
    public void fill() {
        System.out.println("Filling with Bleu");
    }
}
