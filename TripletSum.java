package com.company;
import java.util.*;

public class TripletSum {

    public static void findTriplePairSum(int arr[], int size, int tripleSum){

        for(int i = 0; i < size; i++){
            for(int j = (i + 1); j < size; j++){
                for(int k = (j + 1); k < size; k++){
                    if(arr[i] + arr[j] + arr[k] == tripleSum){
                        System.out.print(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                    System.out.println();
                }
            }
        }

    }

    public static void main(String args[]){

        // Size of an Array : 5
        // Enter Elements of an array : 1 2 3 4 5
        // tripletSum = 10
        // pairs - 1 4 5, 2 3 5

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array : ");
        int size = sc.nextInt();

        int arr[] = new int[10];
        System.out.println("Enter Elements of an Array : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter tripleSum to find Three no. pairs : ");
        int tripleSum = sc.nextInt();

        findTriplePairSum(arr, size, tripleSum);

    }

}
