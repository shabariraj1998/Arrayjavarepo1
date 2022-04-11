package javaArray;

import java.util.Scanner;

public class BinarySearch {
		public static void main(String[]args) {
			int a[];
			Scanner sc = new Scanner(System.in);
			System.out.println("enter an array size:");
			int n = sc.nextInt();
			a=new int[n];
			System.out.println("enter a value from ascending order: ");
			for (int i=0; i< a.length;i++) {
				a[i]=sc.nextInt();
			}
			
			System.out.println("enter the element have search: ");
			int elementkey = sc.nextInt();
			int l=0;
			int h = n-1;
			int midvalue = 0;
			int position = 0;
			
			while(l<h) {
				midvalue = l+h/2;
				if(a[midvalue]==elementkey){
					position = midvalue+1;
					break;
				}
				else if(a[midvalue]>elementkey){
					h = midvalue-1;
				}
				else if(a[midvalue]<elementkey) {
					l = midvalue+1;
				}
			}
			System.out.println(elementkey +" is found in position "+ position);
		}
}
