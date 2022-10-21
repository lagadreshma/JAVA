package com.company;
import java.util.*;

public class insertionSortAlgorithm {

    public static void insertionSort(int arr[], int size){

        for(int i = 1; i < size; i++){

            int temp = arr[i];

            int j = i - 1;
            while(j >= 0){

                if(arr[j] > temp){
                    arr[j + 1] = arr[j]; // shift
                }else{
                    break;
                }

                j--;

            }

            arr[j + 1] = temp;

        }

    }

    public static void printArray(int arr[], int size){

        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array : ");
        int size = sc.nextInt();

        int arr[] = new int[20];
        System.out.println("Enter Elements of An Array for Insertion Sort : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        insertionSort(arr, size);
        System.out.println("Array After Sorting : ");
        printArray(arr, size);

    }

}
