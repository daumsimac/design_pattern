package org.example.design;

import org.example.design.aop.AopBrowser;
import org.example.design.proxy.Browser;
import org.example.design.proxy.BrowserProxy;
import org.example.design.proxy.IBrowser;

import javax.sql.rowset.BaseRowSet;
import java.util.concurrent.atomic.AtomicLong;

public class ProxyMain {
    public static void main(String[] args){
//        IBrowser browser = new BrowserProxy("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopbrowser = new AopBrowser("www.naver.com",
                ()->{
                    System.out.println("Before");
                    start.set(System.currentTimeMillis());
                },
                ()->{
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                });
        aopbrowser.show();
        System.out.println(end.get());
        aopbrowser.show();
        System.out.println(end.get());
    }
}
