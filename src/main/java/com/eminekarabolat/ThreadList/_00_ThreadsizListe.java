package com.eminekarabolat.ThreadList;

import java.util.ArrayList;
import java.util.Random;

public class _00_ThreadsizListe {
    ArrayList<Integer> list1=new ArrayList<>();
    ArrayList<Integer> list2=new ArrayList<>();

    Random random=new Random();

    public static void main(String[] args) {
        _00_ThreadsizListe threadsizListe=new _00_ThreadsizListe();
        long start = System.nanoTime();
        threadsizListe.listelereDegerEkle();
        long end = System.nanoTime();
        System.out.println("Threadsiz Liste geçen süre:"+(end-start));

    }
    public void listelereDegerEkle(){
        for (int i = 0; i < 10000; i++) {
            list1eDegerEkle();
            list2eDegerEkle();
        }
        System.out.println("List1 eleman sayısı:"+list1.size());
        System.out.println("List2 eleman sayısı:"+list2.size());
    }

    public void list1eDegerEkle(){
        list1.add(random.nextInt(0,101));
    }
    public void list2eDegerEkle(){
        list2.add(random.nextInt(0,101));
    }
}
