package javaArray;

import java.util.Scanner;
import java.util.*;

public class MergeTwoUserInput {
	public static void main(String[]args) {
		//getting the value from the user
		Scanner scansize = new Scanner (System.in);
		System.out.println("Enter the Row-array size: ");
		int size1 = scansize.nextInt();
		//Declaring and initialization an array
		int array1[] = new int[size1];
		System.out.println("Enter the array1 elements are: ");
		for (int i=0; i<array1.length;i++) {
			array1[i]=scansize.nextInt();
		}
//		System.out.println("The array elements are: ");
//		for (int i=0;i<array1.length;i++) {
//			System.out.println("array elements ["+array1[i]+"]");
//		}
//		int[] args2 = new int[args.length + array1.length];
//		System.arraycopy(args, 0, args2, 0, args.length);
//		System.arraycopy(array1, 0, args2, args.length, array1.length);
		System.out.println("2nd array size: ");
		int size2 = scansize.nextInt();
		int array2[] = new int[size2];
		if (size2>0) {
		System.out.println("Enter the array2 elements are: ");
		for (int i=0; i<array2.length;i++) {
			array2[i]=scansize.nextInt();
		}
		}
		int size3 = size1+size2;
		int array3[] = new int[size3];
		for (int i=0; i<array1.length;i++) {
			array3[i]=array1[i];
		}
		int j=0;
		for (int i=0;i<array2.length;i++) {
			array3[i+array1.length]=array2[j];
			j++;
		}
		for(int i=0; i<array3.length;i++) {
			System.out.println("merge elements are: "+array3[i]);
		}
	}
	
}
