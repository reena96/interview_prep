package com.company.Threads;

import java.util.concurrent.atomic.AtomicLong;


public class CreatorAtomicLong  {
    public static void main(String[ ] args) {
        for (int i = 0; i < 100; i++) {
            new Thread( ) { public void run( ) { new Creature(); }} .start();
        }
        System.out.println(Creature.numCreated());
    }
}
