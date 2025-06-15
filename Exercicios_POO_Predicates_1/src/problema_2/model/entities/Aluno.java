package problema_2.model.entities;

public class Aluno {
	private String nome;
	private Double mediaFinal;
	private Double percentualPresenca;
	
	public Aluno(String nome, Double mediaFinal, Double percentualPresenca) {
		
		this.nome = nome;
		this.mediaFinal = mediaFinal;
		this.percentualPresenca = percentualPresenca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getMediaFinal() {
		return mediaFinal;
	}

	public void setMediaFinal(Double mediaFinal) {
		this.mediaFinal = mediaFinal;
	}

	public Double getPercentualPresenca() {
		return percentualPresenca;
	}

	public void setPercentualPresenca(Double percentualPresenca) {
		this.percentualPresenca = percentualPresenca;
	}
	
	
}
