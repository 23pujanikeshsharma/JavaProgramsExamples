package demo.java;

public abstract class Demo_003 {
	
	abstract void displayMsg();
	static int value = 33;
	final int value2= 44;
	
}

class Child extends Demo_003{
	int b=20;
	static int v=10;

	@Override
	void displayMsg() {
		System.out.println("parent class overriden display method");	
		System.out.println("value : "+value);	
		System.out.println("value2 : "+value2);		
	}
	
	void childDisplayMsg() {
		v=40;
		System.out.println("child own display method");
	}
	
public static void main(String s[]) {
	int a=10;
	new Child().childDisplayMsg();

	System.out.println(v);
	v = 50;
	System.out.println(a);
	System.out.println(v);


	new Child().displayMsg();
}
}
		
	

