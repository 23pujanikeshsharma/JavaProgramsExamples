package demo.java;

public class SwapingNumber {

	public static void swapNumber(int a, int b){
        System.out.println("a = "+ a +" : "+"b = "+b);

         a = a+b;
         b = a-b;
         a = a-b;
         System.out.println("After Swaping ........");
         System.out.println("a = "+ a +" : "+"b = "+b);
	}
	
	public static void main(String[] args) {
	      int a = 48; 
	      int b = 66;
	      swapNumber(a, b);
	      
	  }
  

}
