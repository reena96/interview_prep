package com.company.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class X {
    private X internalX = new X();

    X() throws FileNotFoundException{
        try {
            Y();
            throw new SQLException();
        }
        catch (SQLException s) {
            System.out.println("SQL Caught");
        }
        finally {
            System.out.println("X FINALLY");   //3. X FINALLY
        }
    }

    public void Y() throws FileNotFoundException{
        try {
            throw new FileNotFoundException("File Not Found thrown!");
        }
        catch (NullPointerException n){
            System.out.println("Null caught");   //1. Null Caught
        }
        finally {
            System.out.println("FINALLY"); //2.FINALLY
        }
    }

    public static void main(String[] args) throws FileNotFoundException  {
        try {
            X x = new X();
            System.out.println("Done!");  //4. Done
        } catch (Exception e) {
            System.out.println("Caught!");
        } catch (StackOverflowError error) {
            System.out.println("Ma ki kangan");
        }
        finally {
            System.out.println("TTTT");
        }
    }
}