package javaArray;

import java.util.Scanner;

public class AddingTwomatrices {
		public static void main (String[]args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the size of row and column: ");
			int row1,row2,column1,column2;
			System.out.println("enter the A array elements size:");
			row1 = sc.nextInt();
			column1  = sc.nextInt();
			System.out.println("enter the B array elements size:");
			row2 = sc.nextInt();
			column2 = sc.nextInt();
			if(row1==row2 && column1 == column2) {
				System.out.println("addition is possible:");
				System.out.println("enter A array element:");
			int a[][] = new int[row1][column1];
			for (int i=0; i<row1; i++) {
				for(int j=0;j<column1;j++) {
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println("the A array elements are: ");
			for (int i=0;i<row1;i++) {
				for(int j=0;j<column1;j++) {
					System.out.print(a[i][j] +" ");
				}
				System.out.println("");
			}
			// B array
			System.out.println("Enter B array element:");
			int b[][] = new int[row2][column2];
			for (int i=0; i<row2; i++) {
				for(int j=0;j<column2;j++) {
					b[i][j] = sc.nextInt();
				}
			}
			System.out.println("the B array elements are: ");
			for (int i=0;i<row2;i++) {
				for(int j=0;j<column2;j++) {
					System.out.print(b[i][j] +" ");
				}
				System.out.println("");
			}
			
			// result array is:
			// assign the addition array
			int result[][] = new int[row1][column1];
			for (int i=0; i<row1;i++) {
				for (int j=0; j<column1;j++) {
					result[i][j] = a[i][j]*b[i][j];
				}
			}
			
			// display the array
			System.out.println("The result of multipling two array is:");
			for (int i=0; i<row1;i++) {
				for (int j=0; j<column1;j++) {
					System.out.print(result[i][j] + " ");
				}
				System.out.println();
			}
		}
			else
			{
				System.out.println("In this matrix addition is not possible bruhh!!!!!.. ");
			}
		}
}
