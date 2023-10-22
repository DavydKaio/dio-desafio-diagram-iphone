package dev.dk_corp.iphone.internet.apps;

import dev.dk_corp.iphone.camera.Camera;

public class Instagram implements Camera {
    private String user;
    private String password;

    public Instagram(String user, String password) {
        this.user = user;
        this.password = password;
    }

    @Override
    public void takePicture() {
        System.out.println("Taking picture");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video");
    }
}
