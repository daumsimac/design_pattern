package org.example.design.singletone;

public class AClazz {
    private SocketClient socketClient;

    public AClazz(){
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
