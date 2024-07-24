package com.lec10conditionAndLoops;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three numbers ");
       int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
//        if(a>b){
//            if(a>c){
//                System.out.println("a is largest");
//            }
//            else{
//                System.out.println("C is largest");
//            }
//        }
//        else {
//            if(b>c){
//                System.out.println("b is largest number");
//            }
//            else{
//             System.out.println("C is largest");
//            }
//        }

        int max=Math.max(c,Math.max(a,b));
        System.out.println("largest number among three is ="+max);
    }
}
