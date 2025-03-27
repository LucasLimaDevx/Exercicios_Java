package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("Nome do arquivo: " + path.getName());
		System.out.println("Nome do caminho sem o arquivo: " + path.getParent());
		System.out.println("Caminho completo: " + path.getPath());
		sc.close();
	}

}
