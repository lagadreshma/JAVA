package com;
import java.util.*;

public class UniqueElement {

    public static int uniqueElement(int arr[], int n){

        int res = arr[0];

        for(int i = 1; i < n; i++){
            res = res ^ arr[i];
        }

        return res;

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array : ");
        int n = sc.nextInt();

        int arr[] = new int[20];
        System.out.println("Enter Elements of an Array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Unique Element : " + uniqueElement(arr, n));

    }

}
