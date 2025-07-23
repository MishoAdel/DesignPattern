public interface Image {
    void display();
}

class RealImage implements Image{

    String fileName;
    public RealImage(String fileName){
        this.fileName = fileName;
        LoadFromDisk(this.fileName);
    }

    private void LoadFromDisk(String path){
        System.out.println("Loading: "+fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying: "+fileName);
    }
}
