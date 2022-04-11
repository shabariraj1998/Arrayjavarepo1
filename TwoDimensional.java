package javaArray;

import java.util.Scanner;

public class TwoDimensional {
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		// Declaring an two dimensional array
		int r,c;
		System.out.println("enter the rows and columns :");
		r = sc.nextInt();
		c = sc.nextInt();
		int a[][] = new int [r][c];
		System.out.println("enter the two dimensional array:");
		
		for (int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0;j < c; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
