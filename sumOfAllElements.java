package com.company;
import java.util.*;

public class sumOfAllElements {

    public static int sumOfElements(int arr[], int size){

        int sum = 0;

        for(int i = 0; i < size; i++){
            sum = sum + arr[i];
        }

        return sum;

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter Elements of an array : ");

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Sum of all Elements Of an Array : " + sumOfElements(arr,size));

    }

}
