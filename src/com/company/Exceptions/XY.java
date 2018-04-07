package com.company.Exceptions;

public class XY {
    public XY internalX = new XY();

    public XY() throws Exception
    {
        throw new Exception("thrown!");
    }
    public static void main(String[] args) {
        try
        {
            XY x = new XY();
            System.out.println("Done!");
        }catch( Exception e ){
            System.out.println("Caught!");
        }
    } }