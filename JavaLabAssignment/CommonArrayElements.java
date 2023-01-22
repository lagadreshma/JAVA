package com.siom;
import java.util.*;

public class CommonArrayElements {

    public static void IntersectionOfTwoArray(int arr1[], int arr2[]){

        int size1 = arr1.length;
        int size2 = arr2.length;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;

        while(i < size1 && j < size2){

            if(arr1[i] > arr2[j]){
                j++;
            }else if(arr2[j] > arr1[i]){
                i++;
            }else if(arr1[i] == arr2[j]){
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }

        }

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of First Array : ");
        int size1 = sc.nextInt();

        int arr1[] = new int[size1];
        System.out.println("Enter Elements of First Array : ");
        for(int i = 0; i < size1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter Size of Second Array : ");
        int size2 = sc.nextInt();

        int arr2[] = new int[size2];
        System.out.println("Enter Elements of Second Array : ");
        for(int i = 0; i < size2; i++){
            arr2[i] = sc.nextInt();
        }

        IntersectionOfTwoArray(arr1, arr2);


    }

}
