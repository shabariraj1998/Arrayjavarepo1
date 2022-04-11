package javaArray;

public class RemoveDuplicate {
		public static void main(String[]args) {
			int k=0;
			int array[] = {2,4,5,6,8,2,6,4};
			outer:
			for (int i=0; i<array.length;i++) {
				inner:
				for (int j=0; j<i;j++) {
						if(array[i]==array[j]) {
							
						}
				}
			}
		}
}
