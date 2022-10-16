package com.company;
import java.util.*;

public class TotalOccurrenceOfElement {

    public static int firstOcc(int arr[], int size, int key){

        int start = 0;
        int end = size - 1;
        int mid = start + (end - start) / 2;

        int ans = -1;

        while(start <= end){

            if(arr[mid] == key){

                ans = mid;
                end = mid - 1;

            }else if(key > arr[mid]){

                start = mid + 1;

            }else if(key < arr[mid]){

                end = mid - 1;

            }

            mid = start + (end - start) / 2;

        }

        return ans;

    }

    public static int lastOcc(int arr[], int size, int key){

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

    public static int totalOccurrence(int first, int last){

        int totalOcc = (last - first) + 1;
        return totalOcc;

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

        System.out.println("Enter Key we have to search for find Total No. of Occurrence in an Array : ");
        int key = sc.nextInt();

        int first = firstOcc(arr, size, key);
        int last = lastOcc(arr, size, key);

        int totalOcc = totalOccurrence(first,last);

        System.out.println("Total Occurrence of " + key + " in Array is : " + totalOcc);

    }

}
