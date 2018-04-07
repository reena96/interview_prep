package com.company.Exceptions.Quiz;

public class Continue {
    public static void main(String[] args){
        int c =10;
        while (c > 0) {
            c=c-1;

            if (c == 5) {
                continue;
            }

            System.out.println(c);


        }

        for(int i=1;i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }

    }
}
