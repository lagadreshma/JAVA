package com.siom;

class sv
{
    static int c=1;
    void a1()
    {
        c=c+4;
        System.out.println("method a1 value of c="+c);
    }
    void a2()
    {
        c=c+10;
        System.out.println("method a1 value of c="+c);
    }
}

public class Svariable {

    public static void main(String[] args) {
// TODO Auto-generated method stub
        sv obj= new sv();
        sv obj1= new sv();

        obj1.a2();
        obj.a1();
    }
}