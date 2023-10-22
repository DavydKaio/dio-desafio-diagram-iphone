package dev.dk_corp.iphone.internet.apps;

import dev.dk_corp.iphone.internet.Browser;

public class Safari extends Browser {
    public Safari(String url) {
        super(url);
    }

    public void showPage() {
        System.out.println("Showing page on Safari");
    }

    public void createNewTab() {
        System.out.println("Creating new tab on Safari");
    }

    public void refreshPage() {
        System.out.println("Refreshing page on Safari");
    }
}
