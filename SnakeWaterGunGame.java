package com.company;
import java.util.*;
import java.lang.Math;

public class SnakeWaterGunGame {

    public static int gameWinner(char you, char comp){

        if(you == 'S' && comp == 'W'){

            return 1;

        }else if(you == 'W' && comp == 'G'){

            return 1;

        }else if(you == 'G' && comp == 'S'){

            return 1;

        }else if(you == 'W' && comp == 'S'){

            return -1;

        }else if(you == 'S' && comp == 'G'){

            return -1;

        }else if(you == 'G' && comp == 'W'){

            return -1;

        }else{
            return 0;
        }

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        char you, comp;
        int rand;

        rand = (int) (Math.random() * 100);
        if(rand < 33){
            comp = 'S';
        }else if(rand >= 33 && rand < 66){
            comp = 'W';
        }else{
            comp = 'G';
        }

        System.out.println("Enter 'S' for Snake, 'W' for Water and 'G' for Gun : ");
        you = sc.next().charAt(0);

        int result = gameWinner(you,comp);

        if(result == 1){
            System.out.println("Congratulations!! You win Game.");
            System.out.println("You choose : " + you + " and Computer Choose : " + comp);
        }else if(result == -1){
            System.out.println("OO No , Computer Win Game.");
            System.out.println("You choose : " + you + " and Computer Choose : " + comp);
        }else{
            System.out.println("Game Tie.");
            System.out.println("You choose : " + you + " and Computer Choose : " + comp);
        }



    }

}
