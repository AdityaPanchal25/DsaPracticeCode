package com.lec10conditionAndLoops;

import java.util.Scanner;

public class NthFibonacciNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int nth=sc.nextInt();

        int a=0;
        int b=1;
        int count=2;
        while (count<=nth){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(nth+" Fibonacci number is "+b);

    }
}
