package org.example.design.adapter;

public class HairDryer implements IElectronic110v{
    @Override
    public void powerOn() {
        System.out.println("헤어드라이어 100v On");
    }
}
