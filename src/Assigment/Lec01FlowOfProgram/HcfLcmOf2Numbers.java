package KunalKushvaYT.DSAPracticeCode.src.Assigment.Lec01FlowOfProgram;
import java.util.*;
public class HcfLcmOf2Numbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number");
    int num1=sc.nextInt();
    System.out.println("Enter the Second Number");
    int num2=sc.nextInt();

    int temp1=num1;
    int temp2=num2;
    int temp=0;
    while(temp2 !=0){
        temp=temp2;
        temp2=temp1%temp2;
        temp1=temp;
    }
    int hcf=temp1;
    int lcm=(num1*num2)/hcf;
    System.out.println("Hcf of input numbers "+hcf);
    System.out.println("Lcm of input numbers "+lcm);


    }
}
