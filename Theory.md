

Thread executes and with which the code assosciated to it is executed.
Smallest execution unit.

Multiple threads can be executed simultaneously.
Multithreading can be said "Ek program ke multiple portions ki ek sath chalne ki capability ko Multithreading kehte h"

When start method is triggered, thread get into ThreadPool. ThreadPool is a portion of RAM where all threads lies and executes. OS no schedule the thread and execute with CPU and then run method is executed.So we provide body to the run method by overriding. Check MyThread class for the same.
 

**Working of Start() Method**
``` java
class ThreadDemo{
    public static void main(String[] args){
        Thread th  = new Thread();
        th.start();
    }
}

class Thread{
    public void start(){
        //Here lies some code +
        // A thread calling the start function automatically get into Thread Pool.

        run();
    }
    public void run(){
        // Run function is completely empty and need to be manually implemented.
    }
}

```