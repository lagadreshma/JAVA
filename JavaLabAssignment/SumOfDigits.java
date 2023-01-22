package com.siom;
import java.util.*;

public class SumOfDigits {

    public static void sumOfDigits(int num){

        int n = num;
        int rem, sum = 0;

        while(num > 0){

            rem = num % 10;
            sum = sum + rem;
            num = num / 10;

        }

        System.out.println("Sum of digits of " + n + " is : " + sum);

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Number : ");
        int num = sc.nextInt();

        sumOfDigits(num);

    }

}
