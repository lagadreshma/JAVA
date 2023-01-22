package com.siom;
import java.util.*;

public class PrimeOrNot {

    public static void primeOrNot(int num){

        int flag = 0;

        for(int i = 2; i <= num / 2; i++){

            if(num % i == 0){
                flag = 1;
                break;
            }

        }

        if(flag == 0){
            System.out.println(num + " is Prime Number.");
        }else{
            System.out.println(num + " is Not Prime Number.");
        }

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int num = sc.nextInt();

        primeOrNot(num);

    }


}
