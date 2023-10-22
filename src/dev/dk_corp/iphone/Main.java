package dev.dk_corp.iphone;

import dev.dk_corp.iphone.internet.Browser;
import dev.dk_corp.iphone.internet.Email;
import dev.dk_corp.iphone.internet.apps.Chrome;
import dev.dk_corp.iphone.internet.apps.Instagram;
import dev.dk_corp.iphone.internet.apps.Safari;
import dev.dk_corp.iphone.ipad.MusicPlayer;
import dev.dk_corp.iphone.ipad.apps.Itunes;
import dev.dk_corp.iphone.ipad.apps.Spotify;
import dev.dk_corp.iphone.phone.Contact;
import dev.dk_corp.iphone.phone.Phone;

public class Main {
    public static void main(String[] args) {
        Browser browser = new Browser("Chrome");
        String browserChosen = "Safari";

        if (browserChosen.equalsIgnoreCase("Safari")) {
            browser = new Safari("https://www.google.com");
        } else if (browserChosen.equalsIgnoreCase("Chrome")) {
            browser = new Chrome("https://www.google.com");
        } else {
            System.out.println("Navegador não encontrado.");
        }

        if (browser != null) {
            browser.showPage();
            browser.createNewTab();
            browser.refreshPage();
        }

        Email email = new Email("myEmail@email.com");
        email.sendEmail();
        email.deleteEmail();

        MusicPlayer musicPlayer = null;
        String musicPlayerChosen = "Spotify";

        if (musicPlayerChosen.equalsIgnoreCase("Spotify")) {
            musicPlayer = new Spotify("Save Your Tears", "The Weeknd");
        } else if (musicPlayerChosen.equalsIgnoreCase("iTunes")) {
            musicPlayer = new Itunes("My Girl", "Vintage Culture & Fancy");
        } else {
            System.out.println("Reprodutor musical não encontrado.");
        }

        if (musicPlayer != null) {
            musicPlayer.playMusic();
            musicPlayer.pauseMusic();
            musicPlayer.selectMusic();
        }

        Phone phone = new Phone("11999999999");
        phone.call();
        phone.answer();
        phone.playVoiceMail();

        Contact contact = new Contact("Jim", "Milton", phone, email);
        contact.createContact();

        Instagram instagram = new Instagram("Arthur", "gunslinger11");
        instagram.takePicture();
        instagram.recordVideo();
    }
}