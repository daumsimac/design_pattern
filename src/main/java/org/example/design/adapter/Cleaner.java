package org.example.design.adapter;

public class Cleaner implements IElectronic220v{
    @Override
    public void connect() {
        System.out.println("청소기 200v on");
    }
}
