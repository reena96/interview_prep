package com.company.Threads;

public class CreatureThread {
    public static void main(String[ ] args) {
        for (int i = 0; i < 10; i++) {
            new Thread( ) { public void run( ) { new CreatureT();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }} .start();
        }
        System.out.println("CreatureT.numCreated():"+CreatureT.numCreated());
    }
}

// 100 threads will start as for iterates through the loop. But as the threads run asynchronously, we don't
// know when the threads will finish- whether it will finish before main thread terminates or after main thread
// teriminates.
//
// This is because the main thread doesn't wait for the threads to finish all their work. The main thread will
// continue its job even as the other threads are running and after all the threads have started, eventually
// System.out.println() will be called

//FOR LOOP: All the threads will be instantiated and at the last thread instantiation when .start() is called
// it calls run()
// and simultaneously transfers control to SOPLN. Here, among the last threads that are running and the
// SOPLN, which is being executed simultaneously the order of execution varies for every single run
// dynamically AS ALL THREADS RUN ASYNC


class CreatureT {
    private static long numCreated = 0;
    public CreatureT( ) { numCreated++; System.out.println(numCreated); }
    public static long numCreated( ) { return numCreated; }
}



