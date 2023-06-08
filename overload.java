import java.util.*;
import java.util.Scanner;
class overload
{
	void area(int l,int b)
	{
		int length=l;
		int breadth=b;
		System.out.println("area of rectangle="+length*breadth);
	}	
	void area(int a)
	{
		int side=a;
		System.out.println("area of square="+side*side);
	}
	void area(double r)
	{
		double radius=r;
		System.out.println("area of circle="+3.14*r*r);
	}
	public static void main(String args[])
	{
		overload obj=new overload();
		Scanner sc=new Scanner(System.in);
		System.out.println("SQUARE");
		System.out.println("please enter side of a square");
		int x=sc.nextInt();
		obj.area(x);
		System.out.println("RECTANGLE");
		System.out.println("please enter length and breadth of rectangle");
		int p=sc.nextInt();
		int q=sc.nextInt();
		obj.area(p,q);
		System.out.println("CIRCLE");
		System.out.println("please enter radius of circle");
		double rad=sc.nextDouble();
		obj.area(rad);
		sc.close();
		
		
	}
}
