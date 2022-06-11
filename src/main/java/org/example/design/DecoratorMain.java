package org.example.design;

import org.example.design.decorator.*;

public class DecoratorMain {
    public static void main(String[] args){
        ICar audi = new Audi(1000);
        audi.showPrice();

        //A3
        ICar audi3 = new A3(audi, "A3");
        audi3.showPrice();
        //A4
        ICar audi4 = new A4(audi, "A3");
        audi4.showPrice();
        //A5
        ICar audi5 = new A5(audi, "A3");
        audi5.showPrice();

    }
}
