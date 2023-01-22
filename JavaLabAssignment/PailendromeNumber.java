package com.siom;
import java.util.*;

public class PailendromeNumber {

    public static void pailendromeNumberOrNot(int num){

        int n = num;
        int rem, rev = 0;

        while(num > 0){

            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;

        }

        if(rev == n){
            System.out.println(n + " is Pailendrome Number.");
        }else{
            System.out.println(n + " is Not Pailendrome Number.");
        }

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int num = sc.nextInt();

        pailendromeNumberOrNot(num);

    }

}
