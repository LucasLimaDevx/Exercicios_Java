package problema_7.model.application;

import problema_7.model.entities.Alimento;
import problema_7.model.entities.Eletronico;
import problema_7.model.entities.ProdutoAbstrato;
import problema_7.model.enums.TipoDeProduto;

public class App {

	public static void main(String[] args) {
		Estoque estoque = new Estoque();
		
		ProdutoAbstrato p1 = new Eletronico("TV1");
		ProdutoAbstrato p2 = new Eletronico("TV2");
		ProdutoAbstrato p3 = new Eletronico("TV3");
		ProdutoAbstrato p4 = new Eletronico("TV4");
		ProdutoAbstrato p5 = new Eletronico("TV5");
		
		ProdutoAbstrato p6 = new Alimento("Alimento 1");
		ProdutoAbstrato p7 = new Alimento("Alimento 2");
		ProdutoAbstrato p8 = new Alimento("Alimento 3");
		ProdutoAbstrato p9 = new Alimento("Alimento 4");
		ProdutoAbstrato p10 = new Alimento("Alimento 5");
		
		
		estoque.adicionarEstoque(p1);
		estoque.adicionarEstoque(p2);
		estoque.adicionarEstoque(p3);
		estoque.adicionarEstoque(p4);
		estoque.adicionarEstoque(p5);
		estoque.adicionarEstoque(p6);
		estoque.adicionarEstoque(p7);
		estoque.adicionarEstoque(p8);
		estoque.adicionarEstoque(p9);
		estoque.adicionarEstoque(p10);
		
		estoque.listar();
		
		System.out.println();
		
		estoque.removerEstoque(3, TipoDeProduto.ALIMENTO);
		estoque.removerEstoque(2, TipoDeProduto.ELETRONICO);
		
		
		estoque.listar();
	}

}
