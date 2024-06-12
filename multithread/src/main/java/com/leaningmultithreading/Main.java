package com.leaningmultithreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Current thread returns the running thread
        // var currThread = Thread.currentThread();
        // System.out.println("Current thread name: " + currThread.getClass().getName());
        // // printThreadState(currThread);
        // System.out.println(" ");

        // //Creating a thread
        // MyThread th1  = new MyThread();
        // //By doing th.run we literally ignore the concept of multithreading. The main thread will call run and no specific thread for MyThread class object is created.
        // //  th.run()
        
        // th1.start();
        // th1.join();
         
        // for(int i=1;i<=2;i++){
        //     System.out.println(i+" "+Thread.currentThread().getName());
        // }
        System.out.println(" ");
            
        RunThreadJava obj1 = new RunThreadJava();
        
            
        

    }


    // public static void printThreadState(Thread thread){
    //     System.out.println("----------------------------------------------------------------");
    //     System.out.println("thread id:  "+ thread.getId());
    //     System.out.println("thread name:  "+ thread.getName());
    //     System.out.println("thread state:  "+ thread.getState());
    //     System.out.println("thread priority:  "+ thread.getPriority());
    //     System.out.println("thread group:  "+ thread.getThreadGroup());
    //     System.out.println("thread is alive:  " + thread.isAlive());
    //     System.out.println("----------------------------------------------------------------");
    // }
}

