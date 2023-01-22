package com.siom;
import java.util.*;

public class ExceptionHandleThrowKeyword {

    public static void fun(){

        try{
            throw new NullPointerException("Demo");
        }catch(NullPointerException e){
            System.out.println("Caught inside fun()");
            throw e; // rethrow exception
        }

    }

    public static void main(String args[]){

        try{
            fun();
        }catch(NullPointerException e){
            System.out.println("Caught in Main");
        }

    }

}
