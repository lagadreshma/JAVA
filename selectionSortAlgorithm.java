package com.company;
import java.util.*;


// time complexity - O(n^2)
// best complexity(array already sorted) - O(n^2)
// worst case complexity (array is sorted in reverse order) - O(n^2)
// space complexity - O(1)
// It is Unstable Sorting Algorithm - becaz It does not preserve order
// suppose we have given array - 2 14 8 14 9 5
// then it sort as - 2 5 8 9 14' 14 - so it is unstable sort algo


public class selectionSortAlgorithm {

    public static void selectionSort(int arr[], int size){

        for(int i = 0; i < (size - 1); i++){

            int minIndex = i;
            for(int j = (i + 1); j < size; j++){

                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }

            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

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
        System.out.println("Enter Elements of Array for Selection Sorting : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        selectionSort(arr,size);
        System.out.println("Array Elements After Sorting : ");
        printArray(arr,size);

    }

}
