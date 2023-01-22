package com.siom;
import java.util.*;
import java.io.*;

public class DuplicateArrayElement {

    public static void findDuplicateElements(int arr[], int size){

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

        System.out.println("Enter Size of an Array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter Elements of an Array : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        findDuplicateElements(arr, size);

    }

}
