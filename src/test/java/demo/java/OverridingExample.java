package demo.java;

class OverridingExample {
	
	public  void printMsg() {
		
		System.out.println("super class print message");
		
	}

}

 class ChildClass extends OverridingExample{
	
	 
	 public  void printMsg() {
		 System.out.println("child class print message");
	 }
	 
	 public static void main(String s[]) {
		 OverridingExample o = new OverridingExample();
		 o.printMsg();
		 
		 ChildClass c = new ChildClass();
		 c.printMsg();
		 
		 OverridingExample oc = new ChildClass();
		 oc.printMsg();
		 
		// ChildClass co = new OverridingExample();
		// co.printMsg();
	 }
}
