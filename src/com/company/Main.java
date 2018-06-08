package com.company;

import java.util.Scanner;
import java.util.Random;


public class fizzBuzzLogic() {
    }

public class createArrayCall() {
        }

public class randNumGenCall() {
        }


public class Main {

    public static void main(String[] args) {

        System.out.println(" Please enter a number form 1 to 99 "); //prompt to user
        input = sc.nextLine();    									//get input from the user

        fizzBuzzLogicCall();      	// call to FizBuzz logic

        createArrayCall();     		// call a sub-program to create array for 100 elements

        randomNumGenCall();         // call to create a random generator ->(BONUS points)

        System.out.println("Fizz" + fizzNum);
        System.out.println("Buzz" + buzzNum);


    }
}
