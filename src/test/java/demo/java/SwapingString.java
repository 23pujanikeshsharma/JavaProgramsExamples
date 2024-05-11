package demo.java;

public class SwapingString {

	public static void main(String[] args) {
		System.out.println("Swaping of two string");
		
		String s = "Hello";
		
		String t = " World";
		
     System.out.println(" Before swaping of two string value : ");
		
		System.out.println(" s : "+s);
		System.out.println(" t : "+t);
		
		s = s+t;   // HelloWorld
		
		t = s.replace(t, "").trim();  // Hello
		
		s = s.replace(t, "");
		System.out.println("######################################");

		
		System.out.println(" After swaping of two string value : ");
		
		System.out.println(" s : "+s);
		System.out.print(" t : "+t);
		
		
		// This swaping of two string program is done 
		
		
		
		
		
		
// 97 to 122 : A to Z
// 65 to 90 : a to z
// 48 to 57 : 0 to 9 		
		

	}

}
