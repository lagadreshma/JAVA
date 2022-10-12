package com.company;
import java.util.*;

public class swapAlternateElement {

    public static void swapAlternate(int arr[], int size){

        for(int i = 0; i < size; i+=2){

            if((i + 1) < size) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
            }

        }

    }

    public static void printArray(int arr[], int size){

        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

    }

    public static void main(String args[]){

        // 1 2 3 4 5
        // 2 1 4 3 5

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter Array Elements : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        swapAlternate(arr,size);
        printArray(arr,size);

    }

}
