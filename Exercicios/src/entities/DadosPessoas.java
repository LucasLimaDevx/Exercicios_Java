package entities;

public class DadosPessoas {
	private double altura;
	private String genero;
	
	public DadosPessoas(double altura, String genero) {
		
		setAltura(altura);
		setGenero(genero);
		
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	
}
