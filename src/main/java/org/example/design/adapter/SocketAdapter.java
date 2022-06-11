package org.example.design.adapter;

public class SocketAdapter implements IElectronic110v{

    private IElectronic220v electronic220v;

    public SocketAdapter(IElectronic220v electronic220v){
        this.electronic220v = electronic220v;
    }
    @Override
    public void powerOn() {
        electronic220v.connect();
    }
}
