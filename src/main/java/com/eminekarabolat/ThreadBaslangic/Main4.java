package com.eminekarabolat;

public class Main4 {
    public static void main(String[] args) {
        //Anonymous Inner Type
        String name="Anonymous Thread";
        Thread thread0=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("\u001B[31m"+name+" isimli thread çalıştı.\u001B[0m");
                String activeThread = Thread.currentThread().getName();
                for (int i = 0; i < 5; i++) {

                    try {
                        Thread.sleep(1000);
                        System.out.println("\u001B[31m"+i+":thread:"+activeThread+"\u001B[0m");
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }

                }
                System.err.println("\u001B[31m"+activeThread+" Threadi çalışmayı bitirdi. \u001B[0m");
            }
        });
        thread0.start();
        System.out.println("Main thread son satır.");
    }
}
