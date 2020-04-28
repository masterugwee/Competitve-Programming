package DFS;

import java.util.ArrayList;
import java.util.Scanner;

public class AdjacencyMatrix {
	int size = 5;
	int matrix[][] = new int[size][size];
	public void Matrix()
	{
		Scanner scan = new Scanner(System.in);
		size = Integer.valueOf(scan.nextLine());
		System.out.println("Enter 1s and 0s :- \n");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
			 matrix[i][j] = Integer.valueOf(scan.nextLine());	
			}
		}
	}
	
	public void printMatrix()
	{
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.println(matrix[i][j]);
			}
		}
	}
	public void connected()
	{
		for(int i =0;i<size;i++)
		{
			System.out.println(i + " is connected to ");
			for(int j=0;j<size;j++)
			{
				if(matrix[i][j] == 1)
				{
					System.out.println(j);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdjacencyMatrix adj = new AdjacencyMatrix();
		adj.Matrix();
		adj.printMatrix();
		adj.connected();
	}
}


