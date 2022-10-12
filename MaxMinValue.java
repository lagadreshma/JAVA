package com.company;
import java.util.*;

public class MaxMinValue {

    public static int getMaximum(int arr[], int size){

        int max = arr[0];
        for(int i = 0; i < size; i++){

            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;

    }

    public static int getMinimum(int arr[], int size){

        int min = arr[size - 1];
        for(int i = 0; i < size; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i < size; i++){

            arr[i] = sc.nextInt();

        }

        System.out.println("Maximum Value is : " + getMaximum(arr,size));
        System.out.println("Minimum Value is : " + getMinimum(arr,size));

    }

}
