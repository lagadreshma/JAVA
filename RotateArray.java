package com;
import java.util.*;

public class RotateArray {

    public static void reverseArray(int arr[], int i, int j){

        int s = i, e = j;

        while(s <= e){

            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;

        }

    }

    public static void rotateArray(int arr[], int n, int k){

        k = k % n;   // for big numbers (numbers greater than size)
        if(k < 0){
            k = k + n;   // for negative numbers
        }

        // step 1
        reverseArray(arr, 0, n - k - 1);
        // step 2
        reverseArray(arr, n - k, n - 1);

        // step 3
        reverseArray(arr, 0, n - 1);

    }

    public static void printArray(int arr[], int n){

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array : ");
        int n = sc.nextInt();

        int arr[] = new int[20];
        System.out.println("Enter Elements of an Array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter position in which we have to rotate array : ");
        int key = sc.nextInt();

        rotateArray(arr, n, key);
        printArray(arr, n);

    }

}
