package com.company.ooleL9S19;


public class Fruit {
    protected int color;
    public Fruit(int color){this.color = color;}
    public int compare(Fruit fruit){
        return fruit.color - color;
        // fruit.color = 2 (passed parameter object is orange), color = 1 (this object is apple)
    }

    public static void main(String args[]){
        Apple a = new Apple();
        Orange o = new Orange();
        if( a.compare(o) == 0 ) {
            System.out.print("Fruits are the same");
        }
    }
}

class Apple extends Fruit{

    public Apple(){super(1);}
}

class Orange extends Fruit {
    public Orange(){super(2);}
}
