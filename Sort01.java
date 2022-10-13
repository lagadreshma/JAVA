package com.company;
import java.util.*;

public class Sort01 {

    public static void sortZeroOne(int arr[], int size){

        int left = 0, right = size - 1;  // two pointer approach

        while(left < right){

            while(arr[left] == 0 && (left < right)){
                left++;
            }
            while(arr[right] == 1 && (left < right)){
                right--;
            }

            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }

        }

    }

    public static void printArray(int arr[], int size){

        System.out.println("Sorted Array : ");

        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

    }

    public static void main(String args[]){

        // Size of Array : 5
        // Elements of an Array : 1 0 0 1 0
        // output -> 0 0 0 1 1

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array : ");
        int size = sc.nextInt();

        int arr[] = new int[20];
        System.out.println("Enter Elements of an Array : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        sortZeroOne(arr,size);
        printArray(arr,size);

    }

}
