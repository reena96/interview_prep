package com.company;

 interface Type1 {
    int x = 9;
    void f() throws CloneNotSupportedException;

}

class Child implements Type1{

    @Override
    public void f() throws CloneNotSupportedException {
        System.out.println(x);
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        new Child().f();
    }
}

