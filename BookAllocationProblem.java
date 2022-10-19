package com.company;
import java.util.*;

public class BookAllocationProblem {

    public static boolean isPossible(int arr[], int size, int students, int mid){

        int studentCount = 1;
        int pageSum = 0;

        for(int i = 0; i < size; i++){

            if(pageSum + arr[i] <= mid){
                pageSum += arr[i];
            }else{
                studentCount++;
                if(studentCount > students || arr[i] > mid){
                    return false;
                }
                pageSum = arr[i];
            }

        }

        return true;

    }

    public static int findBookAllocationMinimum(int arr[], int size, int students){

        int s = 0, sum = 0, ans = -1;

        for(int i = 0; i < size; i++){
            sum = sum + arr[i];
        }
        int e = sum;
        int mid = s + (e - s) / 2;

        while(s <= e){

            if(isPossible(arr, size, students, mid)){

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
        System.out.println("Enter Elements of an Array for Book Allocation : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Number of Students : ");
        int students = sc.nextInt();

        int Ans = findBookAllocationMinimum(arr, size, students);
        System.out.println("Answer is : " + Ans);

    }

}
