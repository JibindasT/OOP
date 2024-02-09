import java.util.Scanner;
class Matrix
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the no.of rows :");
	int m=sc.nextInt();
	
	System.out.print("Enter the no.of columns :");
	int n=sc.nextInt();
	int[][] mat1=new int[m][n];
	int[][] mat2=new int[m][n];
	int[][] summat=new int[m][n];
	System.out.println("Enter the first matrix :");
	for(int i=0;i<m;i++)
	{
	for(int j=0;j<n;j++)
	{
	mat1[i][j]=sc.nextInt();
	}
	}
	System.out.println("Enter the second matrix :");
	for(int i=0;i<m;i++)
	{
	for(int j=0;j<n;j++)
	{
	mat2[i][j]=sc.nextInt();
	}
	}
	
	
	System.out.println("Sum of the matrix :");
	for(int i=0;i<m;i++)
	{
	for(int j=0;j<n;j++)
	{
	summat[i][j]=mat1[i][j]+mat2[i][j];
	System.out.print(summat[i][j]+"\t");
	}
	System.out.println();
	}
	}
	}

