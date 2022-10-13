package com.company;
import java.util.*;

public class pairSum {

    public static void findTwoPairSum(int arr[],int size, int pairSum){

        for(int i = 0; i < size; i++){

            for(int j = (i + 1); j < size; j++){

                if(arr[i] + arr[j] == pairSum){
                    System.out.print(arr[i] + " " + arr[j]);
                }

                System.out.println();

            }

        }

    }

    public static void main(String args[]){

        // Size of array - 5;
        // Elements of array : 1 2 3 4 5;
        // pairsum = 5;
        // ans - 1 4, 2 3

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array : ");
        int size = sc.nextInt();

        int arr[] = new int[10];
        System.out.println("Enter Elements of an Array : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter pairSum to find two no. pairs : ");
        int pairSum = sc.nextInt();

        findTwoPairSum(arr,size,pairSum);

    }

}
