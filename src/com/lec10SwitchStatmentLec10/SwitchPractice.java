package com.lec10SwitchStatmentLec10;

import java.util.Locale;
import java.util.Scanner;
public class SwitchPractice {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Fruit name");
        String fruit=sc.next().toLowerCase();
        switch (fruit) {
            case "mango" -> System.out.println("King of Fruits");
            case "apple" -> System.out.println("Sweer Fruite");
            default -> System.out.println("Enter the valid data");
        }

    }
}
