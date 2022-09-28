/*
*  This Program calculate time needed to heat up certain food in microwave
*
* @author  Lily Liu
* @version 1.0
* @since 2022-9-26
*/

import java.util.Scanner;
/**
* Calculates the amount of time required to heat up certain food.
*/

final class Microwave {
    /**
    * Constant for the time sub takes.
    */
    public static final double SUB_TIME = 60;
    /**
    * Constant for the time pizza takes.
    */
    public static final double PIZZA_TIME = 45;
    /**
    * Constant for the time soup takes.
    */
    public static final double SOUP_TIME = 105;
    /**
    * Constant for 60 seconds.
    */
    public static final double MINUTE = 60;
    /**
    * Constant for magic number 1.
    */
    public static final double AMOUNT_ONE = 1;
    /**
    * Constant for magic number 2.
    */
    public static final double AMOUNT_TWO = 2;
    /**
    * Constant for magic number 3.
    */
    public static final double AMOUNT_THREE = 3;
    /**
    * Constant for amount multipy for 1.
    */
    public static final double MULTIPLY_ONE = 1.0;
    /**
    * Constant for amount multiply for 2.
    */
    public static final double MULTIPLY_TWO = 1.5;
    /**
    * Constant for amount multiply for 3.
    */
    public static final double MULTIPLY_THREE = 2;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Microwave() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Scanner myObj = new Scanner(System.in);
        double foodTypeTime = 0.0;
        double amountTime = 0.0;
        try {
            System.out.println("Are you heating up a sub, soup or pizza? ");
            final String foodType = myObj.next();
            System.out.println("How many are you heating up: ");
            final double foodAmount = myObj.nextDouble();
            if ("sub".equals(foodType)) {
                foodTypeTime = SUB_TIME;
            } else if ("pizza".equals(foodType)) {
                foodTypeTime = PIZZA_TIME;
            } else if ("soup".equals(foodType)) {
                foodTypeTime = SOUP_TIME;
            }
            if (foodAmount == AMOUNT_ONE) {
                amountTime = MULTIPLY_ONE;
            } else if (foodAmount == AMOUNT_TWO) {
                amountTime = MULTIPLY_TWO;
            } else if (foodAmount == AMOUNT_THREE) {
                amountTime = MULTIPLY_THREE;
            }
            final double time = foodTypeTime * amountTime;
            final double minutesDouble = time / MINUTE;
            final int minutes = (int) minutesDouble;
            final double seconds = time % MINUTE;
            System.out.println("The total heat up time is " + minutes
                + " minutes and " + seconds + " seconds");
            System.out.println("\nDone.");
        } catch (java.util.InputMismatchException error) {
            System.out.println("Invalid Input");
        }
    }
}
