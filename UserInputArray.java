package javaArray;

import java.util.Scanner;

public class UserInputArray {
	public static void main (String[]args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("enter the array size");
		n=scan.nextInt();
		int array[]=new int[n];
		System.out.println("enter the array elements:" +n);
		// getting the array
		for(int i=0; i<array.length;i++) {
			array[i]=scan.nextInt();
		}
		//displaying or printing
		for(int i=0; i<array.length;i++) {
			System.out.println("The user array elements: "+array[i]);
		}
	}
}
