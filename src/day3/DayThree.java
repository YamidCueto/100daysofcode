package day3;

import java.util.Scanner;

public class DayThree {

    /**
     * Day 3 - Input and Output
     * 1. Write a program that reads user input and print it to the console.
     * 2. Modify the program to read and print different data type inputs (integers, floating-point numbers, strings)
     * 3. Write a program to read the user input using Scanner class
     */
    public static Scanner sc = new Scanner(System.in);

    public static String readUserInputString() {
        System.out.println("Enter a string: ");
        return sc.nextLine();
    }

    public static int readUserInputInt() {
        System.out.println("Enter an integer: ");
        return sc.nextInt();
    }

    public static float readUserInputFloat() {
        System.out.println("Enter a floating-point number: ");
        return sc.nextFloat();
    }


}
