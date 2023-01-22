package com.siom;
import java.lang.*;

public class ImplementRunnableUsingThread implements Runnable{


    @Override
    public void run() {

        System.out.println("Thread Has Ended");

    }

    public static void main(String args[]){

        ImplementRunnableUsingThread t1 = new ImplementRunnableUsingThread();
        Thread t = new Thread(t1);

        t.start();
        System.out.println("Hi");

    }

}
