package com.company;
import java.util.*;

public class linearSearch {

    public static int searchElement(int arr[], int size, int key){

        for(int i = 0; i < size; i++){
            if(arr[i] == key){
                return 1;
            }
        }

        return 0;

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter array Elements : ");
        for(int i =  0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Key we have to search : ");
        int key = sc.nextInt();

        int found = searchElement(arr,size,key);

        if(found == 1){

            System.out.println("Key is Present.");

        }else{

            System.out.println("Key is Not Present.");

        }

    }

}
