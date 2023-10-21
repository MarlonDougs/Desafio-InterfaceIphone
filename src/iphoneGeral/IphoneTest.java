package iphoneGeral;



public class IphoneTest {
    public static void main(String[] args) {
        // Crie uma instância de IPhone
        Iphone iphone = new Iphone();

        // Teste as funcionalidades
        iphone.play();
        iphone.pause();
        iphone.stop();
        iphone.next();
        iphone.previous();

        iphone.makeCall("123-456-7890");
        iphone.receiveCall("My Girl");
        iphone.endCall();
        iphone.sendMessage("Rafaella", "Hello!I love You.");

        iphone.openWebsite("https://www.example.com");
        iphone.browseHistory();
        iphone.search("Java programming");
    }
}