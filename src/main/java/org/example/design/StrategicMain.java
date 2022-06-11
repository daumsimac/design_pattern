package org.example.design;

import org.example.design.strategy.*;

public class StrategicMain {
    public static void main(String[] args){
        Encoder encoder = new Encoder();

        //Base64
        IEncodingStrategy base64 = new Base64Strategy();

        //normal
        IEncodingStrategy normal = new NormalStrategy();

        //AppendStrategy
        IEncodingStrategy append = new AppendStrategy();

        String message = "Hello World";

        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println(base64Result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);

        encoder.setEncodingStrategy(append);
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult);
    }
}
