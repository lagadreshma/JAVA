package com.company;
import java.util.*;

public class PivotElement {

    public static int findPivotElement(int arr[], int size){

        int sum = 0;
        
        for(int i = 0; i < size; i++){
            sum = sum + arr[i];
        }
        
        int temp = 0;
        
        for(int i = 0; i < size; i++){
            
            sum = sum - arr[i];
            if(temp == sum){
                return i;
            }
            else{
                temp = temp + arr[i];
            }
            
        }
        
        return -1;
        
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
