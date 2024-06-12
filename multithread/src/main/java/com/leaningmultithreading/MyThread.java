package com.leaningmultithreading;

public class MyThread extends Thread {
    @Override
    public void run(){
        System.out.println("Body Provided to the thread.");
    }
}
