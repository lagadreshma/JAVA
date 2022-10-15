package com.company;
import java.util.*;
import java.lang.Math;

public class RockPaperScissorGame {

    public static int GameWinner(char you, char comp){

        if(you == 'R' && comp == 'P'){

            return -1;

        }else if(you == 'R' && comp == 'S'){

            return 1;

        }else if(you == 'P' && comp == 'R'){

            return 1;

        }else if(you == 'P' && comp == 'S'){

            return -1;

        }else if(you == 'S' && comp == 'R'){

            return -1;

        }else if(you == 'S' && comp == 'P'){

            return 1;

        }else if(you == comp){

            return 0;

        }else{
            
            return 2;
         
        }

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        char you, comp;

        int num = (int) (Math.random() * 100);
        if(num < 33){
            comp = 'R';
        }else if(num >= 33 && num < 66){
            comp = 'P';
        }else{
            comp = 'S';
        }

        System.out.println("Enter 'R' for Rock, 'P' for Paper and 'S' for Scissor : ");
        you = sc.next().charAt(0);

        int result = GameWinner(you, comp);

        if(result == 1){
            System.out.println("Congratulations!!! You Win Game.");
        }else if(result == -1){
            System.out.println("OO No, Computer Win Game.");
        }else if(result == 0){
            System.out.println("Game Tie!!");
        }else{
            System.out.println("Invalid Input.");
        }

        System.out.println("You Choose : " + you + " and Computer Choose : " + comp);


    }

}
