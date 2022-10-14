package com.company;
import java.util.*;
import java.lang.Math;

public class NumberGuessingGame{

    public static void main(String args[]){

        int number, guess, nguesses = 1;
        Scanner sc = new Scanner(System.in);
        number = (int) (Math.random() * 100);

        do{

            System.out.println("Guess Number Please : ");
            guess = sc.nextInt();

            if(guess < number){
                System.out.println("Enter Higher Number Please.");
            }else if(guess > number){
                System.out.println("Enter Lower Number Please.");
            }else{
                System.out.println("You guess correct number at " + nguesses + " attempts.");
            }

            nguesses++;

        }while(guess != number);


    }

}