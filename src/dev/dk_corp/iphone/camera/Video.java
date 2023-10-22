package dev.dk_corp.iphone.camera;

public class Video {
    private String name;
    private String date;
    private String place;

    public Video(String name, String date, String place) {
        this.name = name;
        this.date = date;
        this.place = place;
    }

    public void displayVideo() {
        System.out.println("Displaying video");
    }
}
