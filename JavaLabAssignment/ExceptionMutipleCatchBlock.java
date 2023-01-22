package com.siom;
import java.util.*;

public class ExceptionMutipleCatchBlock {

    public static void main(String args[]){

        try{

            int a[] = new int[5];
            int ans = 30 / 0;

        }catch(ArithmeticException e){

            System.out.println("Arithmetic Exception");

        }catch(ArrayIndexOutOfBoundsException e){

            System.out.println("Array Index Out of Bounds");

        }catch(Exception e){

            System.out.println("Exception : " + e);

        }

        System.out.println("Rest of the Code");

    }

}
