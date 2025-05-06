package problema_1.model.application;

import problema_1.model.entities.Par;

public class Main {

	public static void main(String[] args) {
		
		Par<Integer, String> par1 = new Par<>(1, "a");
		Par<String, Integer> newPar1 = par1.inverterPares();
		System.out.println(par1.getObj1());
		System.out.println(par1.getObj2());
		
		
		System.out.println(newPar1.getObj1());
		System.out.println(newPar1.getObj2());
		
		System.out.println("-----------");
		
		Par<String, Boolean> par2 = new Par<>("nome", true);
		Par<Boolean, String> newPar2 = par2.inverterPares();
		
		System.out.println(par2.getObj1());
		System.out.println(par2.getObj2());
		
		
		
		System.out.println(newPar2.getObj1());
		System.out.println(newPar2.getObj2());
		
		System.out.println("-----------");
		
		Par<String, Boolean> par3 = new Par<>("nome", true);
		Par<Boolean, String> newPar3 = par3.inverterPares();
		
		System.out.println(par3.getObj1());
		System.out.println(par3.getObj2());
		
		
		System.out.println(newPar3.getObj1());
		System.out.println(newPar3.getObj2());
		
		System.out.println("-----------");
		
		Par<Double, Integer> par4 = new Par<>(2.2, 3);
		Par<Integer, Double> newPar4 = par4.inverterPares();
		System.out.println(par4.getObj1());
		System.out.println(par4.getObj2());
		System.out.println("-----------");
		
		System.out.println(newPar4.getObj1());
		System.out.println(newPar4.getObj2());
		
		
		
	}

}
