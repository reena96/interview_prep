package com.company.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class WhatIsWrong
{
    //It is a compile-time error for a catch clause to catch a CHECKED EXCEPTION type E
//if the corresponding try clause can’t throw an exception of some subtype of E
    public static void main(String[ ] args) {
        try {
            System.out.println("Hello");
        } catch (Error e) {   //FileNotFoundException will not work
            System.out.println("Failed");
        }
      //When no exception is really thrown, catch lets us use Unchecked Exceptions to catch it
        // but not Checked Excpetions.
    }
}