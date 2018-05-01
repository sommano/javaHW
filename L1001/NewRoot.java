package com.java24hours;

class newRoot {
    public static void main(String[] arguments) {
        int number = 100;
        if (arguments.length > 0) {
            number = Interger.parseInt(arguments[0]);
        }
        System.out.println("The square root of "
            + number    
            + " is "
            + Math.sqrt(number)
        );
    }
}