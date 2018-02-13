package com.company;

/*
*   2.16 (Comparing Integers) Write an application that asks the user to enter two integers, obtains
    them from the user and displays the larger number followed by the words "is larger". If the numbers
    are equal, print the message "These numbers are equal". Use the techniques shown in Fig. 2.15.
* */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int number1;
	    int number2;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
	    number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

	    if(number1 == number2) {
            System.out.println("These numbers are equal");
        }

        if(number1 > number2) {
            System.out.printf("%d is larger than %d", number1, number2);
        }

        if (number1 < number2) {
            System.out.printf("%d is larger than %d", number2, number1);
        }
    }
}
