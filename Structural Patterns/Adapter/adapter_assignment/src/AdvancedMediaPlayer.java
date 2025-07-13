public interface AdvancedMediaPlayer {
    void loadFileName(String file);
    void listen();
}

class VlcPlayer implements AdvancedMediaPlayer{
    public String fileName;
    @Override
    public void loadFileName(String file) {
        fileName = file;
    }


    @Override
    public void listen() {
        System.out.println("palying VLC from: "+ fileName);
    }
}

class Mp4Player implements AdvancedMediaPlayer{

    public String fileName;

    @Override
    public void loadFileName(String file) {
        this.fileName = file;
    }

    @Override
    public void listen() {
        System.out.println("palying MP4 from: "+ fileName);
    }
}

