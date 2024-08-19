package com.eminekarabolat.ThreadBaslangic;

public class MyThread3 implements Runnable{
    private String name;

    public MyThread3(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println(name + " isimli thread çalıştı.");
        String activeThread = Thread.currentThread().getName();
        for (int i = 0; i < 5; i++) {

            try {
                Thread.sleep(1000);
                System.out.println(i + ":thread:" + activeThread);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        System.out.println(activeThread + " Threadi çalışmayı bitirdi.");
    }

    }

