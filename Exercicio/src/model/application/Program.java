package model.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o caminho do arquivo: ");
		String strPath = sc.nextLine();
		
		List<Produto> produtos = new ArrayList<Produto>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(strPath))){
			String line = br.readLine();
			System.out.println(line);
			while(line != null) {
				String[] vect = line.split(",");
				
				String nome = vect[0];
				Double preco = Double.parseDouble(vect[1]);
				Integer quantidade = Integer.parseInt(vect[2]);
				
				Produto produto = new Produto(nome, preco, quantidade);
				produtos.add(produto);
				
				line = br.readLine();
				
			}
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		String path = new File(strPath).getParent();
		System.out.println(path);
		boolean sucess = new File(path+"\\out").mkdir();
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path+"\\out\\summary.csv"))){
			
			
			if(sucess) {
				for(Produto produto : produtos) {
					String nome = produto.getNome();
					Double valorTotal = produto.calcularTotal();
					
					bw.write(nome+","+valorTotal);
					bw.newLine();
				}
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("FINALIZADO");
		
		sc.close();
	}

}
