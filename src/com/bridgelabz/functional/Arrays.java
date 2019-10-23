package com.bridgelabz.functional;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Arrays{
	public static void main(String[] args) throws FileNotFoundException{
	Scanner scan= new Scanner(System.in);
		//File file=new File("C:\\Users\\Gaurav\\Desktop\\matrix.txt");
			Scanner scan1=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int Rows=scan1.nextInt();
		System.out.println("Enter no of columns");
		int Column=scan1.nextInt();
		
		int[][] mat=new int[Rows][Column];
		
		enterMatrixData(scan,mat,Rows,Column);
		
		printMatrix(mat,Rows,Column);
				
	}

	public static void enterMatrixData(Scanner scan, int[][]mat,int Rows,int Column){
	     System.out.println("Enter Matrix Data");
	          
	          for (int i = 0; i < Rows; i++)
	          {
	              for (int j = 0; j < Column; j++)
	              {
	                  mat[i][j] = scan.nextInt();
	              }
	          }
	  }
	  public static void printMatrix( int[][]mat, int Rows, int Column){
		    System.out.println("Your Matrix is : ");
		        
		        for (int i = 0; i < Rows; i++)
		        {
		            for (int j = 0; j <Column; j++)
		            {
		                System.out.print(mat[i][j]+"\t");
		            }
		             
		            System.out.println();
		        }
		  }
}
