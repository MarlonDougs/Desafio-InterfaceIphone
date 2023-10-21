package iphoneGeral.interfaceGeral;

public interface Phone {
    void makeCall(String number);
    void receiveCall(String caller);
    void endCall();
    void sendMessage(String recipient, String message);
}
