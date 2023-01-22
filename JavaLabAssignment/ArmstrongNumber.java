package com.siom;
import java.util.*;

public class ArmstrongNumber {

    public static void armstrongNumber(int num){

        int n = num;
        int rem, sum = 0, a = 0;

        while(num > 0){

            rem = num % 10;
            a = rem * rem * rem;
            sum = sum + a;
            num = num / 10;

        }

        if(n == sum){
            System.out.println(n + " is Armstrong Number. ");
        }else{
            System.out.println(n + " is Not Armstrong Number. ");
        }

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int num = sc.nextInt();

        armstrongNumber(num);

    }

}
