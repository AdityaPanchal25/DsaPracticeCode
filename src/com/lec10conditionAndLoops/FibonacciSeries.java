package com.lec10conditionAndLoops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
                int num=sc.nextInt();
                int n1=0;
                int n2=1;
                int a[]=new int[num];
                a[0]=n1;
                a[1]=n2;
                for(int i=2; i<num;i++)
                {
                a[i]=a[n1]+a[n2];
                n1=n2;
                n2++;
                }
    for(int i=0;i<num;i++){
        System.out.println(a[i]);
    }
    }
}
