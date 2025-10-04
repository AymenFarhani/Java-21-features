package com.features.switchpattern;

public class InputProcessing {

    public static String processInputOld(String input) {
        String output;
        switch(input) {
            case null -> output = "Oops, null";
            case String s -> {
                if("Yes".equalsIgnoreCase(s)) {
                    output = "It's Yes";
                }
                else if("No".equalsIgnoreCase(s)) {
                    output = "It's No";
                }
                else {
                    output = "Invalid Input, Try Again";
                }
            }
        }
        System.out.println(output);
        return output;
    }

    public static String processInputNew(String input) {
        String output;
        switch(input) {
            case null -> output = "Oops, null";
            case String s when "Yes".equalsIgnoreCase(s) -> output = "It's Yes";
            case String s when "No".equalsIgnoreCase(s) -> output = "It's No";
            case String s -> output = "Try Again";
        }
        System.out.println(output);
        return output;


    }



}
