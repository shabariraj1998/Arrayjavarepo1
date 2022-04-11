package javaArray;

public class ArrayDemo {
	public static void main(String[]args) {
		//declare and initialize an array
		
		int arr[]= {12,24,36,48,60}; // each integer value have 4 byte of memory 4*5=20
		System.out.println("First array element is: "+arr[0]);
		System.out.println("Second array element is: "+arr[1]);
		System.out.println("Third array element is: "+arr[2]);
		System.out.println("Fourth array element is: "+arr[3]);
		System.out.println("Fifth array element is: "+arr[4]);
		
		for (int i=0; i<5; i++) {
			System.out.println("arr["+i+"]=" +arr[i]);
		}
		
		int sum=0;
		for (int i=0; i<arr.length; i++) {
			sum = sum+arr[i];
			System.out.println("sum of value is: "+ sum);
		}
		float avg = (sum/arr.length);// here sum and arr.length is in integer datatype assigns in float datatype
		System.out.println("average value is: "+avg);
		
		System.out.println("-------------------------------");
		float avgs = ((float)sum/arr.length);//here sum and arr.length all in float datatype
		System.out.println("average value is: "+avgs);
		
		int max = arr[0];
		int min = arr[0];
		System.out.println("largest number finding");
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("largest element is: "+ max);

		System.out.println("lowest number findiing");
		for (int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("lowest element is: "+ min);
	}
}
