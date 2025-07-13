public class Client {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new AudioPlayer();
        mediaPlayer.play("song.mp3","mp3");

        AdvancedMediaPlayer mp4Player = new Mp4Player();
        MediaPlayer adapter1 = new AdvancedMediaPlayerAdapter(mp4Player);
        adapter1.play("music.mp4","mp4");

        AdvancedMediaPlayer vlcPlayer = new VlcPlayer();
        MediaPlayer adapter2 = new AdvancedMediaPlayerAdapter(vlcPlayer);
        adapter2.play("music.vlc","vlc");
    }
}
