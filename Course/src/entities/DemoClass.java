package entities;

public class DemoClass implements FirstInterface, SecondInterface{

	@Override
	public void myOtherMethod() {
		System.out.println("Second Interface");
		
	}

	@Override
	public void myMethod() {
		// TODO Auto-generated method stub
		System.out.println("First Interface");
		
	}
	
}
