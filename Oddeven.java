import java.util.Scanner;
public class Oddeven {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to check odd or even");
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("number is even");
        }
        else
        {
            System.out.println("number is odd");
        }
    }
    
    
}
