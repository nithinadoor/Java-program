import java.util.Scanner;
public class Leapyear {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("please enter starting year");
        int st1=sc.nextInt();
        System.out.println("please enter ending year");
        int st2=sc.nextInt();

        for(i=st1;i<=st2;i++)
        {
            if(i%4==0 && i%100!=0 || i%400==0)
            {
                System.out.println(i);
            }
        }
    }
}
