package com.features.record;

public class TestRecordFeatures {
    public static int beforeRecordPattern(Object obj) {
        if(obj instanceof Vehicle v){
            int wheelsNumber = v.wheelsNumber();
            System.out.println(STR."Wheels Number: \{wheelsNumber}");
            return wheelsNumber;
        }
        return 0;
    }

    public static String afterRecordPattern(Object obj) {
        if(obj instanceof Vehicle(String model, int wheelsNumber)){
            System.out.println(STR."Model: \{model}Wheels number: \{wheelsNumber}");
            return model;
        }
        return "Car model";
    }

    public static Status getRandomTaskStatus(RandomTask randomTask) {
        String name = "Aymen";
        String message = STR."Hello, \{name}";
        System.out.println(message);
        if(randomTask instanceof RandomTask(Task task)){
            System.out.println(STR."Task: \{task}");
            return task.status();
        }
        return null;
    }
}
