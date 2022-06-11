package org.example.design.strategy;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Strategy implements IEncodingStrategy{
    @Override
    public String encode(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes());
    }
}
