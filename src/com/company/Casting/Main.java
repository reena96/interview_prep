package com.company.Casting;

/* import org.eclipse.jdt.annotation;
import org.eclipse.jdt.apt.core;
import org.eclipse.jdt.compiler;
import org.eclipse.jdt.runtime;
import org.osgi.core;
*/

public class Main {

    public static void main(String[] args) {
	// write your code hers
        new Child().test();
    }
}

interface SomeInterface { int x = 0; }
class GrandParent implements SomeInterface { int x = 1; }
class Parent extends GrandParent  { int x = 2; }
class Child extends Parent {
    int x = 3;
    void test() {
        GrandParent aobj = new GrandParent();
        System.out.println("GrandParent x:"+ aobj.x);
        System.out.println("x= "+x);
        System.out.println("super.x= "+super.x);
        System.out.println("((Parent)this).x= "+((Parent)this).x);
        System.out.println("((GrandParent)this).x= "+((GrandParent)this).x);
        System.out.println("((SomeInterface)this).x= "+((SomeInterface)this).x);
    }
}


