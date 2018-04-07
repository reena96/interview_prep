package com.company.Exceptions;

public class R {
   // private R internalX = new R();
    public R()
    {
        try {
            throw new Exception();
        }
        catch (Exception e){
            System.out.println("Exception Caught");
        }
        finally {
            System.out.println("Finally in R");
        }

    }
    public static void main(String[] args) {
        try
        {
            R x = new R();
            System.out.println("Done!");
        }catch( Exception e ){
            System.out.println("Caught!");
        }
        finally {
            System.out.println("Finally in Main");
        }
    }
}