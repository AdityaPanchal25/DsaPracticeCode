package com.lec10conditionAndLoops;

import java.util.Scanner;

public class CharCaseCheck {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
//        System.out.println(sc.next().charAt(0));
        char ch=sc.next().trim().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("LowerCase char");
        }
        else {
            System.out.println("Uppercase char");
        }
    }

}
