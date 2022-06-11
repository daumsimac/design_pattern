package org.example.design;

import org.example.design.observer.Button;
import org.example.design.observer.IButtonListener;

public class ObserverMain {
    public static void main(String[] args){
        Button button = new Button("버튼");

        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });

        button.click("메시지 전달 : click 1");
        button.click("메시지 전달 : click 2");
        button.click("메시지 전달 : click 3");
        button.click("메시지 전달 : click 4");
        button.click("메시지 전달 : click 5");
    }
}
