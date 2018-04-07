package com.company.ooleL9S19;


abstract class Fruit2 implements Comparable<Fruit2> {
    protected int color;
    public Fruit2(int color){this.color = color;}
    public int compareTo(Fruit2 fruit){
        return fruit.color - color;
//We just implemented Comparable interface and then, we are using compareTo() Method instead of compare
    }

    public static void main(String[] args){
        Apple2 a = new Apple2();
        Orange2 o = new Orange2();
        if( a.compareTo(o) == 0 ) {
//fruits are the same
        }

    }
}

class Apple2 extends Fruit2{
    public Apple2(){super(1);}
}

class Orange2 extends Fruit2 {
    public Orange2(){super(2);}
}



