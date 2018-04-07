package com.company.Exceptions.Quiz;
class Base extends Exception {}
class Derived extends Base  {}

public class Quiz2 {
    public static void main(String args[]) {
        // some other stuff
        try {
            // Some monitored code
            throw new Derived();
        } catch (Base b) {
            System.out.println("Caught base class exception");
        }
       /* catch(Derived d)  {
            System.out.println("Caught derived class exception");
        }

        //Error:(14, 9) java: exception com.company.Exceptions.Quiz.Derived has already been caught
        // This is caught when base Class exception is caught.
        */
    }
}