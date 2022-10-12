package com.company;
import java.util.*;

public class uniqueElementArray {

    public static void uniqueElement(int arr[], int size){

        int c;

        for(int i = 0; i < size; i++){

            c = 0;
            for(int j = 0; j < size; j++){
                if(i != j){
                    if(arr[i] == arr[j]){
                        c++;
                    }
                }
            }

            if(c == 0){
                System.out.println(arr[i] + " ");
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

        uniqueElement(arr,size);


    }

}
