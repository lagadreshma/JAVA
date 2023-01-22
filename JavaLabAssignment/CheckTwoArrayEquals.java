package com.siom;
import java.util.*;
import java.io.*;

public class CheckTwoArrayEquals {

    public static boolean checkArrayEquals(int arr1[], int arr2[]){

        int n = arr1.length;
        int m = arr2.length;

        if(n != m){
            return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i = 0; i < n; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }

        return true;

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of First Array : ");
        int size1 = sc.nextInt();
        int arr1[] = new int[10];
        System.out.println("Enter Elements of First Array : ");
        for(int i = 0; i < size1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter Size of Second Array : ");
        int size2 = sc.nextInt();
        int arr2[] = new int[10];
        System.out.println("Enter Elements of Second Array : ");
        for(int i = 0; i < size2; i++){
            arr2[i] = sc.nextInt();
        }

        if(checkArrayEquals(arr1, arr2)){
            System.out.println("Arr1 and Arr2 Are Equals.");
        }else{
            System.out.println("Arr1 and Arr2 are Not Equals.");
        }


    }

}
