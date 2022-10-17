package com.company;
import java.util.*;

public class PivotElement {

    public static int findPivotElement(int arr[], int size){

        int start = 0;
        int end = size - 1;
        int mid = start + (end - start) / 2;

        while(start < end){

            if(arr[mid] >= arr[0]){
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
        System.out.println("Enter size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[20];
        System.out.println("Enter Elements Of an Array in the form of two monotonically increasing array : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        int pivot = findPivotElement(arr,size);

        System.out.println("Pivot Element in an Array is at Index : " + pivot);

    }

}
