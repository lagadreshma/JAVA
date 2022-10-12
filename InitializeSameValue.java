package com.company;
import java.util.*;

public class InitializeSameValue {

    public static void printArray(int arr[], int size){

        System.out.println("Printing an Array : ");

        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

    }


    public static void main(String args[]){

        // using Arrays.setAll( )
        int val = 5;
        int arr[] = new int[10];
        Arrays.setAll(arr,i -> val);

        printArray(arr,10);

        // using Arrays.fill( )
        int value = 1;
        Arrays.fill(arr,value);

        printArray(arr,10);

    }

}
