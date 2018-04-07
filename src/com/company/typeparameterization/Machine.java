package com.company.typeparameterization;

interface Robot { public void kill(); }
interface Human { public void luv(); }

interface Terminator extends Robot, Human
{
}

class Chitti{

}

public class Machine {
    public static <T extends Chitti & Robot & Human>
    void doTerminatorThings( T schwarz ) {
        schwarz.luv();
        schwarz.kill();
    }

    public static void main(String[] args){
        Machine m = new Machine();
        //Machine.doTerminatorThings();
    }

}

