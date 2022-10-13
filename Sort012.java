package com.company;
import java.util.*;

public class Sort012 {

    public static void sortZeroOneTwo(int arr[], int size){

        int low = 0, mid = 0, high = size - 1;  // three pointer approach

        while(mid <= high){

            int temp;

            switch(arr[mid]){

                case 0 :  temp = arr[low];
                          arr[low] = arr[mid];
                          arr[mid] = temp;
                          low++;
                          mid++;
                          break;

                case 1 : mid++;
                         break;

                case 2 : temp = arr[mid];
                         arr[mid] = arr[high];
                         arr[high] = temp;
                         high--;
                         break;

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

        // Size of an Array : 8
        // Elements of an Array : 2 0 1 1 2 2 0 1
        // output -> 0 0 1 1 1 2 2 2

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array : ");
        int size = sc.nextInt();

        int arr[] = new int[20];
        System.out.println("Enter Elements of an Array : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        sortZeroOneTwo(arr,size);
        printArray(arr,size);


    }

}
