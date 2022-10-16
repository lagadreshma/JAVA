package com.company;
import java.util.*;

public class FirstLastOccurrenceOfElement {

    public static int firstOccurrence(int arr[], int size, int key){

        int start = 0;
        int end = size - 1;
        int mid = start + (end - start) / 2;

        int ans = -1;

        while(start <= end){

            if(arr[mid] == key){

                ans = mid;
                end = mid - 1;

            }else if(key > arr[mid]){    // go to right part

                start = mid + 1;

            }else if(key < arr[mid]){      // go to left part  (key < arr[mid])

                end = mid - 1;

            }

            mid = start + (end - start) / 2;

        }

        return ans;

    }

    public static int lastOccurrence(int arr[], int size, int key){

        int start = 0;
        int end = size - 1;
        int mid = start + (end - start) / 2;

        int ans = -1;

        while(start <= end){

            if(arr[mid] == key){

                ans = mid;
                start = mid + 1;

            }else if(key > arr[mid]){

                start = mid + 1;

            }else if(key < arr[mid]){

                end = mid - 1;

            }

            mid = start + (end - start) / 2;

        }

        return ans;

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array : ");
        int size = sc.nextInt();

        int arr[] = new int[20];
        System.out.println("Enter Elements of an Array in Monotonic Order : ");
        for(int i = 0; i < size; i++){

            arr[i] = sc.nextInt();

        }

        System.out.println("Enter Key We have to find it's first and last occurrence in an array : ");
        int key = sc.nextInt();

        int first = firstOccurrence(arr, size, key);
        int last = lastOccurrence(arr, size, key);

        System.out.println("First Occurrence of " + key + " is : " + first);
        System.out.println("Last Occurrence of " + key + " is : " + last);

    }

}
