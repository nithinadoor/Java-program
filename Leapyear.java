import java.util.Scanner;
public class Leapyear {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p;
        System.out.println("please enter starting year");
        int st1=sc.nextInt();
        System.out.println("please enter ending year");
        int st2=sc.nextInt();

        for(p=st1;p<=st2;p++)
        {
            if(p%4==0 && p%100!=0 || p%400==0)
            {
                System.out.println(p);
            }
        }
    }
}
