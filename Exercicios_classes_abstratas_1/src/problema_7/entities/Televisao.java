package problema_7.entities;

public class Televisao extends Eletronico{
	private Integer horasLigado;
	
	public Televisao() {
		super();
	}

	public Televisao(String modelo, String marca, Double potencia, Double voltagem, Integer horasLigado) {
		super(modelo, marca, potencia, voltagem);
		this.horasLigado = horasLigado;
	}

	@Override
	public Double calcularConsumo() {
		// TODO Auto-generated method stub
		return (potencia * horasLigado) / 1000.0;
	}
	
	
}
