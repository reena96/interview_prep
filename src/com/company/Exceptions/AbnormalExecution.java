package com.company.Exceptions;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class AbnormalExecution {


}

class rval {
    boolean rv() {
        try {
            System.out.println("try");

            int c= 3;
            while (c > 0) {
                c--;
                if (c == 2)
                    //return true;
                    continue;

                System.out.println("number " + c);
            }
            //return false;

        } catch (Exception e) {
            System.out.println("catch");
            //return false;
        } finally {
            System.out.println("finally");
            return false;
            //If the finally block completes normally, then the try statement completes normally.
            //If the finally block completes normally, then the try statement completes abruptly for reason R.

        }

    }

    public static void main(String[] args) {
        rval r = new rval();
        //r.rv();
        System.out.println(r.rv());
    }
}