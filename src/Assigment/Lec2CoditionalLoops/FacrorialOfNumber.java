package KunalKushvaYT.DSAPracticeCode.src.Assigment.Lec2CoditionalLoops;
import javax.annotation.processing.SupportedSourceVersion;
import java.util.*;

public class FacrorialOfNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
//            sum=sum+fact*i;
            fact=fact*i;
            System.out.println(fact);

        }
//System.out.println(num);
    }
}
