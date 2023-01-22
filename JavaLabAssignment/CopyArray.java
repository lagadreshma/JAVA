package com.siom;
import java.util.*;
import java.io.*;

public class CopyArray {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows of an Array : ");
        int r = sc.nextInt();
        System.out.println("Enter columns of an Array : ");
        int c = sc.nextInt();

        int a[][] = new int[5][5];
        System.out.println("Enter Elements of an Array : ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                a[i][j] = sc.nextInt();
            }
        }

        int b[][] = new int[5][5];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                b[i][j] = a[i][j];
            }
        }

        System.out.println("Printing copyed Array : ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

    }

}
