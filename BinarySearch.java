package com.company;
import java.util.*;

public class BinarySearch {

    public static int binaryIndex(int arr[], int size, int key){

        int start = 0;
        int end = size - 1;
        int mid = start + (end - start) / 2;

        while(start <= end){

            if(arr[mid] == key){
                return mid;
            }

            if(key > arr[mid]){
                start = mid + 1;    // go to right part
            }else{
                end = mid - 1;     // go to left part
            }

            mid = start + (end - start) / 2;

        }

        return -1;

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of an Array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter Elements of an Array in Monotonic Order : ");
        for(int i = 0; i < size; i++){

            arr[i] = sc.nextInt();

        }

        System.out.println("Enter Key we have to find in an array using Binary Search : ");
        int key = sc.nextInt();

        int index = binaryIndex(arr, size, key);

        if(index == -1){
            System.out.println(key + " is Absent.");
        }else{
            System.out.println(key + " is present and it's Index in an Array is : " + index);
        }


    }

}
