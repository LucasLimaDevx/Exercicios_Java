package problema_8.model.application;

import java.io.File;

import problema_8.model.exception.ArquivoNaoEncontradoException;

public class Program {

	public static void main(String[] args)  {
		File file = new File("C:\\Users\\Lucas\\Documents\\enx.txt");
		
		try {
			temArquivo(file);
		}
		catch(ArquivoNaoEncontradoException e) {
			System.out.println(e.getMessage());
		}
		
	

	}
	
	public static void temArquivo(File file) throws ArquivoNaoEncontradoException {
		if(!file.exists()) {
			throw new ArquivoNaoEncontradoException("Arquivo não encontrado: " + file.getName());
		}
		
		System.out.println("Arquivo encontrado e processado");
	}

}
