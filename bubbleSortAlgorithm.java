package com.company;
import java.util.*;

// time Complexity - O(n^2)
// best case time complexity(array already Sorted) - O(n)
// worst case time complexity(array is in sorted reverse order) - O(n^2)
// space complexity - O(1)
// It is Stable Sorting Algorithm - becaz it preserves order
// suppose array - 2 14 8 14 9 5
// then it sort as - 2 5 8 9 14 14' - so it preserves order

public class bubbleSortAlgorithm {

    public static void bubbleSort(int arr[], int size){

        boolean swapped = false;

        for(int i = 0; i < (size - 1); i++){

            for(int j = 0; j < (size - i - 1); j++){

                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }

            }

            if(swapped == false){
                break;
            }

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
        System.out.println("Enter Size of an Array : ");
        int size = sc.nextInt();

        int arr[] = new int[20];
        System.out.println("Enter Elements of array for Bubble Sorting : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr, size);
        System.out.println("Array After Sorting : ");
        printArray(arr, size);

    }

}
