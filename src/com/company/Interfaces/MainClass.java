package com.company.Interfaces;

import com.company.Null;

public class MainClass{
    public static void main(String[] args) {
        Class worker = IWorker.class;
        Class nullClass = Null.class;
        while( worker != null ){
            System.out.println(worker.getName());
           // String s=worker.read();
            //worker = worker.getSuperclass();
            nullClass = nullClass.getSuperclass();


            IWriter.ready();
        }}}

