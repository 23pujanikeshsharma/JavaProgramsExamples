package demo.java;

import java.util.HashMap;
import java.util.Map;

public class Demo_001 {
	
	public void printPyramid1(int range) {
		
		for(int i=0; i<range ; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
   public void printPyramid2(int range) {
		
		for(int i=0; i<range ; i++) {
			for(int j= 2*(range-i); j>=0; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String s[]) {
		new Demo_001().printPyramid1(10);
		System.out.println("Printing second pyramid...");
		new Demo_001().printPyramid2(10);

	}

}
