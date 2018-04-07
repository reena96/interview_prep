package com.company.Threads;

public class Creator {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++)
            //UNCOMMENT THIS // //*****declaration not allowed here!
            //Creature creature = new Creature();
            // OR
        //   int x;   //In any block without paranthesis, if there is a single line statement, the scope of
            // any variable declared in that line is that line itself, which makes the declaration useless to the
            // rest of the program. Hence it will be a compile time error
        System.out.println(Creature.numCreated());
    }
}

class Creature {
    private static long numCreated = 0;

    public Creature() {
        numCreated++;
    }

    public static long numCreated() {
        return numCreated;
    }
}