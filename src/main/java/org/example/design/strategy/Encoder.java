package org.example.design.strategy;

public class Encoder {
    private IEncodingStrategy encodingStrategy;

    public String getMessage(String message){
        return this.encodingStrategy.encode(message);
    }

    public void setEncodingStrategy(IEncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }
}
