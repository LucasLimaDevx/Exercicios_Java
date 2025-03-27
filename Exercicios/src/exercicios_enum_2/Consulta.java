package exercicios_enum_2;

public class Consulta {
	private  Integer id;
	private String paciente;
	private String medico;
	private Status status;
	
	Consulta(){
	}
	
	
	public Consulta(Integer id, String paciente, String medico, Status status) {
		
		this.id = id;
		this.paciente = paciente;
		this.medico = medico;
		this.status = status;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	
	
}
