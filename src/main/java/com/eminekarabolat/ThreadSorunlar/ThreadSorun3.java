package com.eminekarabolat.ThreadSorunlar;

public class ThreadSorun3 {
    // Volatile: bir değişkenin değeri direkt olarak bellekten alınması istendiğinde kullanılır.
    // işlemcide cache mekanizması var.
    // burada volatile keywordü ile bu değişkenin işlemci cachelerinde tutulması engellenir.
    // değeri direkt olarak ram bellekten getirilir.

    public static volatile boolean flag=false;
    public static void main(String[] args) {
        Thread thread1=new Thread(()->{
            System.out.println("Thread 1 çalıştı:");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag=true;
            System.out.println("Flag değer true yapıldı");
        });

        Thread thread2=new Thread(()->{
            System.out.println("Thread 2 çalıştı");
            while(!flag) {
                System.out.println(flag);
                System.out.println("Thread 2 while bloğu çalıştı");
            }
            System.out.println("Flag değeri true oldu."+flag);
        });
        thread1.start();
        thread2.start();
    }
}