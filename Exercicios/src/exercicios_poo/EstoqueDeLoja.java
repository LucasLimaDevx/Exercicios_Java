package exercicios_poo;

import java.util.ArrayList;
import java.util.List;

public class EstoqueDeLoja {
	List<ItemEstoque> itensDeEstoque = new ArrayList<>();
	
	public void adicionarItem(Integer codigo, String descricao) {
		ItemEstoque item = new ItemEstoque(codigo, descricao);
		itensDeEstoque.add(item);
	}
	
	public void adicionarItem(Integer codigo, String descricao, Integer quantiade) {
		ItemEstoque item = new ItemEstoque(codigo, descricao, quantiade);
		itensDeEstoque.add(item);
	}
	
	public void verificarItemEstoque(Integer codigo) {
		for(ItemEstoque item : itensDeEstoque) {
			
			if(item.getCodigo().equals(codigo)) {
				
				if(item.getEstoque() > 0) {
					System.out.println(item.getDescricao() + " Ainda está em estoque.");
					break;
				}else {
					System.out.println(item.getDescricao() + " está esgotado.");
					break;
				}
				
			}
			
		}
	}
}
