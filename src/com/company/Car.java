package com.company;

public class Car {
    public class MyCar{
        public Runnable vroom(){
            return ()-> {System.out.print("Hello!" );};
        }
    }

    public class FastCar{
        private Runnable r = new MyCar()::vroom;

        public void startTheCar(){
            r.run();
        }
    }

    public static void main(String[] args){
        Car c = new Car();
        Car.FastCar car = c.new FastCar();
        car.startTheCar();
    }
}
