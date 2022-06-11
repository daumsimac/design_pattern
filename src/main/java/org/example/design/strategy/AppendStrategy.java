package org.example.design.strategy;

public class AppendStrategy implements IEncodingStrategy{
    @Override
    public String encode(String text) {
        return "ABCDE" + text;
    }
}
