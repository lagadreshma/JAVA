package com.company;
import java.util.*;

public class PeakElementInMountainArray {

    public static int findPeakElement(int arr[], int size){

        int start = 0;
        int end = size - 1;
        int mid = start + (end - start) / 2;

        while(start < end){

            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }else{
                end = mid;
            }

            mid = start + (end - start) / 2;

        }

       return start;

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array : ");
        int size = sc.nextInt();

        int arr[] = new int[20];
        System.out.println("Enter Elements of an Array in the form of Mountain Array : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        int peakEleIndex = findPeakElement(arr, size);

        System.out.println("Peak Element is at Index : " + peakEleIndex);

    }

}
