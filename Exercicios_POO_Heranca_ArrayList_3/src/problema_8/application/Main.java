package problema_8.application;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControleDeEquipamentos sistema1 = new ControleDeEquipamentos();
		ControleDeEquipamentos sistema2 = new ControleDeEquipamentos();
		ControleDeEquipamentos sistema3 = new ControleDeEquipamentos();
		
		sistema1.adicionarEquipamento("Impressora", "123");
		sistema1.adicionarEquipamento("PC1", "456", "(Intel i5)");
		sistema1.adicionarEquipamento("Monitor", "789");
		
		sistema2.adicionarEquipamento("Scanner", "001");
		sistema2.adicionarEquipamento("PC2", "002", "(Ryzen 7)");
		
		sistema3.adicionarEquipamento("Teclado", "333");
		sistema3.adicionarEquipamento("PC3", "444", "(Intel i7)");
		
		System.out.println(sistema1.listarEquipamentos());
		System.out.println(sistema2.listarEquipamentos());
		System.out.println(sistema3.listarEquipamentos());
	}

}
