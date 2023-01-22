package com.siom;
import java.util.*;

public class ReverseNumber {

    public static void reverseNumber(int num){

        int n = num;
        int rem, rev = 0;

        while(num > 0){

            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;

        }

        System.out.println("Reverse of " + n + " is " + rev);

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int num = sc.nextInt();

        reverseNumber(num);

    }

}
