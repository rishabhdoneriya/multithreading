package com.leaningmultithreading;

public class Main {
    public static void main(String[] args) {
        // Current thread returns the running thread
        var currThread = Thread.currentThread();
        System.out.println("Current thread name: " + currThread.getClass().getName());
        // printThreadState(currThread);
        System.out.println(" ");

        //Creating a thread
        MyThread th  = new MyThread();
        th.start();
        MyThread th2 = new MyThread();
        th2.start();
    }
    public static void printThreadState(Thread thread){
        System.out.println("----------------------------------------------------------------");
        System.out.println("thread id:  "+ thread.getId());
        System.out.println("thread name:  "+ thread.getName());
        System.out.println("thread state:  "+ thread.getState());
        System.out.println("thread priority:  "+ thread.getPriority());
        System.out.println("thread group:  "+ thread.getThreadGroup());
        System.out.println("thread is alive:  " + thread.isAlive());
        System.out.println("----------------------------------------------------------------");
    }
}