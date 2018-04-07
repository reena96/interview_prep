package com.company.Exceptions.Quiz;

public class Quiz3
{
    String str = "a"; //a

    void A()
    {
        try
        {
            str +="b"; //ab
            B();
        }
        catch (Exception e)
        {
            str += "c";  //abdec
        }
    }

    void B() throws Exception
    {
        try
        {
            str += "d";  //abd
            C();
        }
        catch(Exception e)
        {
            throw new Exception();
        }
        finally
        {
            str += "e"; //abde
                        // Finally executes whether there is an exception that is caught or not
        }

        str += "f";    //doesn't execute because nothing after an exception is thrown executes in a method except
                    // for the finally block

    }

    void C() throws Exception
    {
        throw new Exception();
    }

    void display()
    {
        System.out.println(str);
    }

    public static void main(String[] args)
    {
        Quiz3 object = new Quiz3();
        object.A();
        object.display();
    }

}