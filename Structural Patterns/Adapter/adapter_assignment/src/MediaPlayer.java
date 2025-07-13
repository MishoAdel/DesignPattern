interface MediaPlayer {
    void play(String file,String type);
}

class AudioPlayer implements  MediaPlayer{

    @Override
    public void play(String file, String type) {
        if(type.equalsIgnoreCase("mp3")){
            System.out.println("Playing "+file+" as "+type);
        } else  {
            System.out.println("Invalid Type");
        }

    }
}
