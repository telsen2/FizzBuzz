package com.company;

/*Program that implements a method that prints the numbers from 1 to 100.
  But for multiples of three print “Fizz” instead of the number and for the
  multiples of five print “Buzz”.
  For numbers which are multiples of both three and five print “FizzBuzz”.
*/

import java.util.Scanner;
import java.util.Random;

public class Main {
    int userInput;
    int lowBound = 0;
    int highBound = 99;
    int num = 0;
    int fizzNum;
    int buzzNum;


    public static void main(String[] args)
    {
//        Scanner userInput = new Scanner(System.in);
//        System.out.println(" Please enter a number from 1 to 10 ");         //prompt to user
//        num = userInput.nextInt();                                          //get input from the user

        fizzBuzzLogic();            // call to FizBuzz logic
//      arrayNumbers();     		// call a sub-program to create array for 100 elements
//      randomNumGenCall();         // call to create a random generator ->(BONUS points)

    }

    public static int fizzBuzzLogic()
    {
        int i   = 0;
        int n   = 0;
        int inc = 0;
        Scanner input = new Scanner(System.in);

        System.out.println(" Please enter a number from 1 to 10: ");
        i = input.nextInt();

        System.out.print(" multiples of " + i + " are: " );
        for (inc = 1; inc *i <100;  inc++)
        {
            n = i*inc;
            System.out.print(" " + i*inc);
        }

        if (i == 3) {
            System.out.print("Fizz");
        }
        if (i == 5)
        {
            System.out.print("Buzz");
        }

        return n;
    }

    private static void display()
        {

        };



    public int arrayNumbers() {
        //int i=0;
        int[] intArray = new int[100];    //creates an array of 100 elements
        int i;
        for (i = 1; i < 100; ++i)         // for numbers from 1 to 100
        {
            intArray[i] = i;                 /* fill  the array with those numbers */
        }
        return i;
    };



}
