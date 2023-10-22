package dev.dk_corp.iphone.ipad;

public class MusicPlayer {
    private String musicName;
    private String artist;

    protected MusicPlayer(String musicName, String artist) {
        this.musicName = musicName;
        this.artist = artist;
    }

    public void playMusic() {
        System.out.println("Play music");
    }

    public void pauseMusic() {
        System.out.println("Music paused");
    }

    public void selectMusic() {
        System.out.println("Music selected");
    }
}
