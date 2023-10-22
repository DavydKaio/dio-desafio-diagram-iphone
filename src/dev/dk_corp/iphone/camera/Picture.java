package dev.dk_corp.iphone.camera;

public class Picture {
    private String name;
    private String date;
    private String place;

    public Picture(String name, String date, String place) {
        this.name = name;
        this.date = date;
        this.place = place;
    }

    public void displayPicture() {
        System.out.println("Displaying picture");
    }
}
