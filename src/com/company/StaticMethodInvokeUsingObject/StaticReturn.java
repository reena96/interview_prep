package com.company.StaticMethodInvokeUsingObject;


class Aa {
    public static void blah() { System.err.println("I'm an A"); }
}

 class SubAa extends Aa{
    public static void blah() { System.err.println("I'm a SubA"); }
}

 class Bb {
    public static Aa getA(){ return new SubAa(); }
    public static void main(String args[]){
        Bb.getA().blah();

    }
}

