package com.siom;
import java.util.*;

public class DeleteAllOccurrencesOfElement {

    public static void deleteOccurrences(int arr[],int size, int key){

        for(int i = 0; i < size; i++){
            if(arr[i] != key){
                System.out.print(arr[i] + " ");
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

        System.out.println("Enter Element to delete it's all occurrences : ");
        int element = sc.nextInt();

        deleteOccurrences(arr, size, element);

    }

}
