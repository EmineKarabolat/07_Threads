//package com.eminekarabolat.ThreadSorunlar;
//
//public class ThreadeSorun1 {
//
//    private static int sayac = 0;
//    /*
//       Race Condition: Yarış durumu.
//        */
//    private static int sayac=0;
//
//    public static void main(String[] args) throws InterruptedException {
//
//        Thread thread1=new Thread(()->{
//            for (int i = 0; i < 5000; i++) {
//                sayac++;
//            }
//            System.out.println("Thread1 çalışmayı bitirdi. sayac="+sayac);
//        });
//        Thread thread2=new Thread(()->{
//            for (int i = 0; i < 5000; i++) {
//                sayac++;
//            }
//            System.out.println("Thread2 çalışmayı bitirdi. sayac="+sayac);
//        });
//        thread1.start();
//        thread2.start();
//
//        thread1.join();
//        thread2.join();
//        System.out.println("Main thread çalışmayı bitirdi. sayac="+sayac);
//    }
//}
