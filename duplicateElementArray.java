package com.company;
import java.util.*;

public class duplicateElementArray {

    public static void duplicateElement(int arr[], int size){

        for(int i = 0; i < size; i++){
            for(int j = i+1; j < size; j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[i] + " ");
                }
            }
        }

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter Elements of an Array : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        duplicateElement(arr,size);

    }

}
