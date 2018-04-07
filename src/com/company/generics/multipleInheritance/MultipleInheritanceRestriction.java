package com.company.generics.multipleInheritance;

public class MultipleInheritanceRestriction {
}

interface I<T> {}
class B implements I<Integer> {}
//class C extends B implements I<String> {}