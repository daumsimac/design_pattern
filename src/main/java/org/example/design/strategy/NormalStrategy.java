package org.example.design.strategy;

public class NormalStrategy implements IEncodingStrategy{
    @Override
    public String encode(String text) {
        return text;
    }
}
