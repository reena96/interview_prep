package com.company;

class WhoAmI {
    public static void main(String[ ] args) {
        WhoAmI e = new WhoAmI( );
        System.out.println(e.equals(e));
    }
}

class WhoAmIChild extends WhoAmI {
    public static void main(String[ ] args) {
        WhoAmI a = new WhoAmI();
        //System.out.println(a.equals(super.e));
    }
}