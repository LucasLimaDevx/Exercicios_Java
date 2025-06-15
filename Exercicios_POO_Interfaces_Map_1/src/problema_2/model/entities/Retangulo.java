package problema_2.model.entities;

public class Retangulo extends FormaGeometrica{
	private Double largura;
	private Double altura;
	
	public Retangulo(Double largura, Double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return largura * altura;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2 * (largura + altura);
	}

	@Override
	public String toString() {
		return "Retangulo";
	}
	
	
	
}
