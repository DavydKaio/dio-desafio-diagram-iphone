package dev.dk_corp.iphone.internet.apps;

import dev.dk_corp.iphone.internet.Browser;

public class Chrome extends Browser {
    public Chrome(String url) {
        super(url);
    }

    public void showPage() {
        System.out.println("Showing page on Chrome");
    }

    public void createNewTab() {
        System.out.println("Creating new tab on Chrome");
    }

    public void refreshPage() {
        System.out.println("Refreshing page on Chrome");
    }
}
