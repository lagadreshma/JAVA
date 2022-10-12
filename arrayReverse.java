package com.company;
import java.util.*;

public class arrayReverse {

    public static void arrayReverseElement(int arr[], int size){

        int start = 0;
        int end = size - 1;

        while(start <= end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }

    }

    public static void printArray(int arr[], int size){

        System.out.println("Printing Reverse Array Element : ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }


    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter Array Elements : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        arrayReverseElement(arr,size);
        printArray(arr,size);

    }

}
