package com.company;
import java.util.*;
import java.lang.Math;

public class aggressiveCowsProblem {

    public static boolean isPossible(int stalls[], int size, int cows, int mid){

        int cowsCount = 1;
        int lastStall = stalls[0];

        for(int i = 0; i < size; i++){

            if(stalls[i] - lastStall >= mid){

                cowsCount++;

                if(cowsCount == cows){
                    return true;
                }

                lastStall = stalls[i];

            }

        }


        return false;

    }

    public static int aggressiveCows(int arr[], int size, int cows){

        int start = 0, ans = -1, maxi = -1;
        for(int i = 0; i < size; i++){
            maxi = Math.max(maxi, arr[i]);
        }

        int end = maxi;
        int mid = start + (end - start) / 2;

        while(start <= end){

            if(isPossible(arr, size, cows, mid)){

                ans = mid;
                start = mid + 1;   // go to right part to find largest minimum distance

            }else{

                end = mid - 1;

            }

            mid = start + (end - start) / 2;

        }

        return ans;

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter Elements of an Array for Aggressive Cows Problem. : ");
        for(int i = 0; i < size; i++){

            arr[i] = sc.nextInt();

        }

        System.out.println("Enter Number of Cows : ");
        int cows = sc.nextInt();

        Arrays.sort(arr);

        int ans = aggressiveCows(arr, size, cows);
        System.out.println("Answer is : " + ans);

    }

}
