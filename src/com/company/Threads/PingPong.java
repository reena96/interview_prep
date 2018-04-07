package com.company.Threads;

public class PingPong {
    public static synchronized void main(String[ ] a) {
        Thread t = new Thread( ) {
            public void run( ) { pong( ); }
        };
        t.start();
        System.out.println("Ping");

    }
    static synchronized void pong( ) {
        System.out.println("Pong");
    }
}