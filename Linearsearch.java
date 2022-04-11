package javaArray;

import java.util.Scanner;

public class Linearsearch {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array:");
		int size = sc.nextInt();
		int array[]=new int[size];
		System.out.println("enter an element: ");
		for(int i=0; i<array.length;i++) {
			array[i]=sc.nextInt();
		}
	}
}
