package exercicios_poo_h;

public class Transporte {
	private TipoDoTransporte tipoDoTransporte;
	private String linha;
	
	public Transporte() {
		
	}

	public Transporte(TipoDoTransporte tipoDoTransporte, String linha) {
	
		this.tipoDoTransporte = tipoDoTransporte;
		this.linha = linha;
	}

	public TipoDoTransporte getTipoDoTransporte() {
		return tipoDoTransporte;
	}

	public void setTipoDoTransporte(TipoDoTransporte tipoDoTransporte) {
		this.tipoDoTransporte = tipoDoTransporte;
	}

	public String getLinha() {
		return linha;
	}

	public void setLinha(String linha) {
		this.linha = linha;
	}
	
	
	
	
	
}
