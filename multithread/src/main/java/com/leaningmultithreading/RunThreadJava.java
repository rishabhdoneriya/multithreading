package com.leaningmultithreading;
// public class RunThreadJava implements Runnable {
//     public void run(){
//         for(int i =0;i<5;i++){
//             System.out.println(i);
//         }
//     }

// }   

// In Main method
//        RunThreadJava obj1 = new RunThreadJava();
//        Thread th1 = new Thread(obj1);
//      th1.start();
        

public class RunThreadJava implements Runnable {
    RunThreadJava(){
        new Thread(this).start();
    }

    public void run(){
        for(int i =1;i<=10;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
                // System.out.println(Thread.currentThread().getName()); Thread-0
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }


}