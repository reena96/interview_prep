package com.company.StaticMethodInvokeUsingObject;

class Base
{
    static void foo()
    {
        System.out.println("Base.foo()");
    }
}

class Derived extends Base
{
    static void foo()
    {
        System.out.println("Derived.foo()");
    }
}
class Test3
{
    public static void main(String[] args)
    {
        Base b = new Derived();
        b.foo(); // Prints "Base.foo()"
        b = null;
        b.foo(); // Still prints "Base.foo()"


    }
}
// when methods are declared static, When trying to use them by calling over an object ex: obj.staticmethod()
// Then the JVM only takes the Static / Declaration type of the object "obj" and
// doesn't care about the dynamic/runtime type assigned to the object "obj"
