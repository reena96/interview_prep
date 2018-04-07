package com.company.Exceptions;


import java.io.FileNotFoundException;
import java.io.IOException;

class BlewIt extends ArithmeticException {
    BlewIt() { }
    BlewIt(String s) {
        super(s);
    }
}

class BlewItSubClass extends BlewIt {
    BlewItSubClass() { }
    BlewItSubClass(String s) {
        super(s);
    }
}
class Test {
    static void blowUp(){
       throw new BlewItSubClass();
        //blowUpOnceMore();
    }

    private static void blowUpOnceMore()  {

    }

    public static void main(String[] args) throws BlewIt {
        try {
            blowUp();
        }
        catch (BlewIt r){
            System.out.println("Caught Exception");
        }
        finally {
            System.out.println("Uncaught Exception");
        }
    }
}
/*
Exception
      Runtime Exception
             Arithmetic Exception
                    BlewIt
                        BlewItSubClass
*/
