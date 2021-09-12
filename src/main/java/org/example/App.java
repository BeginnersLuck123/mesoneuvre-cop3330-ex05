package org.example;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dynie Mesoneuvre
 */
public class App 
{
    public static void main( String[] args )
    {
     Scanner input = new Scanner(System.in);
        System.out.println( "What is the first number: " );
        String firstNum = input.nextLine(); //Input
        int first = Integer.parseInt(firstNum); //Turns String into Int
        System.out.println( "What is the second number: ");
        String secondNum = input.nextLine(); //Input
        int second = Integer.parseInt(secondNum); //Turns String into Int
        int sum = first + second;
        int difference = first - second;
        int product = first*second;
        int quotient = first/second;
        System.out.print(first + " + " + second + " = " + sum + "\n" + first + " - " + second + " = " + difference + "\n" + first + " * " + second + " = " + product + "\n" + first + " / " + second + " = " + quotient); //Output


    }
}
