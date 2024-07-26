package KunalKushvaYT.DSAPracticeCode.src.Assigment.Lec2CoditionalLoops;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        int OrignalNum=num;
        int temp=num;
       int count=0;
       int sum=0;
       while(num>0){

            count++;
           num=num/10;
        }

//       while(temp>0){
//          int  degite=num%10;
//          sum=degite*count;
//       }
       while(temp>0){
           int degite=temp%10;
           int degSum=1;
           for(int i=0;i<count;i++){
               degSum=degSum*degite;
           }
           sum=sum+degSum;
           temp=temp/10;
       }
       if(OrignalNum==sum) {
           System.out.println("Number is Armstrong Number");
       }
       else{
           System.out.println("Number is not Armstrong");
       }
    }
}
