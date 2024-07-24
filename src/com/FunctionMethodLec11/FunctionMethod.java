package com.FunctionMethodLec11;

import java.util.Scanner;

public class FunctionMethod {
    public static void main(String args[]){
        System.out.println(sum());
    }
   static int sum(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first number 1");
        int num1=sc.nextInt();
        System.out.println("Enter the second number 2");
        int num2=sc.nextInt();
        int sum=num1+num2;
        return sum;
    }
}
