package org.example.design;

import org.example.design.adapter.Cleaner;
import org.example.design.adapter.HairDryer;
import org.example.design.adapter.IElectronic110v;
import org.example.design.adapter.SocketAdapter;

public class AdapterMain {
    public static void main(String[] args){
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
//        connect(cleaner);
        IElectronic110v adapter = new SocketAdapter(cleaner);
        connect(adapter);
    }

    //콘센트
    public static void connect(IElectronic110v electronic110v){
        electronic110v.powerOn();
    }
}
