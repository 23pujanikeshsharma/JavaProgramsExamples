package demo.java;

public class ReverseArrayInJava {
	
	public static void reverseString(int a[]) {
		
		System.out.println("before reversing an array : ");
		for(int i : a) {
			System.out.print(i);
			System.out.print(" ");
		}
		
		int leftIndex = 0; 
		int rightIndex = a.length-1;
		
		while(leftIndex<rightIndex) {
			int value = a[leftIndex];
			a[leftIndex]= a[rightIndex];
			a[rightIndex]=value;
			leftIndex = leftIndex+1;
			rightIndex = rightIndex-1;
		}
		System.out.println();

		System.out.println("After reversing an array : ");
		for(int i : a) {
			System.out.print(i);
			System.out.print(" ");
		}
	}
	public static void main(String s[]) {
		int a[] ={7,5,6,8,9,3,2,0,0,1};
		reverseString(a);
	}

}
