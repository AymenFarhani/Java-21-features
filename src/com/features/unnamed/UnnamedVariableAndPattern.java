package com.features.unnamed;

import com.features.record.Vehicle;

public class UnnamedVariableAndPattern {

    public void testUnnamedVariable(){
        System.out.println("--------------------------");
        try{
            int result = 10/0;
            System.out.println(result);
        }
        catch(ArithmeticException _){
            System.out.println("Division by zero!");
        }
    }

    public void testUnnamedPattern(){
        Vehicle v = new Vehicle("C4", 4);

        if(v instanceof Vehicle(_, int wheelsNumber)){
            System.out.println(STR."Wheels number \{wheelsNumber}");
        }
    }

    public void printVehicle(Object vehicle) {
        switch (vehicle) {
            case Vehicle(_, int wheelsNumber) -> System.out.println(STR."Print with number \{wheelsNumber}");
            case String _ -> System.out.println(STR."It's a string");
            default -> System.out.println("Default");
        }
    }
}
