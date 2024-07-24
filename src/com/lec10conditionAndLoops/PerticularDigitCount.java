package com.lec10conditionAndLoops;
import  java.util.Scanner;
public class PerticularDigitCount {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
    System.out.println("Enter the Number");
    int num=sc.nextInt();
    System.out.println("Enter the Digite for count");
    int d=sc.nextInt();
    int count=0;
    while(num>0){
       int digit=num%10;
        if(digit==d){
            count++;
        }
        num=num/10;
    }
    System.out.println("Number of time "+d+" count is ="+count);
    }
}
