package iphoneGeral.implemental;

import iphoneGeral.interfaceGeral.InternetBrowser;
import iphoneGeral.interfaceGeral.MusicPlayer;
import iphoneGeral.interfaceGeral.Phone;

class Iphone implements MusicPlayer, Phone, InternetBrowser {

    public void play() {
            System.out.println("Reproduzindo música.");
        }
    

    public void pause() {
            System.out.println("Pausando música.");
        }
    

    public void stop() {

    }

    public void next() {

    }

    public void previous() {
        
    }

    

    public void makeCall(String number) {
        System.out.println("Ligando para " + number);
    }

    

    public void receiveCall(String caller) {
        System.out.println("Recebendo ligação de " + caller);
    }

    public void endCall() {
        System.out.println("Encerrando chamada.");
    }

    public void sendMessage(String recipient, String message) {
        System.out.println("Enviando mensagem para " + recipient + ": " + message);
    }

    public void openWebsite(String url) {
        System.out.println("Abrindo o navegador e acessando " + url);
    }

    public void browseHistory() {
        System.out.println("Visualizando histórico de navegação.");
    }

    public void search(String query) {
        System.out.println("Realizando uma pesquisa na internet: " + query);
    }
}
