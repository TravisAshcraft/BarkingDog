package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        shouldWakeUp(true,23);

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if ((hourOfDay >= 0) && (hourOfDay <= 23)) { // checks and makes sure that the hour of day is with in the specified time

            if (barking) {// checks and makes sure that barking is true

                if ((hourOfDay < 8) || (hourOfDay > 22)) {// ensures that it is not midday

                    return true;

                } else {

                    return false;

                }

            }

        }

        return false;

    }

}
