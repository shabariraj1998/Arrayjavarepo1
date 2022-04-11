package javaArray;

import java.util.Scanner;

public class AddingDiagonal {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of row and columns:");
		int row;
		row = sc.nextInt();
		int column=row;
		System.out.println("Enter the elements of square array:");
		int a[][] = new int[row][column];
		int add=0;
		
		for (int i=0;i<row;i++) {
			for (int j=0;j<column;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("entered matrix is: ");
		
		for (int i=0; i<row;i++ ) {
			for (int j=0;j<column;j++) {
				System.out.print(a[i][j] +" ");
			}
				System.out.println( );
		}
		
		System.out.println("diagonal value is:");
		for (int i=0; i<row;i++ ) {
			for (int j=0;j<column;j++) {
				if(i==j) {
					add = add+a[i][j];
				}
			}
		}
		System.out.println("add the value is: " +add);
	}
}
