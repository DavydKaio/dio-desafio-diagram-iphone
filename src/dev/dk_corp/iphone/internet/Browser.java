package dev.dk_corp.iphone.internet;

public class Browser {
    private String url;

    public Browser(String url) {
        this.url = url;
    }

    public void showPage() {
        System.out.println("Showing page");
    }

    public void createNewTab() {
        System.out.println("Creating new tab");
    }

    public void refreshPage() {
        System.out.println("Refreshing page");
    }
}
