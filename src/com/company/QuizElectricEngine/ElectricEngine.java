package com.company.QuizElectricEngine;


public class ElectricEngine implements Engine{
    //int rpm = 100;
    static int rpm = 500;

    public ElectricEngine(){
         Engine.super.Start(10.8);
        //System.out.println("CONSTRUCTOR OF ELECTRIC ENGINE!!!!!!!!!");

        getMaxDistance();
    }

    void getMaxDistance(){
        System.out.println("ElectricEngine:" + rpm);
    }

    public class TeslaElectricEngine extends ElectricEngine implements Engine {
        int rpm = 100;

        public TeslaElectricEngine(){
            super.Start(3.51);
        }

        @Override void getMaxDistance(){
            rpm = 800;
            System.out.println("TeslaElectricEngine:" + rpm);
        }
        void test(){
            rpm = 800;
            System.out.println("TeslaElectricEngine:" + rpm);
        }
    }

    public static void main(String[] args) {
        Engine e = new ElectricEngine().new TeslaElectricEngine();
       
        //
        // e.Start(2);
        //ElectricEngine.TeslaElectricEngine y = new ElectricEngine.TeslaElectricEngine();
        //ElectricEngine.TeslaElectricEngine.test();
        //TeslaElectricEngine.test();
        //System.out.println("ElectricEngine.class:"+ElectricEngine.class);
        //System.out.println("int.class:"+int.class);
        //Class x = Engine.class;
        //System.out.println("Engine.class x getName: "+x.getName().toString());
        //System.out.println("Engine.class x getMethods: "+x.getMethods()[0]);

    }


}

