package com.company;
import java.util.*;

public class PaintersPartitionProblem {

    public static boolean isPossible(int arr[], int size, int painters, int mid){

        int painterCount = 1;
        int sectionSum = 0;

        for(int i = 0; i < size; i++){

            if(sectionSum + arr[i] <= mid){
                sectionSum += arr[i];
            }else{
                painterCount++;
                if(painterCount > painters || arr[i] > mid){
                    return false;
                }
                sectionSum = arr[i];
            }

        }

        return true;

    }

    public static int findPainterPartitionMininumTime(int arr[], int size, int painters){

        int s = 0, sum = 0, ans = -1;
        for(int i = 0; i < size; i++){
            sum += arr[i];
        }
        int e = sum;
        int mid = s + (e - s) /2;

        while(s <= e){

            if(isPossible(arr, size, painters, mid)){

                ans = mid;
                e = mid - 1;

            }else{

                s = mid + 1;

            }

            mid = s + (e - s) / 2;

        }

        return ans;

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array : ");
        int size = sc.nextInt();

        int arr[] = new int[20];
        System.out.println("Enter Elements of an Array for Painters Partition Problem : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Number of Painters : ");
        int painters = sc.nextInt();

        int ans = findPainterPartitionMininumTime(arr, size, painters);

        System.out.println("Answer is : " + ans);

    }

}
