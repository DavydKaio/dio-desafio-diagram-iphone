package dev.dk_corp.iphone.camera;

public class Gallery {
    private Picture[] pictures;
    private Video[] videos;

    public Gallery(Picture[] pictures, Video[] videos) {
        this.pictures = pictures;
        this.videos = videos;
    }

    public void displayPictures() {
        System.out.println("Displaying pictures");
    }

    public void displayVideos() {
        System.out.println("Displaying Videos");
    }
}
