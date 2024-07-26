package KunalKushvaYT.DSAPracticeCode.src.Assigment.Lec01FlowOfProgram;
import java.util.*;

public class LeapYear {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    int year=sc.nextInt();

    if(year%4==0&& year%100 !=0 || year%400==0){
        System.out.println("Year is leap year");
    }
    else{
        System.out.println("year is not leap year");
    }
    }
}
