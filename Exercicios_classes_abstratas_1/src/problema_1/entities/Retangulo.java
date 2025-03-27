package problema_1.entities;

public class Retangulo extends Figura{
	private Double largura;
	private Double altura;
	
	public Retangulo() {
		super();
	}

	

	public Retangulo(String cor, String nome, Double largura, Double altura) {
		super(cor, nome);
		this.largura = largura;
		this.altura = altura;
	}



	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public Double calcularArea() {
		
		return largura * altura;
	}
	
	
	
}
