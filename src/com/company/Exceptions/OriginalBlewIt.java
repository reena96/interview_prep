package com.company.Exceptions;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;

class OriginalBlewIt extends RuntimeException {
    OriginalBlewIt() {
    }

    OriginalBlewIt(String s) {
        super(s);
    }
}

class ExceptionSubClass extends Exception {
}

class OriginalTest {
    static void blowUp() throws OriginalBlewIt {

        //File f = new File("/Users/reenamaryputhota/IdeaProjects/untitled/src/com/company/Exceptions/Quiz/CheckedExceptio");
        //BufferedWriter writer = new BufferedWriter(new FileWriter(f));
        //throw new FileNotFoundException();
        //FileReader fr = new FileReader("C:\\Users\\pankaj\\Desktop\\test.txt");
        //System.out.println("sharan");

    }

    public static void main(String[] args)  {
        try {
            blowUp();
        }
        catch (OriginalBlewIt b){
           //
            // f.printStackTrace();
        }
        finally
         {
            System.out.println("Uncaught Exception");
        }
    }
}