package com.eminekarabolat.ThreadSorunlar;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSorun2 {
    //AtomicInteger değişkenleri multi-thread uygulamalarda
    // ve lambda exp içinde local değişken gereken yerlerde kullanabilirsiniz.
    public static void main(String[] args) {
        // int i=1; //Variable used in lambda expression should be final or effectively final
        AtomicInteger i=new AtomicInteger(1);
        List<String> isimler=List.of("Özkan","Ahmet","Emine","Alex","Muzaffer","Emirhan");
        isimler.forEach(isim->{
            System.out.println(i+". kişi="+isim);
            // i++;
            //i.getAndIncrement();
        });
    }
}
