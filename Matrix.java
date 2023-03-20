import java.util.Scanner;
public class Matrix {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int row,col,i,j;
        System.out.println("enter numberof rows");
        row=sc.nextInt();
        System.out.println("enter numberof coloumns");
        col=sc.nextInt();
        int mat1[][]=new int[row][col];
        int mat2[][]=new int[row][col];
        int res[][]=new int[row][col];

        System.out.println("enter elments in matrix 1");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            mat1[i][j]=sc.nextInt();

            System.out.println();
        }
        
        System.out.println("enter elements in matrix 2");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            mat2[i][j]=sc.nextInt();

            System.out.println();
        }
        for(i=0;i<row;i++)
        for(j=0;j<col;j++)
        res[i][j]=mat1[i][j]+mat2[i][j];

        System.out.println();

        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            System.out.println(res[i][j]+"\t");

            System.out.println();
        }
    }   
}
