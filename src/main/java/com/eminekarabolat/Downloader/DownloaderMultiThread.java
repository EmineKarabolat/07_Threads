package com.eminekarabolat.Downloader;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DownloaderMultiThread {
    public static void main(String[] args) {
        int threadSayisi = 5;
        ExecutorService executorService = Executors.newFixedThreadPool(threadSayisi);
        executorService.submit(()->{
           //dosyaIndir
           //dosyaYaz

        });
    }
}
