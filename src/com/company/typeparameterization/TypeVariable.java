package com.company.typeparameterization;

class C {
    public void mCPublic() {}
    protected void mCProtected() {}
    void mCDefault() {}
    private void mCPrivate() {}
}

interface I1 {
    void mI();
}

interface I2 {
    void mII();
}

/*interface I {
    void mI();
}
*/

/*class CT extends C implements I {
    public void mI() {}
}
*/

/*class Test {
    <T extends C & I> void test(T t) {
        t.mI(); // OK
        t.mCPublic(); // OK
        t.mCProtected(); // OK
        t.mCDefault(); // OK
        //t.mCPrivate(); // Compile-time error
    }
}
*/

class CT implements I1,I2 {
    public void mI() {}
    public void mII() {}
}
class Test  {
    <T extends I1 & I2> void test(T t) {
        t.mI(); // OK
        t.mII();
       // t.mCPublic(); // OK
       // t.mCProtected(); // OK
       // t.mCDefault(); // OK
        //t.mCPrivate(); // Compile-time error
    }
}

public class TypeVariable {
    public static void main(String[] args){
        Test testObj = new Test();
        CT ct = new CT();
        C c = new C();
       // testObj.test(c);



    }
}

