package com.company;
import java.util.*;

public class predefinedMaxMinFunction {

    public static int getMax(int arr[], int size){

        int maximum = arr[0];
        for(int i = 0; i < size; i++){
            maximum = Math.max(arr[i], maximum);
        }

        return maximum;

    }

    public static int getMin(int arr[], int size){

        int minimum = arr[size - 1];
        for(int i = 0; i < size; i++){
            minimum = Math.min(arr[i], minimum);
        }

        return minimum;

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter Array Element : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Maximum Value is : " + getMax(arr,size));
        System.out.println("Minimum Value is : " + getMin(arr,size));

    }

}
