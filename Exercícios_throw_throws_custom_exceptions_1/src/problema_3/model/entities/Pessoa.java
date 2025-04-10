package problema_3.model.entities;


import problema_3.model.exception.CPFInvalidoException;

public class Pessoa {
	private String nome;
	private String sobreNome;
	private String cpf;
	
	public Pessoa(String nome, String sobreNome, String cpf) throws CPFInvalidoException {
		
		
		if(cpf.length() != 11 ) {
			throw new CPFInvalidoException("CPF inválido: deve conter 11 dígitos");
		}
		if(!isCPF(cpf)) {
			throw new CPFInvalidoException("CPF inválido: deve conter apenas números");
		}
		
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public static boolean isCPF(String cpf) {
		
		boolean res = true;
		for(int i = 0 ; i < cpf.length() ; i++) {
			int code = (int) cpf.charAt(i);
			
			if(code < 48 || code > 57) {
				res = false;
				break;
			}
			
			
		}
		
		return res;
	}
	
	
	
	
	
	
	
}
