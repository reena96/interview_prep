package com.company.functionalProgramming;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class JavaIterators {

    public static void main(String[] args) {
        List<Point> pList = Arrays.asList(new Point(1, 2), new Point(2, 3));

        pList.forEach(p -> p.translate(1, 1));  // new Translation() implements Consumer<Point>


        /*
       Translation t -assume
       for (Point point : this) {
            new Translation.accept(point);
        }
        */
    }
}


class Translation implements Consumer<Point> {

    public void accept(Point p) {
        System.out.println("sharan");
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public void translate(int i, int i1) {
        System.out.println(i + i1 + "dance");
    }
}