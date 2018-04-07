package com.company.anonymousInnerClass;

//Java program to demonstrate need for Anonymous Inner class
interface  Age
{
    int x = 21;
    void getAge();
}
class AnonymousDemo
{
    int y = 3;



    public static void main(String[] args)
    {
        Age age = new Age() {

            int x = 1;
            @Override
            public void getAge() {
                System.out.println("Age is "+x);
            }
        };
        age.getAge();


        //ALSO WORKS
        new Age() {

            int x = 1;
            @Override
            public void getAge() {
                System.out.println("Age is "+x);
            }
        }.getAge();


        /***
         *
         *
         You can't instantiate an interface, yet that's what the code looks like it's doing. But, of course,
         it's not instantiating an Animal object-- it's creating an instance of a new anonymous implementer of Animal.
         The above code is same like creating a class which is implementing the Animal interface.
         The only difference here is the created class is an anonymous inner class.

         Also remember while implementing an interface by anonymous inner class, you cannot implement more than one interface.
         In fact, an anonymous inner class can't even extend a class and implement an interface at the same time.

         So don’t be fool in an interview in this question. Interface cannot be instantiated,
         the following is an invalid statement.

         Runnable r = new Runnable(); // can't instantiate interface

         whereas the following is legal, because it's INSTANTIATING AN IMPLEMENTER CLASS OF THE RUNNABLE INTERFACE
         (an anonymous implementation class):

         Runnable r = new Runnable() {
         public void run(){ }
         };
         */


        // Myclass is implementation class of Age interface
        // calling getage() method implemented at Myclass
        /*
        MyClass myClass = new MyClass();
        myClass.getAge();
        Age age1 = new MyClass();
        age1.getAge();
        */


    }

    static class Age3423 implements Age{

        static int i = 1;
        int x = 1;
        @Override
        public void getAge() {
            System.out.println("Age is "+x);
        }
    };
}

// Myclass implement the methods of Age Interface
class MyClass implements Age
{
    @Override
    public void getAge()
    {
        // printing the age
        System.out.println("Age is now "+x);
    }
}




