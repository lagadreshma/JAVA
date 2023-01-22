package com.siom;
import java.util.*;

public class NestedTryBlock {

    public static void main(String args[]){

        try{

            try{
                System.out.println("Divide By zero");
                int ans = 25 / 0;
            }catch(ArithmeticException e){
                System.out.println("Arithmetic Exception Occurs.");
            }

            try{
                int arr[] = new int[5];
                arr[5] = 10;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBounds Exception Occurs.");
            }

        }catch(Exception e){
            System.out.println("Exception " + e);
        }

    }

}
