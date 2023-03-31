
import java.util.Scanner;
public class Symmetric {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows and colomns");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] matrix =new int[m][n];
        System.out.println("enter elements in matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int a=sc.nextInt();
                matrix[i][j]=a;
            }
        }
        System.out.println("the Matrix is");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("\n");
        }
        System.out.println("the transposed Matrix is");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.print("\n");
        }
        boolean symmetry=true;
        for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(matrix[i][j]!=matrix[j][i])
				{
					symmetry=false;
					break;
				}
				
			}
		}
        if(symmetry)
		{
			System.out.println("The matrix is symmetric.");	
		}
		else
		{
			System.out.println("The matrix is not symmetric.");
		}

    }
}
