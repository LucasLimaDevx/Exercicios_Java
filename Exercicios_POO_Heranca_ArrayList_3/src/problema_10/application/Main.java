package problema_10.application;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		SistemaDeCadastro sistema1 = new SistemaDeCadastro();
		SistemaDeCadastro sistema2 = new SistemaDeCadastro();
		SistemaDeCadastro sistema3 = new SistemaDeCadastro();
		
		sistema1.adicionarProduto("TV", 2000.0);
		sistema1.adicionarProduto("Geladeira", 3000.0);
		sistema1.adicionarProduto("Celular", 1500.0, 2);
		
		sistema2.adicionarProduto("Notebook", 5000.0, 2);
		sistema2.adicionarProduto("Fogão", 2500.0);
		
		sistema3.adicionarProduto("Micro-ondas", 1000.0);
		sistema3.adicionarProduto("Tablet", 2000.0, 1);
		
		Double total1 = sistema1.calcularEstoqueTotal();
		Double total2 = sistema2.calcularEstoqueTotal();
		Double total3 = sistema3.calcularEstoqueTotal();
		
		System.out.println("Total: " +String.format("%.2f",total1));
		System.out.println("Total: " +String.format("%.2f",total2));
		System.out.println("Total: " +String.format("%.2f",total3));
		
	}

}
