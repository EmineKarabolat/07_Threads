package com.eminekarabolat.ThreadBaslangic;

public class Main3 {
    public static void main(String[] args) {
        //MyThread3 myThread3=new MyThread3("myThread3");
        // myThread3.run(); // !!! run metodu ile çağırırsak Thread mantığında çalışmaz!
        // myThread3.start(); // !!! extends Thread yapmadığımız için start metodu gelmez!
        Thread thread0=new Thread(new MyThread3("thread0"));
        Thread thread1=new Thread(new MyThread3("thread1"));
        thread0.start();
        thread1.start();

        System.out.println("Main thread son satır.");
    }
}