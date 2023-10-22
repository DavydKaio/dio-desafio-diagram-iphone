package dev.dk_corp.iphone.ipad.apps;

import dev.dk_corp.iphone.ipad.MusicPlayer;

public class Itunes extends MusicPlayer {

    public Itunes(String musicName, String artist) {
        super(musicName, artist);
    }

    public void playMusic() {
        System.out.println("Play music on iTunes");
    }

    public void pauseMusic() {
        System.out.println("Music paused on iTunes");
    }

    public void selectMusic() {
        System.out.println("Music selected on iTunes");
    }
}
