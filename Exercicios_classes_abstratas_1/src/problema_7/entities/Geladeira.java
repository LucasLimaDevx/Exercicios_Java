package problema_7.entities;

public class Geladeira extends Eletronico{
	private Integer horasLigado;
	
	public Geladeira() {
		super();
	}
	
	public Geladeira(String modelo, String marca, Double potencia, Double voltagem, Integer horasLigado) {
		super(modelo, marca, potencia, voltagem);
		this.horasLigado = horasLigado;
	}

	@Override
	public Double calcularConsumo() {
		
		return (potencia * horasLigado) / 1000.0;
	}
	
	
}
