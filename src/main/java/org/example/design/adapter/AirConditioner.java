package org.example.design.adapter;

public class AirConditioner implements IElectronic220v{
    @Override
    public void connect() {
        System.out.println("에어컨 200v on");
    }
}
