import java.util.Scanner;
public class Marks
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,tt,mk,totalmark=0,tm1;
		float percentage;
		System.out.println("please enter number of subjects");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter mark in which each subject is evaluated");
		tt=sc.nextInt();
		System.out.println("enter mark in"+n+"subjects");
		for(int i=0;i<n;i++)
		{
			mk=sc.nextInt();
			if(mk>tt)
			{
				System.out.println("please enter valid marks");
				i--;
			}
			else
			{
				arr[i]=mk;
			}
				
		}
		for(int i=0;i<n;i++)
		{
			totalmark=totalmark+arr[i];
		}
		tm1=tt*n;
		percentage=(totalmark*100)/tm1;
		System.out.println("total marks obtained by the student is"+totalmark);
		System.out.println("percentage obtained by the student is"+percentage);
		
		
	}
}
