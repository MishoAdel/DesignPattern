public class AdvancedMediaPlayerAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;

    AdvancedMediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer){
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String file, String type) {
            advancedMediaPlayer.loadFileName(file);
            advancedMediaPlayer.listen();
    }
}
