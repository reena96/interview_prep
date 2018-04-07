package com.company.generics.wildcards;

public class WildCards1 {
    public class Glass<T>{
        //Bounded Type Parameter "T"
    }

    class Tray{
        public void add(Glass<?> juiceGlass){
            // <?>-Unbounded Wildcard
            // Note: We can only add the kind of Glass objects that are paramterized by types that are subclasses of T
            // as Glass declaration is parameterized by type "T"
        }
    }
}
