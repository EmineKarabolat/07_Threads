package com.eminekarabolat.ThreadBaslangic;

public class MyThread2 extends Thread {
    private String name;

    public MyThread2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("\u001B"+ name + " isimli thread çalıştı.");
        String activeThread = Thread.currentThread().getName();
        for (int i = 0; i < 10; i++) {

            try {
                Thread.sleep(1000);
                System.err.println(i + ":thread:" + activeThread);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        System.out.println(activeThread + " Threadi çalışmayı bitirdi.");
    }
}
