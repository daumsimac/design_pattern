package org.example.design;

import org.example.design.singletone.AClazz;
import org.example.design.singletone.BClazz;
import org.example.design.singletone.SocketClient;

public class SingletoneMain {
    public static void main(String[] args){
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println(aClient.equals(bClient));
    }
}
