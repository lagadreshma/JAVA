package com.company;
import java.util.*;

class squareRootUsingBinarySearch {

    public static int findSquareroot(int num){

        int start = 0;
        int end = num;
        int mid = start + (end - start) / 2;
        int ans = -1;

        while(start <= end){

            int midSquare = mid * mid;
            if(midSquare == num){
                return mid;
            }else if(midSquare > num){
                end = mid - 1;
            }else{
                ans = mid;
                start = mid + 1;
            }

            mid = start + (end - start) / 2;

        }
        return ans;
    }

    public static double morePrecision(int num, int precision, int tempSol){

        double factor = 1;
        double ans = tempSol;

        for(int i = 0; i < precision; i++){
            factor = factor / 10;
            // 0.1
            // 0.01
            // 0.001
            // 0.0001

            for(double j = ans; (j * j) < num; j = j + factor){
                ans =  j;
            }
        }

        return ans;

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number for Finding it's Square Root : ");
        int num = sc.nextInt();

        int root = findSquareroot(num);

        System.out.println("Square Root of " + num + " is : " + morePrecision(num, 4, root));

    }

}
