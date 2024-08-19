package com.eminekarabolat.ThreadBaslangic;

//100mb -> 10mb
public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyThread myThread1=new MyThread("myThread1");
        MyThread myThread2=new MyThread("myThread2");
        //Eşzamanlılık (Concurrecy)
        myThread1.start(); //start metodu ççağrıldığında Thread içinde run metodu tetiklenir. Ve yeni bir thread
        // çalışmaya başlar.
        myThread2.start();

        String  activeThread= Thread.currentThread().getName();
        for (int i = 0; i < 10; i++) {
            System.out.println(i+": thread="+activeThread);
            //Thread.sleep(1000);
        }


    }
}