package com.siom;
import java.util.*;
import java.io.*;

public class StringMethods {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String str = "Reshma Rajendra Lagad";
        StringBuilder newStr = new StringBuilder();

        System.out.println("Enter Any String : ");
        String str1 = sc.next();

        System.out.println("Enter Another String : ");
        String str2 = sc.next();

        // equals() method
        System.out.println(str1.equals(str2));


        // reverse() method
        newStr.append(str);
        newStr.reverse();
        System.out.println(newStr);


        // toUppercase() method
        System.out.println(str.toUpperCase());


        // toLowercase() method
        System.out.println(str.toLowerCase());

    }

}
