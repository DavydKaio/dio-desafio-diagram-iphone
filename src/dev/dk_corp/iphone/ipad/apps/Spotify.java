package dev.dk_corp.iphone.ipad.apps;

import dev.dk_corp.iphone.ipad.MusicPlayer;

public class Spotify extends MusicPlayer {
    public Spotify(String musicName, String artist) {
        super(musicName, artist);
    }

    public void playMusic() {
        System.out.println("Play music on Spotify");
    }

    public void pauseMusic() {
        System.out.println("Music paused on Spotify");
    }

    public void selectMusic() {
        System.out.println("Music selected on Spotify");
    }
}
