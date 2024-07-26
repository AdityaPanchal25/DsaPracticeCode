package KunalKushvaYT.DSAPracticeCode.src.Assigment.Lec2CoditionalLoops;
import java.util.*;

public class PalindromNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int orignalNum = sc.nextInt();
        int num = orignalNum;
        int reverseNumber = 0;
        while (num > 0) {
            int degite = num % 10;
            reverseNumber = reverseNumber * 10 + degite;
            num = num / 10;
        }
        if (orignalNum == reverseNumber) {
            System.out.println("Number is Palindrom");
        }
        else{
            System.out.println("Number is not Palindrom");
        }
    }
}
