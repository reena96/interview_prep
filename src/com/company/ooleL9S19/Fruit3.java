package com.company.ooleL9S19;



public class Fruit3 {
    protected int color;
    public Fruit3(int color){this.color = color;}


    public static void main(String[] args){
        Apple3 a = new Apple3();
        Orange3 o = new Orange3();
        //if( a.compareTo(o) == 0 ) {
//fruits are the same
        //}

    }

}


class Apple3 extends Fruit3 implements Comparable<Apple3> {
    public Apple3() {
        super(1);
    }

    public int compareTo(Apple3 a) {
       // return super.compareTo(a);
        return 0;
    }
}

class Orange3 extends Fruit3 implements Comparable<Orange3> {
        public Orange3(){super(2);}
        public int compareTo(Orange3 o) {
            //return super.compareTo(o);
            return 0;
    }
}

